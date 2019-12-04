package typings.xstate.libPatternsMod

import typings.std.Partial
import typings.xstate.Anon_Initial
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/patterns", "sequence")
@js.native
object sequence extends js.Object {
  def apply[TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](items: js.Array[String]): Anon_Initial[TStateSchema, TEvent] = js.native
  def apply[TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](items: js.Array[String], options: Partial[SequencePatternOptions[TEvent]]): Anon_Initial[TStateSchema, TEvent] = js.native
}

