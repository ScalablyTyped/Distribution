package typings.xstate.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuardPredicate[TContext, TEvent /* <: EventObject */] extends js.Object {
  var name: js.UndefOr[String] = js.native
  @JSName("predicate")
  var predicate_Original: ConditionPredicate[TContext, OmniEventObject[TEvent]] = js.native
  var `type`: DefaultGuardType = js.native
  def predicate(
    context: TContext,
    event: OmniEventObject[TEvent],
    meta: GuardMeta[TContext, OmniEventObject[TEvent]]
  ): Boolean = js.native
}

