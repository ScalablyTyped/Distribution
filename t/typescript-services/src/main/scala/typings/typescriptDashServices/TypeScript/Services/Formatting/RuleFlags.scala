package typings.typescriptDashServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RuleFlags extends js.Object

@JSGlobal("TypeScript.Services.Formatting.RuleFlags")
@js.native
object RuleFlags extends js.Object {
  @js.native
  sealed trait CanDeleteNewLines extends RuleFlags
  
  @js.native
  sealed trait None extends RuleFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleFlags with Double] = js.native
  /* 1 */ @js.native
  object CanDeleteNewLines extends TopLevel[CanDeleteNewLines with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

