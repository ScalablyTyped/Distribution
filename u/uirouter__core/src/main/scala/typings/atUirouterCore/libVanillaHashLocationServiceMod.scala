package typings.atUirouterCore

import typings.atUirouterCore.libRouterMod.UIRouter
import typings.atUirouterCore.libVanillaBaseLocationServiceMod.BaseLocationServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/hashLocationService", JSImport.Namespace)
@js.native
object libVanillaHashLocationServiceMod extends js.Object {
  @js.native
  class HashLocationService protected () extends BaseLocationServices {
    def this(router: UIRouter) = this()
  }
  
}

