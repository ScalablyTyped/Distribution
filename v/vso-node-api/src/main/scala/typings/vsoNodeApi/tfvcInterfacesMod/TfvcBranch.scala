package typings.vsoNodeApi.tfvcInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcBranch
  extends StObject
     with TfvcBranchRef {
  
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
  
  inline def apply(
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
  
  extension [Self <: TfvcBranch](x: Self) {
    
    inline def setChildren(value: js.Array[TfvcBranch]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: TfvcBranch*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setMappings(value: js.Array[TfvcBranchMapping]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsVarargs(value: TfvcBranchMapping*): Self = StObject.set(x, "mappings", js.Array(value :_*))
    
    inline def setParent(value: TfvcShallowBranchRef): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRelatedBranches(value: js.Array[TfvcShallowBranchRef]): Self = StObject.set(x, "relatedBranches", value.asInstanceOf[js.Any])
    
    inline def setRelatedBranchesVarargs(value: TfvcShallowBranchRef*): Self = StObject.set(x, "relatedBranches", js.Array(value :_*))
  }
}
