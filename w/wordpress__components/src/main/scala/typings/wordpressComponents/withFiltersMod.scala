package typings.wordpressComponents

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/higher-order/with-filters", JSImport.Namespace)
@js.native
object withFiltersMod extends js.Object {
  // prettier-ignore
  def default(hookName: String): js.Function1[/* wrapped */ js.Any, ComponentType[_]] = js.native
  @JSName("default")
  def default_P[P](hookName: String): js.Function1[/* wrapped */ ComponentType[_], ComponentType[P]] = js.native
}

