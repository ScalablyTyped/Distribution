package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnlyFromCamera extends js.Object {
  var onlyFromCamera: js.UndefOr[Boolean] = js.native
  var scanType: js.UndefOr[js.Array[String]] = js.native
}

object OnlyFromCamera {
  @scala.inline
  def apply(): OnlyFromCamera = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlyFromCamera]
  }
  @scala.inline
  implicit class OnlyFromCameraOps[Self <: OnlyFromCamera] (val x: Self) extends AnyVal {
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
    def setOnlyFromCamera(value: Boolean): Self = this.set("onlyFromCamera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyFromCamera: Self = this.set("onlyFromCamera", js.undefined)
    @scala.inline
    def setScanTypeVarargs(value: String*): Self = this.set("scanType", js.Array(value :_*))
    @scala.inline
    def setScanType(value: js.Array[String]): Self = this.set("scanType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanType: Self = this.set("scanType", js.undefined)
  }
  
}

