package typings.sumoLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<sumo-logger.sumo-logger.PerMessageOptions> */
  trait PartialPerMessageOptions extends StObject {
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[js.Date] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object PartialPerMessageOptions {
    
    inline def apply(): PartialPerMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPerMessageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPerMessageOptions] (val x: Self) extends AnyVal {
      
      inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
