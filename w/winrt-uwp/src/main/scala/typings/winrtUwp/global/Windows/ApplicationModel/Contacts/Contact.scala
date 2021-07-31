package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.std.Date
import typings.winrtUwp.Windows.ApplicationModel.Contacts.IContactField
import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.Contact")
@js.native
/** Creates a new instance of the Contact class. */
class Contact ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact {
  
  /** Gets the contact addresses for a contact. */
  /* CompleteClass */
  var addresses: IVector[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAddress] = js.native
  
  /** If this is a raw contact that is part of an aggregate contact, then this property identifies the parent aggregate. */
  /* CompleteClass */
  var aggregateId: String = js.native
  
  /** Gets the connected service accounts for a contact. */
  /* CompleteClass */
  var connectedServiceAccounts: IVector[
    typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactConnectedServiceAccount
  ] = js.native
  
  /** Gets a string that identifies the ContactList to which this contact is a member. */
  /* CompleteClass */
  var contactListId: String = js.native
  
  /** Gets the data suppliers for a contact. The maximum string length for each data supplier is 50 characters. */
  /* CompleteClass */
  var dataSuppliers: IVector[String] = js.native
  
  /** Gets the display name for a contact. */
  /* CompleteClass */
  var displayName: String = js.native
  
  /** Gets or sets the display that was manually entered by the user. */
  /* CompleteClass */
  var displayNameOverride: String = js.native
  
  /** Gets or sets the last time the user updated their display picture. */
  /* CompleteClass */
  var displayPictureUserUpdateTime: Date = js.native
  
  /** Gets the email addresses for a contact. */
  /* CompleteClass */
  var emails: IVector[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactEmail] = js.native
  
  /** Sets the fields that contain information about a contact. */
  /* CompleteClass */
  var fields: IVector[IContactField] = js.native
  
  /** Gets and sets the first name for a contact. The maximum string length for the first name is 64 characters. */
  /* CompleteClass */
  var firstName: String = js.native
  
  /** Gets the full name of the Contact . */
  /* CompleteClass */
  var fullName: String = js.native
  
  /** Gets and sets the honorific prefix for the name for a contact. The maximum string length for the honorific prefix is 32 characters. */
  /* CompleteClass */
  var honorificNamePrefix: String = js.native
  
  /** Gets and sets the honorific suffix for the name for a contact. The maximum string length for the honorific suffix is 32 characters. */
  /* CompleteClass */
  var honorificNameSuffix: String = js.native
  
  /** Gets and sets the identifier for a contact. The maximum string length for the identifier is 256 characters. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets the important dates for a contact. */
  /* CompleteClass */
  var importantDates: IVector[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactDate] = js.native
  
  /** Gets a Boolean value indicating of this is an aggregate Contact . */
  /* CompleteClass */
  var isAggregate: Boolean = js.native
  
  /** Gets a Boolean value indicating if the user manually set the picture for the Contact . */
  /* CompleteClass */
  var isDisplayPictureManuallySet: Boolean = js.native
  
  /** Gets a Boolean value indicating if this Contact represents the user logged into the device. */
  /* CompleteClass */
  var isMe: Boolean = js.native
  
  /** Gets the job info items for a contact. */
  /* CompleteClass */
  var jobInfo: IVector[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactJobInfo] = js.native
  
  /** Gets a large version of the display picture for the Contact . */
  /* CompleteClass */
  var largeDisplayPicture: IRandomAccessStreamReference = js.native
  
  /** Gets and sets the last name for a contact. The maximum string length for the last name is 64 characters. */
  /* CompleteClass */
  var lastName: String = js.native
  
  /** Gets and sets the middle name for a contact. The maximum string length for the middle name is 64 characters. */
  /* CompleteClass */
  var middleName: String = js.native
  
  /** Sets and gets the name of the contact. */
  /* CompleteClass */
  var name: String = js.native
  
  /** Gets or sets the nickname for the Contact . */
  /* CompleteClass */
  var nickname: String = js.native
  
  /** Gets and sets notes for a contact. The maximum string length for notes is 4096 characters. */
  /* CompleteClass */
  var notes: String = js.native
  
  /** Gets info about the phones for a contact. */
  /* CompleteClass */
  var phones: IVector[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactPhone] = js.native
  
  /** Gets the property set object for the contact. */
  /* CompleteClass */
  var providerProperties: IPropertySet = js.native
  
  /** Gets or sets an ID that can be used by a service provider to access the Contact in their remote system. */
  /* CompleteClass */
  var remoteId: String = js.native
  
  /** Gets or puts the path to the ringtone file for the Contact . */
  /* CompleteClass */
  var ringToneToken: String = js.native
  
  /** Gets the significant others for a contact. */
  /* CompleteClass */
  var significantOthers: IVector[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactSignificantOther] = js.native
  
  /** Gets a small version of the display picture for the Contact . */
  /* CompleteClass */
  var smallDisplayPicture: IRandomAccessStreamReference = js.native
  
  /** Gets the name used to sort the contact. */
  /* CompleteClass */
  var sortName: String = js.native
  
  /** Gets or sets the display picture for the Contact in its original size. */
  /* CompleteClass */
  var sourceDisplayPicture: IRandomAccessStreamReference = js.native
  
  /** Gets or puts the path to the audio file to play when an SMS/MMS message is received from the Contact . */
  /* CompleteClass */
  var textToneToken: String = js.native
  
  /* CompleteClass */
  var thumbnail: js.Any = js.native
  
  /* unmapped type */
  /** Gets the Web sites for a contact. */
  /* CompleteClass */
  var websites: IVector[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactWebsite] = js.native
  
  /** Gets the Yomi (phonetic Japanese equivalent) display name for a contact. */
  /* CompleteClass */
  var yomiDisplayName: String = js.native
  
  /** Gets the Yomi (phonetic Japanese equivalent) family name for a contact. The maximum string length for the Yomi family name is 120 characters. */
  /* CompleteClass */
  var yomiFamilyName: String = js.native
  
  /** Gets the Yomi (phonetic Japanese equivalent) given name for a contact. The maximum string length for the Yomi given name is 120 characters. */
  /* CompleteClass */
  var yomiGivenName: String = js.native
}
