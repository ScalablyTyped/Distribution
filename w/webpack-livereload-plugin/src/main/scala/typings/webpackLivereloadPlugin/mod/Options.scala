package typings.webpackLivereloadPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * livereload `<script>` automatically to `<head>`.
    * @default false
    */
  var appendScriptTag: js.UndefOr[Boolean] = js.undefined
  /**
    * amount of milliseconds by which to delay the live reload (in case build takes longer)
    * @default 0
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * he desired hostname for the appended `<script>` (if present) to point to
    * @default hostname of the page, like `localhost` or 10.0.2.2
    */
  var hostname: js.UndefOr[String] = js.undefined
  /**
    * RegExp of files to ignore. Null value means ignore nothing.
    * It is also possible to define an array and use multiple anymatch patterns
    */
  var ignore: js.UndefOr[RegExp | js.Array[RegExp] | Null] = js.undefined
  /**
    * The desired port for the livereload server.
    * If you define port 0, an available port will be searched for, starting from 35729.
    * @default 35729
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * protocol for livereload `<script>` src attribute value
    * @default protocol of the page, either `http` or `https`
    */
  var protocol: js.UndefOr[String] = js.undefined
  /**
    * create hash for each file source and only notify livereload if hash has changed
    * @default false
    */
  var useSourceHash: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    appendScriptTag: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    hostname: String = null,
    ignore: js.UndefOr[Null | RegExp | js.Array[RegExp]] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    protocol: String = null,
    useSourceHash: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appendScriptTag)) __obj.updateDynamic("appendScriptTag")(appendScriptTag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(useSourceHash)) __obj.updateDynamic("useSourceHash")(useSourceHash.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

