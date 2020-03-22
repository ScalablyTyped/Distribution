package typings.universalRouter.universalRouterSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-router/src/UniversalRouterSync", JSImport.Default)
@js.native
class default[R, C /* <: RouterContext */] protected () extends UniversalRouterSync[R, C] {
  def this(routes: Route[R, C]) = this()
  def this(routes: Routes[R, C]) = this()
  def this(routes: Route[R, C], options: RouterOptions[R, C]) = this()
  def this(routes: Routes[R, C], options: RouterOptions[R, C]) = this()
}

