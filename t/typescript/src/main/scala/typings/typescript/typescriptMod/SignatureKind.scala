package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignatureKind extends js.Object

@JSImport("typescript", "SignatureKind")
@js.native
object SignatureKind extends js.Object {
  @js.native
  sealed trait Call extends SignatureKind
  
  @js.native
  sealed trait Construct extends SignatureKind
  
  /* 0 */ val Call: typings.typescript.typescriptMod.SignatureKind.Call with Double = js.native
  /* 1 */ val Construct: typings.typescript.typescriptMod.SignatureKind.Construct with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignatureKind with Double] = js.native
}

