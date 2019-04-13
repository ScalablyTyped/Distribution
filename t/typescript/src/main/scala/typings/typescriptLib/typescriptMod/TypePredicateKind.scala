package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypePredicateKind extends js.Object

@JSImport("typescript", "TypePredicateKind")
@js.native
object TypePredicateKind extends js.Object {
  @js.native
  sealed trait Identifier
    extends typescriptLib.typescriptMod.TypePredicateKind
  
  @js.native
  sealed trait This
    extends typescriptLib.typescriptMod.TypePredicateKind
  
  /* 1 */ val Identifier: Identifier with scala.Double = js.native
  /* 0 */ val This: This with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.TypePredicateKind with scala.Double] = js.native
}

