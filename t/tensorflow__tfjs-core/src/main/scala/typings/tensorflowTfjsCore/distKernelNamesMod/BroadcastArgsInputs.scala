package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 's0' | 's1'> */
trait BroadcastArgsInputs extends StObject {
  
  var s0: js.UndefOr[scala.Any] = js.undefined
  
  var s1: js.UndefOr[scala.Any] = js.undefined
}
object BroadcastArgsInputs {
  
  inline def apply(): BroadcastArgsInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastArgsInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BroadcastArgsInputs] (val x: Self) extends AnyVal {
    
    inline def setS0(value: scala.Any): Self = StObject.set(x, "s0", value.asInstanceOf[js.Any])
    
    inline def setS0Undefined: Self = StObject.set(x, "s0", js.undefined)
    
    inline def setS1(value: scala.Any): Self = StObject.set(x, "s1", value.asInstanceOf[js.Any])
    
    inline def setS1Undefined: Self = StObject.set(x, "s1", js.undefined)
  }
}
