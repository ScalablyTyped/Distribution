package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.baseCallbacksMod.CallbackList
import typings.tensorflowTfjsLayers.baseCallbacksMod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallbackList extends js.Object {
  var callbackList: CallbackList
  var history: History
}

object AnonCallbackList {
  @scala.inline
  def apply(callbackList: CallbackList, history: History): AnonCallbackList = {
    val __obj = js.Dynamic.literal(callbackList = callbackList.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallbackList]
  }
}

