package typings
package wouterLib.wouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Link: reactLib.reactMod.FunctionComponent[LinkProps] = js.native
  val Redirect: reactLib.reactMod.FunctionComponent[RedirectProps] = js.native
  val Route: reactLib.reactMod.FunctionComponent[RouteProps] = js.native
  val Router: reactLib.reactMod.FunctionComponent[stdLib.Partial[RouterProps] with wouterLib.Anon_Children] = js.native
  val Switch: reactLib.reactMod.FunctionComponent[SwitchProps] = js.native
  def useLocation(): LocationTuple = js.native
  def useRoute(pattern: java.lang.String): Match = js.native
  def useRouter(): RouterProps = js.native
}

