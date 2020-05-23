package typings.winrtUwp.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a component that is being revoked and renewed with a trusted component. */
trait RevocationAndRenewalItem extends js.Object {
  /** Returns the header hash for the component being revoked. */
  var headerHash: String
  /** Returns the name for the component being revoked. */
  var name: String
  /** Returns the public key hash for the component. */
  var publicKeyHash: String
  /** Returns the reason for revocation of component. */
  var reasons: RevocationAndRenewalReasons
  /** Returns the GUID for the renewal object. */
  var renewalId: String
}

object RevocationAndRenewalItem {
  @scala.inline
  def apply(
    headerHash: String,
    name: String,
    publicKeyHash: String,
    reasons: RevocationAndRenewalReasons,
    renewalId: String
  ): RevocationAndRenewalItem = {
    val __obj = js.Dynamic.literal(headerHash = headerHash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicKeyHash = publicKeyHash.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], renewalId = renewalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevocationAndRenewalItem]
  }
}

