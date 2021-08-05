package typings.wixStyleReact

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addItemDriverMod {
  
  trait AddItemDriver[T]
    extends StObject
       with BaseDriver {
    
    def click(): Unit
    
    def element(): T
    
    def getText(): String
    
    def getTooltipContent(): String
    
    def textExists(): Boolean
  }
  object AddItemDriver {
    
    inline def apply[T](
      click: () => Unit,
      element: () => T,
      exists: () => Boolean,
      getText: () => String,
      getTooltipContent: () => String,
      textExists: () => Boolean
    ): AddItemDriver[T] = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getText = js.Any.fromFunction0(getText), getTooltipContent = js.Any.fromFunction0(getTooltipContent), textExists = js.Any.fromFunction0(textExists))
      __obj.asInstanceOf[AddItemDriver[T]]
    }
    
    extension [Self <: AddItemDriver[?], T](x: Self & AddItemDriver[T]) {
      
      inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setElement(value: () => T): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setGetTooltipContent(value: () => String): Self = StObject.set(x, "getTooltipContent", js.Any.fromFunction0(value))
      
      inline def setTextExists(value: () => Boolean): Self = StObject.set(x, "textExists", js.Any.fromFunction0(value))
    }
  }
}
