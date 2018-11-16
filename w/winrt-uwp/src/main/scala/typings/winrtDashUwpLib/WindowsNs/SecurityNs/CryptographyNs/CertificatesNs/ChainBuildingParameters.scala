package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents parameters to use when building a certificate chain. */
@JSGlobal("Windows.Security.Cryptography.Certificates.ChainBuildingParameters")
@js.native
class ChainBuildingParameters () extends js.Object {
  /** Gets or sets a value that indicates whether Authority Information Access (AIA) is enabled. */
  var authorityInformationAccessEnabled: scala.Boolean = js.native
  /** Gets or sets a value indicating that the current time is to be used for the validation timestamp. */
  var currentTimeValidationEnabled: scala.Boolean = js.native
  /** Gets a collection of object identifiers (OIDs) for the enhanced key usage extension. */
  var enhancedKeyUsages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets the list of root certificates that will be trusted. */
  var exclusiveTrustRoots: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Certificate] = js.native
  /** Gets or sets a value indicating whether to request new URLs to use for chain building and revocation checking or to use cached URLs. */
  var networkRetrievalEnabled: scala.Boolean = js.native
  /** Gets or sets a value indicating whether revocation checking is enabled. */
  var revocationCheckEnabled: scala.Boolean = js.native
  /** Gets or sets the time stamp used to determine whether the certificate chain was time valid. */
  var validationTimestamp: stdLib.Date = js.native
}

