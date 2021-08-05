package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cell extends StObject {
  
  var cell: String
  
  var detailButton: String
  
  var detailButtonExpanded: String
  
  var detailCell: String
  
  var detailIcon: String
  
  var detailIconExpanded: String
  
  var detailPanelCell: String
  
  var detailRowText: String
  
  var headerCell: String
  
  var root: String
}
object Cell {
  
  inline def apply(
    cell: String,
    detailButton: String,
    detailButtonExpanded: String,
    detailCell: String,
    detailIcon: String,
    detailIconExpanded: String,
    detailPanelCell: String,
    detailRowText: String,
    headerCell: String,
    root: String
  ): Cell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], detailButton = detailButton.asInstanceOf[js.Any], detailButtonExpanded = detailButtonExpanded.asInstanceOf[js.Any], detailCell = detailCell.asInstanceOf[js.Any], detailIcon = detailIcon.asInstanceOf[js.Any], detailIconExpanded = detailIconExpanded.asInstanceOf[js.Any], detailPanelCell = detailPanelCell.asInstanceOf[js.Any], detailRowText = detailRowText.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
  
  extension [Self <: Cell](x: Self) {
    
    inline def setCell(value: String): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setDetailButton(value: String): Self = StObject.set(x, "detailButton", value.asInstanceOf[js.Any])
    
    inline def setDetailButtonExpanded(value: String): Self = StObject.set(x, "detailButtonExpanded", value.asInstanceOf[js.Any])
    
    inline def setDetailCell(value: String): Self = StObject.set(x, "detailCell", value.asInstanceOf[js.Any])
    
    inline def setDetailIcon(value: String): Self = StObject.set(x, "detailIcon", value.asInstanceOf[js.Any])
    
    inline def setDetailIconExpanded(value: String): Self = StObject.set(x, "detailIconExpanded", value.asInstanceOf[js.Any])
    
    inline def setDetailPanelCell(value: String): Self = StObject.set(x, "detailPanelCell", value.asInstanceOf[js.Any])
    
    inline def setDetailRowText(value: String): Self = StObject.set(x, "detailRowText", value.asInstanceOf[js.Any])
    
    inline def setHeaderCell(value: String): Self = StObject.set(x, "headerCell", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
