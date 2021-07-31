package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticRelatedInformation extends StObject {
  
  /**
    * The location of this related diagnostic information.
    */
  var location: Location
  
  /**
    * The message of this related diagnostic information.
    */
  var message: String
}
object DiagnosticRelatedInformation {
  
  @scala.inline
  def apply(location: Location, message: String): DiagnosticRelatedInformation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticRelatedInformation]
  }
  
  @JSImport("vscode-languageserver-types", "DiagnosticRelatedInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DiagnosticRelatedInformation literal.
    */
  @scala.inline
  def create(location: Location, message: String): DiagnosticRelatedInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(location.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[DiagnosticRelatedInformation]
  
  /**
    * Checks whether the given literal conforms to the [DiagnosticRelatedInformation](#DiagnosticRelatedInformation) interface.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DiagnosticRelatedInformation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.DiagnosticRelatedInformation */ Boolean]
  
  @scala.inline
  implicit class DiagnosticRelatedInformationMutableBuilder[Self <: DiagnosticRelatedInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
