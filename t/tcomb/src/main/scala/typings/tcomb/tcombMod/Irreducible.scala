package typings.tcomb.tcombMod

import typings.tcomb.Anon_IdentityKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// irreducible
//
@js.native
trait Irreducible[T] extends Type[T] {
  @JSName("meta")
  var meta_Irreducible: Anon_IdentityKind[T] = js.native
}

@JSImport("tcomb", "irreducible")
@js.native
object irreducible extends js.Object {
  def apply[T](name: java.lang.String, predicate: Predicate[_]): Irreducible[T] = js.native
}

