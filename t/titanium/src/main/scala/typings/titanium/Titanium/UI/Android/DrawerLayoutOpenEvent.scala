package typings.titanium.Titanium.UI.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the drawer view is opened.
  */
trait DrawerLayoutOpenEvent extends DrawerLayoutBaseEvent {
  /**
    * Contains the drawer frame type. Either `left` or `right`.
    */
  var drawer: String
}

object DrawerLayoutOpenEvent {
  @scala.inline
  def apply(drawer: String, source: DrawerLayout): DrawerLayoutOpenEvent = {
    val __obj = js.Dynamic.literal(drawer = drawer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutOpenEvent]
  }
}

