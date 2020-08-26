package typings.xmlrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateFormatterOptions extends js.Object {
  var colons: js.UndefOr[Boolean] = js.native
  var hyphens: js.UndefOr[Boolean] = js.native
  var local: js.UndefOr[Boolean] = js.native
  var ms: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Boolean] = js.native
}

object DateFormatterOptions {
  @scala.inline
  def apply(): DateFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFormatterOptions]
  }
  @scala.inline
  implicit class DateFormatterOptionsOps[Self <: DateFormatterOptions] (val x: Self) extends AnyVal {
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
    def setColons(value: Boolean): Self = this.set("colons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColons: Self = this.set("colons", js.undefined)
    @scala.inline
    def setHyphens(value: Boolean): Self = this.set("hyphens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyphens: Self = this.set("hyphens", js.undefined)
    @scala.inline
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    @scala.inline
    def setMs(value: Boolean): Self = this.set("ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMs: Self = this.set("ms", js.undefined)
    @scala.inline
    def setOffset(value: Boolean): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

