package typings.xstate.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuardPredicate[TContext, TEvent /* <: EventObject */] extends js.Object {
  var name: js.UndefOr[String] = js.native
  @JSName("predicate")
  var predicate_Original: ConditionPredicate[TContext, TEvent] = js.native
  var `type`: DefaultGuardType = js.native
  def predicate(context: TContext, event: TEvent, meta: GuardMeta[TContext, TEvent]): Boolean = js.native
}

