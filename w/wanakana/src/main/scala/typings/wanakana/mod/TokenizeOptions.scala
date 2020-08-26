package typings.wanakana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenizeOptions extends js.Object {
  var compact: js.UndefOr[Boolean] = js.native
  var detailed: js.UndefOr[Boolean] = js.native
}

object TokenizeOptions {
  @scala.inline
  def apply(): TokenizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenizeOptions]
  }
  @scala.inline
  implicit class TokenizeOptionsOps[Self <: TokenizeOptions] (val x: Self) extends AnyVal {
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
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setDetailed(value: Boolean): Self = this.set("detailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailed: Self = this.set("detailed", js.undefined)
  }
  
}

