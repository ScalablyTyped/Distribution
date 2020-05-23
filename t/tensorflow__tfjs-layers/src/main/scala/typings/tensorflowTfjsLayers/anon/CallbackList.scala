package typings.tensorflowTfjsLayers.anon

import typings.tensorflowTfjsLayers.baseCallbacksMod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackList extends js.Object {
  var callbackList: typings.tensorflowTfjsLayers.baseCallbacksMod.CallbackList
  var history: History
}

object CallbackList {
  @scala.inline
  def apply(callbackList: typings.tensorflowTfjsLayers.baseCallbacksMod.CallbackList, history: History): CallbackList = {
    val __obj = js.Dynamic.literal(callbackList = callbackList.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackList]
  }
}

