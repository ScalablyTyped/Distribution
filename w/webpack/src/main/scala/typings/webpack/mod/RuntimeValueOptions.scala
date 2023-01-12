package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeValueOptions extends StObject {
  
  var buildDependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var contextDependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var fileDependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var missingDependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var version: js.UndefOr[String | js.Function0[String]] = js.undefined
}
object RuntimeValueOptions {
  
  inline def apply(): RuntimeValueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeValueOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuntimeValueOptions] (val x: Self) extends AnyVal {
    
    inline def setBuildDependencies(value: js.Array[String]): Self = StObject.set(x, "buildDependencies", value.asInstanceOf[js.Any])
    
    inline def setBuildDependenciesUndefined: Self = StObject.set(x, "buildDependencies", js.undefined)
    
    inline def setBuildDependenciesVarargs(value: String*): Self = StObject.set(x, "buildDependencies", js.Array(value*))
    
    inline def setContextDependencies(value: js.Array[String]): Self = StObject.set(x, "contextDependencies", value.asInstanceOf[js.Any])
    
    inline def setContextDependenciesUndefined: Self = StObject.set(x, "contextDependencies", js.undefined)
    
    inline def setContextDependenciesVarargs(value: String*): Self = StObject.set(x, "contextDependencies", js.Array(value*))
    
    inline def setFileDependencies(value: js.Array[String]): Self = StObject.set(x, "fileDependencies", value.asInstanceOf[js.Any])
    
    inline def setFileDependenciesUndefined: Self = StObject.set(x, "fileDependencies", js.undefined)
    
    inline def setFileDependenciesVarargs(value: String*): Self = StObject.set(x, "fileDependencies", js.Array(value*))
    
    inline def setMissingDependencies(value: js.Array[String]): Self = StObject.set(x, "missingDependencies", value.asInstanceOf[js.Any])
    
    inline def setMissingDependenciesUndefined: Self = StObject.set(x, "missingDependencies", js.undefined)
    
    inline def setMissingDependenciesVarargs(value: String*): Self = StObject.set(x, "missingDependencies", js.Array(value*))
    
    inline def setVersion(value: String | js.Function0[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionFunction0(value: () => String): Self = StObject.set(x, "version", js.Any.fromFunction0(value))
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
