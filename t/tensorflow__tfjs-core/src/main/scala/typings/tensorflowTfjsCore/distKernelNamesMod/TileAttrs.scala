package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileAttrs extends StObject {
  
  var reps: js.Array[Double]
}
object TileAttrs {
  
  inline def apply(reps: js.Array[Double]): TileAttrs = {
    val __obj = js.Dynamic.literal(reps = reps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileAttrs]
  }
  
  extension [Self <: TileAttrs](x: Self) {
    
    inline def setReps(value: js.Array[Double]): Self = StObject.set(x, "reps", value.asInstanceOf[js.Any])
    
    inline def setRepsVarargs(value: Double*): Self = StObject.set(x, "reps", js.Array(value*))
  }
}
