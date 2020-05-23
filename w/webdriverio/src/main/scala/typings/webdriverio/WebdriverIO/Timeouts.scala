package typings.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeouts extends js.Object {
  var `implicit`: js.UndefOr[Double] = js.undefined
  var pageLoad: js.UndefOr[Double] = js.undefined
  var script: js.UndefOr[Double] = js.undefined
}

object Timeouts {
  @scala.inline
  def apply(
    `implicit`: js.UndefOr[Double] = js.undefined,
    pageLoad: js.UndefOr[Double] = js.undefined,
    script: js.UndefOr[Double] = js.undefined
  ): Timeouts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`implicit`)) __obj.updateDynamic("implicit")(`implicit`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageLoad)) __obj.updateDynamic("pageLoad")(pageLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(script)) __obj.updateDynamic("script")(script.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeouts]
  }
}

