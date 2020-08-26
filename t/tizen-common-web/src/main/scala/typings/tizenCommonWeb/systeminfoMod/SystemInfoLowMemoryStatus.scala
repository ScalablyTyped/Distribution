package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemInfoLowMemoryStatus extends js.Object

@JSImport("tizen-common-web/systeminfo", "SystemInfoLowMemoryStatus")
@js.native
object SystemInfoLowMemoryStatus extends js.Object {
  @js.native
  sealed trait NORMAL extends SystemInfoLowMemoryStatus
  
  @js.native
  sealed trait WARNING extends SystemInfoLowMemoryStatus
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoLowMemoryStatus with String] = js.native
  /* "NORMAL" */ @js.native
  object NORMAL extends TopLevel[NORMAL with String]
  
  /* "WARNING" */ @js.native
  object WARNING extends TopLevel[WARNING with String]
  
}

