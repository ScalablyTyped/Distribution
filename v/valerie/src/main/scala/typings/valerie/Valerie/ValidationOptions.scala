package typings.valerie.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptions extends js.Object {
  var applicable: js.UndefOr[js.Function0[_]] = js.native
    // the function used to determine if the property is applicable
  var converter: js.UndefOr[IConverter] = js.native
    // the converter used to parse user entries and format display of the property's value
  var entryFormat: js.UndefOr[String] = js.native
    // the string used to format the property's value for display in a user entry
  var excludeFromSummary: js.UndefOr[Boolean] = js.native
    // whether any validation failures for this property are excluded from a summary
  var invalidFailureMessage: js.UndefOr[String] = js.native
    // the message shown when the user has entered an invalid value
  var missingFailureMessage: js.UndefOr[String] = js.native
    // the message shown when a value is required but is missing
  var name: js.UndefOr[js.Function0[_]] = js.native
    // the function used to determine the name of the property; used in failure messages
  var required: js.UndefOr[js.Function0[_]] = js.native
    // the function used to determine if a value is required
  var rules: js.UndefOr[js.Any] = js.native
   //Valerie.array.<IRule>;  // the chain of rules used to validate the property's value
  var valueFormat: js.UndefOr[String] = js.native
}

object ValidationOptions {
  @scala.inline
  def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  @scala.inline
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
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
    def setApplicable(value: () => _): Self = this.set("applicable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteApplicable: Self = this.set("applicable", js.undefined)
    @scala.inline
    def setConverter(value: IConverter): Self = this.set("converter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConverter: Self = this.set("converter", js.undefined)
    @scala.inline
    def setEntryFormat(value: String): Self = this.set("entryFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryFormat: Self = this.set("entryFormat", js.undefined)
    @scala.inline
    def setExcludeFromSummary(value: Boolean): Self = this.set("excludeFromSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeFromSummary: Self = this.set("excludeFromSummary", js.undefined)
    @scala.inline
    def setInvalidFailureMessage(value: String): Self = this.set("invalidFailureMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidFailureMessage: Self = this.set("invalidFailureMessage", js.undefined)
    @scala.inline
    def setMissingFailureMessage(value: String): Self = this.set("missingFailureMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingFailureMessage: Self = this.set("missingFailureMessage", js.undefined)
    @scala.inline
    def setName(value: () => _): Self = this.set("name", js.Any.fromFunction0(value))
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRequired(value: () => _): Self = this.set("required", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setRules(value: js.Any): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setValueFormat(value: String): Self = this.set("valueFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueFormat: Self = this.set("valueFormat", js.undefined)
  }
  
}

