package typings.winrt.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRevocationAndRenewalItem extends js.Object {
  var headerHash: String
  var name: String
  var publicKeyHash: String
  var reasons: RevocationAndRenewalReasons
  var renewalId: String
}

object IRevocationAndRenewalItem {
  @scala.inline
  def apply(
    headerHash: String,
    name: String,
    publicKeyHash: String,
    reasons: RevocationAndRenewalReasons,
    renewalId: String
  ): IRevocationAndRenewalItem = {
    val __obj = js.Dynamic.literal(headerHash = headerHash, name = name, publicKeyHash = publicKeyHash, reasons = reasons, renewalId = renewalId)
  
    __obj.asInstanceOf[IRevocationAndRenewalItem]
  }
}

