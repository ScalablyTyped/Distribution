package typings.watchpack.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherOptions extends js.Object {
  
  var ignored: js.UndefOr[js.Array[String] | String | RegExp | (js.Function1[/* path */ String, Boolean])] = js.native
  
  var poll: js.UndefOr[Boolean | Double] = js.native
}
object WatcherOptions {
  
  @scala.inline
  def apply(): WatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherOptions]
  }
  
  @scala.inline
  implicit class WatcherOptionsOps[Self <: WatcherOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoredVarargs(value: String*): Self = this.set("ignored", js.Array(value :_*))
    
    @scala.inline
    def setIgnoredFunction1(value: /* path */ String => Boolean): Self = this.set("ignored", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnored(value: js.Array[String] | String | RegExp | (js.Function1[/* path */ String, Boolean])): Self = this.set("ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnored: Self = this.set("ignored", js.undefined)
    
    @scala.inline
    def setPoll(value: Boolean | Double): Self = this.set("poll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoll: Self = this.set("poll", js.undefined)
  }
}
