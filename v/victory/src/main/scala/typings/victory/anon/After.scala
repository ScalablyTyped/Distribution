package typings.victory.anon

import typings.victory.mod.AnimationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait After extends js.Object {
  var after: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.native
  var before: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.native
  var duration: js.UndefOr[Double] = js.native
}

object After {
  @scala.inline
  def apply(): After = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[After]
  }
  @scala.inline
  implicit class AfterOps[Self <: After] (val x: Self) extends AnyVal {
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
    def setAfter(value: /* datum */ js.Any => AnimationStyle): Self = this.set("after", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setBefore(value: /* datum */ js.Any => AnimationStyle): Self = this.set("before", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
  
}

