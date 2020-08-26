package typings.stripejs.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdealBankOptions extends BaseOptions {
  /**
    * A pre-filled value for the Element. Can be one of the banks listed in the
    * @see https://stripe.com/docs/sources/ideal#optional-specifying-the-customers-bank
    *
    * @example 'abn_amro'
    */
  var value: js.UndefOr[String] = js.native
}

object IdealBankOptions {
  @scala.inline
  def apply(): IdealBankOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdealBankOptions]
  }
  @scala.inline
  implicit class IdealBankOptionsOps[Self <: IdealBankOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

