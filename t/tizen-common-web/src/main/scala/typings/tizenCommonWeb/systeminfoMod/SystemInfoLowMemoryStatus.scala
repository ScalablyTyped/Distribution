package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoLowMemoryStatus extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoLowMemoryStatus")
@js.native
object SystemInfoLowMemoryStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoLowMemoryStatus with String] = js.native
  
  @js.native
  sealed trait NORMAL extends SystemInfoLowMemoryStatus
  /* "NORMAL" */ val NORMAL: typings.tizenCommonWeb.systeminfoMod.SystemInfoLowMemoryStatus.NORMAL with String = js.native
  
  @js.native
  sealed trait WARNING extends SystemInfoLowMemoryStatus
  /* "WARNING" */ val WARNING: typings.tizenCommonWeb.systeminfoMod.SystemInfoLowMemoryStatus.WARNING with String = js.native
}
