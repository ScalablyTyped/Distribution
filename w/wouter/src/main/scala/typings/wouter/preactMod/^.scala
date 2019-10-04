package typings.wouter.preactMod

import typings.preact.srcMod.FunctionComponent
import typings.std.Partial
import typings.wouter.Anon_ChildrenComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/preact", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Link: FunctionComponent[LinkProps] = js.native
  val Redirect: FunctionComponent[RedirectProps] = js.native
  val Route: FunctionComponent[RouteProps] = js.native
  val Router: FunctionComponent[Partial[RouterProps] with Anon_ChildrenComponentChildren] = js.native
  val Switch: FunctionComponent[SwitchProps] = js.native
  def useLocation(): LocationTuple = js.native
  def useRoute(pattern: String): Match = js.native
  def useRouter(): RouterProps = js.native
}

