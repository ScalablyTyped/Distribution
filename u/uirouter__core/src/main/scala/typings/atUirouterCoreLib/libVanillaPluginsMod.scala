package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/plugins", JSImport.Namespace)
@js.native
object libVanillaPluginsMod extends js.Object {
  val hashLocationPlugin: js.Function1[
    /* router */ atUirouterCoreLib.libRouterMod.UIRouter, 
    atUirouterCoreLib.libVanillaInterfaceMod.LocationPlugin
  ] = js.native
  val memoryLocationPlugin: js.Function1[
    /* router */ atUirouterCoreLib.libRouterMod.UIRouter, 
    atUirouterCoreLib.libVanillaInterfaceMod.LocationPlugin
  ] = js.native
  val pushStateLocationPlugin: js.Function1[
    /* router */ atUirouterCoreLib.libRouterMod.UIRouter, 
    atUirouterCoreLib.libVanillaInterfaceMod.LocationPlugin
  ] = js.native
  def servicesPlugin(router: atUirouterCoreLib.libRouterMod.UIRouter): atUirouterCoreLib.libVanillaInterfaceMod.ServicesPlugin = js.native
}

