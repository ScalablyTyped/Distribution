package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationUsageMode extends js.Object

@JSImport("tizen-common-web/application", "ApplicationUsageMode")
@js.native
object ApplicationUsageMode extends js.Object {
  @js.native
  sealed trait FREQUENTLY extends ApplicationUsageMode
  
  @js.native
  sealed trait RECENTLY extends ApplicationUsageMode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApplicationUsageMode with String] = js.native
  /* "FREQUENTLY" */ @js.native
  object FREQUENTLY extends TopLevel[FREQUENTLY with String]
  
  /* "RECENTLY" */ @js.native
  object RECENTLY extends TopLevel[RECENTLY with String]
  
}

