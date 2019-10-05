package typings.winrtDashUwp.Windows.Devices.Custom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IOControlAccessMode extends js.Object

/** Identifies the access mode. */
@JSGlobal("Windows.Devices.Custom.IOControlAccessMode")
@js.native
object IOControlAccessMode extends js.Object {
  /** Any mode. */
  @js.native
  sealed trait any extends IOControlAccessMode
  
  /** Read mode. */
  @js.native
  sealed trait read extends IOControlAccessMode
  
  /** Read/write mode. */
  @js.native
  sealed trait readWrite extends IOControlAccessMode
  
  /** Write mode. */
  @js.native
  sealed trait write extends IOControlAccessMode
  
  /* 0 */ val any: typings.winrtDashUwp.Windows.Devices.Custom.IOControlAccessMode.any with Double = js.native
  /* 1 */ val read: typings.winrtDashUwp.Windows.Devices.Custom.IOControlAccessMode.read with Double = js.native
  /* 3 */ val readWrite: typings.winrtDashUwp.Windows.Devices.Custom.IOControlAccessMode.readWrite with Double = js.native
  /* 2 */ val write: typings.winrtDashUwp.Windows.Devices.Custom.IOControlAccessMode.write with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IOControlAccessMode with Double] = js.native
}

