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
  
  @scala.inline
  def apply(): IFunctionDefLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFunctionDefLibrary]
  }
  
  @scala.inline
  implicit class IFunctionDefLibraryMutableBuilder[Self <: IFunctionDefLibrary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunction(value: js.Array[IFunctionDef]): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionNull: Self = StObject.set(x, "function", null)
    
    @scala.inline
    def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    @scala.inline
    def setFunctionVarargs(value: IFunctionDef*): Self = StObject.set(x, "function", js.Array(value :_*))
    
    @scala.inline
    def setGradient(value: js.Array[IGradientDef]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientNull: Self = StObject.set(x, "gradient", null)
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    @scala.inline
    def setGradientVarargs(value: IGradientDef*): Self = StObject.set(x, "gradient", js.Array(value :_*))
  }
}
