package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailMessageBodyKind extends StObject
/** Defines the format of an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageBodyKind")
@js.native
object EmailMessageBodyKind extends StObject {
  
  /** The email message is formatted as HTML. */
  @js.native
  sealed trait html extends EmailMessageBodyKind
  
  /** The email message is formatted as plain text. */
  @js.native
  sealed trait plainText extends EmailMessageBodyKind
}
