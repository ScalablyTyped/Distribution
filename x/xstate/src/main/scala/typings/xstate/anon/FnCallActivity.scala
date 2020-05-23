package typings.xstate.anon

import typings.xstate.typesMod.ActivityActionObject
import typings.xstate.typesMod.ActivityDefinition
import typings.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallActivity extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
}

