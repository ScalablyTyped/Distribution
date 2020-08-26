package typings.tampermonkey.Tampermonkey

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseBase extends js.Object {
  val readyState: ReadyState = js.native
  val response: js.Any = js.native
  val responseHeaders: String = js.native
  val responseText: String = js.native
  val responseXML: Document | Null = js.native
  val status: Double = js.native
  val statusText: String = js.native
}

object ResponseBase {
  @scala.inline
  def apply(
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    status: Double,
    statusText: String
  ): ResponseBase = {
    val __obj = js.Dynamic.literal(readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBase]
  }
  @scala.inline
  implicit class ResponseBaseOps[Self <: ResponseBase] (val x: Self) extends AnyVal {
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
    def setReadyState(value: ReadyState): Self = this.set("readyState", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: js.Any): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseHeaders(value: String): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseText(value: String): Self = this.set("responseText", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseXML(value: Document): Self = this.set("responseXML", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseXMLNull: Self = this.set("responseXML", null)
  }
  
}

