package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUOrigin3DDict extends StObject {
  
  var x: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  var y: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  var z: js.UndefOr[GPUIntegerCoordinate] = js.undefined
}
object GPUOrigin3DDict {
  
  inline def apply(): GPUOrigin3DDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUOrigin3DDict]
  }
  
  extension [Self <: GPUOrigin3DDict](x: Self) {
    
    inline def setX(value: GPUIntegerCoordinate): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: GPUIntegerCoordinate): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZ(value: GPUIntegerCoordinate): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
