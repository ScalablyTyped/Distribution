package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TodoComment extends js.Object {
  var descriptor: TodoCommentDescriptor
  var message: java.lang.String
  var position: Double
}

object TodoComment {
  @scala.inline
  def apply(descriptor: TodoCommentDescriptor, message: java.lang.String, position: Double): TodoComment = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TodoComment]
  }
}

