package typings.webpack.mod

import typings.webpack.webpackStrings.dependencies
import typings.webpack.webpackStrings.entries
import typings.webpack.webpackStrings.modules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options object for the ProgressPlugin.
  */
trait ProgressPluginOptions extends StObject {
  
  /**
  	 * Show active modules count and one active module in progress message.
  	 */
  var activeModules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Show dependencies count in progress message.
  	 */
  var dependencies: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Minimum dependencies count to start with. For better progress calculation. Default: 10000.
  	 */
  var dependenciesCount: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Show entries count in progress message.
  	 */
  var entries: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Function that executes for every progress step.
  	 */
  var handler: js.UndefOr[
    js.Function3[/* percentage */ Double, /* msg */ String, /* repeated */ String, Unit]
  ] = js.undefined
  
  /**
  	 * Show modules count in progress message.
  	 */
  var modules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Minimum modules count to start with. For better progress calculation. Default: 5000.
  	 */
  var modulesCount: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Collect percent algorithm. By default it calculates by a median from modules, entries and dependencies percent.
  	 */
  var percentBy: js.UndefOr[Null | modules | dependencies | entries] = js.undefined
  
  /**
  	 * Collect profile data for progress steps. Default: false.
  	 */
  var profile: js.UndefOr[Null | Boolean] = js.undefined
}
object ProgressPluginOptions {
  
  inline def apply(): ProgressPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressPluginOptions]
  }
  
  extension [Self <: ProgressPluginOptions](x: Self) {
    
    inline def setActiveModules(value: Boolean): Self = StObject.set(x, "activeModules", value.asInstanceOf[js.Any])
    
    inline def setActiveModulesUndefined: Self = StObject.set(x, "activeModules", js.undefined)
    
    inline def setDependencies(value: Boolean): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesCount(value: Double): Self = StObject.set(x, "dependenciesCount", value.asInstanceOf[js.Any])
    
    inline def setDependenciesCountUndefined: Self = StObject.set(x, "dependenciesCount", js.undefined)
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setEntries(value: Boolean): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setHandler(value: (/* percentage */ Double, /* msg */ String, /* repeated */ String) => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setModules(value: Boolean): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesCount(value: Double): Self = StObject.set(x, "modulesCount", value.asInstanceOf[js.Any])
    
    inline def setModulesCountUndefined: Self = StObject.set(x, "modulesCount", js.undefined)
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setPercentBy(value: modules | dependencies | entries): Self = StObject.set(x, "percentBy", value.asInstanceOf[js.Any])
    
    inline def setPercentByNull: Self = StObject.set(x, "percentBy", null)
    
    inline def setPercentByUndefined: Self = StObject.set(x, "percentBy", js.undefined)
    
    inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileNull: Self = StObject.set(x, "profile", null)
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
  }
}
