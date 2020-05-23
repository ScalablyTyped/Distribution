package typings.stubby.mod

import typings.node.Buffer
import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StubbyWithKeyCertOptions
  extends StubbyCommonOptions
     with StubbyOptions {
   // tslint:disable-line:ban-types
  /** certificate file contents (in PEM format) */
  var cert: String | Buffer | (js.Array[String | Buffer])
  /** keyfile contents (in PEM format) */
  var key: String | Buffer | (js.Array[Buffer | js.Object])
}

object StubbyWithKeyCertOptions {
  @scala.inline
  def apply(
    cert: String | Buffer | (js.Array[String | Buffer]),
    key: String | Buffer | (js.Array[Buffer | js.Object]),
    _httpsOptions: TlsOptions = null,
    admin: js.UndefOr[Double] = js.undefined,
    data: StubbyData | js.Array[StubbyData] = null,
    datadir: String = null,
    location: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    stubs: js.UndefOr[Double] = js.undefined,
    tls: js.UndefOr[Double] = js.undefined,
    watch: String = null
  ): StubbyWithKeyCertOptions = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (_httpsOptions != null) __obj.updateDynamic("_httpsOptions")(_httpsOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(admin)) __obj.updateDynamic("admin")(admin.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datadir != null) __obj.updateDynamic("datadir")(datadir.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stubs)) __obj.updateDynamic("stubs")(stubs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.get.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[StubbyWithKeyCertOptions]
  }
}

