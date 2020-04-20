package typings.wordpressDate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFuture extends js.Object {
  var future: String
  var past: String
}

object AnonFuture {
  @scala.inline
  def apply(future: String, past: String): AnonFuture = {
    val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFuture]
  }
}

