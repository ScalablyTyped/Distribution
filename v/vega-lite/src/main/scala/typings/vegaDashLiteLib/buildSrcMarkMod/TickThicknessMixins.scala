package typings
package vegaDashLiteLib.buildSrcMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TickThicknessMixins extends js.Object {
  /**
    * Thickness of the tick mark.
    *
    * __Default value:__  `1`
    *
    * @minimum 0
    */
  var thickness: js.UndefOr[scala.Double] = js.undefined
}

object TickThicknessMixins {
  @scala.inline
  def apply(thickness: scala.Int | scala.Double = null): TickThicknessMixins = {
    val __obj = js.Dynamic.literal()
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickThicknessMixins]
  }
}

