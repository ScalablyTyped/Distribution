package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityBatchInfo extends js.Object {
  var descriptors: js.Array[IdentityDescriptor] = js.native
  var identityIds: js.Array[String] = js.native
  var includeRestrictedVisibility: Boolean = js.native
  var propertyNames: js.Array[String] = js.native
  var queryMembership: QueryMembership = js.native
}

object IdentityBatchInfo {
  @scala.inline
  def apply(
    descriptors: js.Array[IdentityDescriptor],
    identityIds: js.Array[String],
    includeRestrictedVisibility: Boolean,
    propertyNames: js.Array[String],
    queryMembership: QueryMembership
  ): IdentityBatchInfo = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], identityIds = identityIds.asInstanceOf[js.Any], includeRestrictedVisibility = includeRestrictedVisibility.asInstanceOf[js.Any], propertyNames = propertyNames.asInstanceOf[js.Any], queryMembership = queryMembership.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityBatchInfo]
  }
  @scala.inline
  implicit class IdentityBatchInfoOps[Self <: IdentityBatchInfo] (val x: Self) extends AnyVal {
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
    def setDescriptorsVarargs(value: IdentityDescriptor*): Self = this.set("descriptors", js.Array(value :_*))
    @scala.inline
    def setDescriptors(value: js.Array[IdentityDescriptor]): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityIdsVarargs(value: String*): Self = this.set("identityIds", js.Array(value :_*))
    @scala.inline
    def setIdentityIds(value: js.Array[String]): Self = this.set("identityIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeRestrictedVisibility(value: Boolean): Self = this.set("includeRestrictedVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyNamesVarargs(value: String*): Self = this.set("propertyNames", js.Array(value :_*))
    @scala.inline
    def setPropertyNames(value: js.Array[String]): Self = this.set("propertyNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryMembership(value: QueryMembership): Self = this.set("queryMembership", value.asInstanceOf[js.Any])
  }
  
}

