package typings
package yaddaLib.libPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaPlugin extends js.Object {
  var ScenarioLevelPlugin: yaddaLib.TypeofScenarioLevelPlugin
  var StepLevelPlugin: yaddaLib.TypeofStepLevelPlugin
}

object MochaPlugin {
  @scala.inline
  def apply(
    ScenarioLevelPlugin: yaddaLib.TypeofScenarioLevelPlugin,
    StepLevelPlugin: yaddaLib.TypeofStepLevelPlugin
  ): MochaPlugin = {
    val __obj = js.Dynamic.literal(ScenarioLevelPlugin = ScenarioLevelPlugin, StepLevelPlugin = StepLevelPlugin)
  
    __obj.asInstanceOf[MochaPlugin]
  }
}

