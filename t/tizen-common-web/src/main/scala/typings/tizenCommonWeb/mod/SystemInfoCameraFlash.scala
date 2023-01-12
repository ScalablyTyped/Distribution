package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoCameraFlash
  extends StObject
     with SystemInfoProperty {
  
  /**
    * /\*\*\*
    * Brightness level of the camera flash (0~1).
    *
    * @since 2.4
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/led
    *
    * @throw WebAPIException with error type SecurityError, if this attribute is not allowed.
    */
  val brightness: Double
  
  /**
    * /\*\*\*
    * Specifies camera to which this flash belongs.
    *
    *
    * *   BACK - back camera flash
    * *   FRONT - front camera flash
    * *   EXTERNAL - external camera flash
    * *   OTHER - a flash attached to any other camera
    *
    *
    * @since 2.4
    *
    * The [getPropertyValue()](#SystemInfo::getPropertyValue) method retrieves the SystemInfoCameraFlash for BACK camera.
    */
  val camera: String
  
  /**
    * /\*\*\*
    * Number of brightness levels supported by the flash (other than 0 brightness).
    *
    * @since 2.4
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/led
    *
    * @throw WebAPIException with error type SecurityError, if this attribute is not allowed.
    */
  val levels: Double
  
  /**
    * Sets the brightness value of the flash that is located next to the camera.
    *
    * If the specified brightness value is not supported by the device, the brightness is rounded down to the nearest supported brightness value.
    *
    * @since 2.4
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/led
    *
    * @param brightness The brightness value of LED (0~1).
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters contains an invalid value.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if the method cannot be completed because of an unknown error.
    */
  def setBrightness(brightness: Double): Unit
}
object SystemInfoCameraFlash {
  
  inline def apply(brightness: Double, camera: String, levels: Double, setBrightness: Double => Unit): SystemInfoCameraFlash = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], setBrightness = js.Any.fromFunction1(setBrightness))
    __obj.asInstanceOf[SystemInfoCameraFlash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfoCameraFlash] (val x: Self) extends AnyVal {
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setCamera(value: String): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setLevels(value: Double): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setSetBrightness(value: Double => Unit): Self = StObject.set(x, "setBrightness", js.Any.fromFunction1(value))
  }
}
