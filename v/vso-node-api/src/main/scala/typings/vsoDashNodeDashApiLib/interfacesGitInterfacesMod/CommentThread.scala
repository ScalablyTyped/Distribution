package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  var id: scala.Double
  /**
       * Specify if the thread is deleted which happens when all comments are deleted.
       */
  var isDeleted: scala.Boolean
  /**
       * The time this thread was last updated.
       */
  var lastUpdatedDate: stdLib.Date
  /**
       * Optional properties associated with the thread as a collection of key-value pairs.
       */
  var properties: js.Any
  /**
       * The time this thread was published.
       */
  var publishedDate: stdLib.Date
  /**
       * The status of the comment thread.
       */
  var status: CommentThreadStatus
  /**
       * Specify thread context such as position in left/right file.
       */
  var threadContext: CommentThreadContext
}

