package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables/Disables experiments (experimental features with relax SemVer compatibility).
  */
trait ExperimentsExtra extends StObject {
  
  /**
  	 * Build http(s): urls using a lockfile and resource content cache.
  	 */
  var buildHttp: js.UndefOr[
    HttpUriOptions | (js.Array[String | js.RegExp | (js.Function1[/* uri */ String, Boolean])])
  ] = js.undefined
  
  /**
  	 * Enable css support.
  	 */
  var css: js.UndefOr[Boolean | CssExperimentOptions] = js.undefined
  
  /**
  	 * Compile entrypoints and import()s only when they are accessed.
  	 */
  var lazyCompilation: js.UndefOr[Boolean | LazyCompilationOptions] = js.undefined
}
object ExperimentsExtra {
  
  inline def apply(): ExperimentsExtra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentsExtra]
  }
  
  extension [Self <: ExperimentsExtra](x: Self) {
    
    inline def setBuildHttp(value: HttpUriOptions | (js.Array[String | js.RegExp | (js.Function1[/* uri */ String, Boolean])])): Self = StObject.set(x, "buildHttp", value.asInstanceOf[js.Any])
    
    inline def setBuildHttpUndefined: Self = StObject.set(x, "buildHttp", js.undefined)
    
    inline def setBuildHttpVarargs(value: (String | js.RegExp | (js.Function1[/* uri */ String, Boolean]))*): Self = StObject.set(x, "buildHttp", js.Array(value*))
    
    inline def setCss(value: Boolean | CssExperimentOptions): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setLazyCompilation(value: Boolean | LazyCompilationOptions): Self = StObject.set(x, "lazyCompilation", value.asInstanceOf[js.Any])
    
    inline def setLazyCompilationUndefined: Self = StObject.set(x, "lazyCompilation", js.undefined)
  }
}
