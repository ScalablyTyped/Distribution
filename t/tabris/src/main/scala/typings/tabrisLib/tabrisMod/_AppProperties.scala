package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// App
trait _AppProperties extends _NativeObjectProperties {
  /**
    * Enables certificate pinning for HTTP requests. When pinned certificates are defined for a host,
    * connections to this host will only be permitted if the server provides a matching certificate.
    * Connections to hosts that are not in the list are not affected.
    * Certificate pinning affects the following components: XHR/fetch, WebSockets, image loading and app
    * patching. It does *not* affect WebViews.
    * The list of pinned certificates has to be in the form of `[{host: <string>, hash: <string>,
    * algorithm: <RSA2048|RSA4096|ECDSA256>}, ..]`.
    * - The `host` attribute denotes the host name (including subdomain) of the host to be pinned
    * ([wildcards allowed](https://en.wikipedia.org/wiki/Wildcard_DNS_record)).
    * - The `hash` attribute is the base64 encoded sha256 fingerprint of the _subjectPublicKeyInfo_,
    * prefixed with `sha256/`.
    * - The `algorithm` attribute denotes the public key algorithm of the SSL certificate and can have the
    * values `RSA2048`, `RSA4096` or `ECDSA256`. This attribute is only required on iOS.
    * Example: `[{host: 'freegeoip.net', hash: 'sha256/+SVYjThgePRQxQ0e8bWTQDRtPYR/xBRufqyMoeaWteo=',
    * algorithm: 'ECDSA256'}]`
    * For further details see https://www.owasp.org/index.php/Certificate_and_Public_Key_Pinning.
    */
  var pinnedCertificates: js.Array[_]
  /**
    * Adds a set of certificates to validated ssl connections against. The certificates are applied in
    * addition to the system wide default certificates.
    * The `ArrayBuffer` entries of the `trustedCertificates` array consist of the bytes of the certificate
    * files. On Android the certificate file has to be a _*.pem_ (Privacy Enhanced Mail) file whereas on
    * iOS  it has to be _*.der_ (Distinguished Encoding Rules) file.
    */
  var trustedCertificates: js.Array[_]
}

object _AppProperties {
  @scala.inline
  def apply(pinnedCertificates: js.Array[_], trustedCertificates: js.Array[_]): _AppProperties = {
    val __obj = js.Dynamic.literal(pinnedCertificates = pinnedCertificates, trustedCertificates = trustedCertificates)
  
    __obj.asInstanceOf[_AppProperties]
  }
}

