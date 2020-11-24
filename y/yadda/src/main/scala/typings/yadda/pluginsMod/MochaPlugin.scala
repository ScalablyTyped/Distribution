package typings.yadda.pluginsMod

import typings.yadda.anon.TypeofScenarioLevelPlugin
import typings.yadda.anon.TypeofStepLevelPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MochaPlugin extends js.Object {
  
  var ScenarioLevelPlugin: TypeofScenarioLevelPlugin = js.native
  
  var StepLevelPlugin: TypeofStepLevelPlugin = js.native
}
object MochaPlugin {
  
  @scala.inline
  def apply(ScenarioLevelPlugin: TypeofScenarioLevelPlugin, StepLevelPlugin: TypeofStepLevelPlugin): MochaPlugin = {
    val __obj = js.Dynamic.literal(ScenarioLevelPlugin = ScenarioLevelPlugin.asInstanceOf[js.Any], StepLevelPlugin = StepLevelPlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaPlugin]
  }
  
  @scala.inline
  implicit class MochaPluginOps[Self <: MochaPlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScenarioLevelPlugin(value: TypeofScenarioLevelPlugin): Self = this.set("ScenarioLevelPlugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepLevelPlugin(value: TypeofStepLevelPlugin): Self = this.set("StepLevelPlugin", value.asInstanceOf[js.Any])
  }
}
