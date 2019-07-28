package typings.winrtDashUwp.WindowsNs.SystemNs

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
  sealed trait uri extends LaunchQuerySupportType
  
  /** Activate by URI and return a result to the calling app. */
  @js.native
  sealed trait uriForResults extends LaunchQuerySupportType
  
  /* 0 */ val uri: typings.winrtDashUwp.WindowsNs.SystemNs.LaunchQuerySupportType.uri with Double = js.native
  /* 1 */ val uriForResults: typings.winrtDashUwp.WindowsNs.SystemNs.LaunchQuerySupportType.uriForResults with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LaunchQuerySupportType with Double] = js.native
}

