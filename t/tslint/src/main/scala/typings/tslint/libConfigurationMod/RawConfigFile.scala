package typings.tslint.libConfigurationMod

import typings.std.Partial
import typings.tslint.Anon_Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawConfigFile extends js.Object {
  var defaultSeverity: js.UndefOr[String] = js.undefined
  var `extends`: js.UndefOr[String | js.Array[String]] = js.undefined
  var jsRules: js.UndefOr[RawRulesConfig | Boolean] = js.undefined
  var linterOptions: js.UndefOr[Partial[Anon_Exclude]] = js.undefined
  var rules: js.UndefOr[RawRulesConfig] = js.undefined
  var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.undefined
}

object RawConfigFile {
  @scala.inline
  def apply(
    defaultSeverity: String = null,
    `extends`: String | js.Array[String] = null,
    jsRules: RawRulesConfig | Boolean = null,
    linterOptions: Partial[Anon_Exclude] = null,
    rules: RawRulesConfig = null,
    rulesDirectory: String | js.Array[String] = null
  ): RawConfigFile = {
    val __obj = js.Dynamic.literal()
    if (defaultSeverity != null) __obj.updateDynamic("defaultSeverity")(defaultSeverity.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (jsRules != null) __obj.updateDynamic("jsRules")(jsRules.asInstanceOf[js.Any])
    if (linterOptions != null) __obj.updateDynamic("linterOptions")(linterOptions.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (rulesDirectory != null) __obj.updateDynamic("rulesDirectory")(rulesDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawConfigFile]
  }
}

