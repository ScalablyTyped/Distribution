package typings.tslint.configurationMod

import typings.std.Map
import typings.std.Partial
import typings.tslint.AnonExclude
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.RuleSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigurationFile extends js.Object {
  /**
    * @deprecated property is never set
    *
    * The severity that is applied to rules in this config file as well as rules
    * in any inherited config files which have their severity set to "default".
    * Not inherited.
    */
  var defaultSeverity: js.UndefOr[RuleSeverity] = js.undefined
  /**
    * An array of config files whose rules are inherited by this config file.
    */
  var `extends`: js.Array[String]
  /**
    * Rules that are used to lint to JavaScript files.
    */
  var jsRules: Map[String, Partial[IOptions]]
  /**
    * A subset of the CLI options.
    */
  var linterOptions: js.UndefOr[Partial[AnonExclude]] = js.undefined
  /**
    * Rules that are used to lint TypeScript files.
    */
  var rules: Map[String, Partial[IOptions]]
  /**
    * Directories containing custom rules. Resolved using node module semantics.
    */
  var rulesDirectory: js.Array[String]
}

object IConfigurationFile {
  @scala.inline
  def apply(
    `extends`: js.Array[String],
    jsRules: Map[String, Partial[IOptions]],
    rules: Map[String, Partial[IOptions]],
    rulesDirectory: js.Array[String],
    defaultSeverity: RuleSeverity = null,
    linterOptions: Partial[AnonExclude] = null
  ): IConfigurationFile = {
    val __obj = js.Dynamic.literal(jsRules = jsRules.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], rulesDirectory = rulesDirectory.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (defaultSeverity != null) __obj.updateDynamic("defaultSeverity")(defaultSeverity.asInstanceOf[js.Any])
    if (linterOptions != null) __obj.updateDynamic("linterOptions")(linterOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigurationFile]
  }
}

