package typings.stylus.mod

import org.scalablytyped.runtime.Instantiable0
import typings.stylus.mod.Stylus.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderOptions extends StObject {
  
  var Evaluator: js.UndefOr[Instantiable0[typings.stylus.mod.Stylus.Evaluator]] = js.undefined
  
  var filename: js.UndefOr[String] = js.undefined
  
  var functions: js.UndefOr[Dictionary[Any]] = js.undefined
  
  var globals: js.UndefOr[Dictionary[Any]] = js.undefined
  
  var imports: js.UndefOr[js.Array[String]] = js.undefined
  
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}
object RenderOptions {
  
  inline def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  
  extension [Self <: RenderOptions](x: Self) {
    
    inline def setEvaluator(value: Instantiable0[typings.stylus.mod.Stylus.Evaluator]): Self = StObject.set(x, "Evaluator", value.asInstanceOf[js.Any])
    
    inline def setEvaluatorUndefined: Self = StObject.set(x, "Evaluator", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setFunctions(value: Dictionary[Any]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setGlobals(value: Dictionary[Any]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
