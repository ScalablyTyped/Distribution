package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calls extends StObject {
  
  var calls: Double
  
  var frame: Double
  
  var lines: Double
  
  var points: Double
  
  var triangles: Double
}
object Calls {
  
  inline def apply(calls: Double, frame: Double, lines: Double, points: Double, triangles: Double): Calls = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Calls] (val x: Self) extends AnyVal {
    
    inline def setCalls(value: Double): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setTriangles(value: Double): Self = StObject.set(x, "triangles", value.asInstanceOf[js.Any])
  }
}
