package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way to tag existing user contacts with additional information, specifying that your app can perform some SupportedOperations for this particular contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAnnotation")
@js.native
/** Initializes a new instance of the ContactAnnotation class. */
open class ContactAnnotation ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotation {
  
  /** Gets the ID for the parent ContactAnnotationList that this ContactAnnotation is contained within. */
  /* CompleteClass */
  var annotationListId: String = js.native
  
  /** Gets or set the ID for the Contact to which this ContactAnnotation applies. */
  /* CompleteClass */
  var contactId: String = js.native
  
  /** Gets the ID for this ContactAnnotation . */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets a Boolean value indicating if this ContactAnnotation has been disabled by the user. */
  /* CompleteClass */
  var isDisabled: Boolean = js.native
  
  /** Provides a place to store data to be used by the app when interacting with a service provider. */
  /* CompleteClass */
  var providerProperties: ValueSet = js.native
  
  /** Gets or sets an ID that can be used by a service provider to access the corresponding entity in their remote system. */
  /* CompleteClass */
  var remoteId: String = js.native
  
  /** Gets or sets the group of ContactAnnotationOperations supported by this ContactAnnotation . */
  /* CompleteClass */
  var supportedOperations: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotationOperations = js.native
}
