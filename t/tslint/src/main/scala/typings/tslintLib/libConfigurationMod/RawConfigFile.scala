package typings
package tslintLib.libConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawConfigFile extends js.Object {
  var defaultSeverity: js.UndefOr[java.lang.String] = js.undefined
  var `extends`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var jsRules: js.UndefOr[RawRulesConfig | scala.Boolean] = js.undefined
  var linterOptions: js.UndefOr[stdLib.Partial[tslintLib.Anon_Exclude]] = js.undefined
  var rules: js.UndefOr[RawRulesConfig] = js.undefined
  var rulesDirectory: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object RawConfigFile {
  @scala.inline
  def apply(
    defaultSeverity: java.lang.String = null,
    `extends`: java.lang.String | js.Array[java.lang.String] = null,
    jsRules: RawRulesConfig | scala.Boolean = null,
    linterOptions: stdLib.Partial[tslintLib.Anon_Exclude] = null,
    rules: RawRulesConfig = null,
    rulesDirectory: java.lang.String | js.Array[java.lang.String] = null
  ): RawConfigFile = {
    val __obj = js.Dynamic.literal()
    if (defaultSeverity != null) __obj.updateDynamic("defaultSeverity")(defaultSeverity)
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (jsRules != null) __obj.updateDynamic("jsRules")(jsRules.asInstanceOf[js.Any])
    if (linterOptions != null) __obj.updateDynamic("linterOptions")(linterOptions)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (rulesDirectory != null) __obj.updateDynamic("rulesDirectory")(rulesDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawConfigFile]
  }
}

