package typings.stropheDotJs.stropheDotJsMod.Strophe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var keepalive: js.UndefOr[Boolean] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    keepalive: js.UndefOr[Boolean] = js.undefined,
    protocol: String = null,
    sync: js.UndefOr[Boolean] = js.undefined
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[ConnectionOptions]
  }
}

