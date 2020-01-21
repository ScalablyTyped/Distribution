package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccidentalRootType extends js.Object {
  var accidental: String
  var root: String
  var `type`: String
}

object AnonAccidentalRootType {
  @scala.inline
  def apply(accidental: String, root: String, `type`: String): AnonAccidentalRootType = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccidentalRootType]
  }
}

