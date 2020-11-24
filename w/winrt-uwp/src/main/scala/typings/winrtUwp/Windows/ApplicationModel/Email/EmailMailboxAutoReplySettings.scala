package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the settings for the automatic reply functionality of an email account. */
@js.native
trait EmailMailboxAutoReplySettings extends js.Object {
  
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
  implicit class EmailMailboxAutoReplySettingsOps[Self <: EmailMailboxAutoReplySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndTime(value: Date): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalReply(value: EmailMailboxAutoReply): Self = this.set("internalReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnownExternalReply(value: EmailMailboxAutoReply): Self = this.set("knownExternalReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseKind(value: EmailMailboxAutoReplyMessageResponseKind): Self = this.set("responseKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownExternalReply(value: EmailMailboxAutoReply): Self = this.set("unknownExternalReply", value.asInstanceOf[js.Any])
  }
}
