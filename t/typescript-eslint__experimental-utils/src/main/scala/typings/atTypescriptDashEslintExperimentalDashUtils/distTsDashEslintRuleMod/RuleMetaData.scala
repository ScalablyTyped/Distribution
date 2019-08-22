package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod

import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.code
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.layout
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.problem
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.suggestion
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.whitespace
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleMetaData[TMessageIds /* <: String */] extends js.Object {
  /**
    * True if the rule is deprecated, false otherwise
    */
  var deprecated: js.UndefOr[Boolean] = js.undefined
  /**
    * Documentation for the rule
    */
  var docs: RuleMetaDataDocs
  /**
    * The fixer category. Omit if there is no fixer
    */
  var fixable: js.UndefOr[code | whitespace] = js.undefined
  /**
    * A map of messages which the rule can report.
    * The key is the messageId, and the string is the parameterised error string.
    * See: https://eslint.org/docs/developer-guide/working-with-rules#messageids
    */
  var messages: Record[TMessageIds, String]
  /**
    * The name of the rule this rule was replaced by, if it was deprecated.
    */
  var replacedBy: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The options schema. Supply an empty array if there are no options.
    */
  var schema: JSONSchema4 | js.Array[JSONSchema4]
  /**
    * The type of rule.
    * - `"problem"` means the rule is identifying code that either will cause an error or may cause a confusing behavior. Developers should consider this a high priority to resolve.
    * - `"suggestion"` means the rule is identifying something that could be done in a better way but no errors will occur if the code isn’t changed.
    * - `"layout"` means the rule cares primarily about whitespace, semicolons, commas, and parentheses, all the parts of the program that determine how the code looks rather than how it executes. These rules work on parts of the code that aren’t specified in the AST.
    */
  var `type`: suggestion | problem | layout
}

object RuleMetaData {
  @scala.inline
  def apply[TMessageIds /* <: String */](
    docs: RuleMetaDataDocs,
    messages: Record[TMessageIds, String],
    schema: JSONSchema4 | js.Array[JSONSchema4],
    `type`: suggestion | problem | layout,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    fixable: code | whitespace = null,
    replacedBy: js.Array[String] = null
  ): RuleMetaData[TMessageIds] = {
    val __obj = js.Dynamic.literal(docs = docs, messages = messages, schema = schema.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (fixable != null) __obj.updateDynamic("fixable")(fixable.asInstanceOf[js.Any])
    if (replacedBy != null) __obj.updateDynamic("replacedBy")(replacedBy)
    __obj.asInstanceOf[RuleMetaData[TMessageIds]]
  }
}

