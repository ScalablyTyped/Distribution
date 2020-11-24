package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SignatureKind extends js.Object
@JSImport("typescript", "SignatureKind")
@js.native
object SignatureKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignatureKind with Double] = js.native
  
  @js.native
  sealed trait Call extends SignatureKind
  /* 0 */ @js.native
  object Call extends TopLevel[Call with Double]
  
  @js.native
  sealed trait Construct extends SignatureKind
  /* 1 */ @js.native
  object Construct extends TopLevel[Construct with Double]
}
