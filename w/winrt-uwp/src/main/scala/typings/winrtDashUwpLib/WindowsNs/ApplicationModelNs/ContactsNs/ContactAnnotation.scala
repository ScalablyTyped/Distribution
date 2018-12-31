package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way to tag existing user contacts with additional information, specifying that your app can perform some SupportedOperations for this particular contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAnnotation")
@js.native
/** Initializes a new instance of the ContactAnnotation class. */
class ContactAnnotation () extends js.Object {
  /** Gets the ID for the parent ContactAnnotationList that this ContactAnnotation is contained within. */
  var annotationListId: java.lang.String = js.native
  /** Gets or set the ID for the Contact to which this ContactAnnotation applies. */
  var contactId: java.lang.String = js.native
  /** Gets the ID for this ContactAnnotation . */
  var id: java.lang.String = js.native
  /** Gets a Boolean value indicating if this ContactAnnotation has been disabled by the user. */
  var isDisabled: scala.Boolean = js.native
  /** Provides a place to store data to be used by the app when interacting with a service provider. */
  var providerProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet = js.native
  /** Gets or sets an ID that can be used by a service provider to access the corresponding entity in their remote system. */
  var remoteId: java.lang.String = js.native
  /** Gets or sets the group of ContactAnnotationOperations supported by this ContactAnnotation . */
  var supportedOperations: ContactAnnotationOperations = js.native
}

