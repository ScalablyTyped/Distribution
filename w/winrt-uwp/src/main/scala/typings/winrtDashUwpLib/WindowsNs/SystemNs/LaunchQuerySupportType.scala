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
  
  val uri: uri with java.lang.String = js.native
  val uriForResults: uriForResults with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportType with java.lang.String] = js.native
}

