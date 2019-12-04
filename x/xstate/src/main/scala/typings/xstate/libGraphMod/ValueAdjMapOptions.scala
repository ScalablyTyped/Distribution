package typings.xstate.libGraphMod

import typings.xstate.libTypesMod.EventObject
import typings.xstate.xstateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAdjMapOptions[TContext, TEvent /* <: EventObject */] extends js.Object {
  var events: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in TEvent['type'] ]: std.Array<TEvent & {  type  :K}>}
    */ typings.xstate.xstateStrings.ValueAdjMapOptions with js.Any
  def eventSerializer(event: TEvent): String
  def filter(state: State[TContext, EventObject]): Boolean
  def formatContext[T](context: TContext): T
  def stateSerializer(state: State[TContext, EventObject]): String
}

object ValueAdjMapOptions {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    eventSerializer: TEvent => String,
    events: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in TEvent['type'] ]: std.Array<TEvent & {  type  :K}>}
    */ typings.xstate.xstateStrings.ValueAdjMapOptions with js.Any,
    filter: State[TContext, EventObject] => Boolean,
    formatContext: TContext => js.Any,
    stateSerializer: State[TContext, EventObject] => String
  ): ValueAdjMapOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(eventSerializer = js.Any.fromFunction1(eventSerializer), events = events.asInstanceOf[js.Any], filter = js.Any.fromFunction1(filter), formatContext = js.Any.fromFunction1(formatContext), stateSerializer = js.Any.fromFunction1(stateSerializer))
  
    __obj.asInstanceOf[ValueAdjMapOptions[TContext, TEvent]]
  }
}

