package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileAttrs extends StObject {
  
  var reps: js.Array[Double] = js.native
}
object TileAttrs {
  
  @scala.inline
  def apply(reps: js.Array[Double]): TileAttrs = {
    val __obj = js.Dynamic.literal(reps = reps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileAttrs]
  }
  
  @scala.inline
  implicit class TileAttrsMutableBuilder[Self <: TileAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReps(value: js.Array[Double]): Self = StObject.set(x, "reps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepsVarargs(value: Double*): Self = StObject.set(x, "reps", js.Array(value :_*))
  }
}
