package typings.tsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeInfo extends js.Object {
  var comment: String
  var name: String
}

object TypeInfo {
  @scala.inline
  def apply(comment: String, name: String): TypeInfo = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeInfo]
  }
}

