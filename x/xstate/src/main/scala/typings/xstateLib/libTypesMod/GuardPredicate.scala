package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuardPredicate[TContext, TEvent /* <: EventObject */] extends js.Object {
  @JSName("predicate")
  var predicate_Original: ConditionPredicate[TContext, OmniEventObject[TEvent]] = js.native
  var `type`: xstateLib.xstateLibStrings.xstateDOTcond = js.native
  def predicate(
    context: TContext,
    event: OmniEventObject[OmniEventObject[TEvent]],
    meta: GuardMeta[TContext, OmniEventObject[OmniEventObject[TEvent]]]
  ): scala.Boolean = js.native
}

