package typings.tslint

import typings.tslint.configurationMod.IConfigurationLoadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnConfigFile extends js.Object {
  def apply(configFile: String): IConfigurationLoadResult = js.native
  def apply(configFile: String, inputFilePath: String): IConfigurationLoadResult = js.native
  def apply(configFile: Null, inputFilePath: String): IConfigurationLoadResult = js.native
}

