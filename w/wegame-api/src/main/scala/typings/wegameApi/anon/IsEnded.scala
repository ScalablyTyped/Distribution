package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsEnded extends js.Object {
  var isEnded: Boolean = js.native
}

object IsEnded {
  @scala.inline
  def apply(isEnded: Boolean): IsEnded = {
    val __obj = js.Dynamic.literal(isEnded = isEnded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEnded]
  }
  @scala.inline
  implicit class IsEndedOps[Self <: IsEnded] (val x: Self) extends AnyVal {
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
    def setIsEnded(value: Boolean): Self = this.set("isEnded", value.asInstanceOf[js.Any])
  }
  
}

