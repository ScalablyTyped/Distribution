package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationUsageMode extends StObject
@JSImport("tizen-common-web/application", "ApplicationUsageMode")
@js.native
object ApplicationUsageMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApplicationUsageMode & String] = js.native
  
  @js.native
  sealed trait FREQUENTLY
    extends StObject
       with ApplicationUsageMode
  /* "FREQUENTLY" */ val FREQUENTLY: typings.tizenCommonWeb.applicationMod.ApplicationUsageMode.FREQUENTLY & String = js.native
  
  @js.native
  sealed trait RECENTLY
    extends StObject
       with ApplicationUsageMode
  /* "RECENTLY" */ val RECENTLY: typings.tizenCommonWeb.applicationMod.ApplicationUsageMode.RECENTLY & String = js.native
}
