package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemWatcher extends StObject {
  
  /**
    * The glob pattern to watch. See {@link GlobPattern glob pattern} for more detail.
    *
    * @since 3.17.0 support for relative patterns.
    */
  var globPattern: GlobPattern
  
  /**
    * The kind of events of interest. If omitted it defaults
    * to WatchKind.Create | WatchKind.Change | WatchKind.Delete
    * which is 7.
    */
  var kind: js.UndefOr[WatchKind] = js.undefined
}
object FileSystemWatcher {
  
  inline def apply(globPattern: GlobPattern): FileSystemWatcher = {
    val __obj = js.Dynamic.literal(globPattern = globPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemWatcher]
  }
  
  extension [Self <: FileSystemWatcher](x: Self) {
    
    inline def setGlobPattern(value: GlobPattern): Self = StObject.set(x, "globPattern", value.asInstanceOf[js.Any])
    
    inline def setKind(value: WatchKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
