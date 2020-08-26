package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTypeWithQualityHeaderValue extends js.Object {
  /** The HttpMediaTypeWithQualityHeaderValue version of the string. */ var mediaTypeWithQualityHeaderValue: HttpMediaTypeWithQualityHeaderValue = js.native
  /** true if input is valid HttpMediaTypeWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object MediaTypeWithQualityHeaderValue {
  @scala.inline
  def apply(mediaTypeWithQualityHeaderValue: HttpMediaTypeWithQualityHeaderValue, returnValue: Boolean): MediaTypeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(mediaTypeWithQualityHeaderValue = mediaTypeWithQualityHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTypeWithQualityHeaderValue]
  }
  @scala.inline
  implicit class MediaTypeWithQualityHeaderValueOps[Self <: MediaTypeWithQualityHeaderValue] (val x: Self) extends AnyVal {
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
    def setMediaTypeWithQualityHeaderValue(value: HttpMediaTypeWithQualityHeaderValue): Self = this.set("mediaTypeWithQualityHeaderValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

