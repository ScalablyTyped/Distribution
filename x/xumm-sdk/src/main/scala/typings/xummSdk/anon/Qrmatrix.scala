package typings.xummSdk.anon

import typings.xummSdk.distSrcTypesXummApiMod.XummQrQuality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Qrmatrix extends StObject {
  
  var qr_matrix: String
  
  var qr_png: String
  
  var qr_uri_quality_opts: js.Array[XummQrQuality]
  
  var websocket_status: String
}
object Qrmatrix {
  
  inline def apply(
    qr_matrix: String,
    qr_png: String,
    qr_uri_quality_opts: js.Array[XummQrQuality],
    websocket_status: String
  ): Qrmatrix = {
    val __obj = js.Dynamic.literal(qr_matrix = qr_matrix.asInstanceOf[js.Any], qr_png = qr_png.asInstanceOf[js.Any], qr_uri_quality_opts = qr_uri_quality_opts.asInstanceOf[js.Any], websocket_status = websocket_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Qrmatrix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Qrmatrix] (val x: Self) extends AnyVal {
    
    inline def setQr_matrix(value: String): Self = StObject.set(x, "qr_matrix", value.asInstanceOf[js.Any])
    
    inline def setQr_png(value: String): Self = StObject.set(x, "qr_png", value.asInstanceOf[js.Any])
    
    inline def setQr_uri_quality_opts(value: js.Array[XummQrQuality]): Self = StObject.set(x, "qr_uri_quality_opts", value.asInstanceOf[js.Any])
    
    inline def setQr_uri_quality_optsVarargs(value: XummQrQuality*): Self = StObject.set(x, "qr_uri_quality_opts", js.Array(value*))
    
    inline def setWebsocket_status(value: String): Self = StObject.set(x, "websocket_status", value.asInstanceOf[js.Any])
  }
}
