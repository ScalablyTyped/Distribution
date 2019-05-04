package typings
package vegaDashLiteLib.buildSrcCompositemarkBoxplotMod

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
  var boxMid: js.UndefOr[vegaDashLiteLib.buildSrcMarkMod.MarkConfig] = js.undefined
  /**
    * @hide
    */
  var boxWhisker: js.UndefOr[vegaDashLiteLib.buildSrcMarkMod.MarkConfig] = js.undefined
}

object BoxPlotConfigMixins {
  @scala.inline
  def apply(
    box: BoxPlotConfig = null,
    boxMid: vegaDashLiteLib.buildSrcMarkMod.MarkConfig = null,
    boxWhisker: vegaDashLiteLib.buildSrcMarkMod.MarkConfig = null
  ): BoxPlotConfigMixins = {
    val __obj = js.Dynamic.literal()
    if (box != null) __obj.updateDynamic("box")(box)
    if (boxMid != null) __obj.updateDynamic("boxMid")(boxMid)
    if (boxWhisker != null) __obj.updateDynamic("boxWhisker")(boxWhisker)
    __obj.asInstanceOf[BoxPlotConfigMixins]
  }
}

