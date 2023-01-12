package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KERNELSIZEFLOAT extends StObject {
  
  var KERNEL_SIZE_FLOAT: String
  
  var KERNEL_SIZE_INT: String
}
object KERNELSIZEFLOAT {
  
  inline def apply(KERNEL_SIZE_FLOAT: String, KERNEL_SIZE_INT: String): KERNELSIZEFLOAT = {
    val __obj = js.Dynamic.literal(KERNEL_SIZE_FLOAT = KERNEL_SIZE_FLOAT.asInstanceOf[js.Any], KERNEL_SIZE_INT = KERNEL_SIZE_INT.asInstanceOf[js.Any])
    __obj.asInstanceOf[KERNELSIZEFLOAT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KERNELSIZEFLOAT] (val x: Self) extends AnyVal {
    
    inline def setKERNEL_SIZE_FLOAT(value: String): Self = StObject.set(x, "KERNEL_SIZE_FLOAT", value.asInstanceOf[js.Any])
    
    inline def setKERNEL_SIZE_INT(value: String): Self = StObject.set(x, "KERNEL_SIZE_INT", value.asInstanceOf[js.Any])
  }
}
