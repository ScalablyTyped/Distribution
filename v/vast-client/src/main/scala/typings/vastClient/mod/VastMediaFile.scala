package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastMediaFile extends js.Object {
  
  var apiFramework: String | Null = js.native
  
  var bitrate: Double = js.native
  
  var codec: String | Null = js.native
  
  var deliveryType: String = js.native
  
  var fileURL: String | Null = js.native
  
  var height: Double = js.native
  
  var id: String | Null = js.native
  
  var maintainAspectRatio: Boolean | Null = js.native
  
  var maxBitrate: Double = js.native
  
  var mimeType: String | Null = js.native
  
  var minBitrate: Double = js.native
  
  var scalable: Boolean | Null = js.native
  
  var width: Double = js.native
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
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], deliveryType = deliveryType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxBitrate = maxBitrate.asInstanceOf[js.Any], minBitrate = minBitrate.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastMediaFile]
  }
  
  @scala.inline
  implicit class VastMediaFileOps[Self <: VastMediaFile] (val x: Self) extends AnyVal {
    
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
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryType(value: String): Self = this.set("deliveryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBitrate(value: Double): Self = this.set("maxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBitrate(value: Double): Self = this.set("minBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiFramework(value: String): Self = this.set("apiFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiFrameworkNull: Self = this.set("apiFramework", null)
    
    @scala.inline
    def setCodec(value: String): Self = this.set("codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecNull: Self = this.set("codec", null)
    
    @scala.inline
    def setFileURL(value: String): Self = this.set("fileURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileURLNull: Self = this.set("fileURL", null)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setMaintainAspectRatio(value: Boolean): Self = this.set("maintainAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainAspectRatioNull: Self = this.set("maintainAspectRatio", null)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeNull: Self = this.set("mimeType", null)
    
    @scala.inline
    def setScalable(value: Boolean): Self = this.set("scalable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalableNull: Self = this.set("scalable", null)
  }
}
