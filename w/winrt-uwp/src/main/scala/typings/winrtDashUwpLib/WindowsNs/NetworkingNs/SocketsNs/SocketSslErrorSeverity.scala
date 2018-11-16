package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

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
  sealed trait fatal
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketSslErrorSeverity
  
  /** Ignorable errors indicate that the SSL server’s certificate cannot be properly validated. */
  @js.native
  sealed trait ignorable
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketSslErrorSeverity
  
  /** No error occurs on the SSL connection. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketSslErrorSeverity
  
  val fatal: fatal with java.lang.String = js.native
  val ignorable: ignorable with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketSslErrorSeverity with java.lang.String
  ] = js.native
}

