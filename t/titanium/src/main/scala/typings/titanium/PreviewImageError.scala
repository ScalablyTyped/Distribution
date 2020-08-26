package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameter passed to the `error` callback of <PreviewImageOptions>.
  */
@js.native
trait PreviewImageError extends FailureResponse {
  /**
    * Description of the error.
    * @deprecated
    */
  var message: js.UndefOr[java.lang.String] = js.native
}

object PreviewImageError {
  @scala.inline
  def apply(): PreviewImageError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewImageError]
  }
  @scala.inline
  implicit class PreviewImageErrorOps[Self <: PreviewImageError] (val x: Self) extends AnyVal {
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
    def setMessage(value: java.lang.String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

