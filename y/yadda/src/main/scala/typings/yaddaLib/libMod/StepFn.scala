package typings
package yaddaLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepFn extends js.Object {
  var ctx: yaddaLib.libContextMod.Properties
  var step: java.lang.String
}

object StepFn {
  @scala.inline
  def apply(ctx: yaddaLib.libContextMod.Properties, step: java.lang.String): StepFn = {
    val __obj = js.Dynamic.literal(ctx = ctx, step = step)
  
    __obj.asInstanceOf[StepFn]
  }
}

