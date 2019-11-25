package typings.webpack.webpackMod

import typings.webpack.webpackStrings.development
import typings.webpack.webpackStrings.none
import typings.webpack.webpackStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CliConfigOptions extends js.Object {
  var config: js.UndefOr[String] = js.undefined
  var `config-name`: js.UndefOr[String] = js.undefined
  var `config-register`: js.UndefOr[String] = js.undefined
  var configName: js.UndefOr[String] = js.undefined
  var configRegister: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[development | production | none] = js.undefined
}

object CliConfigOptions {
  @scala.inline
  def apply(
    config: String = null,
    `config-name`: String = null,
    `config-register`: String = null,
    configName: String = null,
    configRegister: String = null,
    env: String = null,
    mode: development | production | none = null
  ): CliConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (`config-name` != null) __obj.updateDynamic("config-name")(`config-name`.asInstanceOf[js.Any])
    if (`config-register` != null) __obj.updateDynamic("config-register")(`config-register`.asInstanceOf[js.Any])
    if (configName != null) __obj.updateDynamic("configName")(configName.asInstanceOf[js.Any])
    if (configRegister != null) __obj.updateDynamic("configRegister")(configRegister.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CliConfigOptions]
  }
}

