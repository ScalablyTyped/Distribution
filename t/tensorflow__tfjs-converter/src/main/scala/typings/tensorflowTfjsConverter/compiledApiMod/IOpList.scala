package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOpList extends StObject {
  
  /** OpList op */
  var op: js.UndefOr[js.Array[IOpDef] | Null] = js.undefined
}
object IOpList {
  
  inline def apply(): IOpList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpList]
  }
  
  extension [Self <: IOpList](x: Self) {
    
    inline def setOp(value: js.Array[IOpDef]): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpNull: Self = StObject.set(x, "op", null)
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setOpVarargs(value: IOpDef*): Self = StObject.set(x, "op", js.Array(value*))
  }
}
