package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod

import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`false`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.Variables
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.`Best Practices`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.`Possible Errors`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.`Stylistic Issues`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.error
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleMetaDataDocs extends js.Object {
  /**
    * The general category the rule falls within
    */
  var category: (`Best Practices`) | (`Stylistic Issues`) | Variables | (`Possible Errors`)
  /**
    * Concise description of the rule
    */
  var description: String
  /**
    * Extra information linking the rule to a tslint rule
    */
  var extraDescription: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The recommendation level for the rule.
    * Used by the build tools to generate the recommended config.
    * Set to false to not include it as a recommendation
    */
  var recommended: error | warn | `false`
  /**
    * The URL of the rule's docs
    */
  var url: String
}

object RuleMetaDataDocs {
  @scala.inline
  def apply(
    category: (`Best Practices`) | (`Stylistic Issues`) | Variables | (`Possible Errors`),
    description: String,
    recommended: error | warn | `false`,
    url: String,
    extraDescription: js.Array[String] = null
  ): RuleMetaDataDocs = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], description = description, recommended = recommended.asInstanceOf[js.Any], url = url)
    if (extraDescription != null) __obj.updateDynamic("extraDescription")(extraDescription)
    __obj.asInstanceOf[RuleMetaDataDocs]
  }
}

