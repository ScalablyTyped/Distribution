package typings.validator.validatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsMACAddressOptions extends js.Object {
  /**
    * If `no_colons` is `true`, the validator will allow MAC addresses without the colons.
    * Also, it allows the use of hyphens or spaces.
    *
    * e.g. `01 02 03 04 05 ab` or `01-02-03-04-05-ab`.
    *
    * @default false
    */
  var no_colons: js.UndefOr[Boolean] = js.undefined
}

object IsMACAddressOptions {
  @scala.inline
  def apply(no_colons: js.UndefOr[Boolean] = js.undefined): IsMACAddressOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(no_colons)) __obj.updateDynamic("no_colons")(no_colons)
    __obj.asInstanceOf[IsMACAddressOptions]
  }
}

