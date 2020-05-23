package typings.winrtUwp.global.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a component that is being revoked and renewed with a trusted component. */
@JSGlobal("Windows.Media.Protection.RevocationAndRenewalItem")
@js.native
abstract class RevocationAndRenewalItem ()
  extends typings.winrtUwp.Windows.Media.Protection.RevocationAndRenewalItem {
  /** Returns the header hash for the component being revoked. */
  /* CompleteClass */
  override var headerHash: String = js.native
  /** Returns the name for the component being revoked. */
  /* CompleteClass */
  override var name: String = js.native
  /** Returns the public key hash for the component. */
  /* CompleteClass */
  override var publicKeyHash: String = js.native
  /** Returns the reason for revocation of component. */
  /* CompleteClass */
  override var reasons: typings.winrtUwp.Windows.Media.Protection.RevocationAndRenewalReasons = js.native
  /** Returns the GUID for the renewal object. */
  /* CompleteClass */
  override var renewalId: String = js.native
}

