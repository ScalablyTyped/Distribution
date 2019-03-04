package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  var createdDate: stdLib.Date
  /**
    * Description of the branch.
    */
  var description: java.lang.String
  /**
    * Is the branch deleted?
    */
  var isDeleted: scala.Boolean
  /**
    * Alias or display name of user
    */
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * URL to retrieve the item.
    */
  var url: java.lang.String
}

object TfvcBranchRef {
  @scala.inline
  def apply(
    _links: js.Any,
    createdDate: stdLib.Date,
    description: java.lang.String,
    isDeleted: scala.Boolean,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    path: java.lang.String,
    url: java.lang.String
  ): TfvcBranchRef = {
    val __obj = js.Dynamic.literal(_links = _links, createdDate = createdDate, description = description, isDeleted = isDeleted, owner = owner, path = path, url = url)
  
    __obj.asInstanceOf[TfvcBranchRef]
  }
}

