package typings.ws.wsMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var agent: js.UndefOr[Agent] = js.undefined
  var ca: js.UndefOr[CertMeta] = js.undefined
  var cert: js.UndefOr[CertMeta] = js.undefined
  var checkServerIdentity: js.UndefOr[js.Function2[/* servername */ String, /* cert */ CertMeta, Boolean]] = js.undefined
  var ciphers: js.UndefOr[String] = js.undefined
  var family: js.UndefOr[Double] = js.undefined
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  var handshakeTimeout: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[CertMeta] = js.undefined
  var localAddress: js.UndefOr[String] = js.undefined
  var maxPayload: js.UndefOr[Double] = js.undefined
  var maxRedirects: js.UndefOr[Double] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var passphrase: js.UndefOr[String] = js.undefined
  var perMessageDeflate: js.UndefOr[Boolean | PerMessageDeflateOptions] = js.undefined
  var pfx: js.UndefOr[String | Buffer] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var protocolVersion: js.UndefOr[Double] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    agent: Agent = null,
    ca: CertMeta = null,
    cert: CertMeta = null,
    checkServerIdentity: (/* servername */ String, /* cert */ CertMeta) => Boolean = null,
    ciphers: String = null,
    family: Int | Double = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    handshakeTimeout: Int | Double = null,
    headers: StringDictionary[String] = null,
    host: String = null,
    key: CertMeta = null,
    localAddress: String = null,
    maxPayload: Int | Double = null,
    maxRedirects: Int | Double = null,
    origin: String = null,
    passphrase: String = null,
    perMessageDeflate: Boolean | PerMessageDeflateOptions = null,
    pfx: String | Buffer = null,
    protocol: String = null,
    protocolVersion: Int | Double = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2(checkServerIdentity))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.asInstanceOf[js.Any])
    if (handshakeTimeout != null) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (maxPayload != null) __obj.updateDynamic("maxPayload")(maxPayload.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (perMessageDeflate != null) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

