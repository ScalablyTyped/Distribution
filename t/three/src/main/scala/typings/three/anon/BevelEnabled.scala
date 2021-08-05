package typings.three.anon

import typings.three.fontMod.Font
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BevelEnabled extends StObject {
  
  /**
  		 * @default false
  		 */
  var bevelEnabled: Boolean
  
  var bevelOffset: Double
  
  var bevelSegments: Double
  
  /**
  		 * @default 8
  		 */
  var bevelSize: Double
  
  /**
  		 * @default 10
  		 */
  var bevelThickness: Double
  
  var curveSegments: Double
  
  var font: Font
  
  /**
  		 * @default 50
  		 */
  var height: Double
  
  var size: Double
}
object BevelEnabled {
  
  inline def apply(
    bevelEnabled: Boolean,
    bevelOffset: Double,
    bevelSegments: Double,
    bevelSize: Double,
    bevelThickness: Double,
    curveSegments: Double,
    font: Font,
    height: Double,
    size: Double
  ): BevelEnabled = {
    val __obj = js.Dynamic.literal(bevelEnabled = bevelEnabled.asInstanceOf[js.Any], bevelOffset = bevelOffset.asInstanceOf[js.Any], bevelSegments = bevelSegments.asInstanceOf[js.Any], bevelSize = bevelSize.asInstanceOf[js.Any], bevelThickness = bevelThickness.asInstanceOf[js.Any], curveSegments = curveSegments.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BevelEnabled]
  }
  
  extension [Self <: BevelEnabled](x: Self) {
    
    inline def setBevelEnabled(value: Boolean): Self = StObject.set(x, "bevelEnabled", value.asInstanceOf[js.Any])
    
    inline def setBevelOffset(value: Double): Self = StObject.set(x, "bevelOffset", value.asInstanceOf[js.Any])
    
    inline def setBevelSegments(value: Double): Self = StObject.set(x, "bevelSegments", value.asInstanceOf[js.Any])
    
    inline def setBevelSize(value: Double): Self = StObject.set(x, "bevelSize", value.asInstanceOf[js.Any])
    
    inline def setBevelThickness(value: Double): Self = StObject.set(x, "bevelThickness", value.asInstanceOf[js.Any])
    
    inline def setCurveSegments(value: Double): Self = StObject.set(x, "curveSegments", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
