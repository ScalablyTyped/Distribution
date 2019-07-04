package typings
package stubbyLib.stubbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StubbyWithPfxOptions
  extends StubbyCommonOptions
     with StubbyOptions {
  /** pfx file contents (mutually exclusive with key/cert options) */
  var pfx: js.UndefOr[
    java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer | js.Object])
  ] = js.undefined
}

object StubbyWithPfxOptions {
  @scala.inline
  def apply(
    _httpsOptions: nodeLib.tlsMod.TlsOptions = null,
    admin: scala.Int | scala.Double = null,
    data: StubbyData | js.Array[StubbyData] = null,
    datadir: java.lang.String = null,
    location: java.lang.String = null,
    pfx: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer | js.Object]) = null,
    quiet: js.UndefOr[scala.Boolean] = js.undefined,
    stubs: scala.Int | scala.Double = null,
    tls: scala.Int | scala.Double = null,
    watch: java.lang.String = null
  ): StubbyWithPfxOptions = {
    val __obj = js.Dynamic.literal()
    if (_httpsOptions != null) __obj.updateDynamic("_httpsOptions")(_httpsOptions)
    if (admin != null) __obj.updateDynamic("admin")(admin.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datadir != null) __obj.updateDynamic("datadir")(datadir)
    if (location != null) __obj.updateDynamic("location")(location)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (stubs != null) __obj.updateDynamic("stubs")(stubs.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[StubbyWithPfxOptions]
  }
}

