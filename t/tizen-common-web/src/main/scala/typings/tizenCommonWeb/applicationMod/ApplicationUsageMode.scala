package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationUsageMode extends StObject
@JSImport("tizen-common-web/application", "ApplicationUsageMode")
@js.native
object ApplicationUsageMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApplicationUsageMode with String] = js.native
  
  @js.native
  sealed trait FREQUENTLY extends ApplicationUsageMode
  /* "FREQUENTLY" */ val FREQUENTLY: typings.tizenCommonWeb.applicationMod.ApplicationUsageMode.FREQUENTLY with String = js.native
  
  @js.native
  sealed trait RECENTLY extends ApplicationUsageMode
  /* "RECENTLY" */ val RECENTLY: typings.tizenCommonWeb.applicationMod.ApplicationUsageMode.RECENTLY with String = js.native
}
