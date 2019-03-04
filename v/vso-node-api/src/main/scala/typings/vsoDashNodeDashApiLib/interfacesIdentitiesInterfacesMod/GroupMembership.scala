package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMembership extends js.Object {
  var active: scala.Boolean
  var descriptor: IdentityDescriptor
  var id: java.lang.String
  var queriedId: java.lang.String
}

object GroupMembership {
  @scala.inline
  def apply(
    active: scala.Boolean,
    descriptor: IdentityDescriptor,
    id: java.lang.String,
    queriedId: java.lang.String
  ): GroupMembership = {
    val __obj = js.Dynamic.literal(active = active, descriptor = descriptor, id = id, queriedId = queriedId)
  
    __obj.asInstanceOf[GroupMembership]
  }
}

