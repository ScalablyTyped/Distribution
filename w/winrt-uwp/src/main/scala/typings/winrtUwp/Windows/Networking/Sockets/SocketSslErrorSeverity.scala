package typings.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocketSslErrorSeverity extends StObject
/** The category of error that occurs on an SSL connection. */
@JSGlobal("Windows.Networking.Sockets.SocketSslErrorSeverity")
@js.native
object SocketSslErrorSeverity extends StObject {
  
  /** Fatal errors indicate the SSL server’s certificate cannot be validated. Reasons for encountering this severity level include: */
  @js.native
  sealed trait fatal
    extends StObject
       with SocketSslErrorSeverity
  
  /** Ignorable errors indicate that the SSL server’s certificate cannot be properly validated. */
  @js.native
  sealed trait ignorable
    extends StObject
       with SocketSslErrorSeverity
  
  /** No error occurs on the SSL connection. */
  @js.native
  sealed trait none
    extends StObject
       with SocketSslErrorSeverity
}
