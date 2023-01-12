package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Positions extends StObject {
  
  var dots: js.UndefOr[Double] = js.undefined
  
  var duration: String
  
  var positions: js.Array[Fret]
  
  var stem_direction: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object Positions {
  
  inline def apply(duration: String, positions: js.Array[Fret]): Positions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Positions] (val x: Self) extends AnyVal {
    
    inline def setDots(value: Double): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setPositions(value: js.Array[Fret]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsVarargs(value: Fret*): Self = StObject.set(x, "positions", js.Array(value*))
    
    inline def setStem_direction(value: Double): Self = StObject.set(x, "stem_direction", value.asInstanceOf[js.Any])
    
    inline def setStem_directionUndefined: Self = StObject.set(x, "stem_direction", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
