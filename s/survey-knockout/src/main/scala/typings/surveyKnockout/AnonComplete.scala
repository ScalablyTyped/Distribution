package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComplete extends js.Object {
  var complete: String
  var next: String
  var prev: String
  var start: String
}

object AnonComplete {
  @scala.inline
  def apply(complete: String, next: String, prev: String, start: String): AnonComplete = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComplete]
  }
}

