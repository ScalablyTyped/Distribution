package typings.stylelintDashWebpackDashPlugin.stylelintDashWebpackDashPluginMod

import typings.stylelintDashWebpackDashPlugin.stylelintDashWebpackDashPluginStrings.error
import typings.stylelintDashWebpackDashPlugin.stylelintDashWebpackDashPluginStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var defaultSeverity: js.UndefOr[warning | error] = js.undefined
  var `extends`: js.UndefOr[String | js.Array[String]] = js.undefined
  var ignoreFiles: js.UndefOr[String | js.Array[String]] = js.undefined
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  var processors: js.UndefOr[js.Array[String]] = js.undefined
  var rules: js.UndefOr[js.Object] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    defaultSeverity: warning | error = null,
    `extends`: String | js.Array[String] = null,
    ignoreFiles: String | js.Array[String] = null,
    plugins: js.Array[String] = null,
    processors: js.Array[String] = null,
    rules: js.Object = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (defaultSeverity != null) __obj.updateDynamic("defaultSeverity")(defaultSeverity.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (ignoreFiles != null) __obj.updateDynamic("ignoreFiles")(ignoreFiles.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (processors != null) __obj.updateDynamic("processors")(processors.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

