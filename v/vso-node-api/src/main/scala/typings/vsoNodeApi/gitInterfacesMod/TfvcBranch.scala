package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcBranch extends TfvcBranchRef {
  /**
    * List of children for the branch.
    */
  var children: js.Array[TfvcBranch] = js.native
  /**
    * List of branch mappings.
    */
  var mappings: js.Array[TfvcBranchMapping] = js.native
  /**
    * Path of the branch's parent.
    */
  var parent: TfvcShallowBranchRef = js.native
  /**
    * List of paths of the related branches.
    */
  var relatedBranches: js.Array[TfvcShallowBranchRef] = js.native
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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], relatedBranches = relatedBranches.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcBranch]
  }
  @scala.inline
  implicit class TfvcBranchOps[Self <: TfvcBranch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenVarargs(value: TfvcBranch*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[TfvcBranch]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setMappingsVarargs(value: TfvcBranchMapping*): Self = this.set("mappings", js.Array(value :_*))
    @scala.inline
    def setMappings(value: js.Array[TfvcBranchMapping]): Self = this.set("mappings", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: TfvcShallowBranchRef): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedBranchesVarargs(value: TfvcShallowBranchRef*): Self = this.set("relatedBranches", js.Array(value :_*))
    @scala.inline
    def setRelatedBranches(value: js.Array[TfvcShallowBranchRef]): Self = this.set("relatedBranches", value.asInstanceOf[js.Any])
  }
  
}

