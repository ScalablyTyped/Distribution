package typings.xstate

import typings.xstate.libTypesMod.ActivityActionObject
import typings.xstate.libTypesMod.ActivityDefinition
import typings.xstate.libTypesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Activity extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
}

