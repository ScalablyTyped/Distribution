package typings.winrt.WindowsNs.NetworkingNs

import typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.IPInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.HostName")
@js.native
class HostName protected () extends IHostName {
  def this(hostName: String) = this()
  /* CompleteClass */
  override var canonicalName: String = js.native
  /* CompleteClass */
  override var displayName: String = js.native
  /* CompleteClass */
  override var iPInformation: IPInformation = js.native
  /* CompleteClass */
  override var rawName: String = js.native
  /* CompleteClass */
  override var `type`: HostNameType = js.native
  /* CompleteClass */
  override def isEqual(hostName: HostName): Boolean = js.native
}

/* static members */
@JSGlobal("Windows.Networking.HostName")
@js.native
object HostName extends js.Object {
  def compare(value1: String, value2: String): Double = js.native
}

