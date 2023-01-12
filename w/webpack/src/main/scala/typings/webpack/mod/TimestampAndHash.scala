package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampAndHash extends StObject {
  
  var hash: String
  
  var safeTime: Double
  
  var timestamp: js.UndefOr[Double] = js.undefined
}
object TimestampAndHash {
  
  inline def apply(hash: String, safeTime: Double): TimestampAndHash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], safeTime = safeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampAndHash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimestampAndHash] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setSafeTime(value: Double): Self = StObject.set(x, "safeTime", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
