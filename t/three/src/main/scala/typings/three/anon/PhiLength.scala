package typings.three.anon

import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhiLength extends StObject {
  
  var phiLength: Double
  
  var phiStart: Double
  
  var points: js.Array[Vector2]
  
  var segments: Double
}
object PhiLength {
  
  inline def apply(phiLength: Double, phiStart: Double, points: js.Array[Vector2], segments: Double): PhiLength = {
    val __obj = js.Dynamic.literal(phiLength = phiLength.asInstanceOf[js.Any], phiStart = phiStart.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhiLength]
  }
  
  extension [Self <: PhiLength](x: Self) {
    
    inline def setPhiLength(value: Double): Self = StObject.set(x, "phiLength", value.asInstanceOf[js.Any])
    
    inline def setPhiStart(value: Double): Self = StObject.set(x, "phiStart", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[Vector2]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Vector2*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
  }
}
