package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EventOptions extends js.Object {
  def apply[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.Event[TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.Event[TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.SendExpr[TContext, TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
}

