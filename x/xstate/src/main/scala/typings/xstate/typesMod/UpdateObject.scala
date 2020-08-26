package typings.xstate.typesMod

import typings.xstate.anon.ContextAny
import typings.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateObject extends EventObject {
  var id: String | Double = js.native
  var state: State[_, _, _, ContextAny] = js.native
}

object UpdateObject {
  @scala.inline
  def apply(id: String | Double, state: State[_, _, _, ContextAny], `type`: String): UpdateObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateObject]
  }
  @scala.inline
  implicit class UpdateObjectOps[Self <: UpdateObject] (val x: Self) extends AnyVal {
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
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: State[_, _, _, ContextAny]): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

