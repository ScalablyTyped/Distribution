package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way to tag existing user contacts with additional information, specifying that your app can perform some SupportedOperations for this particular contact. */
trait ContactAnnotation extends js.Object {
  /** Gets the ID for the parent ContactAnnotationList that this ContactAnnotation is contained within. */
  var annotationListId: String
  /** Gets or set the ID for the Contact to which this ContactAnnotation applies. */
  var contactId: String
  /** Gets the ID for this ContactAnnotation . */
  var id: String
  /** Gets a Boolean value indicating if this ContactAnnotation has been disabled by the user. */
  var isDisabled: Boolean
  /** Provides a place to store data to be used by the app when interacting with a service provider. */
  var providerProperties: ValueSet
  /** Gets or sets an ID that can be used by a service provider to access the corresponding entity in their remote system. */
  var remoteId: String
  /** Gets or sets the group of ContactAnnotationOperations supported by this ContactAnnotation . */
  var supportedOperations: ContactAnnotationOperations
}

object ContactAnnotation {
  @scala.inline
  def apply(
    annotationListId: String,
    contactId: String,
    id: String,
    isDisabled: Boolean,
    providerProperties: ValueSet,
    remoteId: String,
    supportedOperations: ContactAnnotationOperations
  ): ContactAnnotation = {
    val __obj = js.Dynamic.literal(annotationListId = annotationListId.asInstanceOf[js.Any], contactId = contactId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], providerProperties = providerProperties.asInstanceOf[js.Any], remoteId = remoteId.asInstanceOf[js.Any], supportedOperations = supportedOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactAnnotation]
  }
}

