package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeouts extends js.Object {
  var `implicit`: js.UndefOr[scala.Double] = js.undefined
  var pageLoad: js.UndefOr[scala.Double] = js.undefined
  var script: js.UndefOr[scala.Double] = js.undefined
}

object Timeouts {
  @scala.inline
  def apply(
    `implicit`: scala.Int | scala.Double = null,
    pageLoad: scala.Int | scala.Double = null,
    script: scala.Int | scala.Double = null
  ): Timeouts = {
    val __obj = js.Dynamic.literal()
    if (`implicit` != null) __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    if (pageLoad != null) __obj.updateDynamic("pageLoad")(pageLoad.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeouts]
  }
}

