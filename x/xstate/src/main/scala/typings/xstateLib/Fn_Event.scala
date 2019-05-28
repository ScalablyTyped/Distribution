package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Event extends js.Object {
  def apply[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.Event[TEvent]): xstateLib.esTypesMod.RaiseEvent[TContext, TEvent] = js.native
}

