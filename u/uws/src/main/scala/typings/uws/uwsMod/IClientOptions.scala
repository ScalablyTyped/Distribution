package typings.uws.uwsMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientOptions extends js.Object {
  var agent: js.UndefOr[Agent] = js.undefined
  var ca: js.UndefOr[js.Array[_]] = js.undefined
  var cert: js.UndefOr[js.Any] = js.undefined
  var ciphers: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var passphrase: js.UndefOr[String] = js.undefined
  var pfx: js.UndefOr[js.Any] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var protocolVersion: js.UndefOr[js.Any] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
}

object IClientOptions {
  @scala.inline
  def apply(
    agent: Agent = null,
    ca: js.Array[_] = null,
    cert: js.Any = null,
    ciphers: String = null,
    headers: StringDictionary[String] = null,
    host: String = null,
    key: js.Any = null,
    origin: String = null,
    passphrase: String = null,
    pfx: js.Any = null,
    protocol: String = null,
    protocolVersion: js.Any = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
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

