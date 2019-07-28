package typings.yadda.libMod

import typings.yadda.libContextMod.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepFn extends js.Object {
  var ctx: Properties
  var step: String
}

object StepFn {
  @scala.inline
  def apply(ctx: Properties, step: String): StepFn = {
    val __obj = js.Dynamic.literal(ctx = ctx, step = step)
  
    __obj.asInstanceOf[StepFn]
  }
}

