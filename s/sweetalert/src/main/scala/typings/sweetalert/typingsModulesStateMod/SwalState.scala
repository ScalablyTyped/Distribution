package typings.sweetalert.typingsModulesStateMod

import org.scalablytyped.runtime.StringDictionary
import typings.sweetalert.Anon_CloseModal
import typings.sweetalert.Anon_Reject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwalState extends js.Object {
  var actions: StringDictionary[Anon_CloseModal]
  var isOpen: Boolean
  var promise: Anon_Reject
  var timer: Double
}

object SwalState {
  @scala.inline
  def apply(actions: StringDictionary[Anon_CloseModal], isOpen: Boolean, promise: Anon_Reject, timer: Double): SwalState = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SwalState]
  }
}

