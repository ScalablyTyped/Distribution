package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoDisplay
  extends StObject
     with SystemInfoProperty {
  
  /**
    * The current brightness of a display ranging between 0 to 1.
    */
  val brightness: Double
  
  /**
    * Resolution of this device, along its height, in dots per inch.
    */
  val dotsPerInchHeight: Double
  
  /**
    * Resolution of this device, along its width, in dots per inch.
    */
  val dotsPerInchWidth: Double
  
  /**
    * The display's physical height in millimeters.
    */
  val physicalHeight: Double
  
  /**
    * The display's physical width in millimeters.
    */
  val physicalWidth: Double
  
  /**
    * The total number of addressable pixels in the vertical direction of a rectangular element
    * (such as Camera, Display, Image, Video, ...) when held in its default orientation.
    */
  val resolutionHeight: Double
  
  /**
    * The total number of addressable pixels in the horizontal direction of a rectangular entity
    * (such as Camera, Display, Image, Video, ...) when held in its default orientation.
    */
  val resolutionWidth: Double
}
object SystemInfoDisplay {
  
  inline def apply(
    brightness: Double,
    dotsPerInchHeight: Double,
    dotsPerInchWidth: Double,
    physicalHeight: Double,
    physicalWidth: Double,
    resolutionHeight: Double,
    resolutionWidth: Double
  ): SystemInfoDisplay = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any], dotsPerInchHeight = dotsPerInchHeight.asInstanceOf[js.Any], dotsPerInchWidth = dotsPerInchWidth.asInstanceOf[js.Any], physicalHeight = physicalHeight.asInstanceOf[js.Any], physicalWidth = physicalWidth.asInstanceOf[js.Any], resolutionHeight = resolutionHeight.asInstanceOf[js.Any], resolutionWidth = resolutionWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoDisplay]
  }
  
  extension [Self <: SystemInfoDisplay](x: Self) {
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setDotsPerInchHeight(value: Double): Self = StObject.set(x, "dotsPerInchHeight", value.asInstanceOf[js.Any])
    
    inline def setDotsPerInchWidth(value: Double): Self = StObject.set(x, "dotsPerInchWidth", value.asInstanceOf[js.Any])
    
    inline def setPhysicalHeight(value: Double): Self = StObject.set(x, "physicalHeight", value.asInstanceOf[js.Any])
    
    inline def setPhysicalWidth(value: Double): Self = StObject.set(x, "physicalWidth", value.asInstanceOf[js.Any])
    
    inline def setResolutionHeight(value: Double): Self = StObject.set(x, "resolutionHeight", value.asInstanceOf[js.Any])
    
    inline def setResolutionWidth(value: Double): Self = StObject.set(x, "resolutionWidth", value.asInstanceOf[js.Any])
  }
}
