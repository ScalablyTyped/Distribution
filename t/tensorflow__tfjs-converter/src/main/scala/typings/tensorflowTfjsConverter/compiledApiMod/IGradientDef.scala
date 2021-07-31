package typings.tensorflowTfjsConverter.compiledApiMod

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
  
  @scala.inline
  def apply(): IGradientDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGradientDef]
  }
  
  @scala.inline
  implicit class IGradientDefMutableBuilder[Self <: IGradientDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionNameNull: Self = StObject.set(x, "functionName", null)
    
    @scala.inline
    def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    @scala.inline
    def setGradientFunc(value: String): Self = StObject.set(x, "gradientFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientFuncNull: Self = StObject.set(x, "gradientFunc", null)
    
    @scala.inline
    def setGradientFuncUndefined: Self = StObject.set(x, "gradientFunc", js.undefined)
  }
}
