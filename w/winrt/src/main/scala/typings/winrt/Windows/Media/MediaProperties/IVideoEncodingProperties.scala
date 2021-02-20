package typings.winrt.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVideoEncodingProperties extends IMediaEncodingProperties {
  
  var bitrate: Double = js.native
  
  var frameRate: MediaRatio = js.native
  
  var height: Double = js.native
  
  var pixelAspectRatio: MediaRatio = js.native
  
  var width: Double = js.native
}
object IVideoEncodingProperties {
  
  @scala.inline
  def apply(
    bitrate: Double,
    frameRate: MediaRatio,
    height: Double,
    pixelAspectRatio: MediaRatio,
    properties: MediaPropertySet,
    subtype: String,
    `type`: String,
    width: Double
  ): IVideoEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], frameRate = frameRate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pixelAspectRatio = pixelAspectRatio.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideoEncodingProperties]
  }
  
  @scala.inline
  implicit class IVideoEncodingPropertiesMutableBuilder[Self <: IVideoEncodingProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRate(value: MediaRatio): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelAspectRatio(value: MediaRatio): Self = StObject.set(x, "pixelAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
