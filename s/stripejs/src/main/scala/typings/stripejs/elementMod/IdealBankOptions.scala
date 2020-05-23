package typings.stripejs.elementMod

import typings.stripejs.anon.Empty
import typings.stripejs.anon.Invalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdealBankOptions extends BaseOptions {
  /**
    * A pre-filled value for the Element. Can be one of the banks listed in the
    * @see https://stripe.com/docs/sources/ideal#optional-specifying-the-customers-bank
    *
    * @example 'abn_amro'
    */
  var value: js.UndefOr[String] = js.undefined
}

object IdealBankOptions {
  @scala.inline
  def apply(
    classes: Empty = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hideIcon: js.UndefOr[Boolean] = js.undefined,
    style: Invalid = null,
    value: String = null
  ): IdealBankOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdealBankOptions]
  }
}

