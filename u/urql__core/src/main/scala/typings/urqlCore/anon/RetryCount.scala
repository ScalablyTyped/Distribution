package typings.urqlCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryCount extends js.Object {
  var retryCount: Double
}

object RetryCount {
  @scala.inline
  def apply(retryCount: Double): RetryCount = {
    val __obj = js.Dynamic.literal(retryCount = retryCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryCount]
  }
}

