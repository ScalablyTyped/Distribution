package typings.winrtDashUwp.Windows.Security.Cryptography.Certificates

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a subject alternative name. */
@JSGlobal("Windows.Security.Cryptography.Certificates.SubjectAlternativeNameInfo")
@js.native
/** Creates a new instance of the SubjectAlternativeNameInfo class. */
class SubjectAlternativeNameInfo () extends js.Object {
  /** Gets the distinguished name. */
  var distinguishedName: IVectorView[String] = js.native
  /** Gets the DNS name. */
  var dnsName: IVectorView[String] = js.native
  /** Gets the email name. */
  var emailName: IVectorView[String] = js.native
  /** Gets the IP address. */
  var ipAddress: IVectorView[String] = js.native
  /** Gets the principal name. */
  var principalName: IVectorView[String] = js.native
  /** Gets the URL. */
  var url: IVectorView[String] = js.native
}

