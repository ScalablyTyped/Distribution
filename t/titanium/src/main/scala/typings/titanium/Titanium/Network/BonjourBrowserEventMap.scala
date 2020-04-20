package typings.titanium.Titanium.Network

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BonjourBrowserEventMap extends ProxyEventMap {
  var updatedservices: BonjourBrowserUpdatedservicesEvent
}

object BonjourBrowserEventMap {
  @scala.inline
  def apply(updatedservices: BonjourBrowserUpdatedservicesEvent): BonjourBrowserEventMap = {
    val __obj = js.Dynamic.literal(updatedservices = updatedservices.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourBrowserEventMap]
  }
}

