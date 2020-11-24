package typings.valiant.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("valiant", "createInterval")
@js.native
object createInterval extends js.Object {
  
  def apply[T](): IntervalConstructor[T] = js.native
  def apply[T](compareValues: js.Function2[/* a */ T, /* b */ T, Double]): IntervalConstructor[T] = js.native
}
