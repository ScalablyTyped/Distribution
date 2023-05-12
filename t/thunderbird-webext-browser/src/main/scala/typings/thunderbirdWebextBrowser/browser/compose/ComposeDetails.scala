package typings.thunderbirdWebextBrowser.browser.compose

import typings.thunderbirdWebextBrowser.browser.folders.MailFolder
import typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComposeDetails extends StObject {
  
  /**
    * An additional fcc folder which can be selected while composing the
    * message, an empty string if not used.
    */
  var additionalFccFolder: js.UndefOr[MailFolder | _empty] = js.undefined
  
  /**
    * Wether or not the vCard of the used identity will be attached to the
    * message during send. Note: If the value has not been modified,
    * selecting a different identity will load the default value of the new
    * identity.
    */
  var attachVCard: js.UndefOr[Boolean] = js.undefined
  
  /** Only used in the begin\* functions. Attachments to add to the message. */
  var attachments: js.UndefOr[js.Array[FileAttachment | ComposeAttachment]] = js.undefined
  
  var bcc: js.UndefOr[ComposeRecipientList] = js.undefined
  
  /** The HTML content of the message. */
  var body: js.UndefOr[String] = js.undefined
  
  var cc: js.UndefOr[ComposeRecipientList] = js.undefined
  
  /**
    * Array of custom headers. Headers will be returned in
    * _Http-Header-Case_ (a.k.a. _Train-Case_). Set an empty array to clear
    * all custom headers.
    */
  var customHeaders: js.UndefOr[js.Array[CustomHeader]] = js.undefined
  
  /**
    * Defines the mime format of the sent message (ignored on plain text
    * messages). Defaults to `auto`, which will send html messages as plain
    * text, if they do not include any formatting, and as `both` otherwise
    * (a multipart/mixed message).
    */
  var deliveryFormat: js.UndefOr[ComposeDetailsDeliveryFormat] = js.undefined
  
  /**
    * Let the sender know when the recipient's server received the message.
    * Not supported by all servers.
    */
  var deliveryStatusNotification: js.UndefOr[Boolean] = js.undefined
  
  var followupTo: js.UndefOr[ComposeRecipientList] = js.undefined
  
  /**
    * _Caution_: Setting a value for `from` does not change the used
    * identity, it overrides the FROM header. Many email servers do not
    * accept emails where the FROM header does not match the sender
    * identity. Must be set to exactly one valid email address.
    */
  var from: js.UndefOr[ComposeRecipient] = js.undefined
  
  /**
    * The ID of an identity from the
    * [accounts](https://webextension-api.thunderbird.net/en/stable/accounts.html)
    * API. The settings from the identity will be used in the composed
    * message. If `replyTo` is also specified, the `replyTo` property of the
    * identity is overridden. The permission
    * <permission>accountsRead</permission> is required to include the
    * `identityId`.
    */
  var identityId: js.UndefOr[String] = js.undefined
  
  /** Whether the message is an HTML message or a plain text message. */
  var isPlainText: js.UndefOr[Boolean] = js.undefined
  
  var newsgroups: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Indicates whether the default fcc setting (defined by the used
    * identity) is being overridden for this message. Setting `false` will
    * clear the override. Setting `true` will throw an _ExtensionError_, if
    * `overrideDefaultFccFolder` is not set as well.
    */
  var overrideDefaultFcc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This value overrides the default fcc setting (defined by the used
    * identity) for this message only. Either a {@link folders.MailFolder}
    * specifying the folder for the copy of the sent message, or an empty
    * string to not save a copy at all.
    */
  var overrideDefaultFccFolder: js.UndefOr[MailFolder | _empty] = js.undefined
  
  /** The plain text content of the message. */
  var plainTextBody: js.UndefOr[String] = js.undefined
  
  /** The priority of the message. */
  var priority: js.UndefOr[ComposeDetailsPriority] = js.undefined
  
  /**
    * The id of the original message (in case of draft, template, forward or
    * reply). Read-only. Is `null` in all other cases or if the original
    * message was opened from file.
    */
  var relatedMessageId: js.UndefOr[Double] = js.undefined
  
  var replyTo: js.UndefOr[ComposeRecipientList] = js.undefined
  
  /**
    * Add the _Disposition-Notification-To_ header to the message to
    * requests the recipients email client to send a reply once the message
    * has been received. Recipient server may strip the header and the
    * recipient might ignore the request.
    */
  var returnReceipt: js.UndefOr[Boolean] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[ComposeRecipientList] = js.undefined
  
  /**
    * Read-only. The type of the message being composed, depending on how
    * the compose window was opened by the user.
    */
  var `type`: js.UndefOr[ComposeDetailsType] = js.undefined
}
object ComposeDetails {
  
