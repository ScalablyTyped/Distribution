package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Macropicker dialog options object
  */
@js.native
trait IMacroPickerOptions extends StObject {
  
  /*callback function*/
  var callback: js.Function = js.native
}
object IMacroPickerOptions {
  
  @scala.inline
  def apply(callback: js.Function): IMacroPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMacroPickerOptions]
  }
  
  @scala.inline
  implicit class IMacroPickerOptionsMutableBuilder[Self <: IMacroPickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
  }
}
