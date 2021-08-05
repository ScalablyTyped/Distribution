package typings.vscodeLanguageclient

import typings.vscode.mod.Disposable
import typings.vscodeJsonrpc.mod.NotificationHandler
import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverProtocol.mod.NotificationType
import typings.vscodeLanguageserverProtocol.mod.ProgressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressPartMod {
  
  @JSImport("vscode-languageclient/lib/progressPart", "ProgressPart")
  @js.native
  class ProgressPart protected () extends StObject {
    def this(_client: ProgressContext, _token: ProgressToken) = this()
    
    /* private */ var _cancellationToken: js.Any = js.native
    
    /* private */ var _client: js.Any = js.native
    
    /* private */ var _disposable: js.Any = js.native
    
    /* private */ var _infinite: js.Any = js.native
    
    /* private */ var _progress: js.Any = js.native
    
    /* private */ var _reject: js.Any = js.native
    
    /* private */ var _reported: js.Any = js.native
    
    /* private */ var _resolve: js.Any = js.native
    
    /* private */ var _token: js.Any = js.native
    
    /* private */ var begin: js.Any = js.native
    
    def cancel(): Unit = js.native
    
    def done(): Unit = js.native
    
    /* private */ var report: js.Any = js.native
  }
  
  @js.native
  trait ProgressContext extends StObject {
    
    def onProgress[P](`type`: ProgressType[P], token: String, handler: NotificationHandler[P]): Disposable = js.native
    def onProgress[P](`type`: ProgressType[P], token: Double, handler: NotificationHandler[P]): Disposable = js.native
    
    def sendNotification[P, RO](`type`: NotificationType[P, RO]): Unit = js.native
    def sendNotification[P, RO](`type`: NotificationType[P, RO], params: P): Unit = js.native
  }
}
