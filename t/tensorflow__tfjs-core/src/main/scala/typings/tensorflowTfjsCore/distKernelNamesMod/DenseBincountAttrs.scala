package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DenseBincountAttrs extends StObject {
  
  var binaryOutput: js.UndefOr[Boolean] = js.undefined
  
  var size: Double
}
object DenseBincountAttrs {
  
  inline def apply(size: Double): DenseBincountAttrs = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DenseBincountAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DenseBincountAttrs] (val x: Self) extends AnyVal {
    
    inline def setBinaryOutput(value: Boolean): Self = StObject.set(x, "binaryOutput", value.asInstanceOf[js.Any])
    
    inline def setBinaryOutputUndefined: Self = StObject.set(x, "binaryOutput", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
