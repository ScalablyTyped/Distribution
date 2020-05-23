package typings.winrtUwp.global.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the result of activating an application. */
@JSGlobal("Windows.System.LaunchUriStatus")
@js.native
object LaunchUriStatus extends js.Object {
  /* 1 */ val appUnavailable: typings.winrtUwp.Windows.System.LaunchUriStatus.appUnavailable with Double = js.native
  /* 2 */ val protocolUnavailable: typings.winrtUwp.Windows.System.LaunchUriStatus.protocolUnavailable with Double = js.native
  /* 0 */ val success: typings.winrtUwp.Windows.System.LaunchUriStatus.success with Double = js.native
  /* 3 */ val unknown: typings.winrtUwp.Windows.System.LaunchUriStatus.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.LaunchUriStatus with Double] = js.native
}

