package typings.winrtDashUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RemoteSystemAccessStatus with Double] = js.native
  /* 1 */ @js.native
  object allowed extends TopLevel[allowed with Double]
  
  /* 3 */ @js.native
  object deniedBySystem extends TopLevel[deniedBySystem with Double]
  
  /* 2 */ @js.native
  object deniedByUser extends TopLevel[deniedByUser with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

