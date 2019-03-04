package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Touch extends js.Object {
  var clientX: scala.Double
  var clientY: scala.Double
  var identifier: scala.Double
  var pageX: scala.Double
  var pageY: scala.Double
}

object Touch {
  @scala.inline
  def apply(
    clientX: scala.Double,
    clientY: scala.Double,
    identifier: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double
  ): Touch = {
    val __obj = js.Dynamic.literal(clientX = clientX, clientY = clientY, identifier = identifier, pageX = pageX, pageY = pageY)
  
    __obj.asInstanceOf[Touch]
  }
}

