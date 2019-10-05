package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "scm")
@js.native
object scm extends js.Object {
  val inputBox: SourceControlInputBox = js.native
  def createSourceControl(id: String, label: String): SourceControl = js.native
  def createSourceControl(id: String, label: String, rootUri: Uri): SourceControl = js.native
}

