package typings.universalDashRouter

import typings.universalDashRouter.srcUniversalRouterSyncMod.Context
import typings.universalDashRouter.srcUniversalRouterSyncMod.UniversalRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RouterC[C /* <: Context */, R] extends js.Object {
  var router: UniversalRouter[C, R]
}

object Anon_RouterC {
  @scala.inline
  def apply[C /* <: Context */, R](router: UniversalRouter[C, R]): Anon_RouterC[C, R] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RouterC[C, R]]
  }
}

