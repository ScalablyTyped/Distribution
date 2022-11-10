package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables/Disables experiments (experimental features with relax SemVer compatibility).
  */
trait ExperimentsNormalizedExtra extends StObject {
  
  /**
  	 * Build http(s): urls using a lockfile and resource content cache.
  	 */
  var buildHttp: js.UndefOr[HttpUriOptions] = js.undefined
  
  /**
  	 * Enable css support.
  	 */
  var css: js.UndefOr[`false` | CssExperimentOptions] = js.undefined
  
  /**
  	 * Compile entrypoints and import()s only when they are accessed.
  	 */
  var lazyCompilation: js.UndefOr[`false` | LazyCompilationOptions] = js.undefined
}
object ExperimentsNormalizedExtra {
  
  inline def apply(): ExperimentsNormalizedExtra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentsNormalizedExtra]
  }
  
  extension [Self <: ExperimentsNormalizedExtra](x: Self) {
    
    inline def setBuildHttp(value: HttpUriOptions): Self = StObject.set(x, "buildHttp", value.asInstanceOf[js.Any])
    
    inline def setBuildHttpUndefined: Self = StObject.set(x, "buildHttp", js.undefined)
    
    inline def setCss(value: `false` | CssExperimentOptions): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setLazyCompilation(value: `false` | LazyCompilationOptions): Self = StObject.set(x, "lazyCompilation", value.asInstanceOf[js.Any])
    
    inline def setLazyCompilationUndefined: Self = StObject.set(x, "lazyCompilation", js.undefined)
  }
}
