package typings.workboxCore

import typings.workboxCore.typesMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsPluginUtilsMod {
  
  object pluginUtils {
    
    @JSImport("workbox-core/utils/pluginUtils", "pluginUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def filter(plugins: js.Array[WorkboxPlugin], callbackName: String): js.Array[WorkboxPlugin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(plugins.asInstanceOf[js.Any], callbackName.asInstanceOf[js.Any])).asInstanceOf[js.Array[WorkboxPlugin]]
  }
}
