package typings.testingLibraryReact

import org.scalablytyped.runtime.StringDictionary
import typings.prettyFormat.mod.OptionsReceived
import typings.prettyFormat.typesMod.NewPlugin
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Error
import typings.std.Exclude
import typings.std.HTMLDocument
import typings.std.HTMLElement
import typings.std.Pick
import typings.testingLibraryDom.anon.Interval
import typings.testingLibraryDom.anon.PartialConfig
import typings.testingLibraryDom.configMod.Config
import typings.testingLibraryDom.configMod.ConfigFn
import typings.testingLibraryDom.eventsMod.CreateFunction
import typings.testingLibraryDom.eventsMod.CreateObject
import typings.testingLibraryDom.eventsMod.FireFunction
import typings.testingLibraryDom.eventsMod.FireObject
import typings.testingLibraryDom.getQueriesForElementMod.BoundFunction
import typings.testingLibraryDom.getQueriesForElementMod.BoundFunctions
import typings.testingLibraryDom.getQueriesForElementMod.Queries
import typings.testingLibraryDom.matchesMod.DefaultNormalizerOptions
import typings.testingLibraryDom.matchesMod.NormalizerFn
import typings.testingLibraryDom.queriesMod.AllByBoundAttribute
import typings.testingLibraryDom.queriesMod.AllByRole
import typings.testingLibraryDom.queriesMod.AllByText
import typings.testingLibraryDom.queriesMod.FindAllByBoundAttribute
import typings.testingLibraryDom.queriesMod.FindAllByRole_
import typings.testingLibraryDom.queriesMod.FindAllByText_
import typings.testingLibraryDom.queriesMod.FindByBoundAttribute
import typings.testingLibraryDom.queriesMod.FindByRole_
import typings.testingLibraryDom.queriesMod.FindByText_
import typings.testingLibraryDom.queriesMod.GetByBoundAttribute
import typings.testingLibraryDom.queriesMod.GetByRole_
import typings.testingLibraryDom.queriesMod.GetByText_
import typings.testingLibraryDom.queriesMod.QueryByBoundAttribute
import typings.testingLibraryDom.queriesMod.QueryByRole_
import typings.testingLibraryDom.queriesMod.QueryByText_
import typings.testingLibraryDom.queryHelpersMod.AllByAttribute
import typings.testingLibraryDom.queryHelpersMod.BuiltQueryMethods
import typings.testingLibraryDom.queryHelpersMod.GetAllBy
import typings.testingLibraryDom.queryHelpersMod.QueryByAttribute_
import typings.testingLibraryDom.suggestionsMod.Method
import typings.testingLibraryDom.suggestionsMod.Suggestion
import typings.testingLibraryDom.suggestionsMod.Variant
import typings.testingLibraryDom.waitForMod.waitForOptions
import typings.testingLibraryReact.anon.FnCall
import typings.testingLibraryReact.anon.OmitRenderOptionsreadonly
import typings.testingLibraryReact.anon.RenderResultreadonlygetAl
import typings.testingLibraryReact.testingLibraryReactBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@testing-library/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@testing-library/react", "act")
  @js.native
  val act: FnCall | (js.Function1[/* callback */ js.Function0[Unit], Unit]) = js.native
  
  inline def buildQueries[Arguments /* <: js.Array[js.Any] */](
    queryByAll: GetAllBy[Arguments],
    getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
    getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
  ): BuiltQueryMethods[Arguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueries")(queryByAll.asInstanceOf[js.Any], getMultipleError.asInstanceOf[js.Any], getMissingError.asInstanceOf[js.Any])).asInstanceOf[BuiltQueryMethods[Arguments]]
  
  inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
  
  inline def computeHeadingLevel(element: Element): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeHeadingLevel")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def configure(configDelta: PartialConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def configure(configDelta: ConfigFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@testing-library/react", "createEvent")
  @js.native
  val createEvent: CreateObject & CreateFunction = js.native
  
  @JSImport("@testing-library/react", "findAllByAltText")
  @js.native
  val findAllByAltText: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "findAllByDisplayValue")
  @js.native
  val findAllByDisplayValue: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "findAllByLabelText")
  @js.native
  val findAllByLabelText: FindAllByText_ = js.native
  
  @JSImport("@testing-library/react", "findAllByPlaceholderText")
  @js.native
  val findAllByPlaceholderText: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "findAllByRole")
  @js.native
  val findAllByRole: FindAllByRole_ = js.native
  
  @JSImport("@testing-library/react", "findAllByTestId")
  @js.native
  val findAllByTestId: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "findAllByText")
  @js.native
  val findAllByText: FindAllByText_ = js.native
  
  @JSImport("@testing-library/react", "findAllByTitle")
  @js.native
  val findAllByTitle: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "findByAltText")
  @js.native
  val findByAltText: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "findByDisplayValue")
  @js.native
  val findByDisplayValue: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "findByLabelText")
  @js.native
  val findByLabelText: FindByText_ = js.native
  
  @JSImport("@testing-library/react", "findByPlaceholderText")
  @js.native
  val findByPlaceholderText: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "findByRole")
  @js.native
  val findByRole: FindByRole_ = js.native
  
  @JSImport("@testing-library/react", "findByTestId")
  @js.native
  val findByTestId: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "findByText")
  @js.native
  val findByText: FindByText_ = js.native
  
  @JSImport("@testing-library/react", "findByTitle")
  @js.native
  val findByTitle: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "fireEvent")
  @js.native
  val fireEvent: FireFunction & FireObject = js.native
  
  @JSImport("@testing-library/react", "getAllByAltText")
  @js.native
  val getAllByAltText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "getAllByDisplayValue")
  @js.native
  val getAllByDisplayValue: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "getAllByLabelText")
  @js.native
  val getAllByLabelText: AllByText = js.native
  
  @JSImport("@testing-library/react", "getAllByPlaceholderText")
  @js.native
  val getAllByPlaceholderText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "getAllByRole")
  @js.native
  val getAllByRole: AllByRole = js.native
  
  @JSImport("@testing-library/react", "getAllByTestId")
  @js.native
  val getAllByTestId: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "getAllByText")
  @js.native
  val getAllByText: AllByText = js.native
  
  @JSImport("@testing-library/react", "getAllByTitle")
  @js.native
  val getAllByTitle: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "getByAltText")
  @js.native
  val getByAltText: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "getByDisplayValue")
  @js.native
  val getByDisplayValue: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "getByLabelText")
  @js.native
  val getByLabelText: GetByText_ = js.native
  
  @JSImport("@testing-library/react", "getByPlaceholderText")
  @js.native
  val getByPlaceholderText: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "getByRole")
  @js.native
  val getByRole: GetByRole_ = js.native
  
  @JSImport("@testing-library/react", "getByTestId")
  @js.native
  val getByTestId: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "getByText")
  @js.native
  val getByText: GetByText_ = js.native
  
  @JSImport("@testing-library/react", "getByTitle")
  @js.native
  val getByTitle: GetByBoundAttribute = js.native
  
  inline def getConfig(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")().asInstanceOf[Config]
  
  inline def getDefaultNormalizer(): NormalizerFn = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNormalizer")().asInstanceOf[NormalizerFn]
  inline def getDefaultNormalizer(options: DefaultNormalizerOptions): NormalizerFn = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNormalizer")(options.asInstanceOf[js.Any]).asInstanceOf[NormalizerFn]
  
  inline def getElementError(message: String, container: HTMLElement): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementError")(message.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  inline def getNodeText(node: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeText")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getQueriesForElement[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueriesForElement")(element.asInstanceOf[js.Any]).asInstanceOf[BoundFunctions[T]]
  inline def getQueriesForElement[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueriesForElement")(element.asInstanceOf[js.Any], queriesToBind.asInstanceOf[js.Any])).asInstanceOf[BoundFunctions[T]]
  
  inline def getRoles(container: HTMLElement): StringDictionary[js.Array[HTMLElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoles")(container.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Array[HTMLElement]]]
  
  inline def getSuggestedQuery(element: HTMLElement): js.UndefOr[Suggestion] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Suggestion]]
  inline def getSuggestedQuery(element: HTMLElement, variant: Unit, method: Method): js.UndefOr[Suggestion] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any], variant.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Suggestion]]
  inline def getSuggestedQuery(element: HTMLElement, variant: Variant): js.UndefOr[Suggestion] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Suggestion]]
  inline def getSuggestedQuery(element: HTMLElement, variant: Variant, method: Method): js.UndefOr[Suggestion] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any], variant.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Suggestion]]
  
  inline def isInaccessible(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInaccessible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def logDOM(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")().asInstanceOf[Unit]
  inline def logDOM(dom: Unit, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: Unit, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: Unit, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def logDOM(dom: Element, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: Element, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: Element, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: HTMLDocument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def logDOM(dom: HTMLDocument, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: HTMLDocument, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logRoles(container: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("logRoles")(container.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def prettyDOM(): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")().asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Unit, maxLength: Double): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Unit, maxLength: Double, options: OptionsReceived): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Unit, maxLength: Unit, options: OptionsReceived): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Element): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Element, maxLength: Double): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Element, maxLength: Double, options: OptionsReceived): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Element, maxLength: Unit, options: OptionsReceived): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: HTMLDocument): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: HTMLDocument, maxLength: Double): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: HTMLDocument, maxLength: Unit, options: OptionsReceived): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  
  object prettyFormat {
    
    /**
      * Returns a presentation string of your `val` object
      * @param val any potential JavaScript object
      * @param options Custom settings
      */
    inline def apply(`val`: js.Any): String = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(`val`: js.Any, options: typings.prettyFormat.typesMod.OptionsReceived): String = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@testing-library/react", "prettyFormat")
    @js.native
    val ^ : js.Any = js.native
    
    object plugins {
      
      @JSImport("@testing-library/react", "prettyFormat.plugins")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@testing-library/react", "prettyFormat.plugins.AsymmetricMatcher")
      @js.native
      def AsymmetricMatcher: NewPlugin = js.native
      inline def AsymmetricMatcher_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsymmetricMatcher")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.plugins.ConvertAnsi")
      @js.native
      def ConvertAnsi: NewPlugin = js.native
      inline def ConvertAnsi_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvertAnsi")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.plugins.DOMCollection")
      @js.native
      def DOMCollection: NewPlugin = js.native
      inline def DOMCollection_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMCollection")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.plugins.DOMElement")
      @js.native
      def DOMElement: NewPlugin = js.native
      inline def DOMElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMElement")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.plugins.Immutable")
      @js.native
      def Immutable: NewPlugin = js.native
      inline def Immutable_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Immutable")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.plugins.ReactElement")
      @js.native
      def ReactElement: NewPlugin = js.native
      inline def ReactElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactElement")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.plugins.ReactTestComponent")
      @js.native
      def ReactTestComponent: NewPlugin = js.native
      inline def ReactTestComponent_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactTestComponent")(x.asInstanceOf[js.Any])
    }
  }
  
  object queries {
    
    @JSImport("@testing-library/react", "queries.findAllByAltText")
    @js.native
    val findAllByAltText: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.findAllByDisplayValue")
    @js.native
    val findAllByDisplayValue: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.findAllByLabelText")
    @js.native
    val findAllByLabelText: FindAllByText_ = js.native
    
    @JSImport("@testing-library/react", "queries.findAllByPlaceholderText")
    @js.native
    val findAllByPlaceholderText: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.findAllByRole")
    @js.native
    val findAllByRole: FindAllByRole_ = js.native
    
    @JSImport("@testing-library/react", "queries.findAllByTestId")
    @js.native
    val findAllByTestId: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.findAllByText")
    @js.native
    val findAllByText: FindAllByText_ = js.native
    
    @JSImport("@testing-library/react", "queries.findAllByTitle")
    @js.native
    val findAllByTitle: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.findByAltText")
    @js.native
    val findByAltText: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.findByDisplayValue")
    @js.native
    val findByDisplayValue: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.findByLabelText")
    @js.native
    val findByLabelText: FindByText_ = js.native
    
    @JSImport("@testing-library/react", "queries.findByPlaceholderText")
    @js.native
    val findByPlaceholderText: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.findByRole")
    @js.native
    val findByRole: FindByRole_ = js.native
    
    @JSImport("@testing-library/react", "queries.findByTestId")
    @js.native
    val findByTestId: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.findByText")
    @js.native
    val findByText: FindByText_ = js.native
    
    @JSImport("@testing-library/react", "queries.findByTitle")
    @js.native
    val findByTitle: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.getAllByAltText")
    @js.native
    val getAllByAltText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.getAllByDisplayValue")
    @js.native
    val getAllByDisplayValue: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.getAllByLabelText")
    @js.native
    val getAllByLabelText: AllByText = js.native
    
    @JSImport("@testing-library/react", "queries.getAllByPlaceholderText")
    @js.native
    val getAllByPlaceholderText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.getAllByRole")
    @js.native
    val getAllByRole: AllByRole = js.native
    
    @JSImport("@testing-library/react", "queries.getAllByTestId")
    @js.native
    val getAllByTestId: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.getAllByText")
    @js.native
    val getAllByText: AllByText = js.native
    
    @JSImport("@testing-library/react", "queries.getAllByTitle")
    @js.native
    val getAllByTitle: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.getByAltText")
    @js.native
    val getByAltText: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.getByDisplayValue")
    @js.native
    val getByDisplayValue: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.getByLabelText")
    @js.native
    val getByLabelText: GetByText_ = js.native
    
    @JSImport("@testing-library/react", "queries.getByPlaceholderText")
    @js.native
    val getByPlaceholderText: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.getByRole")
    @js.native
    val getByRole: GetByRole_ = js.native
    
    @JSImport("@testing-library/react", "queries.getByTestId")
    @js.native
    val getByTestId: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.getByText")
    @js.native
    val getByText: GetByText_ = js.native
    
    @JSImport("@testing-library/react", "queries.getByTitle")
    @js.native
    val getByTitle: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.queryAllByAltText")
    @js.native
    val queryAllByAltText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.queryAllByDisplayValue")
    @js.native
    val queryAllByDisplayValue: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.queryAllByLabelText")
    @js.native
    val queryAllByLabelText: AllByText = js.native
    
    @JSImport("@testing-library/react", "queries.queryAllByPlaceholderText")
    @js.native
    val queryAllByPlaceholderText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.queryAllByRole")
    @js.native
    val queryAllByRole: AllByRole = js.native
    
    @JSImport("@testing-library/react", "queries.queryAllByTestId")
    @js.native
    val queryAllByTestId: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.queryAllByText")
    @js.native
    val queryAllByText: AllByText = js.native
    
    @JSImport("@testing-library/react", "queries.queryAllByTitle")
    @js.native
    val queryAllByTitle: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.queryByAltText")
    @js.native
    val queryByAltText: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.queryByDisplayValue")
    @js.native
    val queryByDisplayValue: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.queryByLabelText")
    @js.native
    val queryByLabelText: QueryByText_ = js.native
    
    @JSImport("@testing-library/react", "queries.queryByPlaceholderText")
    @js.native
    val queryByPlaceholderText: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.queryByRole")
    @js.native
    val queryByRole: QueryByRole_ = js.native
    
    @JSImport("@testing-library/react", "queries.queryByTestId")
    @js.native
    val queryByTestId: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/react", "queries.queryByText")
    @js.native
    val queryByText: QueryByText_ = js.native
    
    @JSImport("@testing-library/react", "queries.queryByTitle")
    @js.native
    val queryByTitle: QueryByBoundAttribute = js.native
  }
  
  @JSImport("@testing-library/react", "queryAllByAltText")
  @js.native
  val queryAllByAltText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "queryAllByAttribute")
  @js.native
  val queryAllByAttribute: AllByAttribute = js.native
  
  @JSImport("@testing-library/react", "queryAllByDisplayValue")
  @js.native
  val queryAllByDisplayValue: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "queryAllByLabelText")
  @js.native
  val queryAllByLabelText: AllByText = js.native
  
  @JSImport("@testing-library/react", "queryAllByPlaceholderText")
  @js.native
  val queryAllByPlaceholderText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "queryAllByRole")
  @js.native
  val queryAllByRole: AllByRole = js.native
  
  @JSImport("@testing-library/react", "queryAllByTestId")
  @js.native
  val queryAllByTestId: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "queryAllByText")
  @js.native
  val queryAllByText: AllByText = js.native
  
  @JSImport("@testing-library/react", "queryAllByTitle")
  @js.native
  val queryAllByTitle: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "queryByAltText")
  @js.native
  val queryByAltText: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "queryByAttribute")
  @js.native
  val queryByAttribute: QueryByAttribute_ = js.native
  
  @JSImport("@testing-library/react", "queryByDisplayValue")
  @js.native
  val queryByDisplayValue: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "queryByLabelText")
  @js.native
  val queryByLabelText: QueryByText_ = js.native
  
  @JSImport("@testing-library/react", "queryByPlaceholderText")
  @js.native
  val queryByPlaceholderText: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "queryByRole")
  @js.native
  val queryByRole: QueryByRole_ = js.native
  
  @JSImport("@testing-library/react", "queryByTestId")
  @js.native
  val queryByTestId: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/react", "queryByText")
  @js.native
  val queryByText: QueryByText_ = js.native
  
  @JSImport("@testing-library/react", "queryByTitle")
  @js.native
  val queryByTitle: QueryByBoundAttribute = js.native
  
  object queryHelpers {
    
    @JSImport("@testing-library/react", "queryHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildQueries[Arguments /* <: js.Array[js.Any] */](
      queryByAll: GetAllBy[Arguments],
      getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
      getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
    ): BuiltQueryMethods[Arguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueries")(queryByAll.asInstanceOf[js.Any], getMultipleError.asInstanceOf[js.Any], getMissingError.asInstanceOf[js.Any])).asInstanceOf[BuiltQueryMethods[Arguments]]
    
    inline def getElementError(message: String, container: HTMLElement): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementError")(message.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Error]
    
    @JSImport("@testing-library/react", "queryHelpers.queryAllByAttribute")
    @js.native
    val queryAllByAttribute: AllByAttribute = js.native
    
    @JSImport("@testing-library/react", "queryHelpers.queryByAttribute")
    @js.native
    val queryByAttribute: QueryByAttribute_ = js.native
  }
  
  inline def render(ui: ReactElement): RenderResultreadonlygetAl = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(ui.asInstanceOf[js.Any]).asInstanceOf[RenderResultreadonlygetAl]
  inline def render(ui: ReactElement, options: OmitRenderOptionsreadonly): RenderResultreadonlygetAl = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(ui.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RenderResultreadonlygetAl]
  inline def render[Q /* <: Queries */](ui: ReactElement, options: RenderOptions[Q]): RenderResult[Q] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(ui.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RenderResult[Q]]
  
  /* Inlined @testing-library/dom.@testing-library/dom/types/screen.Screen<{ readonly getByLabelText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly getAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly queryByLabelText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly queryAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly findAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly getByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly getAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly queryByText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly queryAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly findAllByText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly getByAltText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByAltText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByTitle :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTitle :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByRole :@testing-library/dom.@testing-library/dom/types/queries.GetByRole,  readonly getAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly queryByRole :@testing-library/dom.@testing-library/dom/types/queries.QueryByRole,  readonly queryAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly findByRole :@testing-library/dom.@testing-library/dom/types/queries.FindByRole,  readonly findAllByRole :@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole,  readonly getByTestId :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTestId :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute}> */
  object screen {
    
    @JSImport("@testing-library/react", "screen")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convenience function for `pretty-dom` which also allows an array
      * of elements
      */
    inline def debug(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")().asInstanceOf[Unit]
    inline def debug(element: js.Array[Element | HTMLDocument]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def debug(element: js.Array[Element | HTMLDocument], maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debug(element: js.Array[Element | HTMLDocument], maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debug(element: js.Array[Element | HTMLDocument], maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debug(element: Unit, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debug(element: Unit, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debug(element: Unit, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debug(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def debug(element: Element, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debug(element: Element, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debug(element: Element, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debug(element: HTMLDocument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def debug(element: HTMLDocument, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debug(element: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debug(element: HTMLDocument, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@testing-library/react", "screen.findAllByAltText")
    @js.native
    def findAllByAltText: BoundFunction[FindAllByBoundAttribute] = js.native
    inline def findAllByAltText_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findAllByDisplayValue")
    @js.native
    def findAllByDisplayValue: BoundFunction[FindAllByBoundAttribute] = js.native
    inline def findAllByDisplayValue_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findAllByLabelText")
    @js.native
    def findAllByLabelText: BoundFunction[FindAllByText_] = js.native
    inline def findAllByLabelText_=(x: BoundFunction[FindAllByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findAllByPlaceholderText")
    @js.native
    def findAllByPlaceholderText: BoundFunction[FindAllByBoundAttribute] = js.native
    inline def findAllByPlaceholderText_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findAllByRole")
    @js.native
    def findAllByRole: BoundFunction[FindAllByRole_] = js.native
    inline def findAllByRole_=(x: BoundFunction[FindAllByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findAllByTestId")
    @js.native
    def findAllByTestId: BoundFunction[FindAllByBoundAttribute] = js.native
    inline def findAllByTestId_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findAllByText")
    @js.native
    def findAllByText: BoundFunction[FindAllByText_] = js.native
    inline def findAllByText_=(x: BoundFunction[FindAllByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findAllByTitle")
    @js.native
    def findAllByTitle: BoundFunction[FindAllByBoundAttribute] = js.native
    inline def findAllByTitle_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findByAltText")
    @js.native
    def findByAltText: BoundFunction[FindByBoundAttribute] = js.native
    inline def findByAltText_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findByDisplayValue")
    @js.native
    def findByDisplayValue: BoundFunction[FindByBoundAttribute] = js.native
    inline def findByDisplayValue_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findByLabelText")
    @js.native
    def findByLabelText: BoundFunction[FindByText_] = js.native
    inline def findByLabelText_=(x: BoundFunction[FindByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findByPlaceholderText")
    @js.native
    def findByPlaceholderText: BoundFunction[FindByBoundAttribute] = js.native
    inline def findByPlaceholderText_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findByRole")
    @js.native
    def findByRole: BoundFunction[FindByRole_] = js.native
    inline def findByRole_=(x: BoundFunction[FindByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findByTestId")
    @js.native
    def findByTestId: BoundFunction[FindByBoundAttribute] = js.native
    inline def findByTestId_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findByText")
    @js.native
    def findByText: BoundFunction[FindByText_] = js.native
    inline def findByText_=(x: BoundFunction[FindByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.findByTitle")
    @js.native
    def findByTitle: BoundFunction[FindByBoundAttribute] = js.native
    inline def findByTitle_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getAllByAltText")
    @js.native
    def getAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    inline def getAllByAltText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getAllByDisplayValue")
    @js.native
    def getAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    inline def getAllByDisplayValue_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getAllByLabelText")
    @js.native
    def getAllByLabelText: BoundFunction[AllByText] = js.native
    inline def getAllByLabelText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getAllByPlaceholderText")
    @js.native
    def getAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    inline def getAllByPlaceholderText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getAllByRole")
    @js.native
    def getAllByRole: BoundFunction[AllByRole] = js.native
    inline def getAllByRole_=(x: BoundFunction[AllByRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getAllByTestId")
    @js.native
    def getAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    inline def getAllByTestId_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getAllByText")
    @js.native
    def getAllByText: BoundFunction[AllByText] = js.native
    inline def getAllByText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getAllByTitle")
    @js.native
    def getAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    inline def getAllByTitle_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getByAltText")
    @js.native
    def getByAltText: BoundFunction[GetByBoundAttribute] = js.native
    inline def getByAltText_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getByDisplayValue")
    @js.native
    def getByDisplayValue: BoundFunction[GetByBoundAttribute] = js.native
    inline def getByDisplayValue_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getByLabelText")
    @js.native
    def getByLabelText: BoundFunction[GetByText_] = js.native
    inline def getByLabelText_=(x: BoundFunction[GetByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getByPlaceholderText")
    @js.native
    def getByPlaceholderText: BoundFunction[GetByBoundAttribute] = js.native
    inline def getByPlaceholderText_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getByRole")
    @js.native
    def getByRole: BoundFunction[GetByRole_] = js.native
    inline def getByRole_=(x: BoundFunction[GetByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getByTestId")
    @js.native
    def getByTestId: BoundFunction[GetByBoundAttribute] = js.native
    inline def getByTestId_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getByText")
    @js.native
    def getByText: BoundFunction[GetByText_] = js.native
    inline def getByText_=(x: BoundFunction[GetByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.getByTitle")
    @js.native
    def getByTitle: BoundFunction[GetByBoundAttribute] = js.native
    inline def getByTitle_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByTitle")(x.asInstanceOf[js.Any])
    
    /**
      * Convenience function for `Testing Playground` which logs URL that
      * can be opened in a browser
      */
    inline def logTestingPlaygroundURL(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logTestingPlaygroundURL")().asInstanceOf[Unit]
    inline def logTestingPlaygroundURL(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logTestingPlaygroundURL")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def logTestingPlaygroundURL(element: HTMLDocument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logTestingPlaygroundURL")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@testing-library/react", "screen.queryAllByAltText")
    @js.native
    def queryAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    inline def queryAllByAltText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryAllByDisplayValue")
    @js.native
    def queryAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    inline def queryAllByDisplayValue_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryAllByLabelText")
    @js.native
    def queryAllByLabelText: BoundFunction[AllByText] = js.native
    inline def queryAllByLabelText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryAllByPlaceholderText")
    @js.native
    def queryAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    inline def queryAllByPlaceholderText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryAllByRole")
    @js.native
    def queryAllByRole: BoundFunction[AllByRole] = js.native
    inline def queryAllByRole_=(x: BoundFunction[AllByRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryAllByTestId")
    @js.native
    def queryAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    inline def queryAllByTestId_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryAllByText")
    @js.native
    def queryAllByText: BoundFunction[AllByText] = js.native
    inline def queryAllByText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryAllByTitle")
    @js.native
    def queryAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    inline def queryAllByTitle_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryByAltText")
    @js.native
    def queryByAltText: BoundFunction[QueryByBoundAttribute] = js.native
    inline def queryByAltText_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryByDisplayValue")
    @js.native
    def queryByDisplayValue: BoundFunction[QueryByBoundAttribute] = js.native
    inline def queryByDisplayValue_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryByLabelText")
    @js.native
    def queryByLabelText: BoundFunction[QueryByText_] = js.native
    inline def queryByLabelText_=(x: BoundFunction[QueryByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryByPlaceholderText")
    @js.native
    def queryByPlaceholderText: BoundFunction[QueryByBoundAttribute] = js.native
    inline def queryByPlaceholderText_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryByRole")
    @js.native
    def queryByRole: BoundFunction[QueryByRole_] = js.native
    inline def queryByRole_=(x: BoundFunction[QueryByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryByTestId")
    @js.native
    def queryByTestId: BoundFunction[QueryByBoundAttribute] = js.native
    inline def queryByTestId_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryByText")
    @js.native
    def queryByText: BoundFunction[QueryByText_] = js.native
    inline def queryByText_=(x: BoundFunction[QueryByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react", "screen.queryByTitle")
    @js.native
    def queryByTitle: BoundFunction[QueryByBoundAttribute] = js.native
    inline def queryByTitle_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByTitle")(x.asInstanceOf[js.Any])
  }
  
  inline def waitFor[T](callback: js.Function0[T | js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def waitFor[T](callback: js.Function0[T | js.Promise[T]], options: waitForOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def waitForDomChange(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForDomChange")().asInstanceOf[js.Promise[js.Any]]
  inline def waitForDomChange(options: waitForOptions): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForDomChange")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  inline def waitForElement[T](callback: js.Function0[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForElement")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def waitForElement[T](callback: js.Function0[T], options: waitForOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElement")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def waitForElementToBeRemoved[T](callback: T): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitForElementToBeRemoved[T](callback: T, options: waitForOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForElementToBeRemoved[T](callback: js.Function0[T]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitForElementToBeRemoved[T](callback: js.Function0[T], options: waitForOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def wait_(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")().asInstanceOf[js.Promise[Unit]]
  inline def wait_(callback: js.Function0[Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def wait_(callback: js.Function0[Unit], options: Interval): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def wait_(callback: Unit, options: Interval): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* was `typeof getQueriesForElement` */
  inline def within[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("within")(element.asInstanceOf[js.Any]).asInstanceOf[BoundFunctions[T]]
  inline def within[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(element.asInstanceOf[js.Any], queriesToBind.asInstanceOf[js.Any])).asInstanceOf[BoundFunctions[T]]
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait RenderOptions[Q /* <: Queries */] extends StObject {
    
    var baseElement: js.UndefOr[Element] = js.undefined
    
    var container: js.UndefOr[Element] = js.undefined
    
    var hydrate: js.UndefOr[Boolean] = js.undefined
    
    var queries: js.UndefOr[Q] = js.undefined
    
    var wrapper: js.UndefOr[ComponentType[js.Object]] = js.undefined
  }
  object RenderOptions {
    
    inline def apply[Q /* <: Queries */](): RenderOptions[Q] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions[Q]]
    }
    
    extension [Self <: RenderOptions[?], Q /* <: Queries */](x: Self & RenderOptions[Q]) {
      
      inline def setBaseElement(value: Element): Self = StObject.set(x, "baseElement", value.asInstanceOf[js.Any])
      
      inline def setBaseElementUndefined: Self = StObject.set(x, "baseElement", js.undefined)
      
      inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setHydrate(value: Boolean): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
      
      inline def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
      
      inline def setQueries(value: Q): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
      
      inline def setWrapper(value: ComponentType[js.Object]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  @js.native
  trait RenderResult[Q /* <: Queries */] extends StObject {
    
    def asFragment(): DocumentFragment = js.native
    
    var baseElement: Element = js.native
    
    var container: Element = js.native
    
    def debug(): Unit = js.native
    def debug(baseElement: js.Array[Element | DocumentFragment]): Unit = js.native
    def debug(baseElement: js.Array[Element | DocumentFragment], maxLength: Double): Unit = js.native
    def debug(baseElement: js.Array[Element | DocumentFragment], maxLength: Double, options: OptionsReceived): Unit = js.native
    def debug(baseElement: js.Array[Element | DocumentFragment], maxLength: Unit, options: OptionsReceived): Unit = js.native
    def debug(baseElement: Unit, maxLength: Double): Unit = js.native
    def debug(baseElement: Unit, maxLength: Double, options: OptionsReceived): Unit = js.native
    def debug(baseElement: Unit, maxLength: Unit, options: OptionsReceived): Unit = js.native
    def debug(baseElement: DocumentFragment): Unit = js.native
    def debug(baseElement: DocumentFragment, maxLength: Double): Unit = js.native
    def debug(baseElement: DocumentFragment, maxLength: Double, options: OptionsReceived): Unit = js.native
    def debug(baseElement: DocumentFragment, maxLength: Unit, options: OptionsReceived): Unit = js.native
    def debug(baseElement: Element): Unit = js.native
    def debug(baseElement: Element, maxLength: Double): Unit = js.native
    def debug(baseElement: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
    def debug(baseElement: Element, maxLength: Unit, options: OptionsReceived): Unit = js.native
    
    def rerender(ui: ReactElement): Unit = js.native
    
    def unmount(): Boolean = js.native
  }
}
