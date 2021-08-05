package typings.unidriverPuppeteer

import typings.puppeteer.mod.ElementHandle
import typings.puppeteer.mod.Frame
import typings.puppeteer.mod.Page
import typings.std.Element
import typings.unidriverCore.mod.UniDriver
import typings.unidriverCore.mod.UniDriverList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@unidriver/puppeteer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pupUniDriver(el: BaseElementContainer): UniDriver[ElementContainer] = ^.asInstanceOf[js.Dynamic].applyDynamic("pupUniDriver")(el.asInstanceOf[js.Any]).asInstanceOf[UniDriver[ElementContainer]]
  inline def pupUniDriver(el: ElementGetter): UniDriver[ElementContainer] = ^.asInstanceOf[js.Dynamic].applyDynamic("pupUniDriver")(el.asInstanceOf[js.Any]).asInstanceOf[UniDriver[ElementContainer]]
  
  inline def pupUniDriverList(elems: ElementsGetter): UniDriverList[ElementContainer] = ^.asInstanceOf[js.Dynamic].applyDynamic("pupUniDriverList")(elems.asInstanceOf[js.Any]).asInstanceOf[UniDriverList[ElementContainer]]
  
  trait BaseElementContainer extends StObject {
    
    var page: Page | Frame
    
    var selector: String
  }
  object BaseElementContainer {
    
    inline def apply(page: Page | Frame, selector: String): BaseElementContainer = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseElementContainer]
    }
    
    extension [Self <: BaseElementContainer](x: Self) {
      
      inline def setPage(value: Page | Frame): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementContainer
    extends StObject
       with BaseElementContainer {
    
    var element: ElementHandle[Element] | Null
  }
  object ElementContainer {
    
    inline def apply(page: Page | Frame, selector: String): ElementContainer = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], element = null)
      __obj.asInstanceOf[ElementContainer]
    }
    
    extension [Self <: ElementContainer](x: Self) {
      
      inline def setElement(value: ElementHandle[Element]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
    }
  }
  
  type ElementGetter = js.Function0[js.Promise[ElementContainer]]
  
  trait ElementsContainer
    extends StObject
       with BaseElementContainer {
    
    var elements: js.Array[ElementHandle[Element]]
  }
  object ElementsContainer {
    
    inline def apply(elements: js.Array[ElementHandle[Element]], page: Page | Frame, selector: String): ElementsContainer = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementsContainer]
    }
    
    extension [Self <: ElementsContainer](x: Self) {
      
      inline def setElements(value: js.Array[ElementHandle[Element]]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: ElementHandle[Element]*): Self = StObject.set(x, "elements", js.Array(value :_*))
    }
  }
  
  type ElementsGetter = js.Function0[js.Promise[ElementsContainer]]
}
