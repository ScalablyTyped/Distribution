package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkEventMap extends ProxyEventMap {
  var change: NetworkChangeEvent
}

object NetworkEventMap {
  @scala.inline
  def apply(change: NetworkChangeEvent): NetworkEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkEventMap]
  }
}

