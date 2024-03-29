package typings.styleToObject

import typings.styleToObject.mod.DeclarationPos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    var end: DeclarationPos
    
    var source: Any
    
    var start: DeclarationPos
  }
  object End {
    
    inline def apply(end: DeclarationPos, source: Any, start: DeclarationPos): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: DeclarationPos): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStart(value: DeclarationPos): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
