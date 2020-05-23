package typings.titanium.Titanium.UI.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the drawer view is closed.
  */
trait DrawerLayoutCloseEvent extends DrawerLayoutBaseEvent {
  /**
    * Contains the drawer frame type. Either `left` or `right`.
    */
  var drawer: String
}

object DrawerLayoutCloseEvent {
  @scala.inline
  def apply(drawer: String, source: DrawerLayout): DrawerLayoutCloseEvent = {
    val __obj = js.Dynamic.literal(drawer = drawer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutCloseEvent]
  }
}

