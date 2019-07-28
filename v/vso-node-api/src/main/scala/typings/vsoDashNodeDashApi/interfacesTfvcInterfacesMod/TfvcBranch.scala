package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcBranch extends TfvcBranchRef {
  /**
    * List of children for the branch.
    */
  var children: js.Array[TfvcBranch]
  /**
    * List of branch mappings.
    */
  var mappings: js.Array[TfvcBranchMapping]
  /**
    * Path of the branch's parent.
    */
  var parent: TfvcShallowBranchRef
  /**
    * List of paths of the related branches.
    */
  var relatedBranches: js.Array[TfvcShallowBranchRef]
}

object TfvcBranch {
  @scala.inline
  def apply(
    _links: js.Any,
    children: js.Array[TfvcBranch],
    createdDate: Date,
    description: String,
    isDeleted: Boolean,
    mappings: js.Array[TfvcBranchMapping],
    owner: IdentityRef,
    parent: TfvcShallowBranchRef,
    path: String,
    relatedBranches: js.Array[TfvcShallowBranchRef],
    url: String
  ): TfvcBranch = {
    val __obj = js.Dynamic.literal(_links = _links, children = children, createdDate = createdDate, description = description, isDeleted = isDeleted, mappings = mappings, owner = owner, parent = parent, path = path, relatedBranches = relatedBranches, url = url)
  
    __obj.asInstanceOf[TfvcBranch]
  }
}

