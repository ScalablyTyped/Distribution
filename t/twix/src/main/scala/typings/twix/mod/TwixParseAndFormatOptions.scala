package typings.twix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwixParseAndFormatOptions extends TwixFormatOptions {
  var parseStrict: js.UndefOr[Boolean] = js.native
}

object TwixParseAndFormatOptions {
  @scala.inline
  def apply(): TwixParseAndFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwixParseAndFormatOptions]
  }
  @scala.inline
  implicit class TwixParseAndFormatOptionsOps[Self <: TwixParseAndFormatOptions] (val x: Self) extends AnyVal {
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
    def setParseStrict(value: Boolean): Self = this.set("parseStrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseStrict: Self = this.set("parseStrict", js.undefined)
  }
  
}

