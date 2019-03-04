package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateScopeInfo extends js.Object {
  var adminGroupDescription: java.lang.String
  var adminGroupName: java.lang.String
  var creatorId: java.lang.String
  var parentScopeId: java.lang.String
  var scopeName: java.lang.String
  var scopeType: GroupScopeType
}

object CreateScopeInfo {
  @scala.inline
  def apply(
    adminGroupDescription: java.lang.String,
    adminGroupName: java.lang.String,
    creatorId: java.lang.String,
    parentScopeId: java.lang.String,
    scopeName: java.lang.String,
    scopeType: GroupScopeType
  ): CreateScopeInfo = {
    val __obj = js.Dynamic.literal(adminGroupDescription = adminGroupDescription, adminGroupName = adminGroupName, creatorId = creatorId, parentScopeId = parentScopeId, scopeName = scopeName, scopeType = scopeType)
  
    __obj.asInstanceOf[CreateScopeInfo]
  }
}

