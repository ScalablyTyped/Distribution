package typings.uslug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UslugOptions extends js.Object {
  var allowedChars: js.UndefOr[String] = js.undefined
  var lower: js.UndefOr[Boolean] = js.undefined
  var spaces: js.UndefOr[Boolean] = js.undefined
}

object UslugOptions {
  @scala.inline
  def apply(
    allowedChars: String = null,
    lower: js.UndefOr[Boolean] = js.undefined,
    spaces: js.UndefOr[Boolean] = js.undefined
  ): UslugOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedChars != null) __obj.updateDynamic("allowedChars")(allowedChars.asInstanceOf[js.Any])
    if (!js.isUndefined(lower)) __obj.updateDynamic("lower")(lower.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spaces)) __obj.updateDynamic("spaces")(spaces.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UslugOptions]
  }
}

