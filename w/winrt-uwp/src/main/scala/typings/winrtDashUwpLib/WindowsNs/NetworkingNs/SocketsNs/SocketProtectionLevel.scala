package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketProtectionLevel extends js.Object

/** Specifies the level of encryption to use on a StreamSocket object. */
@JSGlobal("Windows.Networking.Sockets.SocketProtectionLevel")
@js.native
object SocketProtectionLevel extends js.Object {
  /** A Bluetooth socket that prefers that encryption be used, but allows a NULL cipher (no encryption) based on the configuration of the target server. */
  @js.native
  sealed trait bluetoothEncryptionAllowNullAuthentication
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel
  
  /** A Bluetooth socket that must use encryption. This value requires encryption and never allows a NULL cipher. */
  @js.native
  sealed trait bluetoothEncryptionWithAuthentication
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel
  
  /** A plain socket with no encryption. */
  @js.native
  sealed trait plainSocket
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel
  
  /** A TCP socket that must use the Secure Sockets Layer (SSL) for encryption. This value requires encryption and never allows a NULL cipher (no encryption). */
  @js.native
  sealed trait ssl
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel
  
  /** A TCP socket that must use SSL for encryption. This value supports the SSL 3.0 protocol and all encryption ciphers installed on the system except the NULL cipher. This value allows RC4 and other weak ciphers which are considered insecure. For domain-joined machines, an administrator can configure additional restrictions on which ciphers are allowed. */
  @js.native
  sealed trait ssl3AllowWeakEncryption
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel
  
  /** A TCP socket that prefers to use SSL for encryption. This value prefers that full encryption be used, but allows a NULL cipher (no encryption) based on the server configuration. */
  @js.native
  sealed trait sslAllowNullEncryption
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel
  
  /** A TCP socket that must use SSL for encryption. This value supports the TLS 1.0 protocol and all encryption ciphers installed on the system except RC4, other weak ciphers, and the NULL cipher. For domain-joined machines, an administrator can configure additional restrictions on which ciphers are allowed. */
  @js.native
  sealed trait tls10
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel
  
  /** A TCP socket that must use SSL for encryption. This value supports the TLS 1.1 and TLS 1.0 protocols and all encryption ciphers installed on the system except RC4, other weak ciphers, and the NULL cipher. For domain-joined machines, an administrator can configure additional restrictions on which ciphers are allowed. */
  @js.native
  sealed trait tls11
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel
  
  /** A TCP socket that must use SSL for encryption. This value supports the TLS 1.2, TLS 1.1 and TLS 1.0 protocols and all encryption ciphers installed on the system except RC4, other weak ciphers, and the NULL cipher. For domain-joined machines, an administrator can configure additional restrictions on which ciphers are allowed. */
  @js.native
  sealed trait tls12
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel
  
  /* 3 */ val bluetoothEncryptionAllowNullAuthentication: bluetoothEncryptionAllowNullAuthentication with scala.Double = js.native
  /* 4 */ val bluetoothEncryptionWithAuthentication: bluetoothEncryptionWithAuthentication with scala.Double = js.native
  /* 0 */ val plainSocket: plainSocket with scala.Double = js.native
  /* 1 */ val ssl: ssl with scala.Double = js.native
  /* 5 */ val ssl3AllowWeakEncryption: ssl3AllowWeakEncryption with scala.Double = js.native
  /* 2 */ val sslAllowNullEncryption: sslAllowNullEncryption with scala.Double = js.native
  /* 6 */ val tls10: tls10 with scala.Double = js.native
  /* 7 */ val tls11: tls11 with scala.Double = js.native
  /* 8 */ val tls12: tls12 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel with scala.Double
  ] = js.native
}

