package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcBranchRef extends TfvcShallowBranchRef {
  /**
    * A collection of REST reference links.
    */
  var _links: js.Any
  /**
    * Creation date of the branch.
    */
  var createdDate: Date
  /**
    * Description of the branch.
    */
  var description: String
  /**
    * Is the branch deleted?
    */
  var isDeleted: Boolean
  /**
    * Alias or display name of user
    */
  var owner: IdentityRef
  /**
    * URL to retrieve the item.
    */
  var url: String
}

object TfvcBranchRef {
  @scala.inline
  def apply(
    _links: js.Any,
    createdDate: Date,
    description: String,
    isDeleted: Boolean,
    owner: IdentityRef,
    path: String,
    url: String
  ): TfvcBranchRef = {
    val __obj = js.Dynamic.literal(_links = _links, createdDate = createdDate, description = description, isDeleted = isDeleted, owner = owner, path = path, url = url)
  
    __obj.asInstanceOf[TfvcBranchRef]
  }
}

