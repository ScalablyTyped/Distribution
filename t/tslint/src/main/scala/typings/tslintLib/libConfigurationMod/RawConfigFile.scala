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

