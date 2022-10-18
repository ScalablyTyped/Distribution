package typings.workboxPrecaching

import typings.workboxPrecaching.typesFetchListenerOptionsMod.FetchListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addRouteMod {
  
  @JSImport("workbox-precaching/addRoute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addRoute(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")().asInstanceOf[Unit]
  inline def addRoute(options: FetchListenerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
