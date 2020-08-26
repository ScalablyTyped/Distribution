package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to the [scanMediaFiles](Titanium.Media.Android.scanMediaFiles) callback.
  */
@js.native
trait MediaScannerResponse extends js.Object {
  /**
    * Path to the media file that was scanned.
    */
  var path: js.UndefOr[java.lang.String] = js.native
  /**
    * URI to the file if it was scanned and added to the media library, or `null`
    * if the file was not added.
    */
  var uri: js.UndefOr[java.lang.String] = js.native
}

object MediaScannerResponse {
  @scala.inline
  def apply(): MediaScannerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaScannerResponse]
  }
  @scala.inline
  implicit class MediaScannerResponseOps[Self <: MediaScannerResponse] (val x: Self) extends AnyVal {
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
    def setPath(value: java.lang.String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setUri(value: java.lang.String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

