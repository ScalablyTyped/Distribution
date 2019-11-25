package typings.universalDashRouter

import typings.universalDashRouter.universalDashRouterMod.Context
import typings.universalDashRouter.universalDashRouterMod.UniversalRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Router[C /* <: Context */, R] extends js.Object {
  var router: UniversalRouter[C, R]
}

object Anon_Router {
  @scala.inline
  def apply[C /* <: Context */, R](router: UniversalRouter[C, R]): Anon_Router[C, R] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Router[C, R]]
  }
}

