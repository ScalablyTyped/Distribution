package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SignatureInformation {
  
  @JSImport("vscode-languageserver", "SignatureInformation")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    label: String,
    documentation: String,
    parameters: typings.vscodeLanguageserverTypes.mod.ParameterInformation*
  ): typings.vscodeLanguageserverTypes.mod.SignatureInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.SignatureInformation]
  @scala.inline
  def create(
    label: String,
    documentation: Unit,
    parameters: typings.vscodeLanguageserverTypes.mod.ParameterInformation*
  ): typings.vscodeLanguageserverTypes.mod.SignatureInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.SignatureInformation]
}
