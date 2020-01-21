package typings.universalRouter

import typings.universalRouter.universalRouterSyncMod.Context
import typings.universalRouter.universalRouterSyncMod.UniversalRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRouterC[C /* <: Context */, R] extends js.Object {
  var router: UniversalRouter[C, R]
}

object AnonRouterC {
  @scala.inline
  def apply[C /* <: Context */, R](router: UniversalRouter[C, R]): AnonRouterC[C, R] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRouterC[C, R]]
  }
}

