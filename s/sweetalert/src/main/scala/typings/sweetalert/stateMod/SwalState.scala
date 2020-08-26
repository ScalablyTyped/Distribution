package typings.sweetalert.stateMod

import org.scalablytyped.runtime.StringDictionary
import typings.sweetalert.anon.CloseModal
import typings.sweetalert.anon.Reject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwalState extends js.Object {
  var actions: StringDictionary[CloseModal] = js.native
  var isOpen: Boolean = js.native
  var promise: Reject = js.native
  var timer: Double = js.native
}

object SwalState {
  @scala.inline
  def apply(actions: StringDictionary[CloseModal], isOpen: Boolean, promise: Reject, timer: Double): SwalState = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwalState]
  }
  @scala.inline
  implicit class SwalStateOps[Self <: SwalState] (val x: Self) extends AnyVal {
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
    def setActions(value: StringDictionary[CloseModal]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setPromise(value: Reject): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimer(value: Double): Self = this.set("timer", value.asInstanceOf[js.Any])
  }
  
}

