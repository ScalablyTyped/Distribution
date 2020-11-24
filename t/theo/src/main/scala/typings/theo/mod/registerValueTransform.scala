package typings.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("theo", "registerValueTransform")
@js.native
object registerValueTransform extends js.Object {
  
  def apply[T /* <: String */](
    name: T,
    predicate: js.Function1[/* prop */ Prop, Boolean],
    transform: js.Function1[/* prop */ Prop, String | Double]
  ): Unit = js.native
  def apply[T /* <: String */](
    name: ValueTransform,
    predicate: js.Function1[/* prop */ Prop, Boolean],
    transform: js.Function1[/* prop */ Prop, String | Double]
  ): Unit = js.native
}
