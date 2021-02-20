package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the settings for the automatic reply functionality of an email account. */
@js.native
trait EmailMailboxAutoReplySettings extends StObject {
  
  /** Represents the end time for the automated reply period. */
  var endTime: Date = js.native
  
  /** Gets the automatic reply message intended for an email message from an internal sender. */
  var internalReply: EmailMailboxAutoReply = js.native
  
  /** Gets a Boolean value indicating whether automatic replies are enabled. */
  var isEnabled: Boolean = js.native
  
  /** Gets the automatic reply message intended for an email message from a known external sender. */
  var knownExternalReply: EmailMailboxAutoReply = js.native
  
  /** Gets or sets whether the automated response email message is encoded as HTML or plain text. */
  var responseKind: EmailMailboxAutoReplyMessageResponseKind = js.native
  
  /** Represents the start time for the automated reply period. */
  var startTime: Date = js.native
  
  /** Gets the automatic reply message intended for an email message from an unknown external sender. */
  var unknownExternalReply: EmailMailboxAutoReply = js.native
}
object EmailMailboxAutoReplySettings {
  
  @scala.inline
  def apply(
    endTime: Date,
    internalReply: EmailMailboxAutoReply,
    isEnabled: Boolean,
    knownExternalReply: EmailMailboxAutoReply,
    responseKind: EmailMailboxAutoReplyMessageResponseKind,
    startTime: Date,
    unknownExternalReply: EmailMailboxAutoReply
  ): EmailMailboxAutoReplySettings = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], internalReply = internalReply.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], knownExternalReply = knownExternalReply.asInstanceOf[js.Any], responseKind = responseKind.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], unknownExternalReply = unknownExternalReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxAutoReplySettings]
  }
  
  @scala.inline
  implicit class EmailMailboxAutoReplySettingsMutableBuilder[Self <: EmailMailboxAutoReplySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalReply(value: EmailMailboxAutoReply): Self = StObject.set(x, "internalReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnownExternalReply(value: EmailMailboxAutoReply): Self = StObject.set(x, "knownExternalReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseKind(value: EmailMailboxAutoReplyMessageResponseKind): Self = StObject.set(x, "responseKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownExternalReply(value: EmailMailboxAutoReply): Self = StObject.set(x, "unknownExternalReply", value.asInstanceOf[js.Any])
  }
}
