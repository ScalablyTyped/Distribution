package typings.tgfancy.tgfancyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSocketOptions extends js.Object {
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  var url: String
}

object WebSocketOptions {
  @scala.inline
  def apply(url: String, autoOpen: js.UndefOr[Boolean] = js.undefined): WebSocketOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketOptions]
  }
}

