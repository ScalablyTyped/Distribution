package typings
package yogDashBigpipeLib.yogDashBigpipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigPipeOption extends js.Object {
  var skipAnalysis: js.UndefOr[scala.Boolean] = js.undefined
  var tpl: js.UndefOr[yogDashBigpipeLib.Anon_Default] = js.undefined
}

object BigPipeOption {
  @scala.inline
  def apply(skipAnalysis: js.UndefOr[scala.Boolean] = js.undefined, tpl: yogDashBigpipeLib.Anon_Default = null): BigPipeOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipAnalysis)) __obj.updateDynamic("skipAnalysis")(skipAnalysis)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[BigPipeOption]
  }
}

