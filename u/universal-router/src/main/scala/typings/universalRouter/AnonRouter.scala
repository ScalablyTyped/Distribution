package typings.universalRouter

import typings.universalRouter.mod.Context
import typings.universalRouter.mod.UniversalRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRouter[C /* <: Context */, R] extends js.Object {
  var router: UniversalRouter[C, R]
}

object AnonRouter {
  @scala.inline
  def apply[C /* <: Context */, R](router: UniversalRouter[C, R]): AnonRouter[C, R] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRouter[C, R]]
  }
}

