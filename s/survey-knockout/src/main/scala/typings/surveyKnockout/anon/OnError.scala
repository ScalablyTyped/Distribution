package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnError extends js.Object {
  var onError: String
  var root: String
  var small: String
}

object OnError {
  @scala.inline
  def apply(onError: String, root: String, small: String): OnError = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnError]
  }
}

