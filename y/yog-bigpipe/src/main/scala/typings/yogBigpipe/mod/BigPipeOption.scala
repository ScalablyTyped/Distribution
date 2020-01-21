package typings.yogBigpipe.mod

import typings.yogBigpipe.AnonDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigPipeOption extends js.Object {
  var skipAnalysis: js.UndefOr[Boolean] = js.undefined
  var tpl: js.UndefOr[AnonDefault] = js.undefined
}

object BigPipeOption {
  @scala.inline
  def apply(skipAnalysis: js.UndefOr[Boolean] = js.undefined, tpl: AnonDefault = null): BigPipeOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipAnalysis)) __obj.updateDynamic("skipAnalysis")(skipAnalysis.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigPipeOption]
  }
}

