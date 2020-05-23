package typings.yadda.basePluginMod

import typings.yadda.libMod.Feature
import typings.yadda.libMod.Scenario
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  def featureFile(file: String, iterator: js.Function1[/* feature */ Feature, Unit]): Unit = js.native
  def featureFiles(files: js.Array[String], iterator: js.Function1[/* feature */ Feature, Unit]): Unit = js.native
  def scenario(scenario: Scenario, iterator: js.Function1[/* scenario */ Scenario, Unit]): Unit = js.native
  def scenarios(scenarios: js.Array[Scenario], iterator: js.Function1[/* scenario */ Scenario, Unit]): Unit = js.native
  def step(step: String, iterator: js.Function2[/* step */ String, /* done */ js.Function0[Unit], Unit]): Unit = js.native
  def steps(
    steps: js.Array[String],
    iterator: js.Function2[/* step */ String, /* done */ js.Function0[Unit], Unit]
  ): Unit = js.native
}

