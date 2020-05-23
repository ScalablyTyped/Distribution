package typings.wordpressCompose

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressCompose.wordpressComposeStrings.instanceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/compose/higher-order/with-instance-id", JSImport.Namespace)
@js.native
object withInstanceIdMod extends js.Object {
  // prettier-ignore
  def default[T /* <: ComponentType[_] */](wrapped: T): ComponentType[Omit[_, instanceId]] = js.native
}

