package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoResolution extends StObject {
  
  /**
    * Video aspect ratio.
    */
  val aspectRatio: AspectRatio
  
  /**
    * Vertical frequency rate in Hz.
    */
  val frequency: Double
  
  /**
    * Video height in pixels.
    */
  val height: Double
  
  /**
    * Video width in pixels.
    */
  val width: Double
}
object VideoResolution {
  
  inline def apply(aspectRatio: AspectRatio, frequency: Double, height: Double, width: Double): VideoResolution = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoResolution]
  }
  
  extension [Self <: VideoResolution](x: Self) {
    
    inline def setAspectRatio(value: AspectRatio): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
