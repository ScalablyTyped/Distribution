package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSpecification extends StObject {
  
  var enableStream: Boolean
  
  var expirationTime: js.UndefOr[Double] = js.undefined
}
object StreamSpecification {
  
  inline def apply(enableStream: Boolean): StreamSpecification = {
    val __obj = js.Dynamic.literal(enableStream = enableStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamSpecification] (val x: Self) extends AnyVal {
    
    inline def setEnableStream(value: Boolean): Self = StObject.set(x, "enableStream", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: Double): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
  }
}
