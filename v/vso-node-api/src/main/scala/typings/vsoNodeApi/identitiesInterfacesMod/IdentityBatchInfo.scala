package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityBatchInfo extends js.Object {
  var descriptors: js.Array[IdentityDescriptor]
  var identityIds: js.Array[String]
  var includeRestrictedVisibility: Boolean
  var propertyNames: js.Array[String]
  var queryMembership: QueryMembership
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
}

