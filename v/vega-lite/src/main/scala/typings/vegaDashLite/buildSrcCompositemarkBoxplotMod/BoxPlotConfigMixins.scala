package typings.vegaDashLite.buildSrcCompositemarkBoxplotMod

import typings.vegaDashLite.buildSrcMarkMod.MarkConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxPlotConfigMixins extends js.Object {
  /**
    * Box Config
    * @hide
    */
  var box: js.UndefOr[BoxPlotConfig] = js.undefined
  /**
    * @hide
    */
  var boxMid: js.UndefOr[MarkConfig] = js.undefined
  /**
    * @hide
    */
  var boxWhisker: js.UndefOr[MarkConfig] = js.undefined
}

object BoxPlotConfigMixins {
  @scala.inline
  def apply(box: BoxPlotConfig = null, boxMid: MarkConfig = null, boxWhisker: MarkConfig = null): BoxPlotConfigMixins = {
    val __obj = js.Dynamic.literal()
    if (box != null) __obj.updateDynamic("box")(box)
    if (boxMid != null) __obj.updateDynamic("boxMid")(boxMid)
    if (boxWhisker != null) __obj.updateDynamic("boxWhisker")(boxWhisker)
    __obj.asInstanceOf[BoxPlotConfigMixins]
  }
}

