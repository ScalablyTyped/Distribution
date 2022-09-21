package typings.wordExtractor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IncludeBody extends StObject {
    
    var includeBody: js.UndefOr[Boolean] = js.undefined
    
    var includeHeadersAndFooters: js.UndefOr[Boolean] = js.undefined
  }
  object IncludeBody {
    
    inline def apply(): IncludeBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeBody]
    }
    
    extension [Self <: IncludeBody](x: Self) {
      
      inline def setIncludeBody(value: Boolean): Self = StObject.set(x, "includeBody", value.asInstanceOf[js.Any])
      
      inline def setIncludeBodyUndefined: Self = StObject.set(x, "includeBody", js.undefined)
      
      inline def setIncludeHeadersAndFooters(value: Boolean): Self = StObject.set(x, "includeHeadersAndFooters", value.asInstanceOf[js.Any])
      
      inline def setIncludeHeadersAndFootersUndefined: Self = StObject.set(x, "includeHeadersAndFooters", js.undefined)
    }
  }
  
  trait IncludeFooters extends StObject {
    
    var includeFooters: js.UndefOr[Boolean] = js.undefined
  }
  object IncludeFooters {
    
    inline def apply(): IncludeFooters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeFooters]
    }
    
    extension [Self <: IncludeFooters](x: Self) {
      
      inline def setIncludeFooters(value: Boolean): Self = StObject.set(x, "includeFooters", value.asInstanceOf[js.Any])
      
      inline def setIncludeFootersUndefined: Self = StObject.set(x, "includeFooters", js.undefined)
    }
  }
}
