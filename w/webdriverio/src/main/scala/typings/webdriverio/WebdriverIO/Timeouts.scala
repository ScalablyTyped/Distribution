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
  def apply(`implicit`: Int | Double = null, pageLoad: Int | Double = null, script: Int | Double = null): Timeouts = {
    val __obj = js.Dynamic.literal()
    if (`implicit` != null) __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    if (pageLoad != null) __obj.updateDynamic("pageLoad")(pageLoad.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeouts]
  }
}

