package typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

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
    val __obj = js.Dynamic.literal(itemDisplayName = itemDisplayName, itemId = itemId)
  
    __obj.asInstanceOf[IPrintCustomItemDetails]
  }
}

