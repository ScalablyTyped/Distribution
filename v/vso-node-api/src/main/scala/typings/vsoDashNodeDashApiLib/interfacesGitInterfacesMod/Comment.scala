package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  var author: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * The comment type at the time of creation.
    */
  var commentType: CommentType
  /**
    * The comment content.
    */
  var content: java.lang.String
  /**
    * The comment ID. IDs start at 1 and are unique to a pull request.
    */
  var id: scala.Double
  /**
    * Whether or not this comment was soft-deleted.
    */
  var isDeleted: scala.Boolean
  /**
    * The date the comment's content was last updated.
    */
  var lastContentUpdatedDate: stdLib.Date
  /**
    * The date the comment was last updated.
    */
  var lastUpdatedDate: stdLib.Date
  /**
    * The ID of the parent comment. This is used for replies.
    */
  var parentCommentId: scala.Double
  /**
    * The date the comment was first published.
    */
  var publishedDate: stdLib.Date
  /**
    * A list of the users who have liked this comment.
    */
  var usersLiked: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]
}

