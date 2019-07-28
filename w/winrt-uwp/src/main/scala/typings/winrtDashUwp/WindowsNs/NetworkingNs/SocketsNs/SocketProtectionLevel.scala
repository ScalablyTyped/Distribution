package typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs

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
  sealed trait bluetoothEncryptionAllowNullAuthentication extends SocketProtectionLevel
  
  /** A Bluetooth socket that must use encryption. This value requires encryption and never allows a NULL cipher. */
  @js.native
  sealed trait bluetoothEncryptionWithAuthentication extends SocketProtectionLevel
  
  /** A plain socket with no encryption. */
  @js.native
  sealed trait plainSocket extends SocketProtectionLevel
  
  /** A TCP socket that must use the Secure Sockets Layer (SSL) for encryption. This value requires encryption and never allows a NULL cipher (no encryption). */
  @js.native
  sealed trait ssl extends SocketProtectionLevel
  
  /** A TCP socket that must use SSL for encryption. This value supports the SSL 3.0 protocol and all encryption ciphers installed on the system except the NULL cipher. This value allows RC4 and other weak ciphers which are considered insecure. For domain-joined machines, an administrator can configure additional restrictions on which ciphers are allowed. */
  @js.native
  sealed trait ssl3AllowWeakEncryption extends SocketProtectionLevel
  
  /** A TCP socket that prefers to use SSL for encryption. This value prefers that full encryption be used, but allows a NULL cipher (no encryption) based on the server configuration. */
  @js.native
  sealed trait sslAllowNullEncryption extends SocketProtectionLevel
  
  /** A TCP socket that must use SSL for encryption. This value supports the TLS 1.0 protocol and all encryption ciphers installed on the system except RC4, other weak ciphers, and the NULL cipher. For domain-joined machines, an administrator can configure additional restrictions on which ciphers are allowed. */
  @js.native
  sealed trait tls10 extends SocketProtectionLevel
  
  /** A TCP socket that must use SSL for encryption. This value supports the TLS 1.1 and TLS 1.0 protocols and all encryption ciphers installed on the system except RC4, other weak ciphers, and the NULL cipher. For domain-joined machines, an administrator can configure additional restrictions on which ciphers are allowed. */
  @js.native
  sealed trait tls11 extends SocketProtectionLevel
  
  /** A TCP socket that must use SSL for encryption. This value supports the TLS 1.2, TLS 1.1 and TLS 1.0 protocols and all encryption ciphers installed on the system except RC4, other weak ciphers, and the NULL cipher. For domain-joined machines, an administrator can configure additional restrictions on which ciphers are allowed. */
  @js.native
  sealed trait tls12 extends SocketProtectionLevel
  
  /* 3 */ val bluetoothEncryptionAllowNullAuthentication: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel.bluetoothEncryptionAllowNullAuthentication with Double = js.native
  /* 4 */ val bluetoothEncryptionWithAuthentication: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel.bluetoothEncryptionWithAuthentication with Double = js.native
  /* 0 */ val plainSocket: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel.plainSocket with Double = js.native
  /* 1 */ val ssl: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel.ssl with Double = js.native
  /* 5 */ val ssl3AllowWeakEncryption: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel.ssl3AllowWeakEncryption with Double = js.native
  /* 2 */ val sslAllowNullEncryption: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel.sslAllowNullEncryption with Double = js.native
  /* 6 */ val tls10: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel.tls10 with Double = js.native
  /* 7 */ val tls11: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel.tls11 with Double = js.native
  /* 8 */ val tls12: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel.tls12 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketProtectionLevel with Double] = js.native
}

