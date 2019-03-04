package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitySnapshot extends js.Object {
  var groups: js.Array[Identity]
  var identityIds: js.Array[java.lang.String]
  var memberships: js.Array[GroupMembership]
  var scopeId: java.lang.String
  var scopes: js.Array[IdentityScope]
}

object IdentitySnapshot {
  @scala.inline
  def apply(
    groups: js.Array[Identity],
    identityIds: js.Array[java.lang.String],
    memberships: js.Array[GroupMembership],
    scopeId: java.lang.String,
    scopes: js.Array[IdentityScope]
  ): IdentitySnapshot = {
    val __obj = js.Dynamic.literal(groups = groups, identityIds = identityIds, memberships = memberships, scopeId = scopeId, scopes = scopes)
  
    __obj.asInstanceOf[IdentitySnapshot]
  }
}

