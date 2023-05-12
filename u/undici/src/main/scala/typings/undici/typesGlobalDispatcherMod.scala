package typings.undici

import typings.undici.typesDispatcherMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalDispatcherMod {
  
  @JSImport("undici/types/global-dispatcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGlobalDispatcher(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalDispatcher")().asInstanceOf[default]
  
  inline def setGlobalDispatcher[DispatcherImplementation /* <: default */](dispatcher: DispatcherImplementation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalDispatcher")(dispatcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
