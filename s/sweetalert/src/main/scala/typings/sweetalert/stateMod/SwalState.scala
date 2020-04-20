package typings.sweetalert.stateMod

import org.scalablytyped.runtime.StringDictionary
import typings.sweetalert.AnonCloseModal
import typings.sweetalert.AnonReject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwalState extends js.Object {
  var actions: StringDictionary[AnonCloseModal]
  var isOpen: Boolean
  var promise: AnonReject
  var timer: Double
}

object SwalState {
  @scala.inline
  def apply(actions: StringDictionary[AnonCloseModal], isOpen: Boolean, promise: AnonReject, timer: Double): SwalState = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwalState]
  }
}

