package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendActionOptions[TContext, TEvent /* <: EventObject */] extends js.Object {
  var delay: js.UndefOr[scala.Double | java.lang.String | (Expr[TContext, TEvent, scala.Double])] = js.undefined
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var to: js.UndefOr[
    java.lang.String | (Expr[
      TContext, 
      TEvent, 
      java.lang.String | scala.Double | (xstateLib.esActorMod.Actor[_, EventObject])
    ])
  ] = js.undefined
}

object SendActionOptions {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    delay: scala.Double | java.lang.String | (Expr[TContext, TEvent, scala.Double]) = null,
    id: java.lang.String | scala.Double = null,
    to: java.lang.String | (Expr[
      TContext, 
      TEvent, 
      java.lang.String | scala.Double | (xstateLib.esActorMod.Actor[_, EventObject])
    ]) = null
  ): SendActionOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendActionOptions[TContext, TEvent]]
  }
}

