package typings.winrtUwp.Windows.Devices.Perception

import typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Windows.Devices.Perception video profile. */
trait PerceptionVideoProfile extends StObject {
  
  /** Gets the bitmap alpha mode. */
  var bitmapAlphaMode: BitmapAlphaMode
  
  /** Gets the bitmap pixel format. */
  var bitmapPixelFormat: BitmapPixelFormat
  
  /** Gets the time duration of each frame. */
  var frameDuration: Double
  
  /** Gets the frame height, in pixels. */
  var height: Double
  
  /**
    * A comparison function used to determine if two IPerceptionVideoProfile objects are equivalent.
    * @param other The IPerceptionVideoProfile object to compare to this one.
    * @return True if the two video profiles are equivalent, otherwise false.
    */
  def isEqual(other: PerceptionVideoProfile): Boolean
  
  /** Gets the frame width, in pixels. */
  var width: Double
}
object PerceptionVideoProfile {
  
  @scala.inline
  def apply(
    bitmapAlphaMode: BitmapAlphaMode,
    bitmapPixelFormat: BitmapPixelFormat,
    frameDuration: Double,
    height: Double,
    isEqual: PerceptionVideoProfile => Boolean,
    width: Double
  ): PerceptionVideoProfile = {
    val __obj = js.Dynamic.literal(bitmapAlphaMode = bitmapAlphaMode.asInstanceOf[js.Any], bitmapPixelFormat = bitmapPixelFormat.asInstanceOf[js.Any], frameDuration = frameDuration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionVideoProfile]
  }
  
  @scala.inline
  implicit class PerceptionVideoProfileMutableBuilder[Self <: PerceptionVideoProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitmapAlphaMode(value: BitmapAlphaMode): Self = StObject.set(x, "bitmapAlphaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitmapPixelFormat(value: BitmapPixelFormat): Self = StObject.set(x, "bitmapPixelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameDuration(value: Double): Self = StObject.set(x, "frameDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEqual(value: PerceptionVideoProfile => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
