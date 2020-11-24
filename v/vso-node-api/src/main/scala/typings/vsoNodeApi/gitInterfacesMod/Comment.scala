package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends js.Object {
  
  /**
    * Links to other related objects.
    */
  var _links: js.Any = js.native
  
  /**
    * The author of the comment.
    */
  var author: IdentityRef = js.native
  
  /**
    * The comment type at the time of creation.
    */
  var commentType: CommentType = js.native
  
  /**
    * The comment content.
    */
  var content: String = js.native
  
  /**
    * The comment ID. IDs start at 1 and are unique to a pull request.
    */
  var id: Double = js.native
  
  /**
    * Whether or not this comment was soft-deleted.
    */
  var isDeleted: Boolean = js.native
  
  /**
    * The date the comment's content was last updated.
    */
  var lastContentUpdatedDate: Date = js.native
  
  /**
    * The date the comment was last updated.
    */
  var lastUpdatedDate: Date = js.native
  
  /**
    * The ID of the parent comment. This is used for replies.
    */
  var parentCommentId: Double = js.native
  
  /**
    * The date the comment was first published.
    */
  var publishedDate: Date = js.native
  
  /**
    * A list of the users who have liked this comment.
    */
  var usersLiked: js.Array[IdentityRef] = js.native
}
object Comment {
  
  @scala.inline
  def apply(
    _links: js.Any,
    author: IdentityRef,
    commentType: CommentType,
    content: String,
    id: Double,
    isDeleted: Boolean,
    lastContentUpdatedDate: Date,
    lastUpdatedDate: Date,
    parentCommentId: Double,
    publishedDate: Date,
    usersLiked: js.Array[IdentityRef]
  ): Comment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], commentType = commentType.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], lastContentUpdatedDate = lastContentUpdatedDate.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], parentCommentId = parentCommentId.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], usersLiked = usersLiked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: IdentityRef): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentType(value: CommentType): Self = this.set("commentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastContentUpdatedDate(value: Date): Self = this.set("lastContentUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: Date): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCommentId(value: Double): Self = this.set("parentCommentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedDate(value: Date): Self = this.set("publishedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersLikedVarargs(value: IdentityRef*): Self = this.set("usersLiked", js.Array(value :_*))
    
    @scala.inline
    def setUsersLiked(value: js.Array[IdentityRef]): Self = this.set("usersLiked", value.asInstanceOf[js.Any])
  }
}
