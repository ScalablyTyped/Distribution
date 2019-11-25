package typings.validateDotJs.validateDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectFormValuesOption extends js.Object {
  var nullify: js.UndefOr[Boolean] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
}

object CollectFormValuesOption {
  @scala.inline
  def apply(nullify: js.UndefOr[Boolean] = js.undefined, trim: js.UndefOr[Boolean] = js.undefined): CollectFormValuesOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nullify)) __obj.updateDynamic("nullify")(nullify.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectFormValuesOption]
  }
}

