package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThread extends js.Object {
  /**
    * Links to other related objects.
    */
  var _links: js.Any
  /**
    * A list of the comments.
    */
  var comments: js.Array[Comment]
  /**
    * The comment thread id.
    */
  var id: Double
  /**
    * Specify if the thread is deleted which happens when all comments are deleted.
    */
  var isDeleted: Boolean
  /**
    * The time this thread was last updated.
    */
  var lastUpdatedDate: Date
  /**
    * Optional properties associated with the thread as a collection of key-value pairs.
    */
  var properties: js.Any
  /**
    * The time this thread was published.
    */
  var publishedDate: Date
  /**
    * The status of the comment thread.
    */
  var status: CommentThreadStatus
  /**
    * Specify thread context such as position in left/right file.
    */
  var threadContext: CommentThreadContext
}

object CommentThread {
  @scala.inline
  def apply(
    _links: js.Any,
    comments: js.Array[Comment],
    id: Double,
    isDeleted: Boolean,
    lastUpdatedDate: Date,
    properties: js.Any,
    publishedDate: Date,
    status: CommentThreadStatus,
    threadContext: CommentThreadContext
  ): CommentThread = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], threadContext = threadContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentThread]
  }
}

