package typings.yadda

import typings.yadda.libMod.Feature
import typings.yadda.libMod.Scenario
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPluginsMochaBasePluginMod {
  
  object global {
    
    inline def featureFile(file: String, iterator: js.Function1[/* feature */ Feature, Unit]): Unit = (js.Dynamic.global.applyDynamic("featureFile")(file.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def featureFiles(files: js.Array[String], iterator: js.Function1[/* feature */ Feature, Unit]): Unit = (js.Dynamic.global.applyDynamic("featureFiles")(files.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def scenario(scenario: Scenario, iterator: js.Function1[/* scenario */ Scenario, Unit]): Unit = (js.Dynamic.global.applyDynamic("scenario")(scenario.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def scenarios(scenarios: js.Array[Scenario], iterator: js.Function1[/* scenario */ Scenario, Unit]): Unit = (js.Dynamic.global.applyDynamic("scenarios")(scenarios.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def step(step: String, iterator: js.Function2[/* step */ String, /* done */ js.Function0[Unit], Unit]): Unit = (js.Dynamic.global.applyDynamic("step")(step.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def steps(
      steps: js.Array[String],
      iterator: js.Function2[/* step */ String, /* done */ js.Function0[Unit], Unit]
    ): Unit = (js.Dynamic.global.applyDynamic("steps")(steps.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
