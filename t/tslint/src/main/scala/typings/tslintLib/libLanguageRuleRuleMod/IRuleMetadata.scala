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

