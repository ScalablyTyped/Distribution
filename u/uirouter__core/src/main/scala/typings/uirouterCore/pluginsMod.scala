package typings.uirouterCore

import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.vanillaInterfaceMod.LocationPlugin
import typings.uirouterCore.vanillaInterfaceMod.ServicesPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMod {
  
  @JSImport("@uirouter/core/lib/vanilla/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hashLocationPlugin(router: UIRouter): LocationPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("hashLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[LocationPlugin]
  
  @scala.inline
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[LocationPlugin]
  
  @scala.inline
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("pushStateLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[LocationPlugin]
  
  @scala.inline
  def servicesPlugin(router: UIRouter): ServicesPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("servicesPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[ServicesPlugin]
}
