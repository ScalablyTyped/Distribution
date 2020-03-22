package typings.vscodeLanguageclient

import typings.vscode.mod.Disposable
import typings.vscodeJsonrpc.mod.NotificationHandler
import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverProtocol.mod.NotificationType
import typings.vscodeLanguageserverProtocol.mod.ProgressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/progressPart", JSImport.Namespace)
@js.native
object progressPartMod extends js.Object {
  @js.native
  trait ProgressContext extends js.Object {
    def onProgress[P](`type`: ProgressType[P], token: String, handler: NotificationHandler[P]): Disposable = js.native
    def onProgress[P](`type`: ProgressType[P], token: Double, handler: NotificationHandler[P]): Disposable = js.native
    def sendNotification[P, RO](`type`: NotificationType[P, RO]): Unit = js.native
    def sendNotification[P, RO](`type`: NotificationType[P, RO], params: P): Unit = js.native
  }
  
  @js.native
  class ProgressPart protected () extends js.Object {
    def this(_client: ProgressContext, _token: ProgressToken) = this()
    var _cancellationToken: js.Any = js.native
    var _client: js.Any = js.native
    var _disposable: js.Any = js.native
    var _infinite: js.Any = js.native
    var _progress: js.Any = js.native
    var _reject: js.Any = js.native
    var _reported: js.Any = js.native
    var _resolve: js.Any = js.native
    var _token: js.Any = js.native
    var begin: js.Any = js.native
    var report: js.Any = js.native
    def cancel(): Unit = js.native
    def done(): Unit = js.native
  }
  
}

