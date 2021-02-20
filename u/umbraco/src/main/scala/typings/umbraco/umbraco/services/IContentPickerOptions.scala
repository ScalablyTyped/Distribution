package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Content picker dialog options object
  */
@js.native
trait IContentPickerOptions extends StObject {
  
  /*callback function*/
  var callback: js.Function = js.native
  
  /*should the picker return one or multiple items*/
  var multipicker: Boolean = js.native
}
object IContentPickerOptions {
  
  @scala.inline
  def apply(callback: js.Function, multipicker: Boolean): IContentPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], multipicker = multipicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentPickerOptions]
  }
  
  @scala.inline
  implicit class IContentPickerOptionsMutableBuilder[Self <: IContentPickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipicker(value: Boolean): Self = StObject.set(x, "multipicker", value.asInstanceOf[js.Any])
  }
}
