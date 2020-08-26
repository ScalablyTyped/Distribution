package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[TContext] extends ResponseBase {
  val context: TContext = js.native
  val finalUrl: String = js.native
}

object Response {
  @scala.inline
  def apply[TContext](
    context: TContext,
    finalUrl: String,
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    status: Double,
    statusText: String
  ): Response[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], finalUrl = finalUrl.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[TContext]]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response[_], TContext] (val x: Self with Response[TContext]) extends AnyVal {
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
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalUrl(value: String): Self = this.set("finalUrl", value.asInstanceOf[js.Any])
  }
  
}

