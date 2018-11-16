package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuildStatus extends js.Object

/* cl_build_status */
@JSGlobal("WEBCL.BuildStatus")
@js.native
object BuildStatus extends js.Object {
  @js.native
  sealed trait BUILD_ERROR
    extends webclLib.WEBCLNs.BuildStatus
  
  @js.native
  sealed trait BUILD_IN_PROGRESS
    extends webclLib.WEBCLNs.BuildStatus
  
  @js.native
  sealed trait BUILD_NONE
    extends webclLib.WEBCLNs.BuildStatus
  
  @js.native
  sealed trait BUILD_SUCCESS
    extends webclLib.WEBCLNs.BuildStatus
  
  /* -2 */ val BUILD_ERROR: BUILD_ERROR with scala.Double = js.native
  /* -3 */ val BUILD_IN_PROGRESS: BUILD_IN_PROGRESS with scala.Double = js.native
  /* -1 */ val BUILD_NONE: BUILD_NONE with scala.Double = js.native
  /* 0 */ val BUILD_SUCCESS: BUILD_SUCCESS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.BuildStatus with scala.Double] = js.native
}

