package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "extensions")
@js.native
object extensions extends js.Object {
  
  val all: js.Array[Extension[js.Any]] = js.native
  
  def getExtension(extensionId: String): js.UndefOr[Extension[_]] = js.native
  @JSName("getExtension")
  def getExtension_T[T](extensionId: String): js.UndefOr[Extension[T]] = js.native
  
  val onDidChange: Event[Unit] = js.native
}
