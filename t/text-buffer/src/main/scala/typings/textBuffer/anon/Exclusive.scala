package typings.textBuffer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exclusive extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.native
  var reversed: js.UndefOr[Boolean] = js.native
}

object Exclusive {
  @scala.inline
  def apply(): Exclusive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exclusive]
  }
  @scala.inline
  implicit class ExclusiveOps[Self <: Exclusive] (val x: Self) extends AnyVal {
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
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
  }
  
}

