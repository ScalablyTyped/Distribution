package typings.atUirouterCore

import typings.atUirouterCore.libRouterMod.UIRouter
import typings.atUirouterCore.libVanillaBaseLocationServiceMod.BaseLocationServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/memoryLocationService", JSImport.Namespace)
@js.native
object libVanillaMemoryLocationServiceMod extends js.Object {
  @js.native
  class MemoryLocationService protected () extends BaseLocationServices {
    def this(router: UIRouter) = this()
    var _url: String = js.native
  }
  
}

