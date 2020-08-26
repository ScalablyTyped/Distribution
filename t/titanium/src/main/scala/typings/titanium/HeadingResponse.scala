package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the [getCurrentHeading](Titanium.Geolocation.getCurrentHeading) callback.
  */
@js.native
trait HeadingResponse extends ErrorResponse {
  /**
    * If `success` is true, the actual heading data.
    */
  var heading: js.UndefOr[HeadingData] = js.native
}

object HeadingResponse {
  @scala.inline
  def apply(): HeadingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadingResponse]
  }
  @scala.inline
  implicit class HeadingResponseOps[Self <: HeadingResponse] (val x: Self) extends AnyVal {
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
    def setHeading(value: HeadingData): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
  }
  
}

