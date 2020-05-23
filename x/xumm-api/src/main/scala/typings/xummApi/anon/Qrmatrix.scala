package typings.xummApi.anon

import typings.xummApi.mod.XummQrQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Qrmatrix extends js.Object {
  var qr_matrix: String
  var qr_png: String
  var qr_uri_quality_opts: js.Array[XummQrQuality]
  var websocket_status: String
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
}

