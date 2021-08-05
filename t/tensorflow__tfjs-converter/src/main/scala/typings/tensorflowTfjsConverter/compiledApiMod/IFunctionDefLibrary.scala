package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFunctionDefLibrary extends StObject {
  
  /** FunctionDefLibrary function */
  var function: js.UndefOr[js.Array[IFunctionDef] | Null] = js.undefined
  
  /** FunctionDefLibrary gradient */
  var gradient: js.UndefOr[js.Array[IGradientDef] | Null] = js.undefined
}
object IFunctionDefLibrary {
  
  inline def apply(): IFunctionDefLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFunctionDefLibrary]
  }
  
  extension [Self <: IFunctionDefLibrary](x: Self) {
    
    inline def setFunction(value: js.Array[IFunctionDef]): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionNull: Self = StObject.set(x, "function", null)
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setFunctionVarargs(value: IFunctionDef*): Self = StObject.set(x, "function", js.Array(value :_*))
    
    inline def setGradient(value: js.Array[IGradientDef]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setGradientNull: Self = StObject.set(x, "gradient", null)
    
    inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    inline def setGradientVarargs(value: IGradientDef*): Self = StObject.set(x, "gradient", js.Array(value :_*))
  }
}
