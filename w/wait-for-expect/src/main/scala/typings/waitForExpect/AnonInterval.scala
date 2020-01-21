package typings.waitForExpect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInterval extends js.Object {
  var interval: Double
  var timeout: Double
}

object AnonInterval {
  @scala.inline
  def apply(interval: Double, timeout: Double): AnonInterval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInterval]
  }
}

