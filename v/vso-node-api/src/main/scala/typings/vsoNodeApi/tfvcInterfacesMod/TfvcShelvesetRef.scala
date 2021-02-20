package typings.vsoNodeApi.tfvcInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcShelvesetRef extends StObject {
  
  var _links: js.Any = js.native
  
  var comment: String = js.native
  
  var commentTruncated: Boolean = js.native
  
  var createdDate: Date = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var owner: IdentityRef = js.native
  
  var url: String = js.native
}
object TfvcShelvesetRef {
  
  @scala.inline
  def apply(
    _links: js.Any,
    comment: String,
    commentTruncated: Boolean,
    createdDate: Date,
    id: String,
    name: String,
    owner: IdentityRef,
    url: String
  ): TfvcShelvesetRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcShelvesetRef]
  }
  
  @scala.inline
  implicit class TfvcShelvesetRefMutableBuilder[Self <: TfvcShelvesetRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentTruncated(value: Boolean): Self = StObject.set(x, "commentTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
