package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuPopupEventMap extends ProxyEventMap {
  var click: MenuPopupClickEvent
}

object MenuPopupEventMap {
  @scala.inline
  def apply(click: MenuPopupClickEvent): MenuPopupEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPopupEventMap]
  }
}

