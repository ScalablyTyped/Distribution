package typings.wordpressComponents

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/higher-order/with-focus-outside", JSImport.Namespace)
@js.native
object withFocusOutsideMod extends js.Object {
  @js.native
  trait HFOComponent[P, S] extends ComponentClass[P, S]
  
  def default[T /* <: HFOComponent[_, _] */](wrapped: T): ComponentType[_] = js.native
}

