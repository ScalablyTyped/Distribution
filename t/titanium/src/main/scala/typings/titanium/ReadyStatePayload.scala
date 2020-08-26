package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Object describing the current ready state. See [onreadystatechange](Titanium.Network.HTTPClient.onreadystatechange) for more information.
  */
@js.native
trait ReadyStatePayload extends js.Object {
  /**
    * The state for which `onreadystatechange` was invoked. Set to one of `Titanium.Network.HTTPClient` ready-state constants
    */
  var readyState: js.UndefOr[Double] = js.native
}

object ReadyStatePayload {
  @scala.inline
  def apply(): ReadyStatePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadyStatePayload]
  }
  @scala.inline
  implicit class ReadyStatePayloadOps[Self <: ReadyStatePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReadyState(value: Double): Self = this.set("readyState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadyState: Self = this.set("readyState", js.undefined)
  }
  
}

