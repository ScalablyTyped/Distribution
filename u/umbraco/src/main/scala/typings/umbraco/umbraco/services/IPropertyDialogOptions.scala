package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property dialog options object
  */
@js.native
trait IPropertyDialogOptions extends StObject {
  
  /*callback function*/
  var callback: js.Function = js.native
  
  /*editor to use to edit a given value and return on callback*/
  var editor: String = js.native
  
  /*value sent to the property editor*/
  var value: js.Object = js.native
}
object IPropertyDialogOptions {
  
  @scala.inline
  def apply(callback: js.Function, editor: String, value: js.Object): IPropertyDialogOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDialogOptions]
  }
  
  @scala.inline
  implicit class IPropertyDialogOptionsMutableBuilder[Self <: IPropertyDialogOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
