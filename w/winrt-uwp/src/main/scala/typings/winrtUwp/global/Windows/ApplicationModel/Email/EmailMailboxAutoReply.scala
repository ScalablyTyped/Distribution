package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an auto-reply message set on a mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxAutoReply")
@js.native
abstract class EmailMailboxAutoReply ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAutoReply {
  
  /** Gets or sets a Boolean value that indicates if the auto-reply message is enabled. */
  /* CompleteClass */
  var isEnabled: Boolean = js.native
  
  /** Gets or sets the auto-reply response text. */
  /* CompleteClass */
  var response: String = js.native
}
