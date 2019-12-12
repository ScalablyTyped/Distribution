package typings.winrtDashUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.Sockets.SocketSslErrorSeverity.fatal
import typings.winrtDashUwp.Windows.Networking.Sockets.SocketSslErrorSeverity.ignorable
import typings.winrtDashUwp.Windows.Networking.Sockets.SocketSslErrorSeverity.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketSslErrorSeverity extends js.Object

/** The category of error that occurs on an SSL connection. */
@JSGlobal("Windows.Networking.Sockets.SocketSslErrorSeverity")
@js.native
object SocketSslErrorSeverity extends js.Object {
  /** Fatal errors indicate the SSL server’s certificate cannot be validated. Reasons for encountering this severity level include: */
  @js.native
  sealed trait fatal extends SocketSslErrorSeverity
  
  /** Ignorable errors indicate that the SSL server’s certificate cannot be properly validated. */
  @js.native
  sealed trait ignorable extends SocketSslErrorSeverity
  
  /** No error occurs on the SSL connection. */
  @js.native
  sealed trait none extends SocketSslErrorSeverity
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketSslErrorSeverity with Double] = js.native
  /* 2 */ @js.native
  object fatal extends TopLevel[fatal with Double]
  
  /* 1 */ @js.native
  object ignorable extends TopLevel[ignorable with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

