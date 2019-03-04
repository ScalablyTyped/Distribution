package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityBatchInfo extends js.Object {
  var descriptors: js.Array[IdentityDescriptor]
  var identityIds: js.Array[java.lang.String]
  var includeRestrictedVisibility: scala.Boolean
  var propertyNames: js.Array[java.lang.String]
  var queryMembership: QueryMembership
}

object IdentityBatchInfo {
  @scala.inline
  def apply(
    descriptors: js.Array[IdentityDescriptor],
    identityIds: js.Array[java.lang.String],
    includeRestrictedVisibility: scala.Boolean,
    propertyNames: js.Array[java.lang.String],
    queryMembership: QueryMembership
  ): IdentityBatchInfo = {
    val __obj = js.Dynamic.literal(descriptors = descriptors, identityIds = identityIds, includeRestrictedVisibility = includeRestrictedVisibility, propertyNames = propertyNames, queryMembership = queryMembership)
  
    __obj.asInstanceOf[IdentityBatchInfo]
  }
}

