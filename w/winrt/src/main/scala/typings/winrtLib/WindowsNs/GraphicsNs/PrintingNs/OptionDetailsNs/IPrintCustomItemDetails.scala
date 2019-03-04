package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintCustomItemDetails extends js.Object {
  var itemDisplayName: java.lang.String
  var itemId: java.lang.String
}

object IPrintCustomItemDetails {
  @scala.inline
  def apply(itemDisplayName: java.lang.String, itemId: java.lang.String): IPrintCustomItemDetails = {
    val __obj = js.Dynamic.literal(itemDisplayName = itemDisplayName, itemId = itemId)
  
    __obj.asInstanceOf[IPrintCustomItemDetails]
  }
}

