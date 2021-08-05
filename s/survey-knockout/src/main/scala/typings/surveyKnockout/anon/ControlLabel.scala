package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlLabel extends StObject {
  
  var column: String
  
  var controlLabel: String
  
  var item: String
  
  var itemChecked: String
  
  var itemControl: String
  
  var itemDecorator: String
  
  var itemInline: String
  
  var itemNone: String
  
  var itemSelectAll: String
  
  var label: String
  
  var labelChecked: String
  
  var materialDecorator: String
  
  var other: String
  
  var root: String
}
object ControlLabel {
  
  inline def apply(
    column: String,
    controlLabel: String,
    item: String,
    itemChecked: String,
    itemControl: String,
    itemDecorator: String,
    itemInline: String,
    itemNone: String,
    itemSelectAll: String,
    label: String,
    labelChecked: String,
    materialDecorator: String,
    other: String,
    root: String
  ): ControlLabel = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], controlLabel = controlLabel.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemControl = itemControl.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], itemInline = itemInline.asInstanceOf[js.Any], itemNone = itemNone.asInstanceOf[js.Any], itemSelectAll = itemSelectAll.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelChecked = labelChecked.asInstanceOf[js.Any], materialDecorator = materialDecorator.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlLabel]
  }
  
  extension [Self <: ControlLabel](x: Self) {
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setControlLabel(value: String): Self = StObject.set(x, "controlLabel", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemChecked(value: String): Self = StObject.set(x, "itemChecked", value.asInstanceOf[js.Any])
    
    inline def setItemControl(value: String): Self = StObject.set(x, "itemControl", value.asInstanceOf[js.Any])
    
    inline def setItemDecorator(value: String): Self = StObject.set(x, "itemDecorator", value.asInstanceOf[js.Any])
    
    inline def setItemInline(value: String): Self = StObject.set(x, "itemInline", value.asInstanceOf[js.Any])
    
    inline def setItemNone(value: String): Self = StObject.set(x, "itemNone", value.asInstanceOf[js.Any])
    
    inline def setItemSelectAll(value: String): Self = StObject.set(x, "itemSelectAll", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelChecked(value: String): Self = StObject.set(x, "labelChecked", value.asInstanceOf[js.Any])
    
    inline def setMaterialDecorator(value: String): Self = StObject.set(x, "materialDecorator", value.asInstanceOf[js.Any])
    
    inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
