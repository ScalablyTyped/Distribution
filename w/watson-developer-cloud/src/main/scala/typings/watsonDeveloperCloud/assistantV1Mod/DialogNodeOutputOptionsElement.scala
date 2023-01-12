package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogNodeOutputOptionsElement. */
trait DialogNodeOutputOptionsElement extends StObject {
  
  /** The user-facing label for the option. */
  var label: String
  
  /** An object defining the message input to be sent to the Watson Assistant service if the user selects the corresponding option. */
  var value: DialogNodeOutputOptionsElementValue
}
object DialogNodeOutputOptionsElement {
  
  inline def apply(label: String, value: DialogNodeOutputOptionsElementValue): DialogNodeOutputOptionsElement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeOutputOptionsElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogNodeOutputOptionsElement] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DialogNodeOutputOptionsElementValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
