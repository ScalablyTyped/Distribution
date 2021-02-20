package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SignatureInformation {
  
  @JSImport("vscode-languageserver-protocol", "SignatureInformation.create")
  @js.native
  def create(
    label: String,
    documentation: js.UndefOr[scala.Nothing],
    parameters: typings.vscodeLanguageserverTypes.mod.ParameterInformation*
  ): typings.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
  @JSImport("vscode-languageserver-protocol", "SignatureInformation.create")
  @js.native
  def create(
    label: String,
    documentation: String,
    parameters: typings.vscodeLanguageserverTypes.mod.ParameterInformation*
  ): typings.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
}
