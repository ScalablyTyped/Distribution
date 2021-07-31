package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailMessageSmimeKind extends StObject
/** Defines the S/MIME type of an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageSmimeKind")
@js.native
object EmailMessageSmimeKind extends StObject {
  
  /** Clear signed MIME (two MIME entities). */
  @js.native
  sealed trait clearSigned
    extends StObject
       with EmailMessageSmimeKind
  
  /** Encrypted MIME. */
  @js.native
  sealed trait encrypted
    extends StObject
       with EmailMessageSmimeKind
  
  /** No MIME encryption or signature. */
  @js.native
  sealed trait none
    extends StObject
       with EmailMessageSmimeKind
  
  /** Opaque signed MIME (a single MIME entity). */
  @js.native
  sealed trait opaqueSigned
    extends StObject
       with EmailMessageSmimeKind
}
