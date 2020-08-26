package typings.typedRestClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayFormat extends js.Object {
  var arrayFormat: js.UndefOr[String] = js.native
  var separator: js.UndefOr[String] = js.native
  var shouldAllowDots: js.UndefOr[Boolean] = js.native
  var shouldOnlyEncodeValues: js.UndefOr[Boolean] = js.native
}

object ArrayFormat {
  @scala.inline
  def apply(): ArrayFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayFormat]
  }
  @scala.inline
  implicit class ArrayFormatOps[Self <: ArrayFormat] (val x: Self) extends AnyVal {
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
    def setArrayFormat(value: String): Self = this.set("arrayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayFormat: Self = this.set("arrayFormat", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setShouldAllowDots(value: Boolean): Self = this.set("shouldAllowDots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldAllowDots: Self = this.set("shouldAllowDots", js.undefined)
    @scala.inline
    def setShouldOnlyEncodeValues(value: Boolean): Self = this.set("shouldOnlyEncodeValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldOnlyEncodeValues: Self = this.set("shouldOnlyEncodeValues", js.undefined)
  }
  
}

