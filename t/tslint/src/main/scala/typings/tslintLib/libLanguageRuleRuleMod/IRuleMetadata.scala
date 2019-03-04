package typings
package tslintLib.libLanguageRuleRuleMod

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
  var deprecationMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A short, one line description of what the rule does.
    */
  var description: java.lang.String
  /**
    * More elaborate details about the rule.
    */
  var descriptionDetails: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not the rule will provide fix suggestions.
    */
  var hasFix: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Examples of what a standard config for the rule might look like.
    * Using a string[] here is deprecated. Write the options as a JSON object instead.
    */
  var optionExamples: js.UndefOr[
    (js.Array[tslintLib.tslintLibNumbers.`true` | js.Array[_]]) | js.Array[java.lang.String]
  ] = js.undefined
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
  var optionsDescription: java.lang.String
  /**
    * An explanation of why the rule is useful.
    */
  var rationale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not the rule requires type info to run.
    */
  var requiresTypeInfo: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The kebab-case name of the rule.
    */
  var ruleName: java.lang.String
  /**
    * The type of the rule - its overall purpose
    */
  var `type`: RuleType
  /**
    * Whether or not the rule use for TypeScript only. If `false`, this rule may be used with .js files.
    */
  var typescriptOnly: scala.Boolean
}

object IRuleMetadata {
  @scala.inline
  def apply(
    description: java.lang.String,
    options: js.Any,
    optionsDescription: java.lang.String,
    ruleName: java.lang.String,
    `type`: RuleType,
    typescriptOnly: scala.Boolean,
    codeExamples: js.Array[ICodeExample] = null,
    deprecationMessage: java.lang.String = null,
    descriptionDetails: java.lang.String = null,
    hasFix: js.UndefOr[scala.Boolean] = js.undefined,
    optionExamples: (js.Array[tslintLib.tslintLibNumbers.`true` | js.Array[_]]) | js.Array[java.lang.String] = null,
    rationale: java.lang.String = null,
    requiresTypeInfo: js.UndefOr[scala.Boolean] = js.undefined
  ): IRuleMetadata = {
    val __obj = js.Dynamic.literal(description = description, options = options, optionsDescription = optionsDescription, ruleName = ruleName, typescriptOnly = typescriptOnly)
    __obj.updateDynamic("type")(`type`)
    if (codeExamples != null) __obj.updateDynamic("codeExamples")(codeExamples)
    if (deprecationMessage != null) __obj.updateDynamic("deprecationMessage")(deprecationMessage)
    if (descriptionDetails != null) __obj.updateDynamic("descriptionDetails")(descriptionDetails)
    if (!js.isUndefined(hasFix)) __obj.updateDynamic("hasFix")(hasFix)
    if (optionExamples != null) __obj.updateDynamic("optionExamples")(optionExamples.asInstanceOf[js.Any])
    if (rationale != null) __obj.updateDynamic("rationale")(rationale)
    if (!js.isUndefined(requiresTypeInfo)) __obj.updateDynamic("requiresTypeInfo")(requiresTypeInfo)
    __obj.asInstanceOf[IRuleMetadata]
  }
}

