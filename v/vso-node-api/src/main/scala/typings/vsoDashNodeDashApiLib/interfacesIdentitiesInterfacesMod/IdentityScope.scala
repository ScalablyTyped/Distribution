package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityScope extends js.Object {
  var administrators: IdentityDescriptor
  var id: java.lang.String
  var isActive: scala.Boolean
  var isGlobal: scala.Boolean
  var localScopeId: java.lang.String
  var name: java.lang.String
  var parentId: java.lang.String
  var scopeType: GroupScopeType
  var securingHostId: java.lang.String
  var subjectDescriptor: java.lang.String
}

object IdentityScope {
  @scala.inline
  def apply(
    administrators: IdentityDescriptor,
    id: java.lang.String,
    isActive: scala.Boolean,
    isGlobal: scala.Boolean,
    localScopeId: java.lang.String,
    name: java.lang.String,
    parentId: java.lang.String,
    scopeType: GroupScopeType,
    securingHostId: java.lang.String,
    subjectDescriptor: java.lang.String
  ): IdentityScope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("administrators")(administrators)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("isGlobal")(isGlobal)
    __obj.updateDynamic("localScopeId")(localScopeId)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parentId")(parentId)
    __obj.updateDynamic("scopeType")(scopeType)
    __obj.updateDynamic("securingHostId")(securingHostId)
    __obj.updateDynamic("subjectDescriptor")(subjectDescriptor)
    __obj.asInstanceOf[IdentityScope]
  }
}

