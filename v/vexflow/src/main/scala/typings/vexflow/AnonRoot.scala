package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRoot extends js.Object {
  var accidental: String
  var root: String
}

object AnonRoot {
  @scala.inline
  def apply(accidental: String, root: String): AnonRoot = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRoot]
  }
}

