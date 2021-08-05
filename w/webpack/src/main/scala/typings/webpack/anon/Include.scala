package typings.webpack.anon

import typings.webpack.sourceMapDevToolPluginMod.Rule
import typings.webpack.sourceMapDevToolPluginMod.Rules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Include extends StObject {
  
  /**
  				 * Exclude modules that match the given value from source map generation
  				 */
  var exclude: js.UndefOr[Rules] = js.undefined
  
  /**
  				 * Include source maps for module paths that match the given value
  				 */
  var include: js.UndefOr[Rules] = js.undefined
  
  /**
  				 * Include source maps for modules based on their extension (defaults to .js and .css)
  				 */
  var test: js.UndefOr[Rules] = js.undefined
}
object Include {
  
  inline def apply(): Include = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Include]
  }
  
  extension [Self <: Include](x: Self) {
    
    inline def setExclude(value: Rules): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: Rule*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    inline def setInclude(value: Rules): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: Rule*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    inline def setTest(value: Rules): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setTestVarargs(value: Rule*): Self = StObject.set(x, "test", js.Array(value :_*))
  }
}
