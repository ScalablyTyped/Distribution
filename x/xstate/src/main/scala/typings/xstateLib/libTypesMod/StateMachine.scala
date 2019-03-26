package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMachine[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */]
  extends xstateLib.libStateNodeMod.StateNode[TContext, TStateSchema, TEvent]

