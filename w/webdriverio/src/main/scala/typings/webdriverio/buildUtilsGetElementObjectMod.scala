package typings.webdriverio

import typings.std.Element
import typings.wdioProtocols.buildTypesMod.ElementReference
import typings.webdriverio.buildTypesMod.ElementArray
import typings.webdriverio.buildTypesMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsGetElementObjectMod {
  
  @JSImport("webdriverio/build/utils/getElementObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getElement(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")().asInstanceOf[Element]
  inline def getElement(selector: Unit, res: js.Error): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(selector.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def getElement(selector: Unit, res: js.Error, isReactElement: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(selector.asInstanceOf[js.Any], res.asInstanceOf[js.Any], isReactElement.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def getElement(selector: Unit, res: Unit, isReactElement: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(selector.asInstanceOf[js.Any], res.asInstanceOf[js.Any], isReactElement.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def getElement(selector: Unit, res: ElementReference): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(selector.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def getElement(selector: Unit, res: ElementReference, isReactElement: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(selector.asInstanceOf[js.Any], res.asInstanceOf[js.Any], isReactElement.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def getElement(selector: Selector): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(selector.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def getElement(selector: Selector, res: js.Error): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(selector.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def getElement(selector: Selector, res: js.Error, isReactElement: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(selector.asInstanceOf[js.Any], res.asInstanceOf[js.Any], isReactElement.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def getElement(selector: Selector, res: Unit, isReactElement: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(selector.asInstanceOf[js.Any], res.asInstanceOf[js.Any], isReactElement.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def getElement(selector: Selector, res: ElementReference): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(selector.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def getElement(selector: Selector, res: ElementReference, isReactElement: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(selector.asInstanceOf[js.Any], res.asInstanceOf[js.Any], isReactElement.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def getElements(selector: js.Array[Element | ElementReference], elemResponse: js.Array[ElementReference]): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(selector.asInstanceOf[js.Any], elemResponse.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def getElements(
    selector: js.Array[Element | ElementReference],
    elemResponse: js.Array[ElementReference],
    isReactElement: Boolean
  ): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(selector.asInstanceOf[js.Any], elemResponse.asInstanceOf[js.Any], isReactElement.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def getElements(selector: Selector, elemResponse: js.Array[ElementReference]): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(selector.asInstanceOf[js.Any], elemResponse.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def getElements(selector: Selector, elemResponse: js.Array[ElementReference], isReactElement: Boolean): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(selector.asInstanceOf[js.Any], elemResponse.asInstanceOf[js.Any], isReactElement.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
}
