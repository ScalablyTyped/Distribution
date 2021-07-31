package typings.testingLibraryJestDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exact extends StObject {
    
    var exact: Boolean
  }
  object Exact {
    
    @scala.inline
    def apply(exact: Boolean): Exact = {
      val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exact]
    }
    
    @scala.inline
    implicit class ExactMutableBuilder[Self <: Exact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    }
  }
  
  trait NormalizeWhitespace extends StObject {
    
    var normalizeWhitespace: Boolean
  }
  object NormalizeWhitespace {
    
    @scala.inline
    def apply(normalizeWhitespace: Boolean): NormalizeWhitespace = {
      val __obj = js.Dynamic.literal(normalizeWhitespace = normalizeWhitespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizeWhitespace]
    }
    
    @scala.inline
    implicit class NormalizeWhitespaceMutableBuilder[Self <: NormalizeWhitespace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNormalizeWhitespace(value: Boolean): Self = StObject.set(x, "normalizeWhitespace", value.asInstanceOf[js.Any])
    }
  }
}
