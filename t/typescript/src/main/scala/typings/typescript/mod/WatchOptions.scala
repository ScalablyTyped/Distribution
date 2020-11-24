package typings.typescript.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchOptions
  extends /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  
  var fallbackPolling: js.UndefOr[PollingWatchKind] = js.native
  
  var synchronousWatchDirectory: js.UndefOr[Boolean] = js.native
  
  var watchDirectory: js.UndefOr[WatchDirectoryKind] = js.native
  
  var watchFile: js.UndefOr[WatchFileKind] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFallbackPolling(value: PollingWatchKind): Self = this.set("fallbackPolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackPolling: Self = this.set("fallbackPolling", js.undefined)
    
    @scala.inline
    def setSynchronousWatchDirectory(value: Boolean): Self = this.set("synchronousWatchDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronousWatchDirectory: Self = this.set("synchronousWatchDirectory", js.undefined)
    
    @scala.inline
    def setWatchDirectory(value: WatchDirectoryKind): Self = this.set("watchDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchDirectory: Self = this.set("watchDirectory", js.undefined)
    
    @scala.inline
    def setWatchFile(value: WatchFileKind): Self = this.set("watchFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchFile: Self = this.set("watchFile", js.undefined)
  }
}
