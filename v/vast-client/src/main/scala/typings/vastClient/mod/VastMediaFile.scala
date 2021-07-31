package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastMediaFile extends StObject {
  
  var apiFramework: String | Null
  
  var bitrate: Double
  
  var codec: String | Null
  
  var deliveryType: String
  
  var fileURL: String | Null
  
  var height: Double
  
  var id: String | Null
  
  var maintainAspectRatio: Boolean | Null
  
  var maxBitrate: Double
  
  var mimeType: String | Null
  
  var minBitrate: Double
  
  var scalable: Boolean | Null
  
  var width: Double
}
object VastMediaFile {
  
  @scala.inline
  def apply(
    bitrate: Double,
    deliveryType: String,
    height: Double,
    maxBitrate: Double,
    minBitrate: Double,
    width: Double
  ): VastMediaFile = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], deliveryType = deliveryType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxBitrate = maxBitrate.asInstanceOf[js.Any], minBitrate = minBitrate.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], apiFramework = null, codec = null, fileURL = null, id = null, maintainAspectRatio = null, mimeType = null, scalable = null)
    __obj.asInstanceOf[VastMediaFile]
  }
  
  @scala.inline
  implicit class VastMediaFileMutableBuilder[Self <: VastMediaFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiFramework(value: String): Self = StObject.set(x, "apiFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiFrameworkNull: Self = StObject.set(x, "apiFramework", null)
    
    @scala.inline
    def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecNull: Self = StObject.set(x, "codec", null)
    
    @scala.inline
    def setDeliveryType(value: String): Self = StObject.set(x, "deliveryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileURL(value: String): Self = StObject.set(x, "fileURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileURLNull: Self = StObject.set(x, "fileURL", null)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setMaintainAspectRatio(value: Boolean): Self = StObject.set(x, "maintainAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainAspectRatioNull: Self = StObject.set(x, "maintainAspectRatio", null)
    
    @scala.inline
    def setMaxBitrate(value: Double): Self = StObject.set(x, "maxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    @scala.inline
    def setMinBitrate(value: Double): Self = StObject.set(x, "minBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalable(value: Boolean): Self = StObject.set(x, "scalable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalableNull: Self = StObject.set(x, "scalable", null)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
