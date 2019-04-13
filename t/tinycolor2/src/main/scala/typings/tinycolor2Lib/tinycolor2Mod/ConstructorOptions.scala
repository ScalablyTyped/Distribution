package typings
package tinycolor2Lib.tinycolor2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var gradientType: js.UndefOr[scala.Boolean] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(format: java.lang.String = null, gradientType: js.UndefOr[scala.Boolean] = js.undefined): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(gradientType)) __obj.updateDynamic("gradientType")(gradientType)
    __obj.asInstanceOf[ConstructorOptions]
  }
}

