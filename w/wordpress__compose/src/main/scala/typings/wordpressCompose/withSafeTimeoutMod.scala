package typings.wordpressCompose

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressCompose.wordpressComposeStrings.setTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/compose/higher-order/with-safe-timeout", JSImport.Namespace)
@js.native
object withSafeTimeoutMod extends js.Object {
  // prettier-ignore
  def default[T /* <: ComponentType[_] */](component: T): ComponentType[Omit[_, setTimeout]] = js.native
}

