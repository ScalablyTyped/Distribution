package typings.workboxPrecaching

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPrecacheEntryMod {
  
  trait PrecacheEntry extends StObject {
    
    // integrity?: string;
    var revision: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object PrecacheEntry {
    
    inline def apply(url: String): PrecacheEntry = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrecacheEntry]
    }
    
    extension [Self <: PrecacheEntry](x: Self) {
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
