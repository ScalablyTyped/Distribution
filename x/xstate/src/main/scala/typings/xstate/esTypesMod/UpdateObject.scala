package typings.xstate.esTypesMod

import typings.xstate.esStateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateObject extends EventObject {
  @JSName("id")
  var id_UpdateObject: String | Double
  var state: State[_, _]
}

object UpdateObject {
  @scala.inline
  def apply(id: String | Double, state: State[_, _], `type`: String): UpdateObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UpdateObject]
  }
}

