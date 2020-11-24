package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
