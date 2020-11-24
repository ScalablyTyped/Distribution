package typings.webpackBlocksDevServer.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchOptions extends js.Object {
  
  var aggregateTimeout: js.UndefOr[Double] = js.native
  
  var ignored: js.UndefOr[RegExp] = js.native
  
  var poll: js.UndefOr[Boolean | Double] = js.native
}
object WatchOptions {
  
  @scala.inline
  def apply(): WatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptions]
  }
  
  @scala.inline
  implicit class WatchOptionsOps[Self <: WatchOptions] (val x: Self) extends AnyVal {
    
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
    def setAggregateTimeout(value: Double): Self = this.set("aggregateTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateTimeout: Self = this.set("aggregateTimeout", js.undefined)
    
    @scala.inline
    def setIgnored(value: RegExp): Self = this.set("ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnored: Self = this.set("ignored", js.undefined)
    
    @scala.inline
    def setPoll(value: Boolean | Double): Self = this.set("poll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoll: Self = this.set("poll", js.undefined)
  }
}
