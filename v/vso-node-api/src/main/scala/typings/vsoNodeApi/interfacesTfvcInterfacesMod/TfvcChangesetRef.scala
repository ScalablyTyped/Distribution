package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcChangesetRef extends StObject {
  
  /**
    * A collection of REST reference links.
    */
  var _links: Any
  
  /**
    * Alias or display name of user
    */
  var author: IdentityRef
  
  /**
    * Id of the changeset.
    */
  var changesetId: Double
  
  /**
    * Alias or display name of user
    */
  var checkedInBy: IdentityRef
  
  /**
    * Comment for the changeset.
    */
  var comment: String
  
  /**
    * Was the Comment result truncated?
    */
  var commentTruncated: Boolean
  
  /**
    * Creation date of the changeset.
    */
  var createdDate: js.Date
  
  /**
    * URL to retrieve the item.
    */
  var url: String
}
object TfvcChangesetRef {
  
  inline def apply(
    _links: Any,
    author: IdentityRef,
    changesetId: Double,
    checkedInBy: IdentityRef,
    comment: String,
    commentTruncated: Boolean,
    createdDate: js.Date,
    url: String
  ): TfvcChangesetRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], changesetId = changesetId.asInstanceOf[js.Any], checkedInBy = checkedInBy.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcChangesetRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TfvcChangesetRef] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: IdentityRef): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setChangesetId(value: Double): Self = StObject.set(x, "changesetId", value.asInstanceOf[js.Any])
    
    inline def setCheckedInBy(value: IdentityRef): Self = StObject.set(x, "checkedInBy", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentTruncated(value: Boolean): Self = StObject.set(x, "commentTruncated", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
