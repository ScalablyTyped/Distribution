package typings
package wouterLib.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/preact", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Link: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FunctionComponent<LinkProps> */ js.Any = js.native
  val Redirect: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FunctionComponent<RedirectProps> */ js.Any = js.native
  val Route: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FunctionComponent<RouteProps> */ js.Any = js.native
  val Router: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FunctionComponent<Partial<RouterProps> & {  children  :ComponentChildren}> */ js.Any = js.native
  val Switch: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FunctionComponent<SwitchProps> */ js.Any = js.native
  def useLocation(): LocationTuple = js.native
  def useRoute(pattern: java.lang.String): Match = js.native
  def useRouter(): RouterProps = js.native
}

