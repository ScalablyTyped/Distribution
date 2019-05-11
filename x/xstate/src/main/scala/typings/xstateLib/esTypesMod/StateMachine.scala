package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMachine[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */]
  extends xstateLib.esStateNodeMod.StateNode[TContext, TStateSchema, TEvent]

