package typings
package tcombLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IdentityKind[T] extends js.Object {
  var identity: scala.Boolean = js.native
  var kind: java.lang.String = js.native
  var name: java.lang.String = js.native
  @JSName("predicate")
  var predicate_Original: tcombLib.tcombMod.TypeGuardPredicate[T] = js.native
  def predicate(x: js.Any): /* is T */ scala.Boolean = js.native
}

