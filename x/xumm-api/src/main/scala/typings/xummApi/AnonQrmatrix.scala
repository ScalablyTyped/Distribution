package typings.xummApi

import typings.xummApi.mod.XummQrQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQrmatrix extends js.Object {
  var qr_matrix: String
  var qr_png: String
  var qr_uri_quality_opts: js.Array[XummQrQuality]
  var websocket_status: String
}

object AnonQrmatrix {
  @scala.inline
  def apply(
    qr_matrix: String,
    qr_png: String,
    qr_uri_quality_opts: js.Array[XummQrQuality],
    websocket_status: String
  ): AnonQrmatrix = {
    val __obj = js.Dynamic.literal(qr_matrix = qr_matrix.asInstanceOf[js.Any], qr_png = qr_png.asInstanceOf[js.Any], qr_uri_quality_opts = qr_uri_quality_opts.asInstanceOf[js.Any], websocket_status = websocket_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQrmatrix]
  }
}

