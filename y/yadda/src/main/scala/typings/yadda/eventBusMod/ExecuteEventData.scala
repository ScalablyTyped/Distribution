package typings.yadda.eventBusMod

import typings.yadda.contextMod.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteEventData extends js.Object {
  var args: js.Array[String]
  var ctx: Properties
  var pattern: String
  var step: String
}

object ExecuteEventData {
  @scala.inline
  def apply(args: js.Array[String], ctx: Properties, pattern: String, step: String): ExecuteEventData = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteEventData]
  }
}

