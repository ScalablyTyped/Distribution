package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUOrigin2DDict extends StObject {
  
  var x: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  var y: js.UndefOr[GPUIntegerCoordinate] = js.undefined
}
object GPUOrigin2DDict {
  
  inline def apply(): GPUOrigin2DDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUOrigin2DDict]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUOrigin2DDict] (val x: Self) extends AnyVal {
    
    inline def setX(value: GPUIntegerCoordinate): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: GPUIntegerCoordinate): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
