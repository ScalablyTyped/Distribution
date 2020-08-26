package typings.ws.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import typings.node.tlsMod.SecureContextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends SecureContextOptions {
  var agent: js.UndefOr[Agent] = js.native
  var checkServerIdentity: js.UndefOr[js.Function2[/* servername */ String, /* cert */ CertMeta, Boolean]] = js.native
  var family: js.UndefOr[Double] = js.native
  var followRedirects: js.UndefOr[Boolean] = js.native
  var handshakeTimeout: js.UndefOr[Double] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var host: js.UndefOr[String] = js.native
  var localAddress: js.UndefOr[String] = js.native
  var maxPayload: js.UndefOr[Double] = js.native
  var maxRedirects: js.UndefOr[Double] = js.native
  var origin: js.UndefOr[String] = js.native
  var perMessageDeflate: js.UndefOr[Boolean | PerMessageDeflateOptions] = js.native
  var protocol: js.UndefOr[String] = js.native
  var protocolVersion: js.UndefOr[Double] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgent(value: Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setCheckServerIdentity(value: (/* servername */ String, /* cert */ CertMeta) => Boolean): Self = this.set("checkServerIdentity", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCheckServerIdentity: Self = this.set("checkServerIdentity", js.undefined)
    @scala.inline
    def setFamily(value: Double): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowRedirects: Self = this.set("followRedirects", js.undefined)
    @scala.inline
    def setHandshakeTimeout(value: Double): Self = this.set("handshakeTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandshakeTimeout: Self = this.set("handshakeTimeout", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    @scala.inline
    def setMaxPayload(value: Double): Self = this.set("maxPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPayload: Self = this.set("maxPayload", js.undefined)
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setPerMessageDeflate(value: Boolean | PerMessageDeflateOptions): Self = this.set("perMessageDeflate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerMessageDeflate: Self = this.set("perMessageDeflate", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setProtocolVersion(value: Double): Self = this.set("protocolVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocolVersion: Self = this.set("protocolVersion", js.undefined)
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
  }
  
}

