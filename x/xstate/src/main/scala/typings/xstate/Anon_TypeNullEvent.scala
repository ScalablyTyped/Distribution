package typings.xstate

import typings.xstate.libTypesMod.ActionTypes.NullEvent
import typings.xstate.libTypesMod.BuiltInEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeNullEvent
  extends BuiltInEvent[js.Any] {
  var `type`: NullEvent
}

object Anon_TypeNullEvent {
  @scala.inline
  def apply(`type`: NullEvent): Anon_TypeNullEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeNullEvent]
  }
}

