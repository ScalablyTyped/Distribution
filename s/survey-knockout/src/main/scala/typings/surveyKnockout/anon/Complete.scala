package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Complete extends js.Object {
  var complete: String
  var edit: String
  var next: String
  var prev: String
  var preview: String
  var start: String
}

object Complete {
  @scala.inline
  def apply(complete: String, edit: String, next: String, prev: String, preview: String, start: String): Complete = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete]
  }
}

