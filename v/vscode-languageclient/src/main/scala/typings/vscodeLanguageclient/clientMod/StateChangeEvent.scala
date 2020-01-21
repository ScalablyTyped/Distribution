package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateChangeEvent extends js.Object {
  var newState: State
  var oldState: State
}

object StateChangeEvent {
  @scala.inline
  def apply(newState: State, oldState: State): StateChangeEvent = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StateChangeEvent]
  }
}

