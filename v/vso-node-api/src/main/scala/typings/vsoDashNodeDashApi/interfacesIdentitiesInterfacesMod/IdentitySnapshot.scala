package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitySnapshot extends js.Object {
  var groups: js.Array[Identity]
  var identityIds: js.Array[String]
  var memberships: js.Array[GroupMembership]
  var scopeId: String
  var scopes: js.Array[IdentityScope]
}

object IdentitySnapshot {
  @scala.inline
  def apply(
    groups: js.Array[Identity],
    identityIds: js.Array[String],
    memberships: js.Array[GroupMembership],
    scopeId: String,
    scopes: js.Array[IdentityScope]
  ): IdentitySnapshot = {
    val __obj = js.Dynamic.literal(groups = groups, identityIds = identityIds, memberships = memberships, scopeId = scopeId, scopes = scopes)
  
    __obj.asInstanceOf[IdentitySnapshot]
  }
}

