package typings.workboxPrecaching

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precacheEntryMod {
  
  trait PrecacheEntry extends StObject {
    
    // integrity?: string;
    var revision: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object PrecacheEntry {
    
    @scala.inline
    def apply(url: String): PrecacheEntry = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrecacheEntry]
    }
    
    @scala.inline
    implicit class PrecacheEntryMutableBuilder[Self <: PrecacheEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
