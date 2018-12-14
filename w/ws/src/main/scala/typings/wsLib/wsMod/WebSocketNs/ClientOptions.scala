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

