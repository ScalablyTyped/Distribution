package typings.webpack.anon

import typings.webpack.sourceMapDevToolPluginMod.Rule
import typings.webpack.sourceMapDevToolPluginMod.Rules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Include extends StObject {
  
  /**
  				 * Exclude modules that match the given value from source map generation
  				 */
  var exclude: js.UndefOr[Rules] = js.native
  
  /**
  				 * Include source maps for module paths that match the given value
  				 */
  var include: js.UndefOr[Rules] = js.native
  
  /**
  				 * Include source maps for modules based on their extension (defaults to .js and .css)
  				 */
  var test: js.UndefOr[Rules] = js.native
}
object Include {
  
  @scala.inline
  def apply(): Include = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Include]
  }
  
  @scala.inline
  implicit class IncludeMutableBuilder[Self <: Include] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclude(value: Rules): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: Rule*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: Rules): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: Rule*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: Rules): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: Rule*): Self = StObject.set(x, "test", js.Array(value :_*))
  }
}
