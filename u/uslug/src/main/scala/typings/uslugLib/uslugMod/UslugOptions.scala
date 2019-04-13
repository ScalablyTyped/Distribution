package typings
package uslugLib.uslugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UslugOptions extends js.Object {
  var allowedChars: js.UndefOr[java.lang.String] = js.undefined
  var lower: js.UndefOr[scala.Boolean] = js.undefined
  var spaces: js.UndefOr[scala.Boolean] = js.undefined
}

object UslugOptions {
  @scala.inline
  def apply(
    allowedChars: java.lang.String = null,
    lower: js.UndefOr[scala.Boolean] = js.undefined,
    spaces: js.UndefOr[scala.Boolean] = js.undefined
  ): UslugOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedChars != null) __obj.updateDynamic("allowedChars")(allowedChars)
    if (!js.isUndefined(lower)) __obj.updateDynamic("lower")(lower)
    if (!js.isUndefined(spaces)) __obj.updateDynamic("spaces")(spaces)
    __obj.asInstanceOf[UslugOptions]
  }
}

