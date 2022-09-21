package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoMaxVideoResolution extends StObject {
  
  /**
    * frame rate of max video resolution
    *
    * @since 6.0
    */
  var frameRate: Double
  
  /**
    * height of max video resolution
    *
    * @since 6.0
    */
  var height: Double
  
  /**
    * width of max video resolution
    *
    * @since 6.0
    */
  var width: Double
}
object SystemInfoMaxVideoResolution {
  
  inline def apply(frameRate: Double, height: Double, width: Double): SystemInfoMaxVideoResolution = {
    val __obj = js.Dynamic.literal(frameRate = frameRate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoMaxVideoResolution]
  }
  
  extension [Self <: SystemInfoMaxVideoResolution](x: Self) {
    
    inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
