package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUOrigin2DDictStrict
  extends StObject
     with GPUOrigin2DDict {
  
  /** @deprecated Does not exist for GPUOrigin2D. */
  var z: Unit
}
object GPUOrigin2DDictStrict {
  
  inline def apply(z: Unit): GPUOrigin2DDictStrict = {
    val __obj = js.Dynamic.literal(z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUOrigin2DDictStrict]
  }
  
  extension [Self <: GPUOrigin2DDictStrict](x: Self) {
    
    inline def setZ(value: Unit): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
