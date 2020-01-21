package typings.tcomb.mod

import typings.tcomb.AnonIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type[T]
  extends js.Function {
  var displayName: java.lang.String = js.native
  @JSName("is")
  var is_Original: TypeGuardPredicate[T] = js.native
  var meta: AnonIdentity = js.native
  var t: T = js.native
  def apply(value: T): T = js.native
  def is(x: js.Any): /* is T */ scala.Boolean = js.native
}

