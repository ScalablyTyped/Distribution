package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.anon.Dictindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderOptionsPluginOptions
  extends StObject
     with /* index */ StringDictionary[Any] {
  
  /**
  	 * Whether loaders should be in debug mode or not. debug will be removed as of webpack 3.
  	 */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Where loaders can be switched to minimize mode.
  	 */
  var minimize: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * A configuration object that can be used to configure older loaders.
  	 */
  var options: js.UndefOr[Dictindex] = js.undefined
}
object LoaderOptionsPluginOptions {
  
  inline def apply(): LoaderOptionsPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderOptionsPluginOptions]
  }
  
  extension [Self <: LoaderOptionsPluginOptions](x: Self) {
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
    
    inline def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
    
    inline def setOptions(value: Dictindex): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
