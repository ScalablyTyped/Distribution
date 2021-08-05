package typings.wdioUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initialisePluginMod {
  
  @JSImport("@wdio/utils/build/initialisePlugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def default(name: String, `type`: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
