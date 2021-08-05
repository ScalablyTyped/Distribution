package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implicitWaitMod {
  
  @JSImport("webdriverio/build/utils/implicitWait", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(currentElement: CurrentElement, commandName: String): js.Promise[CurrentElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(currentElement.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CurrentElement]]
  
  trait CurrentElement extends StObject {
    
    @JSName("$")
    def $(selector: String): js.Promise[CurrentElement]
    
    @JSName("$$")
    def DollarDollar(selector: String): js.Promise[js.Array[CurrentElement]]
    
    var elementId: String
    
    var index: Double
    
    var parent: CurrentElement
    
    var selector: String
    
    def waitForExist(): js.Promise[Unit]
  }
  object CurrentElement {
    
    inline def apply(
      $: String => js.Promise[CurrentElement],
      DollarDollar: String => js.Promise[js.Array[CurrentElement]],
      elementId: String,
      index: Double,
      parent: CurrentElement,
      selector: String,
      waitForExist: () => js.Promise[Unit]
    ): CurrentElement = {
      val __obj = js.Dynamic.literal($ = js.Any.fromFunction1($), elementId = elementId.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], waitForExist = js.Any.fromFunction0(waitForExist))
      __obj.updateDynamic("$$")(js.Any.fromFunction1(DollarDollar))
      __obj.asInstanceOf[CurrentElement]
    }
    
    extension [Self <: CurrentElement](x: Self) {
      
      inline def set$(value: String => js.Promise[CurrentElement]): Self = StObject.set(x, "$", js.Any.fromFunction1(value))
      
      inline def setDollarDollar(value: String => js.Promise[js.Array[CurrentElement]]): Self = StObject.set(x, "$$", js.Any.fromFunction1(value))
      
      inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setParent(value: CurrentElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setWaitForExist(value: () => js.Promise[Unit]): Self = StObject.set(x, "waitForExist", js.Any.fromFunction0(value))
    }
  }
}
