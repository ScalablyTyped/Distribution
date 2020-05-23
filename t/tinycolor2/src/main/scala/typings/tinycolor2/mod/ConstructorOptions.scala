package typings.tinycolor2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var gradientType: js.UndefOr[Boolean] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(format: String = null, gradientType: js.UndefOr[Boolean] = js.undefined): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientType)) __obj.updateDynamic("gradientType")(gradientType.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorOptions]
  }
}

