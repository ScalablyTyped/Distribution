package typings.tensorflowTfjsConverter.distDataCompiledApiMod

import typings.tensorflowTfjsConverter.distDataCompiledApiMod.TensorShape.IDim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITensorShape extends StObject {
  
  /** TensorShape dim */
  var dim: js.UndefOr[js.Array[IDim] | Null] = js.undefined
  
  /** TensorShape unknownRank */
  var unknownRank: js.UndefOr[Boolean | Null] = js.undefined
}
object ITensorShape {
  
  inline def apply(): ITensorShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITensorShape]
  }
  
  extension [Self <: ITensorShape](x: Self) {
    
    inline def setDim(value: js.Array[IDim]): Self = StObject.set(x, "dim", value.asInstanceOf[js.Any])
    
    inline def setDimNull: Self = StObject.set(x, "dim", null)
    
    inline def setDimUndefined: Self = StObject.set(x, "dim", js.undefined)
    
    inline def setDimVarargs(value: IDim*): Self = StObject.set(x, "dim", js.Array(value*))
    
    inline def setUnknownRank(value: Boolean): Self = StObject.set(x, "unknownRank", value.asInstanceOf[js.Any])
    
    inline def setUnknownRankNull: Self = StObject.set(x, "unknownRank", null)
    
    inline def setUnknownRankUndefined: Self = StObject.set(x, "unknownRank", js.undefined)
  }
}
