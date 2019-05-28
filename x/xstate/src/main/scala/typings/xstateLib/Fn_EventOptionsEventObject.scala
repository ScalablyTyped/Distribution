package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_EventOptionsEventObject extends js.Object {
  def apply[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.Event[TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.Event[TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.SendExpr[TContext, TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
}

