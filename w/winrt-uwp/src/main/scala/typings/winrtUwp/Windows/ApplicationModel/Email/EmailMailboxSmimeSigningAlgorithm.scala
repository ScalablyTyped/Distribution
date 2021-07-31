package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailMailboxSmimeSigningAlgorithm extends StObject
/** Defines the algorithm used to sign an email. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxSmimeSigningAlgorithm")
@js.native
object EmailMailboxSmimeSigningAlgorithm extends StObject {
  
  /** No specific algorithm is required. */
  @js.native
  sealed trait any
    extends StObject
       with EmailMailboxSmimeSigningAlgorithm
  
  /** Use Message Digest algorithm 5 (128-bit). */
  @js.native
  sealed trait md5
    extends StObject
       with EmailMailboxSmimeSigningAlgorithm
  
  /** Use Secure Hash Algorithm 1 (160-bit). */
  @js.native
  sealed trait sha1
    extends StObject
       with EmailMailboxSmimeSigningAlgorithm
}
