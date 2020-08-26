package typings.urqlCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryCount extends js.Object {
  var retryCount: Double = js.native
}

object RetryCount {
  @scala.inline
  def apply(retryCount: Double): RetryCount = {
    val __obj = js.Dynamic.literal(retryCount = retryCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryCount]
  }
  @scala.inline
  implicit class RetryCountOps[Self <: RetryCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRetryCount(value: Double): Self = this.set("retryCount", value.asInstanceOf[js.Any])
  }
  
}

