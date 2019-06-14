package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LaunchQuerySupportType extends js.Object

/** Specifies the type of activation to query for. */
@JSGlobal("Windows.System.LaunchQuerySupportType")
@js.native
object LaunchQuerySupportType extends js.Object {
  /** Activate by URI but do not return a result to the calling app. This is the default. */
  @js.native
  sealed trait uri
    extends winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportType
  
  /** Activate by URI and return a result to the calling app. */
  @js.native
  sealed trait uriForResults
    extends winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportType
  
  /* 0 */ val uri: uri with scala.Double = js.native
  /* 1 */ val uriForResults: uriForResults with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportType with scala.Double] = js.native
}

