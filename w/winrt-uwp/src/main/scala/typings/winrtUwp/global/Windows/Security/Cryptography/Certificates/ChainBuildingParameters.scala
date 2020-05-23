package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents parameters to use when building a certificate chain. */
@JSGlobal("Windows.Security.Cryptography.Certificates.ChainBuildingParameters")
@js.native
/** Creates a new instance of the ChainBuildingParameters class. */
class ChainBuildingParameters ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainBuildingParameters {
  /** Gets or sets a value that indicates whether Authority Information Access (AIA) is enabled. */
  /* CompleteClass */
  override var authorityInformationAccessEnabled: Boolean = js.native
  /** Gets or sets a value indicating that the current time is to be used for the validation timestamp. */
  /* CompleteClass */
  override var currentTimeValidationEnabled: Boolean = js.native
  /** Gets a collection of object identifiers (OIDs) for the enhanced key usage extension. */
  /* CompleteClass */
  override var enhancedKeyUsages: IVector[String] = js.native
  /** Gets the list of root certificates that will be trusted. */
  /* CompleteClass */
  override var exclusiveTrustRoots: IVector[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate] = js.native
  /** Gets or sets a value indicating whether to request new URLs to use for chain building and revocation checking or to use cached URLs. */
  /* CompleteClass */
  override var networkRetrievalEnabled: Boolean = js.native
  /** Gets or sets a value indicating whether revocation checking is enabled. */
  /* CompleteClass */
  override var revocationCheckEnabled: Boolean = js.native
  /** Gets or sets the time stamp used to determine whether the certificate chain was time valid. */
  /* CompleteClass */
  override var validationTimestamp: Date = js.native
}

