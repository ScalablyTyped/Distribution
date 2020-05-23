package typings.wordpressComponents.mod

import typings.react.mod.ComponentType
import typings.wordpressComponents.withFocusReturnMod.WFROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components", "withFocusReturn")
@js.native
object withFocusReturn extends js.Object {
  // prettier-ignore
  def apply(options: WFROptions): js.Function1[/* wrapped */ ComponentType[_], ComponentType[_]] = js.native
  // prettier-ignore
  def apply[T /* <: ComponentType[_] */](wrapped: T): ComponentType[_] = js.native
}

