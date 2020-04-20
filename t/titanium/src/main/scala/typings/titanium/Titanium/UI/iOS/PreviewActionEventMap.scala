package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewActionEventMap extends ProxyEventMap {
  var click: PreviewActionClickEvent
}

object PreviewActionEventMap {
  @scala.inline
  def apply(click: PreviewActionClickEvent): PreviewActionEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewActionEventMap]
  }
}

