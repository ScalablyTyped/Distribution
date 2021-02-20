package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scm {
  
  @JSImport("vscode", "scm.createSourceControl")
  @js.native
  def createSourceControl(id: String, label: String): SourceControl = js.native
  @JSImport("vscode", "scm.createSourceControl")
  @js.native
  def createSourceControl(id: String, label: String, rootUri: Uri): SourceControl = js.native
  
  @JSImport("vscode", "scm.inputBox")
  @js.native
  val inputBox: SourceControlInputBox = js.native
}
