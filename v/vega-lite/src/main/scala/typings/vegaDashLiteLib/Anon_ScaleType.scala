package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScaleType extends js.Object {
  var scaleType: js.UndefOr[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.undefined
  var zeroFalse: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ScaleType {
  @scala.inline
  def apply(
    scaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType = null,
    zeroFalse: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ScaleType = {
    val __obj = js.Dynamic.literal()
    if (scaleType != null) __obj.updateDynamic("scaleType")(scaleType)
    if (!js.isUndefined(zeroFalse)) __obj.updateDynamic("zeroFalse")(zeroFalse)
    __obj.asInstanceOf[Anon_ScaleType]
  }
}

