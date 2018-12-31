package typings
package valerieLib.ValerieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends js.Object {
  var applicable: js.UndefOr[js.Function0[_]] = js.undefined
    // the function used to determine if the property is applicable
  var converter: js.UndefOr[IConverter] = js.undefined
    // the converter used to parse user entries and format display of the property's value
  var entryFormat: js.UndefOr[java.lang.String] = js.undefined
    // the string used to format the property's value for display in a user entry
  var excludeFromSummary: js.UndefOr[scala.Boolean] = js.undefined
    // whether any validation failures for this property are excluded from a summary
  var invalidFailureMessage: js.UndefOr[java.lang.String] = js.undefined
    // the message shown when the user has entered an invalid value
  var missingFailureMessage: js.UndefOr[java.lang.String] = js.undefined
    // the message shown when a value is required but is missing
  var name: js.UndefOr[js.Function0[_]] = js.undefined
    // the function used to determine the name of the property; used in failure messages
  var required: js.UndefOr[js.Function0[_]] = js.undefined
    // the function used to determine if a value is required
  var rules: js.UndefOr[js.Any] = js.undefined
   //Valerie.array.<IRule>;  // the chain of rules used to validate the property's value
  var valueFormat: js.UndefOr[java.lang.String] = js.undefined
}

