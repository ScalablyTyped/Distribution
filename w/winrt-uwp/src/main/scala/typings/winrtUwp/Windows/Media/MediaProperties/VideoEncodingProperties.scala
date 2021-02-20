package typings.winrtUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the format of a video stream. */
@js.native
trait VideoEncodingProperties extends StObject {
  
  /** Gets or sets the video bit rate. */
  var bitrate: Double = js.native
  
  /** Gets or sets the video frame rate. */
  var frameRate: MediaRatio = js.native
  
  /**
    * Gets the media format user data.
    * @return Receives the media format data.
    */
  def getFormatUserData(): js.Array[Double] = js.native
  
  /** Gets or sets the video image height. */
  var height: Double = js.native
  
  /** Gets or sets the pixel aspect ratio. */
  var pixelAspectRatio: MediaRatio = js.native
  
  /** Gets or sets the media format profile. */
  var profileId: Double = js.native
  
  /** Gets additional format properties for the video stream. */
  var properties: MediaPropertySet = js.native
  
  /**
    * Sets the media format user data.
    * @param value The media data to set.
    */
  def setFormatUserData(value: js.Array[Double]): Unit = js.native
  
  /** Gets or sets the subtype of the format. */
  var subtype: String = js.native
  
  /** Gets the format type. */
  var `type`: String = js.native
  
  /** Gets or sets the video image width. */
  var width: Double = js.native
}
object VideoEncodingProperties {
  
  @scala.inline
  def apply(
    bitrate: Double,
    frameRate: MediaRatio,
    getFormatUserData: () => js.Array[Double],
    height: Double,
    pixelAspectRatio: MediaRatio,
    profileId: Double,
    properties: MediaPropertySet,
    setFormatUserData: js.Array[Double] => Unit,
    subtype: String,
    `type`: String,
    width: Double
  ): VideoEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], frameRate = frameRate.asInstanceOf[js.Any], getFormatUserData = js.Any.fromFunction0(getFormatUserData), height = height.asInstanceOf[js.Any], pixelAspectRatio = pixelAspectRatio.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], setFormatUserData = js.Any.fromFunction1(setFormatUserData), subtype = subtype.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoEncodingProperties]
  }
  
  @scala.inline
  implicit class VideoEncodingPropertiesMutableBuilder[Self <: VideoEncodingProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRate(value: MediaRatio): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFormatUserData(value: () => js.Array[Double]): Self = StObject.set(x, "getFormatUserData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelAspectRatio(value: MediaRatio): Self = StObject.set(x, "pixelAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileId(value: Double): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: MediaPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFormatUserData(value: js.Array[Double] => Unit): Self = StObject.set(x, "setFormatUserData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
