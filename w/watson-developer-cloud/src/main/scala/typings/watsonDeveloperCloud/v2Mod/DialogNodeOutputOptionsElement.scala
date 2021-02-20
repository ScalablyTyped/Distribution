package typings.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogNodeOutputOptionsElement. */
@js.native
trait DialogNodeOutputOptionsElement extends StObject {
  
  /** The user-facing label for the option. */
  var label: String = js.native
  
  /** An object defining the message input to be sent to the assistant if the user selects the corresponding option. */
  var value: DialogNodeOutputOptionsElementValue = js.native
}
object DialogNodeOutputOptionsElement {
  
  @scala.inline
  def apply(label: String, value: DialogNodeOutputOptionsElementValue): DialogNodeOutputOptionsElement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeOutputOptionsElement]
  }
  
  @scala.inline
  implicit class DialogNodeOutputOptionsElementMutableBuilder[Self <: DialogNodeOutputOptionsElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: DialogNodeOutputOptionsElementValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
