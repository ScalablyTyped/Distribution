package typings.wrapAnsi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hard extends js.Object {
  var hard: js.UndefOr[Boolean] = js.native
  var trim: js.UndefOr[Boolean] = js.native
  var wordWrap: js.UndefOr[Boolean] = js.native
}

object Hard {
  @scala.inline
  def apply(): Hard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hard]
  }
  @scala.inline
  implicit class HardOps[Self <: Hard] (val x: Self) extends AnyVal {
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
    def setHard(value: Boolean): Self = this.set("hard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHard: Self = this.set("hard", js.undefined)
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
  }
  
}

