package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DiagnosticRelatedInformation {
  
  /**
    * Creates a new DiagnosticRelatedInformation literal.
    */
  @JSImport("vscode-languageclient", "DiagnosticRelatedInformation.create")
  @js.native
  def create(location: typings.vscodeLanguageserverTypes.mod.Location, message: String): typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation = js.native
  
  /**
    * Checks whether the given literal conforms to the [DiagnosticRelatedInformation](#DiagnosticRelatedInformation) interface.
    */
  @JSImport("vscode-languageclient", "DiagnosticRelatedInformation.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DiagnosticRelatedInformation */ Boolean = js.native
}
