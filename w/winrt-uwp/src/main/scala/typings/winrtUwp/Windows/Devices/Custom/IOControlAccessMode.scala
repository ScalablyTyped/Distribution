package typings.winrtUwp.Windows.Devices.Custom

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
  
}

