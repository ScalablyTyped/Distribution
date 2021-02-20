package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagnosticRelatedInformation extends StObject {
  
  /**
    * The location of this related diagnostic information.
    */
  var location: Location = js.native
  
  /**
    * The message of this related diagnostic information.
    */
  var message: String = js.native
}
object DiagnosticRelatedInformation {
  
  @scala.inline
  def apply(location: Location, message: String): DiagnosticRelatedInformation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticRelatedInformation]
  }
  
  /**
    * Creates a new DiagnosticRelatedInformation literal.
    */
  @JSImport("vscode-languageserver-types", "DiagnosticRelatedInformation.create")
  @js.native
  def create(location: Location, message: String): DiagnosticRelatedInformation = js.native
  
  /**
    * Checks whether the given literal conforms to the [DiagnosticRelatedInformation](#DiagnosticRelatedInformation) interface.
    */
  @JSImport("vscode-languageserver-types", "DiagnosticRelatedInformation.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DiagnosticRelatedInformation */ Boolean = js.native
  
  @scala.inline
  implicit class DiagnosticRelatedInformationMutableBuilder[Self <: DiagnosticRelatedInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
