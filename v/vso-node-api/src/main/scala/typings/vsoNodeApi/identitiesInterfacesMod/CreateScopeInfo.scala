package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateScopeInfo extends js.Object {
  var adminGroupDescription: String
  var adminGroupName: String
  var creatorId: String
  var parentScopeId: String
  var scopeName: String
  var scopeType: GroupScopeType
}

object CreateScopeInfo {
  @scala.inline
  def apply(
    adminGroupDescription: String,
    adminGroupName: String,
    creatorId: String,
    parentScopeId: String,
    scopeName: String,
    scopeType: GroupScopeType
  ): CreateScopeInfo = {
    val __obj = js.Dynamic.literal(adminGroupDescription = adminGroupDescription.asInstanceOf[js.Any], adminGroupName = adminGroupName.asInstanceOf[js.Any], creatorId = creatorId.asInstanceOf[js.Any], parentScopeId = parentScopeId.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any], scopeType = scopeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateScopeInfo]
  }
}

