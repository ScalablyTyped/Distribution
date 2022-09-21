package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationAsRelativeRaw extends StObject {
  
  var name: js.UndefOr[RouteRecordName] = js.undefined
  
  var params: js.UndefOr[RouteParamsRaw] = js.undefined
}
object LocationAsRelativeRaw {
  
  inline def apply(): LocationAsRelativeRaw = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationAsRelativeRaw]
  }
  
  extension [Self <: LocationAsRelativeRaw](x: Self) {
    
    inline def setName(value: RouteRecordName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParams(value: RouteParamsRaw): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
