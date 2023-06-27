package typings.typescript.mod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchTypingLocations
  extends StObject
     with ProjectResponse {
  
  /** if files is undefined, retain same set of watchers */
  val files: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("kind")
  val kind_WatchTypingLocations: ActionWatchTypingLocations
}
object WatchTypingLocations {
  
  inline def apply(kind: ActionWatchTypingLocations, projectName: String): WatchTypingLocations = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchTypingLocations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchTypingLocations] (val x: Self) extends AnyVal {
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setKind(value: ActionWatchTypingLocations): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
