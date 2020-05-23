package typings.sweetalert.stateMod

import org.scalablytyped.runtime.StringDictionary
import typings.sweetalert.anon.CloseModal
import typings.sweetalert.anon.Reject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwalState extends js.Object {
  var actions: StringDictionary[CloseModal]
  var isOpen: Boolean
  var promise: Reject
  var timer: Double
}

object SwalState {
  @scala.inline
  def apply(actions: StringDictionary[CloseModal], isOpen: Boolean, promise: Reject, timer: Double): SwalState = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwalState]
  }
}

