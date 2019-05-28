package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Activity extends js.Object {
  def apply[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](activity: java.lang.String): xstateLib.esTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](activity: xstateLib.esTypesMod.ActivityDefinition[TContext, TEvent]): xstateLib.esTypesMod.ActivityActionObject[TContext, TEvent] = js.native
}

