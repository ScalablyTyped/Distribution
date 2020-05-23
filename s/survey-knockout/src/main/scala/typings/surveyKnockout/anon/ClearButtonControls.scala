package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearButtonControls extends js.Object {
  var clearButton: String
  var controls: String
  var root: String
  var small: String
}

object ClearButtonControls {
  @scala.inline
  def apply(clearButton: String, controls: String, root: String, small: String): ClearButtonControls = {
    val __obj = js.Dynamic.literal(clearButton = clearButton.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearButtonControls]
  }
}

