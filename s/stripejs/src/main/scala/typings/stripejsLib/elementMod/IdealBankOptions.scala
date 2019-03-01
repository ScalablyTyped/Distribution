package typings
package stripejsLib.elementMod

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
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object IdealBankOptions {
  @scala.inline
  def apply(
    classes: stripejsLib.Anon_BaseCompleteEmpty = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hideIcon: js.UndefOr[scala.Boolean] = js.undefined,
    style: stripejsLib.Anon_BaseCompleteEmptyInvalid = null,
    value: java.lang.String = null
  ): IdealBankOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IdealBankOptions]
  }
}

