package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeAnnotation extends StObject {
  
  /**
    * A human-readable string which is rendered less prominent in
    * the user interface.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable string describing the actual change. The string
    * is rendered prominent in the user interface.
    */
  var label: String
  
  /**
    * A flag which indicates that user confirmation is needed
    * before applying the change.
    */
  var needsConfirmation: js.UndefOr[Boolean] = js.undefined
}
object ChangeAnnotation {
  
  inline def apply(label: String): ChangeAnnotation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeAnnotation]
  }
  
  @JSImport("vscode-languageserver-types", "ChangeAnnotation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(label: String): ChangeAnnotation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[ChangeAnnotation]
  inline def create(label: String, needsConfirmation: Boolean): ChangeAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], needsConfirmation.asInstanceOf[js.Any])).asInstanceOf[ChangeAnnotation]
  inline def create(label: String, needsConfirmation: Boolean, description: String): ChangeAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], needsConfirmation.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[ChangeAnnotation]
  inline def create(label: String, needsConfirmation: Unit, description: String): ChangeAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], needsConfirmation.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[ChangeAnnotation]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.ChangeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.ChangeAnnotation */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeAnnotation] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNeedsConfirmation(value: Boolean): Self = StObject.set(x, "needsConfirmation", value.asInstanceOf[js.Any])
    
    inline def setNeedsConfirmationUndefined: Self = StObject.set(x, "needsConfirmation", js.undefined)
  }
}
