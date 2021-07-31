package typings.webpack.anon

import typings.webpack.webpackOptionsMod.FilterItemTypes
import typings.webpack.webpackOptionsMod.FilterTypes
import typings.webpack.webpackStrings.error
import typings.webpack.webpackStrings.info
import typings.webpack.webpackStrings.log
import typings.webpack.webpackStrings.none
import typings.webpack.webpackStrings.verbose
import typings.webpack.webpackStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Debug extends StObject {
  
  /**
  		 * Enable debug logging for specific loggers
  		 */
  var debug: js.UndefOr[FilterTypes | Boolean] = js.undefined
  
  /**
  		 * Log level
  		 */
  var level: js.UndefOr[none | error | warn | info | log | verbose] = js.undefined
}
object Debug {
  
  @scala.inline
  def apply(): Debug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: FilterTypes | Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDebugVarargs(value: FilterItemTypes*): Self = StObject.set(x, "debug", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: none | error | warn | info | log | verbose): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
