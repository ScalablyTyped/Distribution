package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identity extends js.Object {
  /**
    * The custom display name for the identity (if any). Setting this property to an empty string will clear the existing custom display name. Setting this property to null will not affect the existing persisted value (since null values do not get sent over the wire or to the database)
    */
  var customDisplayName: String = js.native
  var descriptor: IdentityDescriptor = js.native
  var id: String = js.native
  var isActive: Boolean = js.native
  var isContainer: Boolean = js.native
  var masterId: String = js.native
  var memberIds: js.Array[String] = js.native
  var memberOf: js.Array[IdentityDescriptor] = js.native
  var members: js.Array[IdentityDescriptor] = js.native
  var metaTypeId: Double = js.native
  var properties: js.Any = js.native
  /**
    * The display name for the identity as specified by the source identity provider.
    */
  var providerDisplayName: String = js.native
  var resourceVersion: Double = js.native
  var subjectDescriptor: String = js.native
  var uniqueUserId: Double = js.native
}

object Identity {
  @scala.inline
  def apply(
    customDisplayName: String,
    descriptor: IdentityDescriptor,
    id: String,
    isActive: Boolean,
    isContainer: Boolean,
    masterId: String,
    memberIds: js.Array[String],
    memberOf: js.Array[IdentityDescriptor],
    members: js.Array[IdentityDescriptor],
    metaTypeId: Double,
    properties: js.Any,
    providerDisplayName: String,
    resourceVersion: Double,
    subjectDescriptor: String,
    uniqueUserId: Double
  ): Identity = {
    val __obj = js.Dynamic.literal(customDisplayName = customDisplayName.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isContainer = isContainer.asInstanceOf[js.Any], masterId = masterId.asInstanceOf[js.Any], memberIds = memberIds.asInstanceOf[js.Any], memberOf = memberOf.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], metaTypeId = metaTypeId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], providerDisplayName = providerDisplayName.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], subjectDescriptor = subjectDescriptor.asInstanceOf[js.Any], uniqueUserId = uniqueUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  @scala.inline
  implicit class IdentityOps[Self <: Identity] (val x: Self) extends AnyVal {
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
    def setCustomDisplayName(value: String): Self = this.set("customDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptor(value: IdentityDescriptor): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsContainer(value: Boolean): Self = this.set("isContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMasterId(value: String): Self = this.set("masterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemberIdsVarargs(value: String*): Self = this.set("memberIds", js.Array(value :_*))
    @scala.inline
    def setMemberIds(value: js.Array[String]): Self = this.set("memberIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemberOfVarargs(value: IdentityDescriptor*): Self = this.set("memberOf", js.Array(value :_*))
    @scala.inline
    def setMemberOf(value: js.Array[IdentityDescriptor]): Self = this.set("memberOf", value.asInstanceOf[js.Any])
    @scala.inline
    def setMembersVarargs(value: IdentityDescriptor*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[IdentityDescriptor]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaTypeId(value: Double): Self = this.set("metaTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderDisplayName(value: String): Self = this.set("providerDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceVersion(value: Double): Self = this.set("resourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubjectDescriptor(value: String): Self = this.set("subjectDescriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueUserId(value: Double): Self = this.set("uniqueUserId", value.asInstanceOf[js.Any])
  }
  
}

