package typings.yadda.libPluginsMod

import typings.yadda.TypeofScenarioLevelPlugin
import typings.yadda.TypeofStepLevelPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaPlugin extends js.Object {
  var ScenarioLevelPlugin: TypeofScenarioLevelPlugin
  var StepLevelPlugin: TypeofStepLevelPlugin
}

object MochaPlugin {
  @scala.inline
  def apply(ScenarioLevelPlugin: TypeofScenarioLevelPlugin, StepLevelPlugin: TypeofStepLevelPlugin): MochaPlugin = {
    val __obj = js.Dynamic.literal(ScenarioLevelPlugin = ScenarioLevelPlugin, StepLevelPlugin = StepLevelPlugin)
  
    __obj.asInstanceOf[MochaPlugin]
  }
}

