package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailMessageResponseKind extends StObject
/** Defines the type of response to an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageResponseKind")
@js.native
object EmailMessageResponseKind extends StObject {
  
  /** The email message is a forwarded copy of another email message. */
  @js.native
  sealed trait forward
    extends StObject
       with EmailMessageResponseKind
  
  /** The email message is not a response to another email message. */
  @js.native
  sealed trait none
    extends StObject
       with EmailMessageResponseKind
  
  /** The email message is a reply to the sender of another email message. */
  @js.native
  sealed trait reply
    extends StObject
       with EmailMessageResponseKind
  
  /** The email message is a reply to the sender and all addressees of another email message. */
  @js.native
  sealed trait replyAll
    extends StObject
       with EmailMessageResponseKind
}
