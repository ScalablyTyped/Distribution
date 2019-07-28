package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentContainer[TComment] extends js.Object {
  var comment: TComment
}

object CommentContainer {
  @scala.inline
  def apply[TComment](comment: TComment): CommentContainer[TComment] = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommentContainer[TComment]]
  }
}

