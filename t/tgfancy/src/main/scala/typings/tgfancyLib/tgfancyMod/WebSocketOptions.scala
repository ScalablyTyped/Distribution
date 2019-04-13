package typings
package tgfancyLib.tgfancyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSocketOptions extends js.Object {
  var autoOpen: js.UndefOr[scala.Boolean] = js.undefined
  var url: java.lang.String
}

object WebSocketOptions {
  @scala.inline
  def apply(url: java.lang.String, autoOpen: js.UndefOr[scala.Boolean] = js.undefined): WebSocketOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen)
    __obj.asInstanceOf[WebSocketOptions]
  }
}

