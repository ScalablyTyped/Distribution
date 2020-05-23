package typings.vastClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeout extends js.Object {
  var timeout: Double
  var withCredentials: Boolean
}

object Timeout {
  @scala.inline
  def apply(timeout: Double, withCredentials: Boolean): Timeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
}

