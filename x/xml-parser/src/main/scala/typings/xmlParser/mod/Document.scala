package typings.xmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var declaration: Declaration
  var root: Node
}

object Document {
  @scala.inline
  def apply(declaration: Declaration, root: Node): Document = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

