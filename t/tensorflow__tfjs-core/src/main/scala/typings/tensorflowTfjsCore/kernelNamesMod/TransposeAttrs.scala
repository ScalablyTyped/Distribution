package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransposeAttrs extends StObject {
  
  var perm: js.Array[Double] = js.native
}
object TransposeAttrs {
  
  @scala.inline
  def apply(perm: js.Array[Double]): TransposeAttrs = {
    val __obj = js.Dynamic.literal(perm = perm.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransposeAttrs]
  }
  
  @scala.inline
  implicit class TransposeAttrsMutableBuilder[Self <: TransposeAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerm(value: js.Array[Double]): Self = StObject.set(x, "perm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermVarargs(value: Double*): Self = StObject.set(x, "perm", js.Array(value :_*))
  }
}
