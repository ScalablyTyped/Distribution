package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailButton extends StObject {
  
  var detailButton: String = js.native
  
  var detailButtonExpanded: String = js.native
  
  var detailCell: String = js.native
  
  var detailIcon: String = js.native
  
  var detailIconExpanded: String = js.native
  
  var detailPanelCell: String = js.native
  
  var detailRowText: String = js.native
  
  var headerCell: String = js.native
  
  var itemValue: String = js.native
  
  var root: String = js.native
}
object DetailButton {
  
  @scala.inline
  def apply(
    detailButton: String,
    detailButtonExpanded: String,
    detailCell: String,
    detailIcon: String,
    detailIconExpanded: String,
    detailPanelCell: String,
    detailRowText: String,
    headerCell: String,
    itemValue: String,
    root: String
  ): DetailButton = {
    val __obj = js.Dynamic.literal(detailButton = detailButton.asInstanceOf[js.Any], detailButtonExpanded = detailButtonExpanded.asInstanceOf[js.Any], detailCell = detailCell.asInstanceOf[js.Any], detailIcon = detailIcon.asInstanceOf[js.Any], detailIconExpanded = detailIconExpanded.asInstanceOf[js.Any], detailPanelCell = detailPanelCell.asInstanceOf[js.Any], detailRowText = detailRowText.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailButton]
  }
  
  @scala.inline
  implicit class DetailButtonMutableBuilder[Self <: DetailButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailButton(value: String): Self = StObject.set(x, "detailButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailButtonExpanded(value: String): Self = StObject.set(x, "detailButtonExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailCell(value: String): Self = StObject.set(x, "detailCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailIcon(value: String): Self = StObject.set(x, "detailIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailIconExpanded(value: String): Self = StObject.set(x, "detailIconExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailPanelCell(value: String): Self = StObject.set(x, "detailPanelCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailRowText(value: String): Self = StObject.set(x, "detailRowText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderCell(value: String): Self = StObject.set(x, "headerCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemValue(value: String): Self = StObject.set(x, "itemValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
