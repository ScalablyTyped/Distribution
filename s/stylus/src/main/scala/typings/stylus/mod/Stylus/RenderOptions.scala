package typings.stylus.mod.Stylus

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderOptions extends StObject {
  
  var Evaluator: js.UndefOr[Instantiable0[typings.stylus.mod.Stylus.Evaluator]] = js.undefined
  
  var filename: js.UndefOr[String] = js.undefined
  
  var functions: js.UndefOr[Dictionary[js.Any]] = js.undefined
  
  var globals: js.UndefOr[Dictionary[js.Any]] = js.undefined
  
  var imports: js.UndefOr[js.Array[String]] = js.undefined
  
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}
object RenderOptions {
  
  @scala.inline
  def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  
  @scala.inline
  implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluator(value: Instantiable0[Evaluator]): Self = StObject.set(x, "Evaluator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluatorUndefined: Self = StObject.set(x, "Evaluator", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setFunctions(value: Dictionary[js.Any]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    @scala.inline
    def setGlobals(value: Dictionary[js.Any]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    @scala.inline
    def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
  }
}
