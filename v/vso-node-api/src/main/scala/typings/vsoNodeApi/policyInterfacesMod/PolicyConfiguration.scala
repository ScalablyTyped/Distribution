package typings.vsoNodeApi.policyInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyConfiguration extends VersionedPolicyConfigurationRef {
  /**
    * The links to other objects related to this object.
    */
  var _links: js.Any = js.native
  /**
    * A reference to the identity that created the policy.
    */
  var createdBy: IdentityRef = js.native
  /**
    * The date and time when the policy was created.
    */
  var createdDate: Date = js.native
  /**
    * Indicates whether the policy is blocking.
    */
  var isBlocking: Boolean = js.native
  /**
    * Indicates whether the policy has been (soft) deleted.
    */
  var isDeleted: Boolean = js.native
  /**
    * Indicates whether the policy is enabled.
    */
  var isEnabled: Boolean = js.native
  /**
    * The policy configuration settings.
    */
  var settings: js.Any = js.native
}

object PolicyConfiguration {
  @scala.inline
  def apply(
    _links: js.Any,
    createdBy: IdentityRef,
    createdDate: Date,
    id: Double,
    isBlocking: Boolean,
    isDeleted: Boolean,
    isEnabled: Boolean,
    revision: Double,
    settings: js.Any,
    `type`: PolicyTypeRef,
    url: String
  ): PolicyConfiguration = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBlocking = isBlocking.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyConfiguration]
  }
  @scala.inline
  implicit class PolicyConfigurationOps[Self <: PolicyConfiguration] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedBy(value: IdentityRef): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedDate(value: Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBlocking(value: Boolean): Self = this.set("isBlocking", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: js.Any): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

