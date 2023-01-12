package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransposeAttrs extends StObject {
  
  var perm: js.Array[Double]
}
object TransposeAttrs {
  
  inline def apply(perm: js.Array[Double]): TransposeAttrs = {
    val __obj = js.Dynamic.literal(perm = perm.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransposeAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransposeAttrs] (val x: Self) extends AnyVal {
    
    inline def setPerm(value: js.Array[Double]): Self = StObject.set(x, "perm", value.asInstanceOf[js.Any])
    
    inline def setPermVarargs(value: Double*): Self = StObject.set(x, "perm", js.Array(value*))
  }
}
