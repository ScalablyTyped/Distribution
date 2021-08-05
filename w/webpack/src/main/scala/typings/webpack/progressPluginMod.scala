package typings.webpack

import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressPluginMod {
  
  @js.native
  trait HandlerFunction
    extends StObject
       with ProgressPluginArgument {
    
    def apply(percentage: Double, msg: String, args: String*): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpack.progressPluginMod.ProgressPluginOptions
    - typings.webpack.progressPluginMod.HandlerFunction
  */
  trait ProgressPluginArgument extends StObject
  
  trait ProgressPluginOptions
    extends StObject
       with ProgressPluginArgument {
    
    /**
    	 * Show active modules count and one active module in progress message
    	 */
    var activeModules: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Show entries count in progress message
    	 */
    var entries: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Function that executes for every progress step
    	 */
    var handler: js.UndefOr[HandlerFunction] = js.undefined
    
    /**
    	 * Show modules count in progress message
    	 */
    var modules: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Minimum modules count to start with. Only for mode=modules. Default: 500
    	 */
    var modulesCount: js.UndefOr[Double] = js.undefined
    
    /**
    	 * Collect profile data for progress steps. Default: false
    	 */
    var profile: js.UndefOr[`true` | `false` | Null] = js.undefined
  }
  object ProgressPluginOptions {
    
    inline def apply(): ProgressPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressPluginOptions]
    }
    
    extension [Self <: ProgressPluginOptions](x: Self) {
      
      inline def setActiveModules(value: Boolean): Self = StObject.set(x, "activeModules", value.asInstanceOf[js.Any])
      
      inline def setActiveModulesUndefined: Self = StObject.set(x, "activeModules", js.undefined)
      
      inline def setEntries(value: Boolean): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setHandler(value: HandlerFunction): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setModules(value: Boolean): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesCount(value: Double): Self = StObject.set(x, "modulesCount", value.asInstanceOf[js.Any])
      
      inline def setModulesCountUndefined: Self = StObject.set(x, "modulesCount", js.undefined)
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setProfile(value: `true` | `false`): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileNull: Self = StObject.set(x, "profile", null)
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    }
  }
}
