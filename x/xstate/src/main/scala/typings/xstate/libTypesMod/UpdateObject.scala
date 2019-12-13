package typings.xstate.libTypesMod

import typings.xstate.libStateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateObject extends EventObject {
  var id: String | Double
  var state: State[_, _, _, _]
}

object UpdateObject {
  @scala.inline
  def apply(id: String | Double, state: State[_, _, _, _], `type`: String): UpdateObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateObject]
  }
}

