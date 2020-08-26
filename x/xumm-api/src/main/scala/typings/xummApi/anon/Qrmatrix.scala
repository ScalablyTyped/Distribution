package typings.xummApi.anon

import typings.xummApi.mod.XummQrQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Qrmatrix extends js.Object {
  var qr_matrix: String = js.native
  var qr_png: String = js.native
  var qr_uri_quality_opts: js.Array[XummQrQuality] = js.native
  var websocket_status: String = js.native
}

object Qrmatrix {
  @scala.inline
  def apply(
    qr_matrix: String,
    qr_png: String,
    qr_uri_quality_opts: js.Array[XummQrQuality],
    websocket_status: String
  ): Qrmatrix = {
    val __obj = js.Dynamic.literal(qr_matrix = qr_matrix.asInstanceOf[js.Any], qr_png = qr_png.asInstanceOf[js.Any], qr_uri_quality_opts = qr_uri_quality_opts.asInstanceOf[js.Any], websocket_status = websocket_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Qrmatrix]
  }
  @scala.inline
  implicit class QrmatrixOps[Self <: Qrmatrix] (val x: Self) extends AnyVal {
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
    def setQr_matrix(value: String): Self = this.set("qr_matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setQr_png(value: String): Self = this.set("qr_png", value.asInstanceOf[js.Any])
    @scala.inline
    def setQr_uri_quality_optsVarargs(value: XummQrQuality*): Self = this.set("qr_uri_quality_opts", js.Array(value :_*))
    @scala.inline
    def setQr_uri_quality_opts(value: js.Array[XummQrQuality]): Self = this.set("qr_uri_quality_opts", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebsocket_status(value: String): Self = this.set("websocket_status", value.asInstanceOf[js.Any])
  }
  
}

