package typings.typescript.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class WatchOptionsMutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallbackPolling(value: PollingWatchKind): Self = StObject.set(x, "fallbackPolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackPollingUndefined: Self = StObject.set(x, "fallbackPolling", js.undefined)
    
    @scala.inline
    def setSynchronousWatchDirectory(value: Boolean): Self = StObject.set(x, "synchronousWatchDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronousWatchDirectoryUndefined: Self = StObject.set(x, "synchronousWatchDirectory", js.undefined)
    
    @scala.inline
    def setWatchDirectory(value: WatchDirectoryKind): Self = StObject.set(x, "watchDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchDirectoryUndefined: Self = StObject.set(x, "watchDirectory", js.undefined)
    
    @scala.inline
    def setWatchFile(value: WatchFileKind): Self = StObject.set(x, "watchFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchFileUndefined: Self = StObject.set(x, "watchFile", js.undefined)
  }
}
