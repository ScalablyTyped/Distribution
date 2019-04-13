package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */] extends js.Object {
  var delay: scala.Double | java.lang.String | (xstateLib.libTypesMod.Expr[TContext, TEvent, scala.Double])
}

object Anon_Delay {
  @scala.inline
  def apply[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    delay: scala.Double | java.lang.String | (xstateLib.libTypesMod.Expr[TContext, TEvent, scala.Double])
  ): Anon_Delay[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Delay[TContext, TEvent]]
  }
}

