package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way to tag existing user contacts with additional information, specifying that your app can perform some SupportedOperations for this particular contact. */
@js.native
trait ContactAnnotation extends StObject {
  
  /** Gets the ID for the parent ContactAnnotationList that this ContactAnnotation is contained within. */
  var annotationListId: String = js.native
  
  /** Gets or set the ID for the Contact to which this ContactAnnotation applies. */
  var contactId: String = js.native
  
  /** Gets the ID for this ContactAnnotation . */
  var id: String = js.native
  
  /** Gets a Boolean value indicating if this ContactAnnotation has been disabled by the user. */
  var isDisabled: Boolean = js.native
  
  /** Provides a place to store data to be used by the app when interacting with a service provider. */
  var providerProperties: ValueSet = js.native
  
  /** Gets or sets an ID that can be used by a service provider to access the corresponding entity in their remote system. */
  var remoteId: String = js.native
  
  /** Gets or sets the group of ContactAnnotationOperations supported by this ContactAnnotation . */
  var supportedOperations: ContactAnnotationOperations = js.native
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
  
  @scala.inline
  implicit class ContactAnnotationMutableBuilder[Self <: ContactAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationListId(value: String): Self = StObject.set(x, "annotationListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderProperties(value: ValueSet): Self = StObject.set(x, "providerProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteId(value: String): Self = StObject.set(x, "remoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedOperations(value: ContactAnnotationOperations): Self = StObject.set(x, "supportedOperations", value.asInstanceOf[js.Any])
  }
}
