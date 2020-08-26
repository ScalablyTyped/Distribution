package typings.tslint.ruleMod

import typings.tslint.anon.OptionsAny
import typings.tslint.tslintBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRuleMetadata extends js.Object {
  /**
    * Examples demonstrating what the lint rule will pass and fail
    */
  var codeExamples: js.UndefOr[js.Array[ICodeExample]] = js.native
  /**
    * A rule deprecation message, if applicable.
    */
  var deprecationMessage: js.UndefOr[String] = js.native
  /**
    * A short, one line description of what the rule does.
    */
  var description: String = js.native
  /**
    * More elaborate details about the rule.
    */
  var descriptionDetails: js.UndefOr[String] = js.native
  /**
    * Whether or not the rule will provide fix suggestions.
    */
  var hasFix: js.UndefOr[Boolean] = js.native
  /**
    * Examples of what a standard config for the rule might look like.
    * Using a string[] here is deprecated. Write the options as a JSON object instead.
    */
  var optionExamples: js.UndefOr[js.Array[`true` | js.Array[_] | OptionsAny | String]] = js.native
  /**
    * Schema of the options the rule accepts.
    * The first boolean for whether the rule is enabled or not is already implied.
    * This field describes the options after that boolean.
    * If null, this rule has no options and is not configurable.
    */
  var options: js.Any = js.native
  /**
    * An explanation of the available options for the rule.
    */
  var optionsDescription: String = js.native
  /**
    * An explanation of why the rule is useful.
    */
  var rationale: js.UndefOr[String] = js.native
  /**
    * Whether or not the rule requires type info to run.
    */
  var requiresTypeInfo: js.UndefOr[Boolean] = js.native
  /**
    * The kebab-case name of the rule.
    */
  var ruleName: String = js.native
  /**
    * The type of the rule - its overall purpose
    */
  var `type`: RuleType = js.native
  /**
    * Whether or not the rule use for TypeScript only. If `false`, this rule may be used with .js files.
    */
  var typescriptOnly: Boolean = js.native
}

object IRuleMetadata {
  @scala.inline
  def apply(
    description: String,
    options: js.Any,
    optionsDescription: String,
    ruleName: String,
    `type`: RuleType,
    typescriptOnly: Boolean
  ): IRuleMetadata = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], optionsDescription = optionsDescription.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], typescriptOnly = typescriptOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRuleMetadata]
  }
  @scala.inline
  implicit class IRuleMetadataOps[Self <: IRuleMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsDescription(value: String): Self = this.set("optionsDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleName(value: String): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: RuleType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypescriptOnly(value: Boolean): Self = this.set("typescriptOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeExamplesVarargs(value: ICodeExample*): Self = this.set("codeExamples", js.Array(value :_*))
    @scala.inline
    def setCodeExamples(value: js.Array[ICodeExample]): Self = this.set("codeExamples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeExamples: Self = this.set("codeExamples", js.undefined)
    @scala.inline
    def setDeprecationMessage(value: String): Self = this.set("deprecationMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecationMessage: Self = this.set("deprecationMessage", js.undefined)
    @scala.inline
    def setDescriptionDetails(value: String): Self = this.set("descriptionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionDetails: Self = this.set("descriptionDetails", js.undefined)
    @scala.inline
    def setHasFix(value: Boolean): Self = this.set("hasFix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasFix: Self = this.set("hasFix", js.undefined)
    @scala.inline
    def setOptionExamplesVarargs(value: (`true` | js.Array[js.Any] | OptionsAny | String)*): Self = this.set("optionExamples", js.Array(value :_*))
    @scala.inline
    def setOptionExamples(value: js.Array[`true` | js.Array[_] | OptionsAny | String]): Self = this.set("optionExamples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionExamples: Self = this.set("optionExamples", js.undefined)
    @scala.inline
    def setRationale(value: String): Self = this.set("rationale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRationale: Self = this.set("rationale", js.undefined)
    @scala.inline
    def setRequiresTypeInfo(value: Boolean): Self = this.set("requiresTypeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiresTypeInfo: Self = this.set("requiresTypeInfo", js.undefined)
  }
  
}

