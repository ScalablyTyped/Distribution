package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an attempt to resolve an email recipient. */
@JSGlobal("Windows.ApplicationModel.Email.EmailRecipientResolutionResult")
@js.native
abstract class EmailRecipientResolutionResult () extends js.Object {
  /** Gets the public key for an email recipient. */
  var publicKeys: IVectorView[Certificate] = js.native
  /** Gets the state of an attempt to resolve an email recipient. */
  var status: EmailRecipientResolutionStatus = js.native
}

