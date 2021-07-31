package typings.workboxRouting

import typings.workboxRouting.routeHandlerMod.RouteHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setDefaultHandlerMod {
  
  @JSImport("workbox-routing/setDefaultHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def setDefaultHandler(handler: RouteHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
