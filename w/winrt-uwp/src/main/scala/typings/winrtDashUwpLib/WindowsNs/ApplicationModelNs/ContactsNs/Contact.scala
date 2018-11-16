package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.Contact")
@js.native
class Contact () extends js.Object {
  /** Gets the contact addresses for a contact. */
  var addresses: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ContactAddress] = js.native
  /** If this is a raw contact that is part of an aggregate contact, then this property identifies the parent aggregate. */
  var aggregateId: java.lang.String = js.native
  /** Gets the connected service accounts for a contact. */
  var connectedServiceAccounts: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ContactConnectedServiceAccount] = js.native
  /** Gets a string that identifies the ContactList to which this contact is a member. */
  var contactListId: java.lang.String = js.native
  /** Gets the data suppliers for a contact. The maximum string length for each data supplier is 50 characters. */
  var dataSuppliers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets the display name for a contact. */
  var displayName: java.lang.String = js.native
  /** Gets or sets the display that was manually entered by the user. */
  var displayNameOverride: java.lang.String = js.native
  /** Gets or sets the last time the user updated their display picture. */
  var displayPictureUserUpdateTime: stdLib.Date = js.native
  /** Gets the email addresses for a contact. */
  var emails: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ContactEmail] = js.native
  /** Sets the fields that contain information about a contact. */
  var fields: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[IContactField] = js.native
  /** Gets and sets the first name for a contact. The maximum string length for the first name is 64 characters. */
  var firstName: java.lang.String = js.native
  /** Gets the full name of the Contact . */
  var fullName: java.lang.String = js.native
  /** Gets and sets the honorific prefix for the name for a contact. The maximum string length for the honorific prefix is 32 characters. */
  var honorificNamePrefix: java.lang.String = js.native
  /** Gets and sets the honorific suffix for the name for a contact. The maximum string length for the honorific suffix is 32 characters. */
  var honorificNameSuffix: java.lang.String = js.native
  /** Gets and sets the identifier for a contact. The maximum string length for the identifier is 256 characters. */
  var id: java.lang.String = js.native
  /** Gets the important dates for a contact. */
  var importantDates: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ContactDate] = js.native
  /** Gets a Boolean value indicating of this is an aggregate Contact . */
  var isAggregate: scala.Boolean = js.native
  /** Gets a Boolean value indicating if the user manually set the picture for the Contact . */
  var isDisplayPictureManuallySet: scala.Boolean = js.native
  /** Gets a Boolean value indicating if this Contact represents the user logged into the device. */
  var isMe: scala.Boolean = js.native
  /** Gets the job info items for a contact. */
  var jobInfo: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ContactJobInfo] = js.native
  /** Gets a large version of the display picture for the Contact . */
  var largeDisplayPicture: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets and sets the last name for a contact. The maximum string length for the last name is 64 characters. */
  var lastName: java.lang.String = js.native
  /** Gets and sets the middle name for a contact. The maximum string length for the middle name is 64 characters. */
  var middleName: java.lang.String = js.native
  /** Sets and gets the name of the contact. */
  var name: java.lang.String = js.native
  /** Gets or sets the nickname for the Contact . */
  var nickname: java.lang.String = js.native
  /** Gets and sets notes for a contact. The maximum string length for notes is 4096 characters. */
  var notes: java.lang.String = js.native
  /** Gets info about the phones for a contact. */
  var phones: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ContactPhone] = js.native
  /** Gets the property set object for the contact. */
  var providerProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  /** Gets or sets an ID that can be used by a service provider to access the Contact in their remote system. */
  var remoteId: java.lang.String = js.native
  /** Gets or puts the path to the ringtone file for the Contact . */
  var ringToneToken: java.lang.String = js.native
  /** Gets the significant others for a contact. */
  var significantOthers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ContactSignificantOther] = js.native
  /** Gets a small version of the display picture for the Contact . */
  var smallDisplayPicture: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets the name used to sort the contact. */
  var sortName: java.lang.String = js.native
  /** Gets or sets the display picture for the Contact in its original size. */
  var sourceDisplayPicture: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets or puts the path to the audio file to play when an SMS/MMS message is received from the Contact . */
  var textToneToken: java.lang.String = js.native
  var thumbnail: js.Any = js.native
   /* unmapped type *//** Gets the Web sites for a contact. */
  var websites: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ContactWebsite] = js.native
  /** Gets the Yomi (phonetic Japanese equivalent) display name for a contact. */
  var yomiDisplayName: java.lang.String = js.native
  /** Gets the Yomi (phonetic Japanese equivalent) family name for a contact. The maximum string length for the Yomi family name is 120 characters. */
  var yomiFamilyName: java.lang.String = js.native
  /** Gets the Yomi (phonetic Japanese equivalent) given name for a contact. The maximum string length for the Yomi given name is 120 characters. */
  var yomiGivenName: java.lang.String = js.native
}

