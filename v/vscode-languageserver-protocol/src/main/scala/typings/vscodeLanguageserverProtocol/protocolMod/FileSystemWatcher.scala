package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemWatcher extends js.Object {
  
  /**
    * The  glob pattern to watch. Glob patterns can have the following syntax:
    * - `*` to match one or more characters in a path segment
    * - `?` to match on one character in a path segment
    * - `**` to match any number of path segments, including none
    * - `{}` to group conditions (e.g. `**​/ *.{ts,js}` matches all TypeScript and JavaScript files)
    * - `[]` to declare a range of characters to match in a path segment (e.g., `example.[0-9]` to match on `example.0`, `example.1`, …)
    * - `[!...]` to negate a range of characters to match in a path segment (e.g., `example.[!0-9]` to match on `example.a`, `example.b`, but not `example.0`)
    */
  var globPattern: String = js.native
  
  /**
    * The kind of events of interest. If omitted it defaults
    * to WatchKind.Create | WatchKind.Change | WatchKind.Delete
    * which is 7.
    */
  var kind: js.UndefOr[Double] = js.native
}
object FileSystemWatcher {
  
  @scala.inline
  def apply(globPattern: String): FileSystemWatcher = {
    val __obj = js.Dynamic.literal(globPattern = globPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemWatcher]
  }
  
  @scala.inline
  implicit class FileSystemWatcherOps[Self <: FileSystemWatcher] (val x: Self) extends AnyVal {
    
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
    def setGlobPattern(value: String): Self = this.set("globPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: Double): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
