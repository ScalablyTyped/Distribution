package typings
package styletronDashReactLib.styletronDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStyleFn extends js.Object {
  def apply[C /* <: StyletronComponent[_] */](component: C, style: styletronDashStandardLib.styletronDashStandardMod.StyleObject): StyletronComponent[reactLib.reactMod.ComponentProps[C]] = js.native
  def apply[C /* <: StyletronComponent[_] */, P /* <: js.Object */](
    component: C,
    style: js.Function1[/* props */ P, styletronDashStandardLib.styletronDashStandardMod.StyleObject]
  ): StyletronComponent[reactLib.reactMod.ComponentProps[C] with P] = js.native
}

