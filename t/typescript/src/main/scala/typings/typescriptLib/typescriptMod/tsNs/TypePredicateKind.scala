package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypePredicateKind extends js.Object

@JSImport("typescript/ts", "TypePredicateKind")
@js.native
object TypePredicateKind extends js.Object {
  @js.native
  sealed trait Identifier
    extends typescriptLib.typescriptMod.tsNs.TypePredicateKind
  
  @js.native
  sealed trait This
    extends typescriptLib.typescriptMod.tsNs.TypePredicateKind
  
}

