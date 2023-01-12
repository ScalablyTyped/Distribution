package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExifInit extends StObject {
  
  var deviceMaker: js.UndefOr[String] = js.undefined
  
  var deviceModel: js.UndefOr[String] = js.undefined
  
  var exposureProgram: js.UndefOr[ExposureProgram] = js.undefined
  
  var exposureTime: js.UndefOr[String] = js.undefined
  
  var fNumber: js.UndefOr[Double] = js.undefined
  
  var flash: js.UndefOr[Boolean] = js.undefined
  
  var focalLength: js.UndefOr[Double] = js.undefined
  
  var gpsAltitude: js.UndefOr[Double] = js.undefined
  
  var gpsLocation: js.UndefOr[SimpleCoordinates] = js.undefined
  
  var gpsProcessingMethod: js.UndefOr[String] = js.undefined
  
  var gpsTime: js.UndefOr[js.Date] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var isoSpeedRatings: js.UndefOr[js.Array[Double]] = js.undefined
  
  var orientation: js.UndefOr[ImageContentOrientation] = js.undefined
  
  var originalTime: js.UndefOr[js.Date] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
  
  var userComment: js.UndefOr[String] = js.undefined
  
  var whiteBalance: js.UndefOr[WhiteBalanceMode] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ExifInit {
  
  inline def apply(): ExifInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExifInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExifInit] (val x: Self) extends AnyVal {
    
    inline def setDeviceMaker(value: String): Self = StObject.set(x, "deviceMaker", value.asInstanceOf[js.Any])
    
    inline def setDeviceMakerUndefined: Self = StObject.set(x, "deviceMaker", js.undefined)
    
    inline def setDeviceModel(value: String): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
    
    inline def setDeviceModelUndefined: Self = StObject.set(x, "deviceModel", js.undefined)
    
    inline def setExposureProgram(value: ExposureProgram): Self = StObject.set(x, "exposureProgram", value.asInstanceOf[js.Any])
    
    inline def setExposureProgramUndefined: Self = StObject.set(x, "exposureProgram", js.undefined)
    
    inline def setExposureTime(value: String): Self = StObject.set(x, "exposureTime", value.asInstanceOf[js.Any])
    
    inline def setExposureTimeUndefined: Self = StObject.set(x, "exposureTime", js.undefined)
    
    inline def setFNumber(value: Double): Self = StObject.set(x, "fNumber", value.asInstanceOf[js.Any])
    
    inline def setFNumberUndefined: Self = StObject.set(x, "fNumber", js.undefined)
    
    inline def setFlash(value: Boolean): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
    
    inline def setFlashUndefined: Self = StObject.set(x, "flash", js.undefined)
    
    inline def setFocalLength(value: Double): Self = StObject.set(x, "focalLength", value.asInstanceOf[js.Any])
    
    inline def setFocalLengthUndefined: Self = StObject.set(x, "focalLength", js.undefined)
    
    inline def setGpsAltitude(value: Double): Self = StObject.set(x, "gpsAltitude", value.asInstanceOf[js.Any])
    
    inline def setGpsAltitudeUndefined: Self = StObject.set(x, "gpsAltitude", js.undefined)
    
    inline def setGpsLocation(value: SimpleCoordinates): Self = StObject.set(x, "gpsLocation", value.asInstanceOf[js.Any])
    
    inline def setGpsLocationUndefined: Self = StObject.set(x, "gpsLocation", js.undefined)
    
    inline def setGpsProcessingMethod(value: String): Self = StObject.set(x, "gpsProcessingMethod", value.asInstanceOf[js.Any])
    
    inline def setGpsProcessingMethodUndefined: Self = StObject.set(x, "gpsProcessingMethod", js.undefined)
    
    inline def setGpsTime(value: js.Date): Self = StObject.set(x, "gpsTime", value.asInstanceOf[js.Any])
    
    inline def setGpsTimeUndefined: Self = StObject.set(x, "gpsTime", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIsoSpeedRatings(value: js.Array[Double]): Self = StObject.set(x, "isoSpeedRatings", value.asInstanceOf[js.Any])
    
    inline def setIsoSpeedRatingsUndefined: Self = StObject.set(x, "isoSpeedRatings", js.undefined)
    
    inline def setIsoSpeedRatingsVarargs(value: Double*): Self = StObject.set(x, "isoSpeedRatings", js.Array(value*))
    
    inline def setOrientation(value: ImageContentOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOriginalTime(value: js.Date): Self = StObject.set(x, "originalTime", value.asInstanceOf[js.Any])
    
    inline def setOriginalTimeUndefined: Self = StObject.set(x, "originalTime", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setUserComment(value: String): Self = StObject.set(x, "userComment", value.asInstanceOf[js.Any])
    
    inline def setUserCommentUndefined: Self = StObject.set(x, "userComment", js.undefined)
    
    inline def setWhiteBalance(value: WhiteBalanceMode): Self = StObject.set(x, "whiteBalance", value.asInstanceOf[js.Any])
    
    inline def setWhiteBalanceUndefined: Self = StObject.set(x, "whiteBalance", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