  inline def apply(): ComposeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComposeDetails] (val x: Self) extends AnyVal {
    
    inline def setAdditionalFccFolder(value: MailFolder | _empty): Self = StObject.set(x, "additionalFccFolder", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFccFolderUndefined: Self = StObject.set(x, "additionalFccFolder", js.undefined)
    
    inline def setAttachVCard(value: Boolean): Self = StObject.set(x, "attachVCard", value.asInstanceOf[js.Any])
    
    inline def setAttachVCardUndefined: Self = StObject.set(x, "attachVCard", js.undefined)
    
    inline def setAttachments(value: js.Array[FileAttachment | ComposeAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: (FileAttachment | ComposeAttachment)*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setBcc(value: ComposeRecipientList): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
    
    inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
    
    inline def setBccVarargs(value: ComposeRecipient*): Self = StObject.set(x, "bcc", js.Array(value*))
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCc(value: ComposeRecipientList): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
    
    inline def setCcVarargs(value: ComposeRecipient*): Self = StObject.set(x, "cc", js.Array(value*))
    
    inline def setCustomHeaders(value: js.Array[CustomHeader]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    inline def setCustomHeadersVarargs(value: CustomHeader*): Self = StObject.set(x, "customHeaders", js.Array(value*))
    
    inline def setDeliveryFormat(value: ComposeDetailsDeliveryFormat): Self = StObject.set(x, "deliveryFormat", value.asInstanceOf[js.Any])
    
    inline def setDeliveryFormatUndefined: Self = StObject.set(x, "deliveryFormat", js.undefined)
    
    inline def setDeliveryStatusNotification(value: Boolean): Self = StObject.set(x, "deliveryStatusNotification", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStatusNotificationUndefined: Self = StObject.set(x, "deliveryStatusNotification", js.undefined)
    
    inline def setFollowupTo(value: ComposeRecipientList): Self = StObject.set(x, "followupTo", value.asInstanceOf[js.Any])
    
    inline def setFollowupToUndefined: Self = StObject.set(x, "followupTo", js.undefined)
    
    inline def setFollowupToVarargs(value: ComposeRecipient*): Self = StObject.set(x, "followupTo", js.Array(value*))
    
    inline def setFrom(value: ComposeRecipient): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setIdentityId(value: String): Self = StObject.set(x, "identityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "identityId", js.undefined)
    
    inline def setIsPlainText(value: Boolean): Self = StObject.set(x, "isPlainText", value.asInstanceOf[js.Any])
    
    inline def setIsPlainTextUndefined: Self = StObject.set(x, "isPlainText", js.undefined)
    
    inline def setNewsgroups(value: String | js.Array[String]): Self = StObject.set(x, "newsgroups", value.asInstanceOf[js.Any])
    
    inline def setNewsgroupsUndefined: Self = StObject.set(x, "newsgroups", js.undefined)
    
    inline def setNewsgroupsVarargs(value: String*): Self = StObject.set(x, "newsgroups", js.Array(value*))
    
    inline def setOverrideDefaultFcc(value: Boolean): Self = StObject.set(x, "overrideDefaultFcc", value.asInstanceOf[js.Any])
    
    inline def setOverrideDefaultFccFolder(value: MailFolder | _empty): Self = StObject.set(x, "overrideDefaultFccFolder", value.asInstanceOf[js.Any])
    
    inline def setOverrideDefaultFccFolderUndefined: Self = StObject.set(x, "overrideDefaultFccFolder", js.undefined)
    
    inline def setOverrideDefaultFccUndefined: Self = StObject.set(x, "overrideDefaultFcc", js.undefined)
    
    inline def setPlainTextBody(value: String): Self = StObject.set(x, "plainTextBody", value.asInstanceOf[js.Any])
    
    inline def setPlainTextBodyUndefined: Self = StObject.set(x, "plainTextBody", js.undefined)
    
    inline def setPriority(value: ComposeDetailsPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRelatedMessageId(value: Double): Self = StObject.set(x, "relatedMessageId", value.asInstanceOf[js.Any])
    
    inline def setRelatedMessageIdUndefined: Self = StObject.set(x, "relatedMessageId", js.undefined)
    
    inline def setReplyTo(value: ComposeRecipientList): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
    
    inline def setReplyToVarargs(value: ComposeRecipient*): Self = StObject.set(x, "replyTo", js.Array(value*))
    
    inline def setReturnReceipt(value: Boolean): Self = StObject.set(x, "returnReceipt", value.asInstanceOf[js.Any])
    
    inline def setReturnReceiptUndefined: Self = StObject.set(x, "returnReceipt", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTo(value: ComposeRecipientList): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(value: ComposeRecipient*): Self = StObject.set(x, "to", js.Array(value*))
    
    inline def setType(value: ComposeDetailsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
