package typings.winrt.Windows.Networking

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostNameType with Double] = js.native
  /* 3 */ @js.native
  object bluetooth extends TopLevel[bluetooth with Double]
  
  /* 0 */ @js.native
  object domainName extends TopLevel[domainName with Double]
  
  /* 1 */ @js.native
  object ipv4 extends TopLevel[ipv4 with Double]
  
  /* 2 */ @js.native
  object ipv6 extends TopLevel[ipv6 with Double]
  
}

