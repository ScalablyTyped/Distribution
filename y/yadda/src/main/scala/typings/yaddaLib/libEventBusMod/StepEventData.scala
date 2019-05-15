package typings
package yaddaLib.libEventBusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepEventData extends js.Object {
  var ctx: yaddaLib.libContextMod.Properties
  var step: java.lang.String
}

object StepEventData {
  @scala.inline
  def apply(ctx: yaddaLib.libContextMod.Properties, step: java.lang.String): StepEventData = {
    val __obj = js.Dynamic.literal(ctx = ctx, step = step)
  
    __obj.asInstanceOf[StepEventData]
  }
}

