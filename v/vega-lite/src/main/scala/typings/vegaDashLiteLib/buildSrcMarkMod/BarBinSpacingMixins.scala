package typings
package vegaDashLiteLib.buildSrcMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarBinSpacingMixins extends js.Object {
  /**
    * Offset between bars for binned field.  Ideal value for this is either 0 (Preferred by statisticians) or 1 (Vega-Lite Default, D3 example style).
    *
    * __Default value:__ `1`
    *
    * @minimum 0
    */
  var binSpacing: js.UndefOr[scala.Double] = js.undefined
}

object BarBinSpacingMixins {
  @scala.inline
  def apply(binSpacing: scala.Int | scala.Double = null): BarBinSpacingMixins = {
    val __obj = js.Dynamic.literal()
    if (binSpacing != null) __obj.updateDynamic("binSpacing")(binSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarBinSpacingMixins]
  }
}

