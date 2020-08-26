package typings.tinymce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Env extends js.Object {
  var android: Boolean = js.native
  var ceFalse: Boolean = js.native
  var contentEditable: Boolean = js.native
  var documentMode: Boolean = js.native
  var fileApi: Boolean = js.native
  var gecko: Boolean = js.native
  var iOS: Boolean = js.native
  var ie: Boolean = js.native
  var mac: Boolean = js.native
  var noCaretAfter: Boolean = js.native
  var opera: Boolean = js.native
  var range: Boolean = js.native
  var transparentSrc: Boolean = js.native
  var webKit: Boolean = js.native
}

object Env {
  @scala.inline
  def apply(
    android: Boolean,
    ceFalse: Boolean,
    contentEditable: Boolean,
    documentMode: Boolean,
    fileApi: Boolean,
    gecko: Boolean,
    iOS: Boolean,
    ie: Boolean,
    mac: Boolean,
    noCaretAfter: Boolean,
    opera: Boolean,
    range: Boolean,
    transparentSrc: Boolean,
    webKit: Boolean
  ): Env = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ceFalse = ceFalse.asInstanceOf[js.Any], contentEditable = contentEditable.asInstanceOf[js.Any], documentMode = documentMode.asInstanceOf[js.Any], fileApi = fileApi.asInstanceOf[js.Any], gecko = gecko.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], noCaretAfter = noCaretAfter.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], transparentSrc = transparentSrc.asInstanceOf[js.Any], webKit = webKit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
  @scala.inline
  implicit class EnvOps[Self <: Env] (val x: Self) extends AnyVal {
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
    def setAndroid(value: Boolean): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def setCeFalse(value: Boolean): Self = this.set("ceFalse", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentEditable(value: Boolean): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentMode(value: Boolean): Self = this.set("documentMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileApi(value: Boolean): Self = this.set("fileApi", value.asInstanceOf[js.Any])
    @scala.inline
    def setGecko(value: Boolean): Self = this.set("gecko", value.asInstanceOf[js.Any])
    @scala.inline
    def setIOS(value: Boolean): Self = this.set("iOS", value.asInstanceOf[js.Any])
    @scala.inline
    def setIe(value: Boolean): Self = this.set("ie", value.asInstanceOf[js.Any])
    @scala.inline
    def setMac(value: Boolean): Self = this.set("mac", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoCaretAfter(value: Boolean): Self = this.set("noCaretAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpera(value: Boolean): Self = this.set("opera", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransparentSrc(value: Boolean): Self = this.set("transparentSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebKit(value: Boolean): Self = this.set("webKit", value.asInstanceOf[js.Any])
  }
  
}

