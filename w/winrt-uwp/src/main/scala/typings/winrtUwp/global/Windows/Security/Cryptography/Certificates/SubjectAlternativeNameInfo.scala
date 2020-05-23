package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a subject alternative name. */
@JSGlobal("Windows.Security.Cryptography.Certificates.SubjectAlternativeNameInfo")
@js.native
/** Creates a new instance of the SubjectAlternativeNameInfo class. */
class SubjectAlternativeNameInfo ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.SubjectAlternativeNameInfo {
  /** Gets the distinguished name. */
  /* CompleteClass */
  override var distinguishedName: IVectorView[String] = js.native
  /** Gets the DNS name. */
  /* CompleteClass */
  override var dnsName: IVectorView[String] = js.native
  /** Gets the email name. */
  /* CompleteClass */
  override var emailName: IVectorView[String] = js.native
  /** Gets the IP address. */
  /* CompleteClass */
  override var ipAddress: IVectorView[String] = js.native
  /** Gets the principal name. */
  /* CompleteClass */
  override var principalName: IVectorView[String] = js.native
  /** Gets the URL. */
  /* CompleteClass */
  override var url: IVectorView[String] = js.native
}

