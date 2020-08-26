package typings.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsMobilePhoneOptions extends js.Object {
  /**
    * If this is set to `true`, the mobile phone number must be supplied with the country code and therefore must start with `+`.
    *
    * @default false
    */
  var strictMode: js.UndefOr[Boolean] = js.native
}

object IsMobilePhoneOptions {
  @scala.inline
  def apply(): IsMobilePhoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsMobilePhoneOptions]
  }
  @scala.inline
  implicit class IsMobilePhoneOptionsOps[Self <: IsMobilePhoneOptions] (val x: Self) extends AnyVal {
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
    def setStrictMode(value: Boolean): Self = this.set("strictMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictMode: Self = this.set("strictMode", js.undefined)
  }
  
}

