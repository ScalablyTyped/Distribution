package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckBox extends StObject {
  
  var checkBox: scala.Double = js.native
  
  var combo: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var passwordBox: scala.Double = js.native
  
  var radioButtons: scala.Double = js.native
  
  var textArea: scala.Double = js.native
  
  var textBox: scala.Double = js.native
}
object CheckBox {
  
  @scala.inline
  def apply(
    checkBox: scala.Double,
    combo: scala.Double,
    none: scala.Double,
    passwordBox: scala.Double,
    radioButtons: scala.Double,
    textArea: scala.Double,
    textBox: scala.Double
  ): CheckBox = {
    val __obj = js.Dynamic.literal(checkBox = checkBox.asInstanceOf[js.Any], combo = combo.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], passwordBox = passwordBox.asInstanceOf[js.Any], radioButtons = radioButtons.asInstanceOf[js.Any], textArea = textArea.asInstanceOf[js.Any], textBox = textBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBox]
  }
  
  @scala.inline
  implicit class CheckBoxMutableBuilder[Self <: CheckBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckBox(value: scala.Double): Self = StObject.set(x, "checkBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombo(value: scala.Double): Self = StObject.set(x, "combo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordBox(value: scala.Double): Self = StObject.set(x, "passwordBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioButtons(value: scala.Double): Self = StObject.set(x, "radioButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextArea(value: scala.Double): Self = StObject.set(x, "textArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBox(value: scala.Double): Self = StObject.set(x, "textBox", value.asInstanceOf[js.Any])
  }
}
