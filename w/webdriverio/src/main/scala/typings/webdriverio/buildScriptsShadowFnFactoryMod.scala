package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildScriptsShadowFnFactoryMod {
  
  @JSImport("webdriverio/build/scripts/shadowFnFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shadowFnFactory(elementSelector: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shadowFnFactory")(elementSelector.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def shadowFnFactory(elementSelector: String, qsAll: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shadowFnFactory")(elementSelector.asInstanceOf[js.Any], qsAll.asInstanceOf[js.Any])).asInstanceOf[Any]
}
