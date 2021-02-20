package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Iconpicker dialog options object
  */
@js.native
trait IIconPickerOptions extends StObject {
  
  /*callback function*/
  var callback: js.Function = js.native
}
object IIconPickerOptions {
  
  @scala.inline
  def apply(callback: js.Function): IIconPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconPickerOptions]
  }
  
  @scala.inline
  implicit class IIconPickerOptionsMutableBuilder[Self <: IIconPickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
  }
}
