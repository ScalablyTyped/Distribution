package typings.webpackLivereloadPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * livereload `<script>` automatically to `<head>`.
    * @default false
    */
  var appendScriptTag: js.UndefOr[Boolean] = js.native
  /**
    * amount of milliseconds by which to delay the live reload (in case build takes longer)
    * @default 0
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * he desired hostname for the appended `<script>` (if present) to point to
    * @default hostname of the page, like `localhost` or 10.0.2.2
    */
  var hostname: js.UndefOr[String] = js.native
  /**
    * RegExp of files to ignore. Null value means ignore nothing.
    * It is also possible to define an array and use multiple anymatch patterns
    */
  var ignore: js.UndefOr[RegExp | js.Array[RegExp] | Null] = js.native
  /**
    * The desired port for the livereload server.
    * If you define port 0, an available port will be searched for, starting from 35729.
    * @default 35729
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * protocol for livereload `<script>` src attribute value
    * @default protocol of the page, either `http` or `https`
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * create hash for each file source and only notify livereload if hash has changed
    * @default false
    */
  var useSourceHash: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAppendScriptTag(value: Boolean): Self = this.set("appendScriptTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendScriptTag: Self = this.set("appendScriptTag", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: RegExp*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: RegExp | js.Array[RegExp]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setIgnoreNull: Self = this.set("ignore", null)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setUseSourceHash(value: Boolean): Self = this.set("useSourceHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSourceHash: Self = this.set("useSourceHash", js.undefined)
  }
  
}

