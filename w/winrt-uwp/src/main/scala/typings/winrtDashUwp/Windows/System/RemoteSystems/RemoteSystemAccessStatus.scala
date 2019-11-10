package typings.winrtDashUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RemoteSystemAccessStatus extends js.Object

/** Contains the values that describe an app's access to use the Remote Systems feature. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemAccessStatus")
@js.native
object RemoteSystemAccessStatus extends js.Object {
  /** Access is allowed */
  @js.native
  sealed trait allowed extends RemoteSystemAccessStatus
  
  /** Access is denied to this app by the System; the app hasn't requested the proper capability. */
  @js.native
  sealed trait deniedBySystem extends RemoteSystemAccessStatus
  
  /** Access has been denied to this particular app by this particular user. */
  @js.native
  sealed trait deniedByUser extends RemoteSystemAccessStatus
  
  /** Access is denied for an unknown reason. */
  @js.native
  sealed trait unspecified extends RemoteSystemAccessStatus
  
  /* 1 */ val allowed: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.allowed with Double = js.native
  /* 3 */ val deniedBySystem: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.deniedBySystem with Double = js.native
  /* 2 */ val deniedByUser: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.deniedByUser with Double = js.native
  /* 0 */ val unspecified: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RemoteSystemAccessStatus with Double] = js.native
}

