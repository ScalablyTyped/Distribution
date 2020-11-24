package typings.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tcomb", "refinement")
@js.native
object refinement extends js.Object {
  
  def apply[T](`type`: Constructor[T], predicate: Predicate[T]): Refinement_[T] = js.native
  def apply[T](`type`: Constructor[T], predicate: Predicate[T], name: java.lang.String): Refinement_[T] = js.native
}
