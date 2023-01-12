package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Breakpoint extends StObject {
  
  var huge: Double
  
  var large: Double
  
  var medium: Double
  
  var small: Double
  
  var tiny: Double
  
  var xlarge: Double
  
  var xsmall: Double
}
object Breakpoint {
  
  inline def apply(
    huge: Double,
    large: Double,
    medium: Double,
    small: Double,
    tiny: Double,
    xlarge: Double,
    xsmall: Double
  ): Breakpoint = {
    val __obj = js.Dynamic.literal(huge = huge.asInstanceOf[js.Any], large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any], xlarge = xlarge.asInstanceOf[js.Any], xsmall = xsmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Breakpoint] (val x: Self) extends AnyVal {
    
    inline def setHuge(value: Double): Self = StObject.set(x, "huge", value.asInstanceOf[js.Any])
    
    inline def setLarge(value: Double): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: Double): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setTiny(value: Double): Self = StObject.set(x, "tiny", value.asInstanceOf[js.Any])
    
    inline def setXlarge(value: Double): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
    
    inline def setXsmall(value: Double): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
  }
}
