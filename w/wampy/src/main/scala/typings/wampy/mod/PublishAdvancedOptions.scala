package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishAdvancedOptions extends AdvancedOptions {
  var eligible_authid: js.UndefOr[String | js.Array[String]] = js.native
  var eligible_authrole: js.UndefOr[String | js.Array[String]] = js.native
  var exclude_authid: js.UndefOr[String | js.Array[String]] = js.native
  var exclude_authrole: js.UndefOr[String | js.Array[String]] = js.native
}

object PublishAdvancedOptions {
  @scala.inline
  def apply(): PublishAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishAdvancedOptions]
  }
  @scala.inline
  implicit class PublishAdvancedOptionsOps[Self <: PublishAdvancedOptions] (val x: Self) extends AnyVal {
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
    def setEligible_authidVarargs(value: String*): Self = this.set("eligible_authid", js.Array(value :_*))
    @scala.inline
    def setEligible_authid(value: String | js.Array[String]): Self = this.set("eligible_authid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEligible_authid: Self = this.set("eligible_authid", js.undefined)
    @scala.inline
    def setEligible_authroleVarargs(value: String*): Self = this.set("eligible_authrole", js.Array(value :_*))
    @scala.inline
    def setEligible_authrole(value: String | js.Array[String]): Self = this.set("eligible_authrole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEligible_authrole: Self = this.set("eligible_authrole", js.undefined)
    @scala.inline
    def setExclude_authidVarargs(value: String*): Self = this.set("exclude_authid", js.Array(value :_*))
    @scala.inline
    def setExclude_authid(value: String | js.Array[String]): Self = this.set("exclude_authid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude_authid: Self = this.set("exclude_authid", js.undefined)
    @scala.inline
    def setExclude_authroleVarargs(value: String*): Self = this.set("exclude_authrole", js.Array(value :_*))
    @scala.inline
    def setExclude_authrole(value: String | js.Array[String]): Self = this.set("exclude_authrole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude_authrole: Self = this.set("exclude_authrole", js.undefined)
  }
  
}

