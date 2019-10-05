package typings.winrtDashUwp.Windows.Networking.Sockets

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
  
  /* 2 */ val fatal: typings.winrtDashUwp.Windows.Networking.Sockets.SocketSslErrorSeverity.fatal with Double = js.native
  /* 1 */ val ignorable: typings.winrtDashUwp.Windows.Networking.Sockets.SocketSslErrorSeverity.ignorable with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Networking.Sockets.SocketSslErrorSeverity.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketSslErrorSeverity with Double] = js.native
}

