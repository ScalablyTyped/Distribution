package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a contact. */
trait Contact extends js.Object {
  /** Gets the contact addresses for a contact. */
  var addresses: IVector[ContactAddress]
  /** If this is a raw contact that is part of an aggregate contact, then this property identifies the parent aggregate. */
  var aggregateId: String
  /** Gets the connected service accounts for a contact. */
  var connectedServiceAccounts: IVector[ContactConnectedServiceAccount]
  /** Gets a string that identifies the ContactList to which this contact is a member. */
  var contactListId: String
  /** Gets the data suppliers for a contact. The maximum string length for each data supplier is 50 characters. */
  var dataSuppliers: IVector[String]
  /** Gets the display name for a contact. */
  var displayName: String
  /** Gets or sets the display that was manually entered by the user. */
  var displayNameOverride: String
  /** Gets or sets the last time the user updated their display picture. */
  var displayPictureUserUpdateTime: Date
  /** Gets the email addresses for a contact. */
  var emails: IVector[ContactEmail]
  /** Sets the fields that contain information about a contact. */
  var fields: IVector[IContactField]
  /** Gets and sets the first name for a contact. The maximum string length for the first name is 64 characters. */
  var firstName: String
  /** Gets the full name of the Contact . */
  var fullName: String
  /** Gets and sets the honorific prefix for the name for a contact. The maximum string length for the honorific prefix is 32 characters. */
  var honorificNamePrefix: String
  /** Gets and sets the honorific suffix for the name for a contact. The maximum string length for the honorific suffix is 32 characters. */
  var honorificNameSuffix: String
  /** Gets and sets the identifier for a contact. The maximum string length for the identifier is 256 characters. */
  var id: String
  /** Gets the important dates for a contact. */
  var importantDates: IVector[ContactDate]
  /** Gets a Boolean value indicating of this is an aggregate Contact . */
  var isAggregate: Boolean
  /** Gets a Boolean value indicating if the user manually set the picture for the Contact . */
  var isDisplayPictureManuallySet: Boolean
  /** Gets a Boolean value indicating if this Contact represents the user logged into the device. */
  var isMe: Boolean
  /** Gets the job info items for a contact. */
  var jobInfo: IVector[ContactJobInfo]
  /** Gets a large version of the display picture for the Contact . */
  var largeDisplayPicture: IRandomAccessStreamReference
  /** Gets and sets the last name for a contact. The maximum string length for the last name is 64 characters. */
  var lastName: String
  /** Gets and sets the middle name for a contact. The maximum string length for the middle name is 64 characters. */
  var middleName: String
  /** Sets and gets the name of the contact. */
  var name: String
  /** Gets or sets the nickname for the Contact . */
  var nickname: String
  /** Gets and sets notes for a contact. The maximum string length for notes is 4096 characters. */
  var notes: String
  /** Gets info about the phones for a contact. */
  var phones: IVector[ContactPhone]
  /** Gets the property set object for the contact. */
  var providerProperties: IPropertySet
  /** Gets or sets an ID that can be used by a service provider to access the Contact in their remote system. */
  var remoteId: String
  /** Gets or puts the path to the ringtone file for the Contact . */
  var ringToneToken: String
  /** Gets the significant others for a contact. */
  var significantOthers: IVector[ContactSignificantOther]
  /** Gets a small version of the display picture for the Contact . */
  var smallDisplayPicture: IRandomAccessStreamReference
  /** Gets the name used to sort the contact. */
  var sortName: String
  /** Gets or sets the display picture for the Contact in its original size. */
  var sourceDisplayPicture: IRandomAccessStreamReference
  /** Gets or puts the path to the audio file to play when an SMS/MMS message is received from the Contact . */
  var textToneToken: String
  var thumbnail: js.Any
   /* unmapped type */ /** Gets the Web sites for a contact. */
  var websites: IVector[ContactWebsite]
  /** Gets the Yomi (phonetic Japanese equivalent) display name for a contact. */
  var yomiDisplayName: String
  /** Gets the Yomi (phonetic Japanese equivalent) family name for a contact. The maximum string length for the Yomi family name is 120 characters. */
  var yomiFamilyName: String
  /** Gets the Yomi (phonetic Japanese equivalent) given name for a contact. The maximum string length for the Yomi given name is 120 characters. */
  var yomiGivenName: String
}

object Contact {
  @scala.inline
  def apply(
    addresses: IVector[ContactAddress],
    aggregateId: String,
    connectedServiceAccounts: IVector[ContactConnectedServiceAccount],
    contactListId: String,
    dataSuppliers: IVector[String],
    displayName: String,
    displayNameOverride: String,
    displayPictureUserUpdateTime: Date,
    emails: IVector[ContactEmail],
    fields: IVector[IContactField],
    firstName: String,
    fullName: String,
    honorificNamePrefix: String,
    honorificNameSuffix: String,
    id: String,
    importantDates: IVector[ContactDate],
    isAggregate: Boolean,
    isDisplayPictureManuallySet: Boolean,
    isMe: Boolean,
    jobInfo: IVector[ContactJobInfo],
    largeDisplayPicture: IRandomAccessStreamReference,
    lastName: String,
    middleName: String,
    name: String,
    nickname: String,
    notes: String,
    phones: IVector[ContactPhone],
    providerProperties: IPropertySet,
    remoteId: String,
    ringToneToken: String,
    significantOthers: IVector[ContactSignificantOther],
    smallDisplayPicture: IRandomAccessStreamReference,
    sortName: String,
    sourceDisplayPicture: IRandomAccessStreamReference,
    textToneToken: String,
    thumbnail: js.Any,
    websites: IVector[ContactWebsite],
    yomiDisplayName: String,
    yomiFamilyName: String,
    yomiGivenName: String
  ): Contact = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], aggregateId = aggregateId.asInstanceOf[js.Any], connectedServiceAccounts = connectedServiceAccounts.asInstanceOf[js.Any], contactListId = contactListId.asInstanceOf[js.Any], dataSuppliers = dataSuppliers.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayNameOverride = displayNameOverride.asInstanceOf[js.Any], displayPictureUserUpdateTime = displayPictureUserUpdateTime.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], honorificNamePrefix = honorificNamePrefix.asInstanceOf[js.Any], honorificNameSuffix = honorificNameSuffix.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], importantDates = importantDates.asInstanceOf[js.Any], isAggregate = isAggregate.asInstanceOf[js.Any], isDisplayPictureManuallySet = isDisplayPictureManuallySet.asInstanceOf[js.Any], isMe = isMe.asInstanceOf[js.Any], jobInfo = jobInfo.asInstanceOf[js.Any], largeDisplayPicture = largeDisplayPicture.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], phones = phones.asInstanceOf[js.Any], providerProperties = providerProperties.asInstanceOf[js.Any], remoteId = remoteId.asInstanceOf[js.Any], ringToneToken = ringToneToken.asInstanceOf[js.Any], significantOthers = significantOthers.asInstanceOf[js.Any], smallDisplayPicture = smallDisplayPicture.asInstanceOf[js.Any], sortName = sortName.asInstanceOf[js.Any], sourceDisplayPicture = sourceDisplayPicture.asInstanceOf[js.Any], textToneToken = textToneToken.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], websites = websites.asInstanceOf[js.Any], yomiDisplayName = yomiDisplayName.asInstanceOf[js.Any], yomiFamilyName = yomiFamilyName.asInstanceOf[js.Any], yomiGivenName = yomiGivenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
}

