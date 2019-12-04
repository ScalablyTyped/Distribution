package typings.xstate.libGraphMod

import typings.xstate.libTypesMod.EventObject
import typings.xstate.xstateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "serializeState")
@js.native
object serializeState extends js.Object {
  def apply[TContext](state: State[TContext, EventObject]): String = js.native
}

