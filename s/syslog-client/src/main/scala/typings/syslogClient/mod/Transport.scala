package typings.syslogClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Transport extends js.Object
@JSImport("syslog-client", "Transport")
@js.native
object Transport extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Transport with Double] = js.native
  
  @js.native
  sealed trait Tcp extends Transport
  /* 1 */ @js.native
  object Tcp extends TopLevel[Tcp with Double]
  
  @js.native
  sealed trait Udp extends Transport
  /* 2 */ @js.native
  object Udp extends TopLevel[Udp with Double]
}
