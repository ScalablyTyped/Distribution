package typings
package yaddaLib.libEventBusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioEventData extends js.Object {
  var ctx: yaddaLib.libContextMod.Properties
  var scenario: js.Array[java.lang.String]
}

object ScenarioEventData {
  @scala.inline
  def apply(ctx: yaddaLib.libContextMod.Properties, scenario: js.Array[java.lang.String]): ScenarioEventData = {
    val __obj = js.Dynamic.literal(ctx = ctx, scenario = scenario)
  
    __obj.asInstanceOf[ScenarioEventData]
  }
}

