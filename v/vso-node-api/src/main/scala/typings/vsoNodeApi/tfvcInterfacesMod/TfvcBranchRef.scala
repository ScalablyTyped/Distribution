package typings.vsoNodeApi.tfvcInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcBranchRef]
  }
}

