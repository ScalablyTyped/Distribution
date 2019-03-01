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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("descriptor")(descriptor)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("queriedId")(queriedId)
    __obj.asInstanceOf[GroupMembership]
  }
}

