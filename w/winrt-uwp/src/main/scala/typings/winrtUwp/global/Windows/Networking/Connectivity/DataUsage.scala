package typings.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data usage information returned by the ConnectionProfile.GetLocalUsage method. */
@JSGlobal("Windows.Networking.Connectivity.DataUsage")
@js.native
abstract class DataUsage ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.DataUsage {
  /** Gets a value indicating the number of bytes received by a connection over a specific period of time. */
  /* CompleteClass */
  override var bytesReceived: Double = js.native
  /** Gets a value indicating the number of bytes sent by the connection over a specific period of time. */
  /* CompleteClass */
  override var bytesSent: Double = js.native
}

