package typings.yadda.libEventBusMod

import typings.yadda.libContextMod.Properties
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
    val __obj = js.Dynamic.literal(args = args, ctx = ctx, pattern = pattern, step = step)
  
    __obj.asInstanceOf[ExecuteEventData]
  }
}

