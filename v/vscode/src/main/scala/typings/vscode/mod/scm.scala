package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "scm")
@js.native
object scm extends js.Object {
  
  def createSourceControl(id: String, label: String): SourceControl = js.native
  def createSourceControl(id: String, label: String, rootUri: Uri): SourceControl = js.native
  
  val inputBox: SourceControlInputBox = js.native
}
