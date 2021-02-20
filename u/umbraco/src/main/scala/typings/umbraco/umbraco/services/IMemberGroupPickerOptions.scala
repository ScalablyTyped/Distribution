package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Member group picker dialog options object
  */
@js.native
trait IMemberGroupPickerOptions extends StObject {
  
  /*callback function*/
  var callback: js.Function = js.native
  
  /*should the tree pick one or multiple members before returning*/
  var multiPicker: Boolean = js.native
}
object IMemberGroupPickerOptions {
  
  @scala.inline
  def apply(callback: js.Function, multiPicker: Boolean): IMemberGroupPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], multiPicker = multiPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMemberGroupPickerOptions]
  }
  
  @scala.inline
  implicit class IMemberGroupPickerOptionsMutableBuilder[Self <: IMemberGroupPickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiPicker(value: Boolean): Self = StObject.set(x, "multiPicker", value.asInstanceOf[js.Any])
  }
}
