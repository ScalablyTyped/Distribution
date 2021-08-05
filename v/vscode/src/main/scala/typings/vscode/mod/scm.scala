package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scm {
  
  @JSImport("vscode", "scm")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSourceControl(id: String, label: String): SourceControl = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceControl")(id.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[SourceControl]
  inline def createSourceControl(id: String, label: String, rootUri: Uri): SourceControl = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceControl")(id.asInstanceOf[js.Any], label.asInstanceOf[js.Any], rootUri.asInstanceOf[js.Any])).asInstanceOf[SourceControl]
  
  @JSImport("vscode", "scm.inputBox")
  @js.native
  val inputBox: SourceControlInputBox = js.native
}
