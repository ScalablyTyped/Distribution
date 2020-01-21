package typings.valerie.Valerie_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends js.Object {
  var applicable: js.UndefOr[js.Function0[_]] = js.undefined
    // the function used to determine if the property is applicable
  var converter: js.UndefOr[IConverter] = js.undefined
    // the converter used to parse user entries and format display of the property's value
  var entryFormat: js.UndefOr[String] = js.undefined
    // the string used to format the property's value for display in a user entry
  var excludeFromSummary: js.UndefOr[Boolean] = js.undefined
    // whether any validation failures for this property are excluded from a summary
  var invalidFailureMessage: js.UndefOr[String] = js.undefined
    // the message shown when the user has entered an invalid value
  var missingFailureMessage: js.UndefOr[String] = js.undefined
    // the message shown when a value is required but is missing
  var name: js.UndefOr[js.Function0[_]] = js.undefined
    // the function used to determine the name of the property; used in failure messages
  var required: js.UndefOr[js.Function0[_]] = js.undefined
    // the function used to determine if a value is required
  var rules: js.UndefOr[js.Any] = js.undefined
   //Valerie.array.<IRule>;  // the chain of rules used to validate the property's value
  var valueFormat: js.UndefOr[String] = js.undefined
}

object ValidationOptions {
  @scala.inline
  def apply(
    applicable: () => _ = null,
    converter: IConverter = null,
    entryFormat: String = null,
    excludeFromSummary: js.UndefOr[Boolean] = js.undefined,
    invalidFailureMessage: String = null,
    missingFailureMessage: String = null,
    name: () => _ = null,
    required: () => _ = null,
    rules: js.Any = null,
    valueFormat: String = null
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (applicable != null) __obj.updateDynamic("applicable")(js.Any.fromFunction0(applicable))
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (entryFormat != null) __obj.updateDynamic("entryFormat")(entryFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeFromSummary)) __obj.updateDynamic("excludeFromSummary")(excludeFromSummary.asInstanceOf[js.Any])
    if (invalidFailureMessage != null) __obj.updateDynamic("invalidFailureMessage")(invalidFailureMessage.asInstanceOf[js.Any])
    if (missingFailureMessage != null) __obj.updateDynamic("missingFailureMessage")(missingFailureMessage.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(js.Any.fromFunction0(name))
    if (required != null) __obj.updateDynamic("required")(js.Any.fromFunction0(required))
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
}

