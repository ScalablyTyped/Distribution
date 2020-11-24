package typings.watchify.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The amount of time in milliseconds to wait before emitting an "update" event after a change.
    * @default 100
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Ignores monitoring files for changes. If set to `true`, then ** /node_modules/ ** will be ignored.
    * For other possible values see Chokidar's documentation on "ignored"
    * Also see anymatch package: https://github.com/es128/anymatch#usage
    */
  var ignoreWatch: js.UndefOr[
    Boolean | String | RegExp | (js.Function1[/* repeated */ js.Any, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* repeated */ _, Boolean])])
  ] = js.native
  
  /**
    * Enables polling to monitor for changes. If set to `true`, then a polling interval of 100 ms is used.
    * If set to a number, then that amount of milliseconds will be the polling interval. For more info see
    * Chokidar's documentation on "usePolling" and "interval".
    * This option is useful if you're watching an NFS volume
    * Also see chokidar package: https://github.com/paulmillr/chokidar#path-filtering
    */
  var poll: js.UndefOr[Boolean | Double] = js.native
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setIgnoreWatchVarargs(value: (String | RegExp | (js.Function1[js.Any, Boolean]))*): Self = this.set("ignoreWatch", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreWatchFunction1(value: /* repeated */ js.Any => Boolean): Self = this.set("ignoreWatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnoreWatch(
      value: Boolean | String | RegExp | (js.Function1[/* repeated */ js.Any, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* repeated */ _, Boolean])])
    ): Self = this.set("ignoreWatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreWatch: Self = this.set("ignoreWatch", js.undefined)
    
    @scala.inline
    def setPoll(value: Boolean | Double): Self = this.set("poll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoll: Self = this.set("poll", js.undefined)
  }
}
