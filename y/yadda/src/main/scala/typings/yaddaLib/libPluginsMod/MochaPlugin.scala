package typings
package yaddaLib.libPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaPlugin extends js.Object {
  var ScenarioLevelPlugin: yaddaLib.Anon_Init
  var StepLevelPlugin: yaddaLib.Anon_InitOptions
}

object MochaPlugin {
  @scala.inline
  def apply(ScenarioLevelPlugin: yaddaLib.Anon_Init, StepLevelPlugin: yaddaLib.Anon_InitOptions): MochaPlugin = {
    val __obj = js.Dynamic.literal(ScenarioLevelPlugin = ScenarioLevelPlugin, StepLevelPlugin = StepLevelPlugin)
  
    __obj.asInstanceOf[MochaPlugin]
  }
}

