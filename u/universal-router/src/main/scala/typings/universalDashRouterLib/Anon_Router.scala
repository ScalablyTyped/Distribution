package typings
package universalDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Router[C /* <: universalDashRouterLib.universalDashRouterMod.Context */, R] extends js.Object {
  var router: universalDashRouterLib.universalDashRouterMod.UniversalRouter[C, R]
}

object Anon_Router {
  @scala.inline
  def apply[C /* <: universalDashRouterLib.universalDashRouterMod.Context */, R](router: universalDashRouterLib.universalDashRouterMod.UniversalRouter[C, R]): Anon_Router[C, R] = {
    val __obj = js.Dynamic.literal(router = router)
  
    __obj.asInstanceOf[Anon_Router[C, R]]
  }
}

