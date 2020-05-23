package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the asynchronous start options. This enumeration is a bitwise OR and is used by the StartAsync method. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDStartAsyncOptions")
@js.native
object NDStartAsyncOptions extends js.Object {
  /* 0 */ val mutualAuthentication: typings.winrtUwp.Windows.Media.Protection.PlayReady.NDStartAsyncOptions.mutualAuthentication with Double = js.native
  /* 1 */ val waitForLicenseDescriptor: typings.winrtUwp.Windows.Media.Protection.PlayReady.NDStartAsyncOptions.waitForLicenseDescriptor with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Media.Protection.PlayReady.NDStartAsyncOptions with Double
  ] = js.native
}

