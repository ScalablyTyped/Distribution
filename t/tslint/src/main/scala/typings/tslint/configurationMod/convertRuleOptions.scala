package typings.tslint.configurationMod

import typings.std.Map
import typings.std.Partial
import typings.tslint.ruleMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/configuration", "convertRuleOptions")
@js.native
object convertRuleOptions extends js.Object {
  def apply(ruleConfiguration: Map[String, Partial[IOptions]]): js.Array[IOptions] = js.native
}

