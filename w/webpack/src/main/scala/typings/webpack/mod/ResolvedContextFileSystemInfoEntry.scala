package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedContextFileSystemInfoEntry extends StObject {
  
  var safeTime: Double
  
  var timestampHash: js.UndefOr[String] = js.undefined
}
object ResolvedContextFileSystemInfoEntry {
  
  inline def apply(safeTime: Double): ResolvedContextFileSystemInfoEntry = {
    val __obj = js.Dynamic.literal(safeTime = safeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedContextFileSystemInfoEntry]
  }
  
  extension [Self <: ResolvedContextFileSystemInfoEntry](x: Self) {
    
    inline def setSafeTime(value: Double): Self = StObject.set(x, "safeTime", value.asInstanceOf[js.Any])
    
    inline def setTimestampHash(value: String): Self = StObject.set(x, "timestampHash", value.asInstanceOf[js.Any])
    
    inline def setTimestampHashUndefined: Self = StObject.set(x, "timestampHash", js.undefined)
  }
}
