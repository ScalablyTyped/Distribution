package typings.webdriverio

import typings.std.Element
import typings.std.HTMLElement
import typings.std.Record
import typings.wdioProtocols.buildTypesMod.ElementReference
import typings.wdioProtocols.buildTypesMod.RectReturn
import typings.wdioTypes.buildOptionsMod.SupportedProtocols
import typings.wdioTypes.buildOptionsMod.Testrunner
import typings.wdioTypes.buildOptionsMod.WebdriverIO
import typings.webdriverio.anon.ScrollX
import typings.webdriverio.buildTypesMod.CustomLocatorReturnValue
import typings.webdriverio.buildTypesMod.ElementArray
import typings.webdriverio.buildTypesMod.ParsedCSSValue
import typings.webdriverio.buildTypesMod.Selector
import typings.webdriverio.webdriverioStrings.browser
import typings.webdriverio.webdriverioStrings.element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsMod {
  
  @JSImport("webdriverio/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addLocatorStrategyHandler(
    scope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MultiRemoteBrowser */ Any
  ): js.Function2[
    /* name */ String, 
    /* func */ js.Function2[/* selector */ String, /* root */ js.UndefOr[HTMLElement], CustomLocatorReturnValue], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("addLocatorStrategyHandler")(scope.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ String, 
    /* func */ js.Function2[/* selector */ String, /* root */ js.UndefOr[HTMLElement], CustomLocatorReturnValue], 
    Unit
  ]]
  
  inline def assertDirectoryExists(filepath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDirectoryExists")(filepath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def checkUnicode(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkUnicode")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def checkUnicode(value: String, isDevTools: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUnicode")(value.asInstanceOf[js.Any], isDevTools.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def containsHeaderObject(base: Record[String, String], `match`: Record[String, String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsHeaderObject")(base.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def enhanceElementsArray(
    elements: ElementArray,
    parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any,
    selector: js.Array[Element | ElementReference]
  ): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(
    elements: ElementArray,
    parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any,
    selector: js.Array[Element | ElementReference],
    foundWith: String
  ): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(
    elements: ElementArray,
    parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any,
    selector: js.Array[Element | ElementReference],
    foundWith: String,
    props: js.Array[Any]
  ): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(
    elements: ElementArray,
    parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any,
    selector: js.Array[Element | ElementReference],
    foundWith: Unit,
    props: js.Array[Any]
  ): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(
    elements: ElementArray,
    parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any,
    selector: Selector
  ): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(
    elements: ElementArray,
    parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any,
    selector: Selector,
    foundWith: String
  ): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(
    elements: ElementArray,
    parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any,
    selector: Selector,
    foundWith: String,
    props: js.Array[Any]
  ): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(
    elements: ElementArray,
    parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any,
    selector: Selector,
    foundWith: Unit,
    props: js.Array[Any]
  ): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(elements: ElementArray, parent: Element, selector: js.Array[Element | ElementReference]): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(
    elements: ElementArray,
    parent: Element,
    selector: js.Array[Element | ElementReference],
    foundWith: String
  ): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(
    elements: ElementArray,
    parent: Element,
    selector: js.Array[Element | ElementReference],
    foundWith: String,
    props: js.Array[Any]
  ): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(
    elements: ElementArray,
    parent: Element,
    selector: js.Array[Element | ElementReference],
    foundWith: Unit,
    props: js.Array[Any]
  ): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(elements: ElementArray, parent: Element, selector: Selector): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(elements: ElementArray, parent: Element, selector: Selector, foundWith: String): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(
    elements: ElementArray,
    parent: Element,
    selector: Selector,
    foundWith: String,
    props: js.Array[Any]
  ): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  inline def enhanceElementsArray(elements: ElementArray, parent: Element, selector: Selector, foundWith: Unit, props: js.Array[Any]): ElementArray = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceElementsArray")(elements.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], foundWith.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ElementArray]
  
  inline def findElement(selector: Selector): js.Promise[js.Error | ElementReference] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Error | ElementReference]]
  
  inline def findElements(selector: Selector): js.Promise[js.Array[ElementReference]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElements")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ElementReference]]]
  
  inline def getAbsoluteFilepath(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbsoluteFilepath")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getAutomationProtocol(config: Testrunner): js.Promise[SupportedProtocols] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutomationProtocol")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SupportedProtocols]]
  inline def getAutomationProtocol(config: WebdriverIO): js.Promise[SupportedProtocols] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutomationProtocol")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SupportedProtocols]]
  
  inline def getBrowserObject(
    elem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowserObject")(elem.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getBrowserObject(elem: Element): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowserObject")(elem.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getElementFromResponse(res: ElementReference): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementFromResponse")(res.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getElementRect(scope: Element): js.Promise[RectReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(scope.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RectReturn]]
  
  inline def getPrototype(scope: browser | element): Record[String, js.PropertyDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototype")(scope.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.PropertyDescriptor]]
  
  inline def getScrollPosition(scope: Element): js.Promise[ScrollX] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollPosition")(scope.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ScrollX]]
  
  inline def hasElementId(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasElementId")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isStub(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStub")().asInstanceOf[Boolean]
  inline def isStub(automationProtocol: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStub")(automationProtocol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseCSS(cssPropertyValue: String): ParsedCSSValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCSS")(cssPropertyValue.asInstanceOf[js.Any]).asInstanceOf[ParsedCSSValue]
  inline def parseCSS(cssPropertyValue: String, cssProperty: String): ParsedCSSValue = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCSS")(cssPropertyValue.asInstanceOf[js.Any], cssProperty.asInstanceOf[js.Any])).asInstanceOf[ParsedCSSValue]
  
  inline def transformToCharString(value: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformToCharString")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformToCharString(value: Any, translateToUnicode: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformToCharString")(value.asInstanceOf[js.Any], translateToUnicode.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def updateCapabilities(params: Testrunner): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateCapabilities")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def updateCapabilities(params: Testrunner, automationProtocol: SupportedProtocols): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCapabilities")(params.asInstanceOf[js.Any], automationProtocol.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def updateCapabilities(params: WebdriverIO): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateCapabilities")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def updateCapabilities(params: WebdriverIO, automationProtocol: SupportedProtocols): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCapabilities")(params.asInstanceOf[js.Any], automationProtocol.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def validateUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validateUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def validateUrl(url: String, origError: js.Error): String = (^.asInstanceOf[js.Dynamic].applyDynamic("validateUrl")(url.asInstanceOf[js.Any], origError.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def verifyArgsAndStripIfElement(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyArgsAndStripIfElement")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
}
