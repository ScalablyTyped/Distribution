package typings.vsoNodeApi.interfacesGitInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  /**
    * Links to other related objects.
    */
  var _links: Any
  
  /**
    * The author of the comment.
    */
  var author: IdentityRef
  
  /**
    * The comment type at the time of creation.
    */
  var commentType: CommentType
  
  /**
    * The comment content.
    */
  var content: String
  
  /**
    * The comment ID. IDs start at 1 and are unique to a pull request.
    */
  var id: Double
  
  /**
    * Whether or not this comment was soft-deleted.
    */
  var isDeleted: Boolean
  
  /**
    * The date the comment's content was last updated.
    */
  var lastContentUpdatedDate: js.Date
  
  /**
    * The date the comment was last updated.
    */
  var lastUpdatedDate: js.Date
  
  /**
    * The ID of the parent comment. This is used for replies.
    */
  var parentCommentId: Double
  
  /**
    * The date the comment was first published.
    */
  var publishedDate: js.Date
  
  /**
    * A list of the users who have liked this comment.
    */
  var usersLiked: js.Array[IdentityRef]
}
object Comment {
  
  inline def apply(
    _links: Any,
    author: IdentityRef,
    commentType: CommentType,
    content: String,
    id: Double,
    isDeleted: Boolean,
    lastContentUpdatedDate: js.Date,
    lastUpdatedDate: js.Date,
    parentCommentId: Double,
    publishedDate: js.Date,
    usersLiked: js.Array[IdentityRef]
  ): Comment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], commentType = commentType.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], lastContentUpdatedDate = lastContentUpdatedDate.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], parentCommentId = parentCommentId.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], usersLiked = usersLiked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: IdentityRef): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setCommentType(value: CommentType): Self = StObject.set(x, "commentType", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    inline def setLastContentUpdatedDate(value: js.Date): Self = StObject.set(x, "lastContentUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setParentCommentId(value: Double): Self = StObject.set(x, "parentCommentId", value.asInstanceOf[js.Any])
    
    inline def setPublishedDate(value: js.Date): Self = StObject.set(x, "publishedDate", value.asInstanceOf[js.Any])
    
    inline def setUsersLiked(value: js.Array[IdentityRef]): Self = StObject.set(x, "usersLiked", value.asInstanceOf[js.Any])
    
    inline def setUsersLikedVarargs(value: IdentityRef*): Self = StObject.set(x, "usersLiked", js.Array(value*))
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
