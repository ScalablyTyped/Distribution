package typings
package wsLib.wsMod.WebSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  var ca: js.UndefOr[CertMeta] = js.undefined
  var cert: js.UndefOr[CertMeta] = js.undefined
  var checkServerIdentity: js.UndefOr[
    js.Function2[/* servername */ java.lang.String, /* cert */ CertMeta, scala.Boolean]
  ] = js.undefined
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  var family: js.UndefOr[scala.Double] = js.undefined
  var handshakeTimeout: js.UndefOr[scala.Double] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[CertMeta] = js.undefined
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var maxPayload: js.UndefOr[scala.Double] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var perMessageDeflate: js.UndefOr[scala.Boolean | PerMessageDeflateOptions] = js.undefined
  var pfx: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var protocolVersion: js.UndefOr[scala.Double] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    agent: nodeLib.httpMod.Agent = null,
    ca: CertMeta = null,
    cert: CertMeta = null,
    checkServerIdentity: js.Function2[/* servername */ java.lang.String, /* cert */ CertMeta, scala.Boolean] = null,
    ciphers: java.lang.String = null,
    family: scala.Int | scala.Double = null,
    handshakeTimeout: scala.Int | scala.Double = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    host: java.lang.String = null,
    key: CertMeta = null,
    localAddress: java.lang.String = null,
    maxPayload: scala.Int | scala.Double = null,
    origin: java.lang.String = null,
    passphrase: java.lang.String = null,
    perMessageDeflate: scala.Boolean | PerMessageDeflateOptions = null,
    pfx: java.lang.String | nodeLib.Buffer = null,
    protocol: java.lang.String = null,
    protocolVersion: scala.Int | scala.Double = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(checkServerIdentity)
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (handshakeTimeout != null) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (maxPayload != null) __obj.updateDynamic("maxPayload")(maxPayload.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (perMessageDeflate != null) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    __obj.asInstanceOf[ClientOptions]
  }
}

