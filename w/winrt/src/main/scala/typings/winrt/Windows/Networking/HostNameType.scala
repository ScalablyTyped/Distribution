package typings.winrt.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HostNameType extends js.Object

@JSGlobal("Windows.Networking.HostNameType")
@js.native
object HostNameType extends js.Object {
  @js.native
  sealed trait bluetooth extends HostNameType
  
  @js.native
  sealed trait domainName extends HostNameType
  
  @js.native
  sealed trait ipv4 extends HostNameType
  
  @js.native
  sealed trait ipv6 extends HostNameType
  
  /* 3 */ val bluetooth: typings.winrt.Windows.Networking.HostNameType.bluetooth with Double = js.native
  /* 0 */ val domainName: typings.winrt.Windows.Networking.HostNameType.domainName with Double = js.native
  /* 1 */ val ipv4: typings.winrt.Windows.Networking.HostNameType.ipv4 with Double = js.native
  /* 2 */ val ipv6: typings.winrt.Windows.Networking.HostNameType.ipv6 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostNameType with Double] = js.native
}

