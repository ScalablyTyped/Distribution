package typings.styleToObject

import typings.styleToObject.mod.DeclarationPos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    var end: DeclarationPos
    
    var source: js.Any
    
    var start: DeclarationPos
  }
  object End {
    
    @scala.inline
    def apply(end: DeclarationPos, source: js.Any, start: DeclarationPos): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: DeclarationPos): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: DeclarationPos): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
