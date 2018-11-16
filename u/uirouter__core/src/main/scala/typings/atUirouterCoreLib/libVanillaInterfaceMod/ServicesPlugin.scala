package typings
package atUirouterCoreLib.libVanillaInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicesPlugin
  extends atUirouterCoreLib.libInterfaceMod.UIRouterPlugin {
  @JSName("$injector")
  var $injector: atUirouterCoreLib.libCommonCoreservicesMod.$InjectorLike = js.native
  @JSName("$q")
  var $q: atUirouterCoreLib.libCommonCoreservicesMod.$QLike = js.native
}

