package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /**
    * Links to other related objects.
    */
  var _links: js.Any
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
  var lastContentUpdatedDate: Date
  /**
    * The date the comment was last updated.
    */
  var lastUpdatedDate: Date
  /**
    * The ID of the parent comment. This is used for replies.
    */
  var parentCommentId: Double
  /**
    * The date the comment was first published.
    */
  var publishedDate: Date
  /**
    * A list of the users who have liked this comment.
    */
  var usersLiked: js.Array[IdentityRef]
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
}

