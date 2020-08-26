package typings.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `identify` operation. */
@js.native
trait IdentifyParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Input text in UTF-8 format. */
  var text: String = js.native
}

object IdentifyParams {
  @scala.inline
  def apply(text: String): IdentifyParams = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifyParams]
  }
  @scala.inline
  implicit class IdentifyParamsOps[Self <: IdentifyParams] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

