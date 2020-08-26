package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentThread extends js.Object {
  /**
    * Links to other related objects.
    */
  var _links: js.Any = js.native
  /**
    * A list of the comments.
    */
  var comments: js.Array[Comment] = js.native
  /**
    * The comment thread id.
    */
  var id: Double = js.native
  /**
    * Specify if the thread is deleted which happens when all comments are deleted.
    */
  var isDeleted: Boolean = js.native
  /**
    * The time this thread was last updated.
    */
  var lastUpdatedDate: Date = js.native
  /**
    * Optional properties associated with the thread as a collection of key-value pairs.
    */
  var properties: js.Any = js.native
  /**
    * The time this thread was published.
    */
  var publishedDate: Date = js.native
  /**
    * The status of the comment thread.
    */
  var status: CommentThreadStatus = js.native
  /**
    * Specify thread context such as position in left/right file.
    */
  var threadContext: CommentThreadContext = js.native
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
  @scala.inline
  implicit class CommentThreadOps[Self <: CommentThread] (val x: Self) extends AnyVal {
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
    def setCommentsVarargs(value: Comment*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[Comment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdatedDate(value: Date): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublishedDate(value: Date): Self = this.set("publishedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: CommentThreadStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreadContext(value: CommentThreadContext): Self = this.set("threadContext", value.asInstanceOf[js.Any])
  }
  
}

