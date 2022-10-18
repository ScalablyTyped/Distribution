package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of an attempt to resolve an email recipient. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Email.EmailRecipientResolutionResult")
@js.native
open class EmailRecipientResolutionResult ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionResult {
  
  /** Gets the public key for an email recipient. */
  /* CompleteClass */
  var publicKeys: IVectorView[Certificate] = js.native
  
  /** Gets the state of an attempt to resolve an email recipient. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus = js.native
}
