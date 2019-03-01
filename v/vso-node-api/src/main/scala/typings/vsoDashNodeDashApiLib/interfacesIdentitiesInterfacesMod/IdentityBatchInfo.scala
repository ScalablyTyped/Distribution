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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("descriptors")(descriptors)
    __obj.updateDynamic("identityIds")(identityIds)
    __obj.updateDynamic("includeRestrictedVisibility")(includeRestrictedVisibility)
    __obj.updateDynamic("propertyNames")(propertyNames)
    __obj.updateDynamic("queryMembership")(queryMembership)
    __obj.asInstanceOf[IdentityBatchInfo]
  }
}

