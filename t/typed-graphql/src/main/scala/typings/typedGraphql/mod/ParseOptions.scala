package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// language/parser.js
@js.native
trait ParseOptions extends js.Object {
  var noLocation: js.UndefOr[Boolean] = js.native
  var noSource: js.UndefOr[Boolean] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
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
    def setNoLocation(value: Boolean): Self = this.set("noLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoLocation: Self = this.set("noLocation", js.undefined)
    @scala.inline
    def setNoSource(value: Boolean): Self = this.set("noSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSource: Self = this.set("noSource", js.undefined)
  }
  
}

