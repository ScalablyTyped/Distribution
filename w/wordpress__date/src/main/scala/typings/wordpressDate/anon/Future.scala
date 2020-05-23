package typings.wordpressDate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Future extends js.Object {
  var future: String
  var past: String
}

object Future {
  @scala.inline
  def apply(future: String, past: String): Future = {
    val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
    __obj.asInstanceOf[Future]
  }
}

