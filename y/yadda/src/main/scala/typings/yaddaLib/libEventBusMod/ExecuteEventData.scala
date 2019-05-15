package typings
package yaddaLib.libEventBusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteEventData extends js.Object {
  var args: js.Array[java.lang.String]
  var ctx: yaddaLib.libContextMod.Properties
  var pattern: java.lang.String
  var step: java.lang.String
}

object ExecuteEventData {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String],
    ctx: yaddaLib.libContextMod.Properties,
    pattern: java.lang.String,
    step: java.lang.String
  ): ExecuteEventData = {
    val __obj = js.Dynamic.literal(args = args, ctx = ctx, pattern = pattern, step = step)
  
    __obj.asInstanceOf[ExecuteEventData]
  }
}

