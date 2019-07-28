package typings.tcomb.tcombMod

import typings.tcomb.Anon_Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type[T]
  extends js.Function {
  var displayName: String = js.native
  @JSName("is")
  var is_Original: TypeGuardPredicate[T] = js.native
  var meta: Anon_Identity = js.native
  var t: T = js.native
  def apply(value: T): T = js.native
  def is(x: js.Any): /* is T */ Boolean = js.native
}

