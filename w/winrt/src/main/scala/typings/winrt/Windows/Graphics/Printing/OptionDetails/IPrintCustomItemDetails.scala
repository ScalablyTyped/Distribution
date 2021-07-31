package typings.winrt.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintCustomItemDetails extends StObject {
  
  var itemDisplayName: String
  
  var itemId: String
}
object IPrintCustomItemDetails {
  
  @scala.inline
  def apply(itemDisplayName: String, itemId: String): IPrintCustomItemDetails = {
    val __obj = js.Dynamic.literal(itemDisplayName = itemDisplayName.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintCustomItemDetails]
  }
  
  @scala.inline
  implicit class IPrintCustomItemDetailsMutableBuilder[Self <: IPrintCustomItemDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemDisplayName(value: String): Self = StObject.set(x, "itemDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
  }
}
