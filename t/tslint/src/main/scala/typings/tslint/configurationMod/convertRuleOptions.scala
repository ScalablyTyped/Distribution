package typings.tslint.configurationMod

import typings.std.Map
import typings.tslint.PartialIOptions
import typings.tslint.ruleMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/configuration", "convertRuleOptions")
@js.native
object convertRuleOptions extends js.Object {
  def apply(ruleConfiguration: Map[String, PartialIOptions]): js.Array[IOptions] = js.native
}

