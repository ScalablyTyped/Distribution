package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TodoComment extends js.Object {
  var descriptor: TodoCommentDescriptor
  var message: java.lang.String
  var position: scala.Double
}

object TodoComment {
  @scala.inline
  def apply(descriptor: TodoCommentDescriptor, message: java.lang.String, position: scala.Double): TodoComment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("descriptor")(descriptor)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[TodoComment]
  }
}

