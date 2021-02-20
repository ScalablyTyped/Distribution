package typings.vsoNodeApi.tfvcInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcBranchRef extends TfvcShallowBranchRef {
  
  /**
    * A collection of REST reference links.
    */
  var _links: js.Any = js.native
  
  /**
    * Creation date of the branch.
    */
  var createdDate: Date = js.native
  
  /**
    * Description of the branch.
    */
  var description: String = js.native
  
  /**
    * Is the branch deleted?
    */
  var isDeleted: Boolean = js.native
  
  /**
    * Alias or display name of user
    */
  var owner: IdentityRef = js.native
  
  /**
    * URL to retrieve the item.
    */
  var url: String = js.native
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
  
  @scala.inline
  implicit class TfvcBranchRefMutableBuilder[Self <: TfvcBranchRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
