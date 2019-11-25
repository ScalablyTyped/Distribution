package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TodoCommentDescriptor extends js.Object {
  var priority: Double
  var text: String
}

object TodoCommentDescriptor {
  @scala.inline
  def apply(priority: Double, text: String): TodoCommentDescriptor = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TodoCommentDescriptor]
  }
}

