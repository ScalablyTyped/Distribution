package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Iconpicker dialog options object
  */
trait ITreePickerOptions extends StObject {
  
  /*callback function*/
  var callback: js.Function
  
  /*should the tree pick one or multiple items before returning*/
  var multiPicker: Boolean
  
  /*tree section to display*/
  var section: String
  
  /*specific tree to display*/
  var treeAlias: String
}
object ITreePickerOptions {
  
  inline def apply(callback: js.Function, multiPicker: Boolean, section: String, treeAlias: String): ITreePickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], multiPicker = multiPicker.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], treeAlias = treeAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreePickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITreePickerOptions] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setMultiPicker(value: Boolean): Self = StObject.set(x, "multiPicker", value.asInstanceOf[js.Any])
    
    inline def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setTreeAlias(value: String): Self = StObject.set(x, "treeAlias", value.asInstanceOf[js.Any])
  }
}
