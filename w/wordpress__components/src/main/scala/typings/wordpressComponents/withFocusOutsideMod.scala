package typings.wordpressComponents

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/components/higher-order/with-focus-outside", JSImport.Namespace)
@js.native
object withFocusOutsideMod extends js.Object {
  
  def default[T /* <: HFOComponent[_, _] */](wrapped: T): ComponentType[_] = js.native
  
  @js.native
  trait HFOComponent[P, S] extends ComponentClass[P, S]
}
