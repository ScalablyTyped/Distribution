package typings.ws.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureContextOptions
import typings.node.tlsMod.SecureVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends SecureContextOptions {
  var agent: js.UndefOr[Agent] = js.undefined
  var checkServerIdentity: js.UndefOr[js.Function2[/* servername */ String, /* cert */ CertMeta, Boolean]] = js.undefined
  var family: js.UndefOr[Double] = js.undefined
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  var handshakeTimeout: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var localAddress: js.UndefOr[String] = js.undefined
  var maxPayload: js.UndefOr[Double] = js.undefined
  var maxRedirects: js.UndefOr[Double] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var perMessageDeflate: js.UndefOr[Boolean | PerMessageDeflateOptions] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var protocolVersion: js.UndefOr[Double] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    agent: Agent = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    checkServerIdentity: (/* servername */ String, /* cert */ CertMeta) => Boolean = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    family: js.UndefOr[Double] = js.undefined,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    handshakeTimeout: js.UndefOr[Double] = js.undefined,
    headers: StringDictionary[String] = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    key: String | Buffer | (js.Array[Buffer | KeyObject]) = null,
    localAddress: String = null,
    maxPayload: js.UndefOr[Double] = js.undefined,
    maxRedirects: js.UndefOr[Double] = js.undefined,
    maxVersion: SecureVersion = null,
    minVersion: SecureVersion = null,
    origin: String = null,
    passphrase: String = null,
    perMessageDeflate: Boolean | PerMessageDeflateOptions = null,
    pfx: String | Buffer | (js.Array[String | Buffer | PxfObject]) = null,
    privateKeyEngine: String = null,
    privateKeyIdentifier: String = null,
    protocol: String = null,
    protocolVersion: js.UndefOr[Double] = js.undefined,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    secureOptions: js.UndefOr[Double] = js.undefined,
    secureProtocol: String = null,
    sessionIdContext: String = null,
    sigalgs: String = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2(checkServerIdentity))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.get.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(handshakeTimeout)) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPayload)) __obj.updateDynamic("maxPayload")(maxPayload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirects)) __obj.updateDynamic("maxRedirects")(maxRedirects.get.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (perMessageDeflate != null) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (privateKeyEngine != null) __obj.updateDynamic("privateKeyEngine")(privateKeyEngine.asInstanceOf[js.Any])
    if (privateKeyIdentifier != null) __obj.updateDynamic("privateKeyIdentifier")(privateKeyIdentifier.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(protocolVersion)) __obj.updateDynamic("protocolVersion")(protocolVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secureOptions)) __obj.updateDynamic("secureOptions")(secureOptions.get.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (sigalgs != null) __obj.updateDynamic("sigalgs")(sigalgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

