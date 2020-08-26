package typings.winrt.anon

import typings.winrt.Windows.Data.Json.JsonArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSucceeded extends js.Object {
  var result: JsonArray = js.native
  var succeeded: Boolean = js.native
}

object ResultSucceeded {
  @scala.inline
  def apply(result: JsonArray, succeeded: Boolean): ResultSucceeded = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSucceeded]
  }
  @scala.inline
  implicit class ResultSucceededOps[Self <: ResultSucceeded] (val x: Self) extends AnyVal {
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
    def setResult(value: JsonArray): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setSucceeded(value: Boolean): Self = this.set("succeeded", value.asInstanceOf[js.Any])
  }
  
}

