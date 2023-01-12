package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemInfoEntry extends StObject {
  
  var safeTime: Double
  
  var timestamp: js.UndefOr[Double] = js.undefined
}
object FileSystemInfoEntry {
  
  inline def apply(safeTime: Double): FileSystemInfoEntry = {
    val __obj = js.Dynamic.literal(safeTime = safeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemInfoEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemInfoEntry] (val x: Self) extends AnyVal {
    
    inline def setSafeTime(value: Double): Self = StObject.set(x, "safeTime", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
