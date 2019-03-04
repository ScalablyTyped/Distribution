package typings
package winrtLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRevocationAndRenewalItem extends js.Object {
  var headerHash: java.lang.String
  var name: java.lang.String
  var publicKeyHash: java.lang.String
  var reasons: RevocationAndRenewalReasons
  var renewalId: java.lang.String
}

object IRevocationAndRenewalItem {
  @scala.inline
  def apply(
    headerHash: java.lang.String,
    name: java.lang.String,
    publicKeyHash: java.lang.String,
    reasons: RevocationAndRenewalReasons,
    renewalId: java.lang.String
  ): IRevocationAndRenewalItem = {
    val __obj = js.Dynamic.literal(headerHash = headerHash, name = name, publicKeyHash = publicKeyHash, reasons = reasons, renewalId = renewalId)
  
    __obj.asInstanceOf[IRevocationAndRenewalItem]
  }
}

