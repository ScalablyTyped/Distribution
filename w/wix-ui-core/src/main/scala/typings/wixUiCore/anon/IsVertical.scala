package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsVertical extends StObject {
  
  def exists(): Boolean
  
  def isVertical(): Boolean
  
  def textContent(): js.Any
}
object IsVertical {
  
  inline def apply(exists: () => Boolean, isVertical: () => Boolean, textContent: () => js.Any): IsVertical = {
    val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), isVertical = js.Any.fromFunction0(isVertical), textContent = js.Any.fromFunction0(textContent))
    __obj.asInstanceOf[IsVertical]
  }
  
  extension [Self <: IsVertical](x: Self) {
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setIsVertical(value: () => Boolean): Self = StObject.set(x, "isVertical", js.Any.fromFunction0(value))
    
    inline def setTextContent(value: () => js.Any): Self = StObject.set(x, "textContent", js.Any.fromFunction0(value))
  }
}
