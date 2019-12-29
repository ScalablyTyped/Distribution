package typings.typescriptDashServices.TypeScript

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("TypeScript.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait Max31BitInteger extends Constants
  
  @js.native
  sealed trait Min31BitInteger extends Constants
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Constants with Double] = js.native
  /* 1073741823 */ @js.native
  object Max31BitInteger extends TopLevel[Max31BitInteger with Double]
  
  /* -1073741824 */ @js.native
  object Min31BitInteger extends TopLevel[Min31BitInteger with Double]
  
}

