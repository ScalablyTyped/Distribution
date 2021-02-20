package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemWatcher extends StObject {
  
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
  implicit class FileSystemWatcherMutableBuilder[Self <: FileSystemWatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobPattern(value: String): Self = StObject.set(x, "globPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: Double): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
