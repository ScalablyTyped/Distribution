package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the user clicks at one of the menu popup items.
  */
trait MenuPopupClickEvent extends MenuPopupBaseEvent {
  /**
    * The index of the clicked item.
    */
  var index: Double
  /**
    * The title of the clicked item.
    */
  var title: String
}

object MenuPopupClickEvent {
  @scala.inline
  def apply(index: Double, source: MenuPopup, title: String): MenuPopupClickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPopupClickEvent]
  }
}

