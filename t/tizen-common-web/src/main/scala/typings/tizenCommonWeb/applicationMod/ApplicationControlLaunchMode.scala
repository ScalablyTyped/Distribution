package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationControlLaunchMode extends StObject
@JSImport("tizen-common-web/application", "ApplicationControlLaunchMode")
@js.native
object ApplicationControlLaunchMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApplicationControlLaunchMode & String] = js.native
  
  @js.native
  sealed trait GROUP
    extends StObject
       with ApplicationControlLaunchMode
  /* "GROUP" */ val GROUP: typings.tizenCommonWeb.applicationMod.ApplicationControlLaunchMode.GROUP & String = js.native
  
  @js.native
  sealed trait SINGLE
    extends StObject
       with ApplicationControlLaunchMode
  /* "SINGLE" */ val SINGLE: typings.tizenCommonWeb.applicationMod.ApplicationControlLaunchMode.SINGLE & String = js.native
}
