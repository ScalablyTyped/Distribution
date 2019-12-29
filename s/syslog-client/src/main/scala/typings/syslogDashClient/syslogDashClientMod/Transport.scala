package typings.syslogDashClient.syslogDashClientMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Transport with Double] = js.native
  /* 1 */ @js.native
  object Tcp extends TopLevel[Tcp with Double]
  
  /* 2 */ @js.native
  object Udp extends TopLevel[Udp with Double]
  
}

