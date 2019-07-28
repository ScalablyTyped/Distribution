package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThreadContext extends js.Object {
  /**
    * File path relative to the root of the repository. It's up to the client to use any path format.
    */
  var filePath: String
  /**
    * Position of last character of the thread's span in left file.
    */
  var leftFileEnd: CommentPosition
  /**
    * Position of first character of the thread's span in left file.
    */
  var leftFileStart: CommentPosition
  /**
    * Position of last character of the thread's span in right file.
    */
  var rightFileEnd: CommentPosition
  /**
    * Position of first character of the thread's span in right file.
    */
  var rightFileStart: CommentPosition
}

object CommentThreadContext {
  @scala.inline
  def apply(
    filePath: String,
    leftFileEnd: CommentPosition,
    leftFileStart: CommentPosition,
    rightFileEnd: CommentPosition,
    rightFileStart: CommentPosition
  ): CommentThreadContext = {
    val __obj = js.Dynamic.literal(filePath = filePath, leftFileEnd = leftFileEnd, leftFileStart = leftFileStart, rightFileEnd = rightFileEnd, rightFileStart = rightFileStart)
  
    __obj.asInstanceOf[CommentThreadContext]
  }
}

