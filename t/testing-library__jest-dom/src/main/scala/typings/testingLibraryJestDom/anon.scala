package typings.testingLibraryJestDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exact extends StObject {
    
    var exact: Boolean
  }
  object Exact {
    
    inline def apply(exact: Boolean): Exact = {
      val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exact]
    }
    
    extension [Self <: Exact](x: Self) {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    }
  }
  
  trait NormalizeWhitespace extends StObject {
    
    var normalizeWhitespace: Boolean
  }
  object NormalizeWhitespace {
    
    inline def apply(normalizeWhitespace: Boolean): NormalizeWhitespace = {
      val __obj = js.Dynamic.literal(normalizeWhitespace = normalizeWhitespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizeWhitespace]
    }
    
    extension [Self <: NormalizeWhitespace](x: Self) {
      
      inline def setNormalizeWhitespace(value: Boolean): Self = StObject.set(x, "normalizeWhitespace", value.asInstanceOf[js.Any])
    }
  }
}
