package typings.wanakana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripOkuriganaOptions extends js.Object {
  var leading: js.UndefOr[Boolean] = js.native
  var matchKanji: js.UndefOr[String] = js.native
}

object StripOkuriganaOptions {
  @scala.inline
  def apply(): StripOkuriganaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripOkuriganaOptions]
  }
  @scala.inline
  implicit class StripOkuriganaOptionsOps[Self <: StripOkuriganaOptions] (val x: Self) extends AnyVal {
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
    def setLeading(value: Boolean): Self = this.set("leading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeading: Self = this.set("leading", js.undefined)
    @scala.inline
    def setMatchKanji(value: String): Self = this.set("matchKanji", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchKanji: Self = this.set("matchKanji", js.undefined)
  }
  
}

