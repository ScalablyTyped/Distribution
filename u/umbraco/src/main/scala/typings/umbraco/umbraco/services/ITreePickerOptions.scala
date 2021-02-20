package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Iconpicker dialog options object
  */
@js.native
trait ITreePickerOptions extends StObject {
  
  /*callback function*/
  var callback: js.Function = js.native
  
  /*should the tree pick one or multiple items before returning*/
  var multiPicker: Boolean = js.native
  
  /*tree section to display*/
  var section: String = js.native
  
  /*specific tree to display*/
  var treeAlias: String = js.native
}
object ITreePickerOptions {
  
  @scala.inline
  def apply(callback: js.Function, multiPicker: Boolean, section: String, treeAlias: String): ITreePickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], multiPicker = multiPicker.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], treeAlias = treeAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreePickerOptions]
  }
  
  @scala.inline
  implicit class ITreePickerOptionsMutableBuilder[Self <: ITreePickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiPicker(value: Boolean): Self = StObject.set(x, "multiPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeAlias(value: String): Self = StObject.set(x, "treeAlias", value.asInstanceOf[js.Any])
  }
}
