package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for the <Titanium.Contacts.showContacts> method.
  */
trait showContactsParams extends js.Object {
  /**
  	 * Determines whether to animate the show/hide of the contacts picker (iPhone, iPad only.)
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Function to call when selection is canceled.
  	 */
  var cancel: js.UndefOr[js.Function1[/* param0 */ js.Any, _]] = js.undefined
  /**
  	 * Field names to show when selecting properties. By default, shows all available.
  	 */
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	 * Function to call when a person is selected. Must not be used with `selectedProperty` property.
  	 */
  var selectedPerson: js.UndefOr[js.Function1[/* param0 */ js.Any, _]] = js.undefined
  /**
  	 * Function to call when a property is selected. Must not be used with `selectedPerson`
  	 * property.
  	 * Note: If ringtone or texttone is selected, null values are returned, since these are unsupported
  	 * by Apple.
  	 * Since iOS 9.0, there is a native apple issue whereby it may return null if the birthday property
  	 * is selected on certain device models.
  	 * The callback contains the selected property and a 'person' object of type <Titanium.Contacts.Person>.
  	 * Since iOS 9.0, apple only returns the person object with partial information. Currently it is known to
  	 * at least contain the selected property and fullName.
  	 */
  var selectedProperty: js.UndefOr[js.Function1[/* param0 */ js.Any, _]] = js.undefined
}

object showContactsParams {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    cancel: /* param0 */ js.Any => _ = null,
    fields: js.Array[java.lang.String] = null,
    selectedPerson: /* param0 */ js.Any => _ = null,
    selectedProperty: /* param0 */ js.Any => _ = null
  ): showContactsParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (selectedPerson != null) __obj.updateDynamic("selectedPerson")(js.Any.fromFunction1(selectedPerson))
    if (selectedProperty != null) __obj.updateDynamic("selectedProperty")(js.Any.fromFunction1(selectedProperty))
    __obj.asInstanceOf[showContactsParams]
  }
}

