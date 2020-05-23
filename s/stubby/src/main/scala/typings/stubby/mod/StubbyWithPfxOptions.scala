package typings.stubby.mod

import typings.node.Buffer
import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StubbyWithPfxOptions
  extends StubbyCommonOptions
     with StubbyOptions {
  /** pfx file contents (mutually exclusive with key/cert options) */
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | js.Object])] = js.undefined
}

object StubbyWithPfxOptions {
  @scala.inline
  def apply(
    _httpsOptions: TlsOptions = null,
    admin: js.UndefOr[Double] = js.undefined,
    data: StubbyData | js.Array[StubbyData] = null,
    datadir: String = null,
    location: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | js.Object]) = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    stubs: js.UndefOr[Double] = js.undefined,
    tls: js.UndefOr[Double] = js.undefined,
    watch: String = null
  ): StubbyWithPfxOptions = {
    val __obj = js.Dynamic.literal()
    if (_httpsOptions != null) __obj.updateDynamic("_httpsOptions")(_httpsOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(admin)) __obj.updateDynamic("admin")(admin.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datadir != null) __obj.updateDynamic("datadir")(datadir.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stubs)) __obj.updateDynamic("stubs")(stubs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.get.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[StubbyWithPfxOptions]
  }
}

