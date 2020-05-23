package typings.winrt.global.Windows.Networking

import typings.winrt.Windows.Networking.Connectivity.IPInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.HostName")
@js.native
class HostName protected ()
  extends typings.winrt.Windows.Networking.HostName {
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
  override var `type`: typings.winrt.Windows.Networking.HostNameType = js.native
  /* CompleteClass */
  override def isEqual(hostName: typings.winrt.Windows.Networking.HostName): Boolean = js.native
}

/* static members */
@JSGlobal("Windows.Networking.HostName")
@js.native
object HostName extends js.Object {
  def compare(value1: String, value2: String): Double = js.native
}

