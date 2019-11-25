package typings.winrt.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintCustomItemDetails extends js.Object {
  var itemDisplayName: String
  var itemId: String
}

object IPrintCustomItemDetails {
  @scala.inline
  def apply(itemDisplayName: String, itemId: String): IPrintCustomItemDetails = {
    val __obj = js.Dynamic.literal(itemDisplayName = itemDisplayName.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPrintCustomItemDetails]
  }
}

