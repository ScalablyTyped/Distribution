package typings.tizenTvWebapis.billingMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TVServerType extends js.Object
@JSImport("tizen-tv-webapis/billing", "TVServerType")
@js.native
object TVServerType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TVServerType with String] = js.native
  
  @js.native
  sealed trait DEV extends TVServerType
  /* "DEV" */ @js.native
  object DEV extends TopLevel[DEV with String]
  
  @js.native
  sealed trait PRD extends TVServerType
  /* "PRD" */ @js.native
  object PRD extends TopLevel[PRD with String]
}
