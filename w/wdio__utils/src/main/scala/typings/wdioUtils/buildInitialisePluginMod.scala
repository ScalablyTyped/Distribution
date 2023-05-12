package typings.wdioUtils

import typings.wdioTypes.buildServicesMod.RunnerPlugin
import typings.wdioTypes.buildServicesMod.ServicePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildInitialisePluginMod {
  
  @JSImport("@wdio/utils/build/initialisePlugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(name: String): js.Promise[ServicePlugin | RunnerPlugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ServicePlugin | RunnerPlugin]]
  inline def default(name: String, `type`: String): js.Promise[ServicePlugin | RunnerPlugin] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ServicePlugin | RunnerPlugin]]
}
