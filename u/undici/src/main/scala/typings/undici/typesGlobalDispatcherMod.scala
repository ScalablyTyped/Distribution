package typings.undici

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalDispatcherMod {
  
  @JSImport("undici/types/global-dispatcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGlobalDispatcher(): typings.undici.typesDispatcherMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalDispatcher")().asInstanceOf[typings.undici.typesDispatcherMod.^]
  
  inline def setGlobalDispatcher[DispatcherImplementation /* <: typings.undici.typesDispatcherMod.^ */](dispatcher: DispatcherImplementation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalDispatcher")(dispatcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
