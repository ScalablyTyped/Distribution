package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

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
    createdDate: stdLib.Date,
    description: java.lang.String,
    isDeleted: scala.Boolean,
    mappings: js.Array[TfvcBranchMapping],
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    parent: TfvcShallowBranchRef,
    path: java.lang.String,
    relatedBranches: js.Array[TfvcShallowBranchRef],
    url: java.lang.String
  ): TfvcBranch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("isDeleted")(isDeleted)
    __obj.updateDynamic("mappings")(mappings)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("relatedBranches")(relatedBranches)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TfvcBranch]
  }
}

