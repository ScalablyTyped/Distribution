package typings.webpack.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextFileSystemInfoEntry extends StObject {
  
  var resolved: js.UndefOr[ResolvedContextFileSystemInfoEntry] = js.undefined
  
  var safeTime: Double
  
  var symlinks: js.UndefOr[Set[String]] = js.undefined
  
  var timestampHash: js.UndefOr[String] = js.undefined
}
object ContextFileSystemInfoEntry {
  
  inline def apply(safeTime: Double): ContextFileSystemInfoEntry = {
    val __obj = js.Dynamic.literal(safeTime = safeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextFileSystemInfoEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextFileSystemInfoEntry] (val x: Self) extends AnyVal {
    
    inline def setResolved(value: ResolvedContextFileSystemInfoEntry): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    
    inline def setSafeTime(value: Double): Self = StObject.set(x, "safeTime", value.asInstanceOf[js.Any])
    
    inline def setSymlinks(value: Set[String]): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
    
    inline def setTimestampHash(value: String): Self = StObject.set(x, "timestampHash", value.asInstanceOf[js.Any])
    
    inline def setTimestampHashUndefined: Self = StObject.set(x, "timestampHash", js.undefined)
  }
}
