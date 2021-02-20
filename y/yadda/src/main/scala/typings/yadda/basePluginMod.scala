package typings.yadda

import typings.yadda.libMod.Feature
import typings.yadda.libMod.Scenario
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basePluginMod {
  
  object global {
    
    @JSGlobal("featureFile")
    @js.native
    def featureFile(file: String, iterator: js.Function1[/* feature */ Feature, Unit]): Unit = js.native
    
    @JSGlobal("featureFiles")
    @js.native
    def featureFiles(files: js.Array[String], iterator: js.Function1[/* feature */ Feature, Unit]): Unit = js.native
    
    @JSGlobal("scenario")
    @js.native
    def scenario(scenario: Scenario, iterator: js.Function1[/* scenario */ Scenario, Unit]): Unit = js.native
    
    @JSGlobal("scenarios")
    @js.native
    def scenarios(scenarios: js.Array[Scenario], iterator: js.Function1[/* scenario */ Scenario, Unit]): Unit = js.native
    
    @JSGlobal("step")
    @js.native
    def step(step: String, iterator: js.Function2[/* step */ String, /* done */ js.Function0[Unit], Unit]): Unit = js.native
    
    @JSGlobal("steps")
    @js.native
    def steps(
      steps: js.Array[String],
      iterator: js.Function2[/* step */ String, /* done */ js.Function0[Unit], Unit]
    ): Unit = js.native
  }
}
