package typings.testingLibraryJasmineDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait NormalizeWhitespace extends StObject {
    
    var normalizeWhitespace: Boolean = js.native
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
