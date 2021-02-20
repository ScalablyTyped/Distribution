package typings.yadda

import typings.yadda.anon.TypeofScenarioLevelPlugin
import typings.yadda.anon.TypeofStepLevelPlugin
import typings.yadda.yaddaMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMod {
  
  @JSImport("yadda/lib/plugins", "casper")
  @js.native
  def casper(yadda: ^, casper: js.Any): Unit = js.native
  
  @JSImport("yadda/lib/plugins", "jasmine")
  @js.native
  val jasmine: MochaPlugin = js.native
  
  @JSImport("yadda/lib/plugins", "mocha")
  @js.native
  val mocha: MochaPlugin = js.native
  
  @js.native
  trait MochaPlugin extends StObject {
    
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
    implicit class MochaPluginMutableBuilder[Self <: MochaPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScenarioLevelPlugin(value: TypeofScenarioLevelPlugin): Self = StObject.set(x, "ScenarioLevelPlugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepLevelPlugin(value: TypeofStepLevelPlugin): Self = StObject.set(x, "StepLevelPlugin", value.asInstanceOf[js.Any])
    }
  }
}
