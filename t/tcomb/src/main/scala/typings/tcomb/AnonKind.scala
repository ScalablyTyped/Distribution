package typings.tcomb

import typings.tcomb.mod.TypeGuardPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKind[T] extends js.Object {
  var identity: Boolean = js.native
  var kind: String = js.native
  var name: String = js.native
  @JSName("predicate")
  var predicate_Original: TypeGuardPredicate[T] = js.native
  def predicate(x: js.Any): /* is T */ Boolean = js.native
}

