package typings.wordpressDom

import typings.std.CSSStyleDeclaration
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(elt: Element): CSSStyleDeclaration = js.native
    def apply(elt: Element, pseudoElt: String): CSSStyleDeclaration = js.native
  }
  
  trait Sequential extends StObject {
    
    var sequential: js.UndefOr[Boolean] = js.undefined
  }
  object Sequential {
    
    inline def apply(): Sequential = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sequential]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sequential] (val x: Self) extends AnyVal {
      
      inline def setSequential(value: Boolean): Self = StObject.set(x, "sequential", value.asInstanceOf[js.Any])
      
      inline def setSequentialUndefined: Self = StObject.set(x, "sequential", js.undefined)
    }
  }
}
