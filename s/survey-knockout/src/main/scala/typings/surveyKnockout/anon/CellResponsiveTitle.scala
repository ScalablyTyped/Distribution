package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellResponsiveTitle extends StObject {
  
  var cellLabel: String
  
  var cellResponsiveTitle: String
  
  var cellText: String
  
  var cellTextSelected: String
  
  var itemChecked: String
  
  var itemDecorator: String
  
  var itemValue: String
  
  var label: String
  
  var materialDecorator: String
  
  var root: String
  
  var row: String
}
object CellResponsiveTitle {
  
  inline def apply(
    cellLabel: String,
    cellResponsiveTitle: String,
    cellText: String,
    cellTextSelected: String,
    itemChecked: String,
    itemDecorator: String,
    itemValue: String,
    label: String,
    materialDecorator: String,
    root: String,
    row: String
  ): CellResponsiveTitle = {
    val __obj = js.Dynamic.literal(cellLabel = cellLabel.asInstanceOf[js.Any], cellResponsiveTitle = cellResponsiveTitle.asInstanceOf[js.Any], cellText = cellText.asInstanceOf[js.Any], cellTextSelected = cellTextSelected.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], materialDecorator = materialDecorator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellResponsiveTitle]
  }
  
  extension [Self <: CellResponsiveTitle](x: Self) {
    
    inline def setCellLabel(value: String): Self = StObject.set(x, "cellLabel", value.asInstanceOf[js.Any])
    
    inline def setCellResponsiveTitle(value: String): Self = StObject.set(x, "cellResponsiveTitle", value.asInstanceOf[js.Any])
    
    inline def setCellText(value: String): Self = StObject.set(x, "cellText", value.asInstanceOf[js.Any])
    
    inline def setCellTextSelected(value: String): Self = StObject.set(x, "cellTextSelected", value.asInstanceOf[js.Any])
    
    inline def setItemChecked(value: String): Self = StObject.set(x, "itemChecked", value.asInstanceOf[js.Any])
    
    inline def setItemDecorator(value: String): Self = StObject.set(x, "itemDecorator", value.asInstanceOf[js.Any])
    
    inline def setItemValue(value: String): Self = StObject.set(x, "itemValue", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMaterialDecorator(value: String): Self = StObject.set(x, "materialDecorator", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
