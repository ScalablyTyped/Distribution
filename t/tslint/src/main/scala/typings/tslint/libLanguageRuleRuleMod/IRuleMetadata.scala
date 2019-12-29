package typings.tslint.libLanguageRuleRuleMod

import typings.tslint.Anon_OptionsAny
import typings.tslint.tslintBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRuleMetadata extends js.Object {
  /**
    * Examples demonstrating what the lint rule will pass and fail
    */
  var codeExamples: js.UndefOr[js.Array[ICodeExample]] = js.undefined
  /**
    * A rule deprecation message, if applicable.
    */
  var deprecationMessage: js.UndefOr[String] = js.undefined
  /**
    * A short, one line description of what the rule does.
    */
  var description: String
  /**
    * More elaborate details about the rule.
    */
  var descriptionDetails: js.UndefOr[String] = js.undefined
  /**
    * Whether or not the rule will provide fix suggestions.
    */
  var hasFix: js.UndefOr[Boolean] = js.undefined
  /**
    * Examples of what a standard config for the rule might look like.
    * Using a string[] here is deprecated. Write the options as a JSON object instead.
    */
  var optionExamples: js.UndefOr[js.Array[`true` | Anon_OptionsAny | js.Array[_] | String]] = js.undefined
  /**
    * Schema of the options the rule accepts.
    * The first boolean for whether the rule is enabled or not is already implied.
    * This field describes the options after that boolean.
    * If null, this rule has no options and is not configurable.
    */
  var options: js.Any
  /**
    * An explanation of the available options for the rule.
    */
  var optionsDescription: String
  /**
    * An explanation of why the rule is useful.
    */
  var rationale: js.UndefOr[String] = js.undefined
  /**
    * Whether or not the rule requires type info to run.
    */
  var requiresTypeInfo: js.UndefOr[Boolean] = js.undefined
  /**
    * The kebab-case name of the rule.
    */
  var ruleName: String
  /**
    * The type of the rule - its overall purpose
    */
  var `type`: RuleType
  /**
    * Whether or not the rule use for TypeScript only. If `false`, this rule may be used with .js files.
    */
  var typescriptOnly: Boolean
}

object IRuleMetadata {
  @scala.inline
  def apply(
    description: String,
    options: js.Any,
    optionsDescription: String,
    ruleName: String,
    `type`: RuleType,
    typescriptOnly: Boolean,
    codeExamples: js.Array[ICodeExample] = null,
    deprecationMessage: String = null,
    descriptionDetails: String = null,
    hasFix: js.UndefOr[Boolean] = js.undefined,
    optionExamples: js.Array[`true` | Anon_OptionsAny | js.Array[_] | String] = null,
    rationale: String = null,
    requiresTypeInfo: js.UndefOr[Boolean] = js.undefined
  ): IRuleMetadata = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], optionsDescription = optionsDescription.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], typescriptOnly = typescriptOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (codeExamples != null) __obj.updateDynamic("codeExamples")(codeExamples.asInstanceOf[js.Any])
    if (deprecationMessage != null) __obj.updateDynamic("deprecationMessage")(deprecationMessage.asInstanceOf[js.Any])
    if (descriptionDetails != null) __obj.updateDynamic("descriptionDetails")(descriptionDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFix)) __obj.updateDynamic("hasFix")(hasFix.asInstanceOf[js.Any])
    if (optionExamples != null) __obj.updateDynamic("optionExamples")(optionExamples.asInstanceOf[js.Any])
    if (rationale != null) __obj.updateDynamic("rationale")(rationale.asInstanceOf[js.Any])
    if (!js.isUndefined(requiresTypeInfo)) __obj.updateDynamic("requiresTypeInfo")(requiresTypeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRuleMetadata]
  }
}

