package typings
package uwsLib.uwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientOptions extends js.Object {
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  var ca: js.UndefOr[js.Array[_]] = js.undefined
  var cert: js.UndefOr[js.Any] = js.undefined
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var pfx: js.UndefOr[js.Any] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var protocolVersion: js.UndefOr[js.Any] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
}

object IClientOptions {
  @scala.inline
  def apply(
    agent: nodeLib.httpMod.Agent = null,
    ca: js.Array[_] = null,
    cert: js.Any = null,
    ciphers: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    host: java.lang.String = null,
    key: js.Any = null,
    origin: java.lang.String = null,
    passphrase: java.lang.String = null,
    pfx: js.Any = null,
    protocol: java.lang.String = null,
    protocolVersion: js.Any = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  ): IClientOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    __obj.asInstanceOf[IClientOptions]
  }
}

