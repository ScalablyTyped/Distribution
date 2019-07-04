package typings
package stubbyLib.stubbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StubbyWithKeyCertOptions
  extends StubbyCommonOptions
     with StubbyOptions {
   // tslint:disable-line:ban-types
  /** certificate file contents (in PEM format) */
  var cert: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer])
  /** keyfile contents (in PEM format) */
  var key: java.lang.String | nodeLib.Buffer | (js.Array[nodeLib.Buffer | js.Object])
}

object StubbyWithKeyCertOptions {
  @scala.inline
  def apply(
    cert: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]),
    key: java.lang.String | nodeLib.Buffer | (js.Array[nodeLib.Buffer | js.Object]),
    _httpsOptions: nodeLib.tlsMod.TlsOptions = null,
    admin: scala.Int | scala.Double = null,
    data: StubbyData | js.Array[StubbyData] = null,
    datadir: java.lang.String = null,
    location: java.lang.String = null,
    quiet: js.UndefOr[scala.Boolean] = js.undefined,
    stubs: scala.Int | scala.Double = null,
    tls: scala.Int | scala.Double = null,
    watch: java.lang.String = null
  ): StubbyWithKeyCertOptions = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (_httpsOptions != null) __obj.updateDynamic("_httpsOptions")(_httpsOptions)
    if (admin != null) __obj.updateDynamic("admin")(admin.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datadir != null) __obj.updateDynamic("datadir")(datadir)
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (stubs != null) __obj.updateDynamic("stubs")(stubs.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[StubbyWithKeyCertOptions]
  }
}

