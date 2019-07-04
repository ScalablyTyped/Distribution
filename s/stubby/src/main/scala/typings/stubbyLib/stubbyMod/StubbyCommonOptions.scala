package typings
package stubbyLib.stubbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StubbyCommonOptions extends js.Object {
  /** additional options to pass to the underlying tls server */
  var _httpsOptions: js.UndefOr[nodeLib.tlsMod.TlsOptions] = js.undefined
  /** port number to run the admin portal */
  var admin: js.UndefOr[scala.Double] = js.undefined
  /** JavaScript Object/Array containing endpoint data */
  var data: js.UndefOr[StubbyData | js.Array[StubbyData]] = js.undefined
  var datadir: js.UndefOr[java.lang.String] = js.undefined
  /** address/hostname at which to run stubby */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** defaults to `true`. Pass in `false` to have console output (if available) */
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  /** port number to run the stubs portal */
  var stubs: js.UndefOr[scala.Double] = js.undefined
  /** port number to run the stubs portal over https */
  var tls: js.UndefOr[scala.Double] = js.undefined
  /** filename to monitor and load as stubby's data when changes occur */
  var watch: js.UndefOr[java.lang.String] = js.undefined
}

object StubbyCommonOptions {
  @scala.inline
  def apply(
    _httpsOptions: nodeLib.tlsMod.TlsOptions = null,
    admin: scala.Int | scala.Double = null,
    data: StubbyData | js.Array[StubbyData] = null,
    datadir: java.lang.String = null,
    location: java.lang.String = null,
    quiet: js.UndefOr[scala.Boolean] = js.undefined,
    stubs: scala.Int | scala.Double = null,
    tls: scala.Int | scala.Double = null,
    watch: java.lang.String = null
  ): StubbyCommonOptions = {
    val __obj = js.Dynamic.literal()
    if (_httpsOptions != null) __obj.updateDynamic("_httpsOptions")(_httpsOptions)
    if (admin != null) __obj.updateDynamic("admin")(admin.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datadir != null) __obj.updateDynamic("datadir")(datadir)
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (stubs != null) __obj.updateDynamic("stubs")(stubs.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[StubbyCommonOptions]
  }
}

