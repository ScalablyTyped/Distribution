package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  var disabled: String
  
  var item: String
  
  var itemText: String
  
  var maxText: String
  
  var minText: String
  
  var root: String
  
  var selected: String
}
object Disabled {
  
  @scala.inline
  def apply(
    disabled: String,
    item: String,
    itemText: String,
    maxText: String,
    minText: String,
    root: String,
    selected: String
  ): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], maxText = maxText.asInstanceOf[js.Any], minText = minText.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  @scala.inline
  implicit class DisabledMutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemText(value: String): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxText(value: String): Self = StObject.set(x, "maxText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinText(value: String): Self = StObject.set(x, "minText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
