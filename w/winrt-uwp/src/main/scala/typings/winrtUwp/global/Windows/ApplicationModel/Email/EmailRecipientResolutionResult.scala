package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an attempt to resolve an email recipient. */
@JSGlobal("Windows.ApplicationModel.Email.EmailRecipientResolutionResult")
@js.native
abstract class EmailRecipientResolutionResult ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionResult {
  /** Gets the public key for an email recipient. */
  /* CompleteClass */
  override var publicKeys: IVectorView[Certificate] = js.native
  /** Gets the state of an attempt to resolve an email recipient. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus = js.native
}

