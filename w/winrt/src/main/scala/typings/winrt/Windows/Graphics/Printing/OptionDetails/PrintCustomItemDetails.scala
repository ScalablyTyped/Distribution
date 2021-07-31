package typings.winrt.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintCustomItemDetails
  extends StObject
     with IPrintCustomItemDetails
object PrintCustomItemDetails {
  
  @scala.inline
  def apply(itemDisplayName: String, itemId: String): PrintCustomItemDetails = {
    val __obj = js.Dynamic.literal(itemDisplayName = itemDisplayName.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCustomItemDetails]
  }
}
