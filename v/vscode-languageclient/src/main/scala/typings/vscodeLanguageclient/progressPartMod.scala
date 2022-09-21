package typings.vscodeLanguageclient

import typings.vscode.mod.Disposable
import typings.vscodeJsonrpc.connectionMod.NotificationHandler
import typings.vscodeJsonrpc.connectionMod.ProgressToken
import typings.vscodeLanguageserverProtocol.mod.ProgressType
import typings.vscodeLanguageserverProtocol.mod.ProtocolNotificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressPartMod {
  
  @JSImport("vscode-languageclient/lib/common/progressPart", "ProgressPart")
  @js.native
  open class ProgressPart protected () extends StObject {
    def this(_client: ProgressContext, _token: ProgressToken) = this()
    def this(_client: ProgressContext, _token: ProgressToken, done: js.Function1[/* part */ ProgressPart, Unit]) = this()
    
    /* private */ var _cancellationToken: Any = js.native
    
    /* private */ var _client: Any = js.native
    
    /* private */ var _infinite: Any = js.native
    
    /* private */ var _lspProgressDisposable: Any = js.native
    
    /* private */ var _progress: Any = js.native
    
    /* private */ var _reject: Any = js.native
    
    /* private */ var _reported: Any = js.native
    
    /* private */ var _resolve: Any = js.native
    
    /* private */ var _token: Any = js.native
    
    /* private */ var _tokenDisposable: Any = js.native
    
    /* private */ var begin: Any = js.native
    
    def cancel(): Unit = js.native
    
    /* private */ var cleanup: Any = js.native
    
    def done(): Unit = js.native
    
    /* private */ var report: Any = js.native
  }
  
  @js.native
  trait ProgressContext extends StObject {
    
    def onProgress[P](`type`: ProgressType[P], token: String, handler: NotificationHandler[P]): Disposable = js.native
    def onProgress[P](`type`: ProgressType[P], token: Double, handler: NotificationHandler[P]): Disposable = js.native
    
    def sendNotification[P, RO](`type`: ProtocolNotificationType[P, RO]): Unit = js.native
    def sendNotification[P, RO](`type`: ProtocolNotificationType[P, RO], params: P): Unit = js.native
  }
}
