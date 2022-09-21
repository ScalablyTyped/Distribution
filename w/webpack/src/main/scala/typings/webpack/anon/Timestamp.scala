package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timestamp extends StObject {
  
  /**
  		 * Use hashes of the content of the files/directories to determine invalidation.
  		 */
  var hash: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Use timestamps of the files/directories to determine invalidation.
  		 */
  var timestamp: js.UndefOr[Boolean] = js.undefined
}
object Timestamp {
  
  inline def apply(): Timestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timestamp]
  }
  
  extension [Self <: Timestamp](x: Self) {
    
    inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
