package typings
package yaddaLib.libPluginsMochaBasePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  def featureFile(file: java.lang.String, iterator: js.Function1[/* feature */ yaddaLib.libMod.Feature, scala.Unit]): scala.Unit = js.native
  def featureFiles(
    files: js.Array[java.lang.String],
    iterator: js.Function1[/* feature */ yaddaLib.libMod.Feature, scala.Unit]
  ): scala.Unit = js.native
  def scenario(
    scenario: yaddaLib.libMod.Scenario,
    iterator: js.Function1[/* scenario */ yaddaLib.libMod.Scenario, scala.Unit]
  ): scala.Unit = js.native
  def scenarios(
    scenarios: js.Array[yaddaLib.libMod.Scenario],
    iterator: js.Function1[/* scenario */ yaddaLib.libMod.Scenario, scala.Unit]
  ): scala.Unit = js.native
  def step(
    step: java.lang.String,
    iterator: js.Function2[/* step */ java.lang.String, /* done */ js.Function0[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def steps(
    steps: js.Array[java.lang.String],
    iterator: js.Function2[/* step */ java.lang.String, /* done */ js.Function0[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}

