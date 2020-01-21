package typings.vscode.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "env")
@js.native
object env extends js.Object {
  val appName: String = js.native
  val appRoot: String = js.native
  val clipboard: Clipboard = js.native
  val language: String = js.native
  val machineId: String = js.native
  val remoteName: js.UndefOr[String] = js.native
  val sessionId: String = js.native
  val shell: String = js.native
  val uiKind: UIKind = js.native
  val uriScheme: String = js.native
  def asExternalUri(target: Uri): Thenable[Uri] = js.native
  def openExternal(target: Uri): Thenable[Boolean] = js.native
}

