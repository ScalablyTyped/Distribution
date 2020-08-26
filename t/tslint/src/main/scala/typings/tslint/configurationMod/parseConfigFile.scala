package typings.tslint.configurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/configuration", "parseConfigFile")
@js.native
object parseConfigFile extends js.Object {
  def apply(configFile: RawConfigFile): IConfigurationFile = js.native
  def apply(
    configFile: RawConfigFile,
    configFileDir: js.UndefOr[scala.Nothing],
    readConfig: js.Function1[/* path */ String, RawConfigFile]
  ): IConfigurationFile = js.native
  def apply(configFile: RawConfigFile, configFileDir: String): IConfigurationFile = js.native
  def apply(
    configFile: RawConfigFile,
    configFileDir: String,
    readConfig: js.Function1[/* path */ String, RawConfigFile]
  ): IConfigurationFile = js.native
}

