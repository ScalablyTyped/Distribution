package typings.webLocksApi

import typings.std.AbortSignal
import typings.webLocksApi.webLocksApiStrings.exclusive
import typings.webLocksApi.webLocksApiStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockManagerRequestOptions extends js.Object {
  var ifAvailable: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[exclusive | shared] = js.native
  var signal: js.UndefOr[AbortSignal] = js.native
  var steal: js.UndefOr[Boolean] = js.native
}

object LockManagerRequestOptions {
  @scala.inline
  def apply(): LockManagerRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockManagerRequestOptions]
  }
  @scala.inline
  implicit class LockManagerRequestOptionsOps[Self <: LockManagerRequestOptions] (val x: Self) extends AnyVal {
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
    def setIfAvailable(value: Boolean): Self = this.set("ifAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfAvailable: Self = this.set("ifAvailable", js.undefined)
    @scala.inline
    def setMode(value: exclusive | shared): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setSteal(value: Boolean): Self = this.set("steal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteal: Self = this.set("steal", js.undefined)
  }
  
}

