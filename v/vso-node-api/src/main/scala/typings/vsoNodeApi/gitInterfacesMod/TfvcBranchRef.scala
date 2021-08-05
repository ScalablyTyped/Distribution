package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcBranchRef
  extends StObject
     with TfvcShallowBranchRef {
  
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
  
  inline def apply(
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
  
  extension [Self <: TfvcBranchRef](x: Self) {
    
    inline def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
