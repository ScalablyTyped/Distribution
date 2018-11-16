package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type[T]
  extends js.Function {
  var displayName: java.lang.String = js.native
  @JSName("is")
  var is_Original: tcombLib.TypeGuardPredicate[T] = js.native
  var meta: tcombLib.Anon_KindIdentityNameString = js.native
  var t: T = js.native
  def apply(value: T): T = js.native
  def is(x: js.Any): /* is T */scala.Boolean = js.native
}

