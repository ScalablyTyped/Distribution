package typings.yadda.eventBusMod

import typings.yadda.contextMod.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepEventData extends js.Object {
  var ctx: Properties
  var step: String
}

object StepEventData {
  @scala.inline
  def apply(ctx: Properties, step: String): StepEventData = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StepEventData]
  }
}

