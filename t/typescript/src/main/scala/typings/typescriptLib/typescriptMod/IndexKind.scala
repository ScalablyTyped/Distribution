package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexKind extends js.Object

@JSImport("typescript", "IndexKind")
@js.native
object IndexKind extends js.Object {
  @js.native
  sealed trait Number
    extends typescriptLib.typescriptMod.IndexKind
  
  @js.native
  sealed trait String
    extends typescriptLib.typescriptMod.IndexKind
  
  /* 1 */ val Number: Number with scala.Double = js.native
  /* 0 */ val String: String with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.IndexKind with scala.Double] = js.native
}

