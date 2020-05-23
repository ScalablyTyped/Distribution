package typings.winrtUwp.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages enterprise-protection policy on protected content. */
trait ProtectionPolicyManager extends js.Object {
  /** Gets or sets the enterprise identity. */
  var identity: String
}

object ProtectionPolicyManager {
  @scala.inline
  def apply(identity: String): ProtectionPolicyManager = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionPolicyManager]
  }
}

