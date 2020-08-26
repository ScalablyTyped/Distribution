package typings.webidlConversions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringOptions extends Options {
  var treatNullAsEmptyString: js.UndefOr[Boolean] = js.native
}

object StringOptions {
  @scala.inline
  def apply(): StringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringOptions]
  }
  @scala.inline
  implicit class StringOptionsOps[Self <: StringOptions] (val x: Self) extends AnyVal {
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
    def setTreatNullAsEmptyString(value: Boolean): Self = this.set("treatNullAsEmptyString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreatNullAsEmptyString: Self = this.set("treatNullAsEmptyString", js.undefined)
  }
  
}

