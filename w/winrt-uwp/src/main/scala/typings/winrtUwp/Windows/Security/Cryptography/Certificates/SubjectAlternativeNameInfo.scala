package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a subject alternative name. */
trait SubjectAlternativeNameInfo extends js.Object {
  /** Gets the distinguished name. */
  var distinguishedName: IVectorView[String]
  /** Gets the DNS name. */
  var dnsName: IVectorView[String]
  /** Gets the email name. */
  var emailName: IVectorView[String]
  /** Gets the IP address. */
  var ipAddress: IVectorView[String]
  /** Gets the principal name. */
  var principalName: IVectorView[String]
  /** Gets the URL. */
  var url: IVectorView[String]
}

object SubjectAlternativeNameInfo {
  @scala.inline
  def apply(
    distinguishedName: IVectorView[String],
    dnsName: IVectorView[String],
    emailName: IVectorView[String],
    ipAddress: IVectorView[String],
    principalName: IVectorView[String],
    url: IVectorView[String]
  ): SubjectAlternativeNameInfo = {
    val __obj = js.Dynamic.literal(distinguishedName = distinguishedName.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], emailName = emailName.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], principalName = principalName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAlternativeNameInfo]
  }
}

