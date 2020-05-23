package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Controls extends js.Object {
  var clearButton: String
  var controls: String
  var root: String
}

object Controls {
  @scala.inline
  def apply(clearButton: String, controls: String, root: String): Controls = {
    val __obj = js.Dynamic.literal(clearButton = clearButton.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controls]
  }
}

