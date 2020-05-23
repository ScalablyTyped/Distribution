package typings.winrtUwp.global.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the values that describe an app's access to use the Remote Systems feature. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemAccessStatus")
@js.native
object RemoteSystemAccessStatus extends js.Object {
  /* 1 */ val allowed: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.allowed with Double = js.native
  /* 3 */ val deniedBySystem: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.deniedBySystem with Double = js.native
  /* 2 */ val deniedByUser: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.deniedByUser with Double = js.native
  /* 0 */ val unspecified: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus with Double
  ] = js.native
}

