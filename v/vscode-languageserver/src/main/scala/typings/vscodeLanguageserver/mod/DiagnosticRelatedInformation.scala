package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DiagnosticRelatedInformation {
  
  @JSImport("vscode-languageserver", "DiagnosticRelatedInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DiagnosticRelatedInformation literal.
    */
  inline def create(location: typings.vscodeLanguageserverTypes.mod.Location, message: String): typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(location.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  
  /**
    * Checks whether the given literal conforms to the [DiagnosticRelatedInformation](#DiagnosticRelatedInformation) interface.
    */
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DiagnosticRelatedInformation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.DiagnosticRelatedInformation */ Boolean]
}
