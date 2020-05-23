package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents parameters to use when building a certificate chain. */
trait ChainBuildingParameters extends js.Object {
  /** Gets or sets a value that indicates whether Authority Information Access (AIA) is enabled. */
  var authorityInformationAccessEnabled: Boolean
  /** Gets or sets a value indicating that the current time is to be used for the validation timestamp. */
  var currentTimeValidationEnabled: Boolean
  /** Gets a collection of object identifiers (OIDs) for the enhanced key usage extension. */
  var enhancedKeyUsages: IVector[String]
  /** Gets the list of root certificates that will be trusted. */
  var exclusiveTrustRoots: IVector[Certificate]
  /** Gets or sets a value indicating whether to request new URLs to use for chain building and revocation checking or to use cached URLs. */
  var networkRetrievalEnabled: Boolean
  /** Gets or sets a value indicating whether revocation checking is enabled. */
  var revocationCheckEnabled: Boolean
  /** Gets or sets the time stamp used to determine whether the certificate chain was time valid. */
  var validationTimestamp: Date
}

object ChainBuildingParameters {
  @scala.inline
  def apply(
    authorityInformationAccessEnabled: Boolean,
    currentTimeValidationEnabled: Boolean,
    enhancedKeyUsages: IVector[String],
    exclusiveTrustRoots: IVector[Certificate],
    networkRetrievalEnabled: Boolean,
    revocationCheckEnabled: Boolean,
    validationTimestamp: Date
  ): ChainBuildingParameters = {
    val __obj = js.Dynamic.literal(authorityInformationAccessEnabled = authorityInformationAccessEnabled.asInstanceOf[js.Any], currentTimeValidationEnabled = currentTimeValidationEnabled.asInstanceOf[js.Any], enhancedKeyUsages = enhancedKeyUsages.asInstanceOf[js.Any], exclusiveTrustRoots = exclusiveTrustRoots.asInstanceOf[js.Any], networkRetrievalEnabled = networkRetrievalEnabled.asInstanceOf[js.Any], revocationCheckEnabled = revocationCheckEnabled.asInstanceOf[js.Any], validationTimestamp = validationTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainBuildingParameters]
  }
}

