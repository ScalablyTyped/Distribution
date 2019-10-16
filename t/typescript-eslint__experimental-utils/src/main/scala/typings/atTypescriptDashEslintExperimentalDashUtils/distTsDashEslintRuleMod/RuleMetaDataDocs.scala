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
    * The recommendation level for the rule.
    * Used by the build tools to generate the recommended config.
    * Set to false to not include it as a recommendation
    */
  var recommended: error | warn | `false`
  /**
    * Does the rule require us to create a full TypeScript Program in order for it
    * to type-check code. This is only used for documentation purposes.
    */
  var requiresTypeChecking: js.UndefOr[Boolean] = js.undefined
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
    requiresTypeChecking: js.UndefOr[Boolean] = js.undefined
  ): RuleMetaDataDocs = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], description = description, recommended = recommended.asInstanceOf[js.Any], url = url)
    if (!js.isUndefined(requiresTypeChecking)) __obj.updateDynamic("requiresTypeChecking")(requiresTypeChecking)
    __obj.asInstanceOf[RuleMetaDataDocs]
  }
}

