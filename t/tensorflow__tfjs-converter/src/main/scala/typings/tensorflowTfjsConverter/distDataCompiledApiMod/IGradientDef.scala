package typings.tensorflowTfjsConverter.distDataCompiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGradientDef extends StObject {
  
  /** GradientDef functionName */
  var functionName: js.UndefOr[String | Null] = js.undefined
  
  /** GradientDef gradientFunc */
  var gradientFunc: js.UndefOr[String | Null] = js.undefined
}
object IGradientDef {
  
  inline def apply(): IGradientDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGradientDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGradientDef] (val x: Self) extends AnyVal {
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameNull: Self = StObject.set(x, "functionName", null)
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setGradientFunc(value: String): Self = StObject.set(x, "gradientFunc", value.asInstanceOf[js.Any])
    
    inline def setGradientFuncNull: Self = StObject.set(x, "gradientFunc", null)
    
    inline def setGradientFuncUndefined: Self = StObject.set(x, "gradientFunc", js.undefined)
  }
}
