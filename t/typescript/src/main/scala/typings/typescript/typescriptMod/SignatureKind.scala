package typings.typescript.typescriptMod

import org.scalablytyped.runtime.TopLevel
import typings.typescript.typescriptMod.SignatureKind.Call
import typings.typescript.typescriptMod.SignatureKind.Construct
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignatureKind with Double] = js.native
  /* 0 */ @js.native
  object Call extends TopLevel[Call with Double]
  
  /* 1 */ @js.native
  object Construct extends TopLevel[Construct with Double]
  
}

