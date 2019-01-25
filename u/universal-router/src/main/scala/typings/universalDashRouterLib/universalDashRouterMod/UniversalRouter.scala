package typings
package universalDashRouterLib.universalDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniversalRouter[C /* <: Context */, R] extends js.Object {
  def resolve(pathnameOrContext: java.lang.String): js.Promise[R] = js.native
  def resolve(pathnameOrContext: ResolveContext): js.Promise[R] = js.native
}

