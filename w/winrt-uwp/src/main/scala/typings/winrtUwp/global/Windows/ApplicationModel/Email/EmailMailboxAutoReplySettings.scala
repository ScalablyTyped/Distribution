package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the settings for the automatic reply functionality of an email account. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxAutoReplySettings")
@js.native
/** Initializes a new instance of an EmailMailboxAutoReplySettings object. */
class EmailMailboxAutoReplySettings ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAutoReplySettings {
  
  /** Represents the end time for the automated reply period. */
  /* CompleteClass */
  var endTime: Date = js.native
  
  /** Gets the automatic reply message intended for an email message from an internal sender. */
  /* CompleteClass */
  var internalReply: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAutoReply = js.native
  
  /** Gets a Boolean value indicating whether automatic replies are enabled. */
  /* CompleteClass */
  var isEnabled: Boolean = js.native
  
  /** Gets the automatic reply message intended for an email message from a known external sender. */
  /* CompleteClass */
  var knownExternalReply: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAutoReply = js.native
  
  /** Gets or sets whether the automated response email message is encoded as HTML or plain text. */
  /* CompleteClass */
  var responseKind: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAutoReplyMessageResponseKind = js.native
  
  /** Represents the start time for the automated reply period. */
  /* CompleteClass */
  var startTime: Date = js.native
  
  /** Gets the automatic reply message intended for an email message from an unknown external sender. */
  /* CompleteClass */
  var unknownExternalReply: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAutoReply = js.native
}
