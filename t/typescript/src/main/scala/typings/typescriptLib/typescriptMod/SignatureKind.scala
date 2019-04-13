package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignatureKind extends js.Object

@JSImport("typescript", "SignatureKind")
@js.native
object SignatureKind extends js.Object {
  @js.native
  sealed trait Call
    extends typescriptLib.typescriptMod.SignatureKind
  
  @js.native
  sealed trait Construct
    extends typescriptLib.typescriptMod.SignatureKind
  
  /* 0 */ val Call: Call with scala.Double = js.native
  /* 1 */ val Construct: Construct with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.SignatureKind with scala.Double] = js.native
}

