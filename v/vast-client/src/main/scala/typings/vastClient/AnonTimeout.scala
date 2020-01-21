package typings.vastClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimeout extends js.Object {
  var timeout: Double
  var withCredentials: Boolean
}

object AnonTimeout {
  @scala.inline
  def apply(timeout: Double, withCredentials: Boolean): AnonTimeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTimeout]
  }
}

