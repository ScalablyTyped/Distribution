package typings.tslint.configurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/configuration", "findConfiguration")
@js.native
object findConfiguration extends js.Object {
  def apply(configFile: String): IConfigurationLoadResult = js.native
  def apply(configFile: String, inputFilePath: String): IConfigurationLoadResult = js.native
  def apply(configFile: Null, inputFilePath: String): IConfigurationLoadResult = js.native
}

