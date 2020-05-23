package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows apps to add a collection of enumerable options to the app print experience. */
trait PrintCustomItemDetails extends js.Object {
  /** Gets or sets the display name of the custom print task option item. */
  var itemDisplayName: String
  /** Gets the ID of the custom print task option item. */
  var itemId: String
}

object PrintCustomItemDetails {
  @scala.inline
  def apply(itemDisplayName: String, itemId: String): PrintCustomItemDetails = {
    val __obj = js.Dynamic.literal(itemDisplayName = itemDisplayName.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCustomItemDetails]
  }
}

