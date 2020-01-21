package typings.stubby.mod

import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StubbyCommonOptions extends js.Object {
  /** additional options to pass to the underlying tls server */
  var _httpsOptions: js.UndefOr[TlsOptions] = js.undefined
  /** port number to run the admin portal */
  var admin: js.UndefOr[Double] = js.undefined
  /** JavaScript Object/Array containing endpoint data */
  var data: js.UndefOr[StubbyData | js.Array[StubbyData]] = js.undefined
  var datadir: js.UndefOr[String] = js.undefined
  /** address/hostname at which to run stubby */
  var location: js.UndefOr[String] = js.undefined
  /** defaults to `true`. Pass in `false` to have console output (if available) */
  var quiet: js.UndefOr[Boolean] = js.undefined
  /** port number to run the stubs portal */
  var stubs: js.UndefOr[Double] = js.undefined
  /** port number to run the stubs portal over https */
  var tls: js.UndefOr[Double] = js.undefined
  /** filename to monitor and load as stubby's data when changes occur */
  var watch: js.UndefOr[String] = js.undefined
}

object StubbyCommonOptions {
  @scala.inline
  def apply(
    _httpsOptions: TlsOptions = null,
    admin: Int | Double = null,
    data: StubbyData | js.Array[StubbyData] = null,
    datadir: String = null,
    location: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    stubs: Int | Double = null,
    tls: Int | Double = null,
    watch: String = null
  ): StubbyCommonOptions = {
    val __obj = js.Dynamic.literal()
    if (_httpsOptions != null) __obj.updateDynamic("_httpsOptions")(_httpsOptions.asInstanceOf[js.Any])
    if (admin != null) __obj.updateDynamic("admin")(admin.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datadir != null) __obj.updateDynamic("datadir")(datadir.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (stubs != null) __obj.updateDynamic("stubs")(stubs.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[StubbyCommonOptions]
  }
}

