package typings.webpack.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextTimestampAndHash extends StObject {
  
  var hash: String
  
  var resolved: js.UndefOr[ResolvedContextTimestampAndHash] = js.undefined
  
  var safeTime: Double
  
  var symlinks: js.UndefOr[Set[String]] = js.undefined
  
  var timestampHash: js.UndefOr[String] = js.undefined
}
object ContextTimestampAndHash {
  
  inline def apply(hash: String, safeTime: Double): ContextTimestampAndHash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], safeTime = safeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextTimestampAndHash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextTimestampAndHash] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setResolved(value: ResolvedContextTimestampAndHash): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    
    inline def setSafeTime(value: Double): Self = StObject.set(x, "safeTime", value.asInstanceOf[js.Any])
    
    inline def setSymlinks(value: Set[String]): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
    
    inline def setTimestampHash(value: String): Self = StObject.set(x, "timestampHash", value.asInstanceOf[js.Any])
    
    inline def setTimestampHashUndefined: Self = StObject.set(x, "timestampHash", js.undefined)
  }
}
