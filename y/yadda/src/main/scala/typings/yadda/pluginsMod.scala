package typings.yadda

import typings.yadda.anon.TypeofScenarioLevelPlugin
import typings.yadda.anon.TypeofStepLevelPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMod {
  
  @JSImport("yadda/lib/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def casper(yadda: typings.yadda.yaddaMod.^, casper: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("casper")(yadda.asInstanceOf[js.Any], casper.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("yadda/lib/plugins", "jasmine")
  @js.native
  val jasmine: MochaPlugin = js.native
  
  @JSImport("yadda/lib/plugins", "mocha")
  @js.native
  val mocha: MochaPlugin = js.native
  
  trait MochaPlugin extends StObject {
    
    var ScenarioLevelPlugin: TypeofScenarioLevelPlugin
    
    var StepLevelPlugin: TypeofStepLevelPlugin
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
