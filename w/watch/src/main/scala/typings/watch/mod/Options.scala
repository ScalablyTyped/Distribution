package typings.watch.mod

import typings.node.fsMod.Stats
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ Stats, Boolean]] = js.native
  
  var ignoreDirectoryPattern: js.UndefOr[RegExp] = js.native
  
  var ignoreDotFiles: js.UndefOr[Boolean] = js.native
  
  var ignoreNotPermitted: js.UndefOr[Boolean] = js.native
  
  var ignoreUnreadableDir: js.UndefOr[Boolean] = js.native
  
  var interval: js.UndefOr[Double] = js.native
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
    def setFilter(value: (/* path */ String, /* stat */ Stats) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setIgnoreDirectoryPattern(value: RegExp): Self = this.set("ignoreDirectoryPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDirectoryPattern: Self = this.set("ignoreDirectoryPattern", js.undefined)
    
    @scala.inline
    def setIgnoreDotFiles(value: Boolean): Self = this.set("ignoreDotFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDotFiles: Self = this.set("ignoreDotFiles", js.undefined)
    
    @scala.inline
    def setIgnoreNotPermitted(value: Boolean): Self = this.set("ignoreNotPermitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreNotPermitted: Self = this.set("ignoreNotPermitted", js.undefined)
    
    @scala.inline
    def setIgnoreUnreadableDir(value: Boolean): Self = this.set("ignoreUnreadableDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUnreadableDir: Self = this.set("ignoreUnreadableDir", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
  }
}
