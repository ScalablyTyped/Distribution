package typings.winrtUwp.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages enterprise-protection policy on protected content. */
@js.native
trait ProtectionPolicyManager extends js.Object {
  /** Gets or sets the enterprise identity. */
  var identity: String = js.native
}

object ProtectionPolicyManager {
  @scala.inline
  def apply(identity: String): ProtectionPolicyManager = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionPolicyManager]
  }
  @scala.inline
  implicit class ProtectionPolicyManagerOps[Self <: ProtectionPolicyManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
  }
  
}

