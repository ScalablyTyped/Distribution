package typings
package winrtLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.HostName")
@js.native
class HostName protected () extends IHostName {
  def this(hostName: java.lang.String) = this()
  /* CompleteClass */
  override var canonicalName: java.lang.String = js.native
  /* CompleteClass */
  override var displayName: java.lang.String = js.native
  /* CompleteClass */
  override var iPInformation: winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.IPInformation = js.native
  /* CompleteClass */
  override var rawName: java.lang.String = js.native
  /* CompleteClass */
  override var `type`: HostNameType = js.native
  /* CompleteClass */
  override def isEqual(hostName: HostName): scala.Boolean = js.native
}

/* static members */
@JSGlobal("Windows.Networking.HostName")
@js.native
object HostName extends js.Object {
  def compare(value1: java.lang.String, value2: java.lang.String): scala.Double = js.native
}

