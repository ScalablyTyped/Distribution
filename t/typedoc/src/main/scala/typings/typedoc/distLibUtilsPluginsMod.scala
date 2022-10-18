package typings.typedoc

import typings.typedoc.distLibApplicationMod.Application
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsPluginsMod {
  
  @JSImport("typedoc/dist/lib/utils/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def discoverPlugins(app: Application): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("discoverPlugins")(app.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def loadPlugins(app: Application, plugins: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugins")(app.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
