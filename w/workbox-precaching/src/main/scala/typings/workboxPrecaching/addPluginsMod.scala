package typings.workboxPrecaching

import typings.workboxCore.typesMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addPluginsMod {
  
  @JSImport("workbox-precaching/addPlugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds plugins to the precaching strategy.
    *
    * @param {Array<Object>} plugins
    *
    * @memberof workbox-precaching
    */
  inline def addPlugins(plugins: js.Array[WorkboxPlugin]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPlugins")(plugins.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
