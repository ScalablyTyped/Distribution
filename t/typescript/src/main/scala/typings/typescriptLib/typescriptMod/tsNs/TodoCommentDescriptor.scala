package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TodoCommentDescriptor extends js.Object {
  var priority: scala.Double
  var text: java.lang.String
}

object TodoCommentDescriptor {
  @scala.inline
  def apply(priority: scala.Double, text: java.lang.String): TodoCommentDescriptor = {
    val __obj = js.Dynamic.literal(priority = priority, text = text)
  
    __obj.asInstanceOf[TodoCommentDescriptor]
  }
}

