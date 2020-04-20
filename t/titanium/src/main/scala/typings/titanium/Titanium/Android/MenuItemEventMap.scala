package typings.titanium.Titanium.Android

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemEventMap extends ProxyEventMap {
  var click: MenuItemClickEvent
  var collapse: MenuItemCollapseEvent
  var expand: MenuItemExpandEvent
}

object MenuItemEventMap {
  @scala.inline
  def apply(click: MenuItemClickEvent, collapse: MenuItemCollapseEvent, expand: MenuItemExpandEvent): MenuItemEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], collapse = collapse.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemEventMap]
  }
}

