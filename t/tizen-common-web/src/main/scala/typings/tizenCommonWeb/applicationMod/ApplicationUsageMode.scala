package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationUsageMode extends js.Object
@JSImport("tizen-common-web/application", "ApplicationUsageMode")
@js.native
object ApplicationUsageMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApplicationUsageMode with String] = js.native
  
  @js.native
  sealed trait FREQUENTLY extends ApplicationUsageMode
  /* "FREQUENTLY" */ @js.native
  object FREQUENTLY extends TopLevel[FREQUENTLY with String]
  
  @js.native
  sealed trait RECENTLY extends ApplicationUsageMode
  /* "RECENTLY" */ @js.native
  object RECENTLY extends TopLevel[RECENTLY with String]
}
