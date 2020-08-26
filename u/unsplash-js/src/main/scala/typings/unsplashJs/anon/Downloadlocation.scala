package typings.unsplashJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Downloadlocation extends js.Object {
  var download_location: String = js.native
}

object Downloadlocation {
  @scala.inline
  def apply(download_location: String): Downloadlocation = {
    val __obj = js.Dynamic.literal(download_location = download_location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Downloadlocation]
  }
  @scala.inline
  implicit class DownloadlocationOps[Self <: Downloadlocation] (val x: Self) extends AnyVal {
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
    def setDownload_location(value: String): Self = this.set("download_location", value.asInstanceOf[js.Any])
  }
  
}

