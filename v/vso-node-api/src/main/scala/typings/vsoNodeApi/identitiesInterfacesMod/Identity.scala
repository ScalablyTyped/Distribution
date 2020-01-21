package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  /**
    * The custom display name for the identity (if any). Setting this property to an empty string will clear the existing custom display name. Setting this property to null will not affect the existing persisted value (since null values do not get sent over the wire or to the database)
    */
  var customDisplayName: String
  var descriptor: IdentityDescriptor
  var id: String
  var isActive: Boolean
  var isContainer: Boolean
  var masterId: String
  var memberIds: js.Array[String]
  var memberOf: js.Array[IdentityDescriptor]
  var members: js.Array[IdentityDescriptor]
  var metaTypeId: Double
  var properties: js.Any
  /**
    * The display name for the identity as specified by the source identity provider.
    */
  var providerDisplayName: String
  var resourceVersion: Double
  var subjectDescriptor: String
  var uniqueUserId: Double
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
}

