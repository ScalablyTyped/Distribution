package typings.unidriverPuppeteer

import typings.unidriverCore.mod.DriverContext
import typings.unidriverCore.mod.UniDriver
import typings.unidriverCore.mod.UniDriverList
import typings.unidriverPuppeteer.distPptrVersionSelectorMod.ElementHandle
import typings.unidriverPuppeteer.distPptrVersionSelectorMod.Frame
import typings.unidriverPuppeteer.distPptrVersionSelectorMod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@unidriver/puppeteer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pupUniDriver(el: BaseElementContainer): UniDriver[ElementContainer] = ^.asInstanceOf[js.Dynamic].applyDynamic("pupUniDriver")(el.asInstanceOf[js.Any]).asInstanceOf[UniDriver[ElementContainer]]
  inline def pupUniDriver(el: BaseElementContainer, context: DriverContext): UniDriver[ElementContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("pupUniDriver")(el.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[UniDriver[ElementContainer]]
  inline def pupUniDriver(el: ElementGetter): UniDriver[ElementContainer] = ^.asInstanceOf[js.Dynamic].applyDynamic("pupUniDriver")(el.asInstanceOf[js.Any]).asInstanceOf[UniDriver[ElementContainer]]
  inline def pupUniDriver(el: ElementGetter, context: DriverContext): UniDriver[ElementContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("pupUniDriver")(el.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[UniDriver[ElementContainer]]
  
  inline def pupUniDriverList(elems: ElementsGetter): UniDriverList[ElementContainer] = ^.asInstanceOf[js.Dynamic].applyDynamic("pupUniDriverList")(elems.asInstanceOf[js.Any]).asInstanceOf[UniDriverList[ElementContainer]]
  inline def pupUniDriverList(elems: ElementsGetter, context: DriverContext): UniDriverList[ElementContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("pupUniDriverList")(elems.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[UniDriverList[ElementContainer]]
  
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
    
    var element: ElementHandle | Null
  }
  object ElementContainer {
    
    inline def apply(page: Page | Frame, selector: String): ElementContainer = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], element = null)
      __obj.asInstanceOf[ElementContainer]
    }
    
    extension [Self <: ElementContainer](x: Self) {
      
      inline def setElement(value: ElementHandle): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
    }
  }
  
  type ElementGetter = js.Function0[js.Promise[ElementContainer]]
  
  trait ElementsContainer
    extends StObject
       with BaseElementContainer {
    
    var elements: js.Array[ElementHandle]
  }
  object ElementsContainer {
    
    inline def apply(elements: js.Array[ElementHandle], page: Page | Frame, selector: String): ElementsContainer = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementsContainer]
    }
    
    extension [Self <: ElementsContainer](x: Self) {
      
      inline def setElements(value: js.Array[ElementHandle]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: ElementHandle*): Self = StObject.set(x, "elements", js.Array(value*))
    }
  }
  
  type ElementsGetter = js.Function0[js.Promise[ElementsContainer]]
}
