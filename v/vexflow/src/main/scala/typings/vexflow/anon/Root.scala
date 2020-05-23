package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root extends js.Object {
  var accidental: String
  var root: String
}

object Root {
  @scala.inline
  def apply(accidental: String, root: String): Root = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
}

