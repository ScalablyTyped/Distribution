package typings.webdriverio

import typings.webdriverio.anon.NOTFIBER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("webdriverio/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addLocatorStrategyHandler(scope: js.Any): js.Function2[/* name */ js.Any, /* script */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addLocatorStrategyHandler")(scope.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* name */ js.Any, /* script */ js.Any, Unit]]
  
  inline def assertDirectoryExists(filepath: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDirectoryExists")(filepath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def checkUnicode(value: String, isDevTools: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUnicode")(value.asInstanceOf[js.Any], isDevTools.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def containsHeaderObject(base: js.Object, `match`: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsHeaderObject")(base.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def enhanceElementsArray(elements: js.Array[js.Object], parent: js.Object, selector: String): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def enhanceElementsArray(elements: js.Array[js.Object], parent: js.Object, selector: String, foundWith: String): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def enhanceElementsArray(
    elements: js.Array[js.Object],
    parent: js.Object,
    selector: String,
    foundWith: String,
    props: js.Array[js.Any]
  ): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def enhanceElementsArray(
    elements: js.Array[js.Object],
    parent: js.Object,
    selector: String,
    foundWith: Unit,
    props: js.Array[js.Any]
  ): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def enhanceElementsArray(elements: js.Array[js.Object], parent: js.Object, selector: js.Function): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def enhanceElementsArray(elements: js.Array[js.Object], parent: js.Object, selector: js.Function, foundWith: String): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def enhanceElementsArray(
    elements: js.Array[js.Object],
    parent: js.Object,
    selector: js.Function,
    foundWith: String,
    props: js.Array[js.Any]
  ): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def enhanceElementsArray(
    elements: js.Array[js.Object],
    parent: js.Object,
    selector: js.Function,
    foundWith: Unit,
    props: js.Array[js.Any]
  ): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  
  inline def findElement(selector: js.Any): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  inline def findElements(selector: js.Any): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElements")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  inline def getAbsoluteFilepath(filepath: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbsoluteFilepath")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getAutomationProtocol(config: js.Any): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutomationProtocol")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  inline def getBrowserObject(elem: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowserObject")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getElementFromResponse(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementFromResponse")().asInstanceOf[String | Null]
  inline def getElementFromResponse(res: js.Object): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementFromResponse")(res.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getElementRect(scope: js.Any): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(scope.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  inline def getPrototype(scope: js.Any): NOTFIBER = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototype")(scope.asInstanceOf[js.Any]).asInstanceOf[NOTFIBER]
  
  inline def getScrollPosition(scope: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollPosition")(scope.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def hasElementId(element: js.Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasElementId")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isStub(automationProtocol: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStub")(automationProtocol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseCSS(cssPropertyValue: js.Object, cssProperty: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCSS")(cssPropertyValue.asInstanceOf[js.Any], cssProperty.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def transformToCharString(value: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformToCharString")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def transformToCharString(value: js.Any, translateToUnicode: Boolean): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformToCharString")(value.asInstanceOf[js.Any], translateToUnicode.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def updateCapabilities(params: js.Any, automationProtocol: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCapabilities")(params.asInstanceOf[js.Any], automationProtocol.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def validateUrl(url: String, origError: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("validateUrl")(url.asInstanceOf[js.Any], origError.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def verifyArgsAndStripIfElement(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyArgsAndStripIfElement")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
