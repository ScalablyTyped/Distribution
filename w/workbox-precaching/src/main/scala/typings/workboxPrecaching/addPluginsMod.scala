package typings.workboxPrecaching

import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addPluginsMod {
  
  @JSImport("workbox-precaching/addPlugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPlugins(newPlugins: js.Array[WorkboxPlugin]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPlugins")(newPlugins.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
