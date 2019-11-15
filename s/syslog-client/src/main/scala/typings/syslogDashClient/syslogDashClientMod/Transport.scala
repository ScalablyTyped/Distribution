package typings.syslogDashClient.syslogDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Transport extends js.Object

@JSImport("syslog-client", "Transport")
@js.native
object Transport extends js.Object {
  @js.native
  sealed trait Tcp extends Transport
  
  @js.native
  sealed trait Udp extends Transport
  
  /* 1 */ val Tcp: typings.syslogDashClient.syslogDashClientMod.Transport.Tcp with Double = js.native
  /* 2 */ val Udp: typings.syslogDashClient.syslogDashClientMod.Transport.Udp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Transport with Double] = js.native
}

