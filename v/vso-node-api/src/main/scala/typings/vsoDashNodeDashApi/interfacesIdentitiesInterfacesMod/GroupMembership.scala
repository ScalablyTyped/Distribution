package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMembership extends js.Object {
  var active: Boolean
  var descriptor: IdentityDescriptor
  var id: String
  var queriedId: String
}

object GroupMembership {
  @scala.inline
  def apply(active: Boolean, descriptor: IdentityDescriptor, id: String, queriedId: String): GroupMembership = {
    val __obj = js.Dynamic.literal(active = active, descriptor = descriptor, id = id, queriedId = queriedId)
  
    __obj.asInstanceOf[GroupMembership]
  }
}

