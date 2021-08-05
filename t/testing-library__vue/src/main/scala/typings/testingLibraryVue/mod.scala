package typings.testingLibraryVue

import org.scalablytyped.runtime.StringDictionary
import typings.prettyFormat.mod.OptionsReceived
import typings.prettyFormat.typesMod.NewPlugin
import typings.std.Document
import typings.std.Element
import typings.std.Error
import typings.std.HTMLDocument
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLOptionElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import typings.std.Partial
import typings.std.Record
import typings.std.Window
import typings.testingLibraryDom.anon.Interval
import typings.testingLibraryDom.anon.PartialConfig
import typings.testingLibraryDom.configMod.Config
import typings.testingLibraryDom.configMod.ConfigFn
import typings.testingLibraryDom.eventsMod.CreateFunction
import typings.testingLibraryDom.eventsMod.CreateObject
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
import typings.testingLibraryVue.testingLibraryVueBooleans.`false`
import typings.vue.anon.Event
import typings.vue.optionsMod.AsyncComponent
import typings.vue.optionsMod.Component
import typings.vue.optionsMod.ComponentOptions
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.DirectiveFunction
import typings.vue.optionsMod.DirectiveOptions
import typings.vue.optionsMod.InjectOptions
import typings.vue.optionsMod.PropsDefinition
import typings.vue.optionsMod.RenderContext
import typings.vue.optionsMod.WatchHandler
import typings.vue.optionsMod.WatchOptionsWithHandler
import typings.vue.vnodeMod.VNode
import typings.vue.vnodeMod.VNodeData
import typings.vue.vueMod.CreateElement
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueRouter.mod.default
import typings.vueRouter.routerMod.RouteConfig
import typings.vueTestUtils.mod.Slots
import typings.vueTestUtils.mod.Stubs
import typings.vueTestUtils.mod.ThisTypedMountOptions
import typings.vueTestUtils.mod.VueClass
import typings.vuex.mod.Store
import typings.vuex.mod.StoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@testing-library/vue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildQueries[Arguments /* <: js.Array[js.Any] */](
    queryByAll: GetAllBy[Arguments],
    getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
    getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
  ): BuiltQueryMethods[Arguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueries")(queryByAll.asInstanceOf[js.Any], getMultipleError.asInstanceOf[js.Any], getMissingError.asInstanceOf[js.Any])).asInstanceOf[BuiltQueryMethods[Arguments]]
  
  inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
  
  inline def computeHeadingLevel(element: Element): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeHeadingLevel")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def configure(configDelta: PartialConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def configure(configDelta: ConfigFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@testing-library/vue", "createEvent")
  @js.native
  val createEvent: CreateObject & CreateFunction = js.native
  
  @JSImport("@testing-library/vue", "findAllByAltText")
  @js.native
  val findAllByAltText: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "findAllByDisplayValue")
  @js.native
  val findAllByDisplayValue: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "findAllByLabelText")
  @js.native
  val findAllByLabelText: FindAllByText_ = js.native
  
  @JSImport("@testing-library/vue", "findAllByPlaceholderText")
  @js.native
  val findAllByPlaceholderText: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "findAllByRole")
  @js.native
  val findAllByRole: FindAllByRole_ = js.native
  
  @JSImport("@testing-library/vue", "findAllByTestId")
  @js.native
  val findAllByTestId: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "findAllByText")
  @js.native
  val findAllByText: FindAllByText_ = js.native
  
  @JSImport("@testing-library/vue", "findAllByTitle")
  @js.native
  val findAllByTitle: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "findByAltText")
  @js.native
  val findByAltText: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "findByDisplayValue")
  @js.native
  val findByDisplayValue: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "findByLabelText")
  @js.native
  val findByLabelText: FindByText_ = js.native
  
  @JSImport("@testing-library/vue", "findByPlaceholderText")
  @js.native
  val findByPlaceholderText: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "findByRole")
  @js.native
  val findByRole: FindByRole_ = js.native
  
  @JSImport("@testing-library/vue", "findByTestId")
  @js.native
  val findByTestId: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "findByText")
  @js.native
  val findByText: FindByText_ = js.native
  
  @JSImport("@testing-library/vue", "findByTitle")
  @js.native
  val findByTitle: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "fireEvent")
  @js.native
  val fireEvent: VueFireObject = js.native
  
  @JSImport("@testing-library/vue", "getAllByAltText")
  @js.native
  val getAllByAltText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "getAllByDisplayValue")
  @js.native
  val getAllByDisplayValue: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "getAllByLabelText")
  @js.native
  val getAllByLabelText: AllByText = js.native
  
  @JSImport("@testing-library/vue", "getAllByPlaceholderText")
  @js.native
  val getAllByPlaceholderText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "getAllByRole")
  @js.native
  val getAllByRole: AllByRole = js.native
  
  @JSImport("@testing-library/vue", "getAllByTestId")
  @js.native
  val getAllByTestId: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "getAllByText")
  @js.native
  val getAllByText: AllByText = js.native
  
  @JSImport("@testing-library/vue", "getAllByTitle")
  @js.native
  val getAllByTitle: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "getByAltText")
  @js.native
  val getByAltText: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "getByDisplayValue")
  @js.native
  val getByDisplayValue: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "getByLabelText")
  @js.native
  val getByLabelText: GetByText_ = js.native
  
  @JSImport("@testing-library/vue", "getByPlaceholderText")
  @js.native
  val getByPlaceholderText: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "getByRole")
  @js.native
  val getByRole: GetByRole_ = js.native
  
  @JSImport("@testing-library/vue", "getByTestId")
  @js.native
  val getByTestId: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "getByText")
  @js.native
  val getByText: GetByText_ = js.native
  
  @JSImport("@testing-library/vue", "getByTitle")
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
    
    @JSImport("@testing-library/vue", "prettyFormat")
    @js.native
    val ^ : js.Any = js.native
    
    object plugins {
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.AsymmetricMatcher")
      @js.native
      def AsymmetricMatcher: NewPlugin = js.native
      inline def AsymmetricMatcher_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsymmetricMatcher")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.ConvertAnsi")
      @js.native
      def ConvertAnsi: NewPlugin = js.native
      inline def ConvertAnsi_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvertAnsi")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.DOMCollection")
      @js.native
      def DOMCollection: NewPlugin = js.native
      inline def DOMCollection_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMCollection")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.DOMElement")
      @js.native
      def DOMElement: NewPlugin = js.native
      inline def DOMElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMElement")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.Immutable")
      @js.native
      def Immutable: NewPlugin = js.native
      inline def Immutable_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Immutable")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.ReactElement")
      @js.native
      def ReactElement: NewPlugin = js.native
      inline def ReactElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactElement")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.ReactTestComponent")
      @js.native
      def ReactTestComponent: NewPlugin = js.native
      inline def ReactTestComponent_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactTestComponent")(x.asInstanceOf[js.Any])
    }
  }
  
  object queries {
    
    @JSImport("@testing-library/vue", "queries.findAllByAltText")
    @js.native
    val findAllByAltText: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.findAllByDisplayValue")
    @js.native
    val findAllByDisplayValue: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.findAllByLabelText")
    @js.native
    val findAllByLabelText: FindAllByText_ = js.native
    
    @JSImport("@testing-library/vue", "queries.findAllByPlaceholderText")
    @js.native
    val findAllByPlaceholderText: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.findAllByRole")
    @js.native
    val findAllByRole: FindAllByRole_ = js.native
    
    @JSImport("@testing-library/vue", "queries.findAllByTestId")
    @js.native
    val findAllByTestId: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.findAllByText")
    @js.native
    val findAllByText: FindAllByText_ = js.native
    
    @JSImport("@testing-library/vue", "queries.findAllByTitle")
    @js.native
    val findAllByTitle: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.findByAltText")
    @js.native
    val findByAltText: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.findByDisplayValue")
    @js.native
    val findByDisplayValue: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.findByLabelText")
    @js.native
    val findByLabelText: FindByText_ = js.native
    
    @JSImport("@testing-library/vue", "queries.findByPlaceholderText")
    @js.native
    val findByPlaceholderText: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.findByRole")
    @js.native
    val findByRole: FindByRole_ = js.native
    
    @JSImport("@testing-library/vue", "queries.findByTestId")
    @js.native
    val findByTestId: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.findByText")
    @js.native
    val findByText: FindByText_ = js.native
    
    @JSImport("@testing-library/vue", "queries.findByTitle")
    @js.native
    val findByTitle: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.getAllByAltText")
    @js.native
    val getAllByAltText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.getAllByDisplayValue")
    @js.native
    val getAllByDisplayValue: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.getAllByLabelText")
    @js.native
    val getAllByLabelText: AllByText = js.native
    
    @JSImport("@testing-library/vue", "queries.getAllByPlaceholderText")
    @js.native
    val getAllByPlaceholderText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.getAllByRole")
    @js.native
    val getAllByRole: AllByRole = js.native
    
    @JSImport("@testing-library/vue", "queries.getAllByTestId")
    @js.native
    val getAllByTestId: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.getAllByText")
    @js.native
    val getAllByText: AllByText = js.native
    
    @JSImport("@testing-library/vue", "queries.getAllByTitle")
    @js.native
    val getAllByTitle: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.getByAltText")
    @js.native
    val getByAltText: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.getByDisplayValue")
    @js.native
    val getByDisplayValue: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.getByLabelText")
    @js.native
    val getByLabelText: GetByText_ = js.native
    
    @JSImport("@testing-library/vue", "queries.getByPlaceholderText")
    @js.native
    val getByPlaceholderText: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.getByRole")
    @js.native
    val getByRole: GetByRole_ = js.native
    
    @JSImport("@testing-library/vue", "queries.getByTestId")
    @js.native
    val getByTestId: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.getByText")
    @js.native
    val getByText: GetByText_ = js.native
    
    @JSImport("@testing-library/vue", "queries.getByTitle")
    @js.native
    val getByTitle: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.queryAllByAltText")
    @js.native
    val queryAllByAltText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.queryAllByDisplayValue")
    @js.native
    val queryAllByDisplayValue: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.queryAllByLabelText")
    @js.native
    val queryAllByLabelText: AllByText = js.native
    
    @JSImport("@testing-library/vue", "queries.queryAllByPlaceholderText")
    @js.native
    val queryAllByPlaceholderText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.queryAllByRole")
    @js.native
    val queryAllByRole: AllByRole = js.native
    
    @JSImport("@testing-library/vue", "queries.queryAllByTestId")
    @js.native
    val queryAllByTestId: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.queryAllByText")
    @js.native
    val queryAllByText: AllByText = js.native
    
    @JSImport("@testing-library/vue", "queries.queryAllByTitle")
    @js.native
    val queryAllByTitle: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.queryByAltText")
    @js.native
    val queryByAltText: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.queryByDisplayValue")
    @js.native
    val queryByDisplayValue: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.queryByLabelText")
    @js.native
    val queryByLabelText: QueryByText_ = js.native
    
    @JSImport("@testing-library/vue", "queries.queryByPlaceholderText")
    @js.native
    val queryByPlaceholderText: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.queryByRole")
    @js.native
    val queryByRole: QueryByRole_ = js.native
    
    @JSImport("@testing-library/vue", "queries.queryByTestId")
    @js.native
    val queryByTestId: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/vue", "queries.queryByText")
    @js.native
    val queryByText: QueryByText_ = js.native
    
    @JSImport("@testing-library/vue", "queries.queryByTitle")
    @js.native
    val queryByTitle: QueryByBoundAttribute = js.native
  }
  
  @JSImport("@testing-library/vue", "queryAllByAltText")
  @js.native
  val queryAllByAltText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "queryAllByAttribute")
  @js.native
  val queryAllByAttribute: AllByAttribute = js.native
  
  @JSImport("@testing-library/vue", "queryAllByDisplayValue")
  @js.native
  val queryAllByDisplayValue: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "queryAllByLabelText")
  @js.native
  val queryAllByLabelText: AllByText = js.native
  
  @JSImport("@testing-library/vue", "queryAllByPlaceholderText")
  @js.native
  val queryAllByPlaceholderText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "queryAllByRole")
  @js.native
  val queryAllByRole: AllByRole = js.native
  
  @JSImport("@testing-library/vue", "queryAllByTestId")
  @js.native
  val queryAllByTestId: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "queryAllByText")
  @js.native
  val queryAllByText: AllByText = js.native
  
  @JSImport("@testing-library/vue", "queryAllByTitle")
  @js.native
  val queryAllByTitle: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "queryByAltText")
  @js.native
  val queryByAltText: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "queryByAttribute")
  @js.native
  val queryByAttribute: QueryByAttribute_ = js.native
  
  @JSImport("@testing-library/vue", "queryByDisplayValue")
  @js.native
  val queryByDisplayValue: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "queryByLabelText")
  @js.native
  val queryByLabelText: QueryByText_ = js.native
  
  @JSImport("@testing-library/vue", "queryByPlaceholderText")
  @js.native
  val queryByPlaceholderText: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "queryByRole")
  @js.native
  val queryByRole: QueryByRole_ = js.native
  
  @JSImport("@testing-library/vue", "queryByTestId")
  @js.native
  val queryByTestId: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/vue", "queryByText")
  @js.native
  val queryByText: QueryByText_ = js.native
  
  @JSImport("@testing-library/vue", "queryByTitle")
  @js.native
  val queryByTitle: QueryByBoundAttribute = js.native
  
  object queryHelpers {
    
    @JSImport("@testing-library/vue", "queryHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildQueries[Arguments /* <: js.Array[js.Any] */](
      queryByAll: GetAllBy[Arguments],
      getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
      getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
    ): BuiltQueryMethods[Arguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueries")(queryByAll.asInstanceOf[js.Any], getMultipleError.asInstanceOf[js.Any], getMissingError.asInstanceOf[js.Any])).asInstanceOf[BuiltQueryMethods[Arguments]]
    
    inline def getElementError(message: String, container: HTMLElement): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementError")(message.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Error]
    
    @JSImport("@testing-library/vue", "queryHelpers.queryAllByAttribute")
    @js.native
    val queryAllByAttribute: AllByAttribute = js.native
    
    @JSImport("@testing-library/vue", "queryHelpers.queryByAttribute")
    @js.native
    val queryByAttribute: QueryByAttribute_ = js.native
  }
  
  inline def render[V /* <: Vue */](TestComponent: VueClass[V]): ComponentHarness = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(TestComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentHarness]
  inline def render[V /* <: Vue */](TestComponent: VueClass[V], options: Unit, configure: ConfigurationCallback[V]): ComponentHarness = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(TestComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configure.asInstanceOf[js.Any])).asInstanceOf[ComponentHarness]
  inline def render[V /* <: Vue */](TestComponent: VueClass[V], options: RenderOptions[V, js.Object]): ComponentHarness = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(TestComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentHarness]
  inline def render[V /* <: Vue */](
    TestComponent: VueClass[V],
    options: RenderOptions[V, js.Object],
    configure: ConfigurationCallback[V]
  ): ComponentHarness = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(TestComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configure.asInstanceOf[js.Any])).asInstanceOf[ComponentHarness]
  
  /* Inlined @testing-library/dom.@testing-library/dom/types/screen.Screen<{ readonly getByLabelText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly getAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly queryByLabelText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly queryAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly findAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly getByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly getAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly queryByText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly queryAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly findAllByText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly getByAltText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByAltText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByTitle :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTitle :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByRole :@testing-library/dom.@testing-library/dom/types/queries.GetByRole,  readonly getAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly queryByRole :@testing-library/dom.@testing-library/dom/types/queries.QueryByRole,  readonly queryAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly findByRole :@testing-library/dom.@testing-library/dom/types/queries.FindByRole,  readonly findAllByRole :@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole,  readonly getByTestId :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTestId :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute}> */
  object screen {
    
    @JSImport("@testing-library/vue", "screen")
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
    
    @JSImport("@testing-library/vue", "screen.findAllByAltText")
    @js.native
    def findAllByAltText: BoundFunction[FindAllByBoundAttribute] = js.native
    inline def findAllByAltText_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByDisplayValue")
    @js.native
    def findAllByDisplayValue: BoundFunction[FindAllByBoundAttribute] = js.native
    inline def findAllByDisplayValue_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByLabelText")
    @js.native
    def findAllByLabelText: BoundFunction[FindAllByText_] = js.native
    inline def findAllByLabelText_=(x: BoundFunction[FindAllByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByPlaceholderText")
    @js.native
    def findAllByPlaceholderText: BoundFunction[FindAllByBoundAttribute] = js.native
    inline def findAllByPlaceholderText_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByRole")
    @js.native
    def findAllByRole: BoundFunction[FindAllByRole_] = js.native
    inline def findAllByRole_=(x: BoundFunction[FindAllByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByTestId")
    @js.native
    def findAllByTestId: BoundFunction[FindAllByBoundAttribute] = js.native
    inline def findAllByTestId_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByText")
    @js.native
    def findAllByText: BoundFunction[FindAllByText_] = js.native
    inline def findAllByText_=(x: BoundFunction[FindAllByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByTitle")
    @js.native
    def findAllByTitle: BoundFunction[FindAllByBoundAttribute] = js.native
    inline def findAllByTitle_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByAltText")
    @js.native
    def findByAltText: BoundFunction[FindByBoundAttribute] = js.native
    inline def findByAltText_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByDisplayValue")
    @js.native
    def findByDisplayValue: BoundFunction[FindByBoundAttribute] = js.native
    inline def findByDisplayValue_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByLabelText")
    @js.native
    def findByLabelText: BoundFunction[FindByText_] = js.native
    inline def findByLabelText_=(x: BoundFunction[FindByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByPlaceholderText")
    @js.native
    def findByPlaceholderText: BoundFunction[FindByBoundAttribute] = js.native
    inline def findByPlaceholderText_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByRole")
    @js.native
    def findByRole: BoundFunction[FindByRole_] = js.native
    inline def findByRole_=(x: BoundFunction[FindByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByTestId")
    @js.native
    def findByTestId: BoundFunction[FindByBoundAttribute] = js.native
    inline def findByTestId_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByText")
    @js.native
    def findByText: BoundFunction[FindByText_] = js.native
    inline def findByText_=(x: BoundFunction[FindByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByTitle")
    @js.native
    def findByTitle: BoundFunction[FindByBoundAttribute] = js.native
    inline def findByTitle_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByAltText")
    @js.native
    def getAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    inline def getAllByAltText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByDisplayValue")
    @js.native
    def getAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    inline def getAllByDisplayValue_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByLabelText")
    @js.native
    def getAllByLabelText: BoundFunction[AllByText] = js.native
    inline def getAllByLabelText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByPlaceholderText")
    @js.native
    def getAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    inline def getAllByPlaceholderText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByRole")
    @js.native
    def getAllByRole: BoundFunction[AllByRole] = js.native
    inline def getAllByRole_=(x: BoundFunction[AllByRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByTestId")
    @js.native
    def getAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    inline def getAllByTestId_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByText")
    @js.native
    def getAllByText: BoundFunction[AllByText] = js.native
    inline def getAllByText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByTitle")
    @js.native
    def getAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    inline def getAllByTitle_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByAltText")
    @js.native
    def getByAltText: BoundFunction[GetByBoundAttribute] = js.native
    inline def getByAltText_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByDisplayValue")
    @js.native
    def getByDisplayValue: BoundFunction[GetByBoundAttribute] = js.native
    inline def getByDisplayValue_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByLabelText")
    @js.native
    def getByLabelText: BoundFunction[GetByText_] = js.native
    inline def getByLabelText_=(x: BoundFunction[GetByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByPlaceholderText")
    @js.native
    def getByPlaceholderText: BoundFunction[GetByBoundAttribute] = js.native
    inline def getByPlaceholderText_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByRole")
    @js.native
    def getByRole: BoundFunction[GetByRole_] = js.native
    inline def getByRole_=(x: BoundFunction[GetByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByTestId")
    @js.native
    def getByTestId: BoundFunction[GetByBoundAttribute] = js.native
    inline def getByTestId_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByText")
    @js.native
    def getByText: BoundFunction[GetByText_] = js.native
    inline def getByText_=(x: BoundFunction[GetByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByTitle")
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
    
    @JSImport("@testing-library/vue", "screen.queryAllByAltText")
    @js.native
    def queryAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    inline def queryAllByAltText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByDisplayValue")
    @js.native
    def queryAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    inline def queryAllByDisplayValue_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByLabelText")
    @js.native
    def queryAllByLabelText: BoundFunction[AllByText] = js.native
    inline def queryAllByLabelText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByPlaceholderText")
    @js.native
    def queryAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    inline def queryAllByPlaceholderText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByRole")
    @js.native
    def queryAllByRole: BoundFunction[AllByRole] = js.native
    inline def queryAllByRole_=(x: BoundFunction[AllByRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByTestId")
    @js.native
    def queryAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    inline def queryAllByTestId_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByText")
    @js.native
    def queryAllByText: BoundFunction[AllByText] = js.native
    inline def queryAllByText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByTitle")
    @js.native
    def queryAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    inline def queryAllByTitle_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByAltText")
    @js.native
    def queryByAltText: BoundFunction[QueryByBoundAttribute] = js.native
    inline def queryByAltText_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByDisplayValue")
    @js.native
    def queryByDisplayValue: BoundFunction[QueryByBoundAttribute] = js.native
    inline def queryByDisplayValue_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByLabelText")
    @js.native
    def queryByLabelText: BoundFunction[QueryByText_] = js.native
    inline def queryByLabelText_=(x: BoundFunction[QueryByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByPlaceholderText")
    @js.native
    def queryByPlaceholderText: BoundFunction[QueryByBoundAttribute] = js.native
    inline def queryByPlaceholderText_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByRole")
    @js.native
    def queryByRole: BoundFunction[QueryByRole_] = js.native
    inline def queryByRole_=(x: BoundFunction[QueryByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByTestId")
    @js.native
    def queryByTestId: BoundFunction[QueryByBoundAttribute] = js.native
    inline def queryByTestId_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByText")
    @js.native
    def queryByText: BoundFunction[QueryByText_] = js.native
    inline def queryByText_=(x: BoundFunction[QueryByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByTitle")
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
  
  /* Inlined {[ K in @testing-library/dom.@testing-library/dom.EventType ]: (element : std.Document | std.Element | std.Window, options : {} | undefined): std.Promise<void>} */
  trait AsyncFireObject extends StObject {
    
    var abort: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var animationEnd: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var animationIteration: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var animationStart: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var blur: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var canPlay: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var canPlayThrough: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var change: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var click: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var compositionEnd: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var compositionStart: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var compositionUpdate: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var contextMenu: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var copy: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var cut: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var dblClick: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var doubleClick: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var drag: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var dragEnd: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var dragEnter: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var dragExit: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var dragLeave: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var dragOver: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var dragStart: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var drop: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var durationChange: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var emptied: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var encrypted: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var ended: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var error: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var focus: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var focusIn: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var focusOut: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var gotPointerCapture: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var input: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var invalid: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var keyDown: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var keyPress: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var keyUp: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var load: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var loadStart: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var loadedData: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var loadedMetadata: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var lostPointerCapture: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var mouseDown: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var mouseEnter: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var mouseLeave: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var mouseMove: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var mouseOut: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var mouseOver: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var mouseUp: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var paste: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var pause: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var play: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var playing: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var pointerCancel: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var pointerDown: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var pointerEnter: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var pointerLeave: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var pointerMove: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var pointerOut: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var pointerOver: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var pointerUp: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var popState: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var progress: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var rateChange: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var reset: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var scroll: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var seeked: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var seeking: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var select: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var stalled: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var submit: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var suspend: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var timeUpdate: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var touchCancel: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var touchEnd: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var touchMove: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var touchStart: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var transitionEnd: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var volumeChange: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var waiting: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    var wheel: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
  }
  object AsyncFireObject {
    
    inline def apply(
      abort: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      animationEnd: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      animationIteration: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      animationStart: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      blur: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      canPlay: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      canPlayThrough: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      change: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      click: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      compositionEnd: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      compositionStart: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      compositionUpdate: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      contextMenu: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      copy: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      cut: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      dblClick: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      doubleClick: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      drag: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      dragEnd: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      dragEnter: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      dragExit: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      dragLeave: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      dragOver: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      dragStart: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      drop: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      durationChange: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      emptied: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      encrypted: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      ended: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      error: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      focus: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      focusIn: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      focusOut: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      gotPointerCapture: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      input: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      invalid: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      keyDown: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      keyPress: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      keyUp: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      load: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      loadStart: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      loadedData: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      loadedMetadata: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      lostPointerCapture: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      mouseDown: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      mouseEnter: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      mouseLeave: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      mouseMove: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      mouseOut: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      mouseOver: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      mouseUp: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      paste: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      pause: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      play: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      playing: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      pointerCancel: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      pointerDown: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      pointerEnter: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      pointerLeave: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      pointerMove: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      pointerOut: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      pointerOver: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      pointerUp: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      popState: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      progress: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      rateChange: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      reset: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      scroll: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      seeked: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      seeking: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      select: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      stalled: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      submit: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      suspend: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      timeUpdate: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      touchCancel: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      touchEnd: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      touchMove: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      touchStart: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      transitionEnd: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      volumeChange: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      waiting: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      wheel: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
    ): AsyncFireObject = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), animationEnd = js.Any.fromFunction2(animationEnd), animationIteration = js.Any.fromFunction2(animationIteration), animationStart = js.Any.fromFunction2(animationStart), blur = js.Any.fromFunction2(blur), canPlay = js.Any.fromFunction2(canPlay), canPlayThrough = js.Any.fromFunction2(canPlayThrough), change = js.Any.fromFunction2(change), click = js.Any.fromFunction2(click), compositionEnd = js.Any.fromFunction2(compositionEnd), compositionStart = js.Any.fromFunction2(compositionStart), compositionUpdate = js.Any.fromFunction2(compositionUpdate), contextMenu = js.Any.fromFunction2(contextMenu), copy = js.Any.fromFunction2(copy), cut = js.Any.fromFunction2(cut), dblClick = js.Any.fromFunction2(dblClick), doubleClick = js.Any.fromFunction2(doubleClick), drag = js.Any.fromFunction2(drag), dragEnd = js.Any.fromFunction2(dragEnd), dragEnter = js.Any.fromFunction2(dragEnter), dragExit = js.Any.fromFunction2(dragExit), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), dragStart = js.Any.fromFunction2(dragStart), drop = js.Any.fromFunction2(drop), durationChange = js.Any.fromFunction2(durationChange), emptied = js.Any.fromFunction2(emptied), encrypted = js.Any.fromFunction2(encrypted), ended = js.Any.fromFunction2(ended), error = js.Any.fromFunction2(error), focus = js.Any.fromFunction2(focus), focusIn = js.Any.fromFunction2(focusIn), focusOut = js.Any.fromFunction2(focusOut), gotPointerCapture = js.Any.fromFunction2(gotPointerCapture), input = js.Any.fromFunction2(input), invalid = js.Any.fromFunction2(invalid), keyDown = js.Any.fromFunction2(keyDown), keyPress = js.Any.fromFunction2(keyPress), keyUp = js.Any.fromFunction2(keyUp), load = js.Any.fromFunction2(load), loadStart = js.Any.fromFunction2(loadStart), loadedData = js.Any.fromFunction2(loadedData), loadedMetadata = js.Any.fromFunction2(loadedMetadata), lostPointerCapture = js.Any.fromFunction2(lostPointerCapture), mouseDown = js.Any.fromFunction2(mouseDown), mouseEnter = js.Any.fromFunction2(mouseEnter), mouseLeave = js.Any.fromFunction2(mouseLeave), mouseMove = js.Any.fromFunction2(mouseMove), mouseOut = js.Any.fromFunction2(mouseOut), mouseOver = js.Any.fromFunction2(mouseOver), mouseUp = js.Any.fromFunction2(mouseUp), paste = js.Any.fromFunction2(paste), pause = js.Any.fromFunction2(pause), play = js.Any.fromFunction2(play), playing = js.Any.fromFunction2(playing), pointerCancel = js.Any.fromFunction2(pointerCancel), pointerDown = js.Any.fromFunction2(pointerDown), pointerEnter = js.Any.fromFunction2(pointerEnter), pointerLeave = js.Any.fromFunction2(pointerLeave), pointerMove = js.Any.fromFunction2(pointerMove), pointerOut = js.Any.fromFunction2(pointerOut), pointerOver = js.Any.fromFunction2(pointerOver), pointerUp = js.Any.fromFunction2(pointerUp), popState = js.Any.fromFunction2(popState), progress = js.Any.fromFunction2(progress), rateChange = js.Any.fromFunction2(rateChange), reset = js.Any.fromFunction2(reset), scroll = js.Any.fromFunction2(scroll), seeked = js.Any.fromFunction2(seeked), seeking = js.Any.fromFunction2(seeking), select = js.Any.fromFunction2(select), stalled = js.Any.fromFunction2(stalled), submit = js.Any.fromFunction2(submit), suspend = js.Any.fromFunction2(suspend), timeUpdate = js.Any.fromFunction2(timeUpdate), touchCancel = js.Any.fromFunction2(touchCancel), touchEnd = js.Any.fromFunction2(touchEnd), touchMove = js.Any.fromFunction2(touchMove), touchStart = js.Any.fromFunction2(touchStart), transitionEnd = js.Any.fromFunction2(transitionEnd), volumeChange = js.Any.fromFunction2(volumeChange), waiting = js.Any.fromFunction2(waiting), wheel = js.Any.fromFunction2(wheel))
      __obj.asInstanceOf[AsyncFireObject]
    }
    
    extension [Self <: AsyncFireObject](x: Self) {
      
      inline def setAbort(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "abort", js.Any.fromFunction2(value))
      
      inline def setAnimationEnd(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "animationEnd", js.Any.fromFunction2(value))
      
      inline def setAnimationIteration(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "animationIteration", js.Any.fromFunction2(value))
      
      inline def setAnimationStart(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "animationStart", js.Any.fromFunction2(value))
      
      inline def setBlur(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      inline def setCanPlay(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "canPlay", js.Any.fromFunction2(value))
      
      inline def setCanPlayThrough(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "canPlayThrough", js.Any.fromFunction2(value))
      
      inline def setChange(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      inline def setClick(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
      
      inline def setCompositionEnd(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "compositionEnd", js.Any.fromFunction2(value))
      
      inline def setCompositionStart(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "compositionStart", js.Any.fromFunction2(value))
      
      inline def setCompositionUpdate(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "compositionUpdate", js.Any.fromFunction2(value))
      
      inline def setContextMenu(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "contextMenu", js.Any.fromFunction2(value))
      
      inline def setCopy(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      inline def setCut(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "cut", js.Any.fromFunction2(value))
      
      inline def setDblClick(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dblClick", js.Any.fromFunction2(value))
      
      inline def setDoubleClick(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "doubleClick", js.Any.fromFunction2(value))
      
      inline def setDrag(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
      
      inline def setDragEnd(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2(value))
      
      inline def setDragEnter(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
      
      inline def setDragExit(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dragExit", js.Any.fromFunction2(value))
      
      inline def setDragLeave(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
      
      inline def setDragOver(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
      
      inline def setDragStart(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
      
      inline def setDrop(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
      
      inline def setDurationChange(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "durationChange", js.Any.fromFunction2(value))
      
      inline def setEmptied(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "emptied", js.Any.fromFunction2(value))
      
      inline def setEncrypted(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "encrypted", js.Any.fromFunction2(value))
      
      inline def setEnded(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "ended", js.Any.fromFunction2(value))
      
      inline def setError(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setFocus(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
      
      inline def setFocusIn(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "focusIn", js.Any.fromFunction2(value))
      
      inline def setFocusOut(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "focusOut", js.Any.fromFunction2(value))
      
      inline def setGotPointerCapture(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "gotPointerCapture", js.Any.fromFunction2(value))
      
      inline def setInput(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      inline def setInvalid(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "invalid", js.Any.fromFunction2(value))
      
      inline def setKeyDown(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "keyDown", js.Any.fromFunction2(value))
      
      inline def setKeyPress(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "keyPress", js.Any.fromFunction2(value))
      
      inline def setKeyUp(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "keyUp", js.Any.fromFunction2(value))
      
      inline def setLoad(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      inline def setLoadStart(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "loadStart", js.Any.fromFunction2(value))
      
      inline def setLoadedData(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "loadedData", js.Any.fromFunction2(value))
      
      inline def setLoadedMetadata(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "loadedMetadata", js.Any.fromFunction2(value))
      
      inline def setLostPointerCapture(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "lostPointerCapture", js.Any.fromFunction2(value))
      
      inline def setMouseDown(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseDown", js.Any.fromFunction2(value))
      
      inline def setMouseEnter(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction2(value))
      
      inline def setMouseLeave(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction2(value))
      
      inline def setMouseMove(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseMove", js.Any.fromFunction2(value))
      
      inline def setMouseOut(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseOut", js.Any.fromFunction2(value))
      
      inline def setMouseOver(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseOver", js.Any.fromFunction2(value))
      
      inline def setMouseUp(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseUp", js.Any.fromFunction2(value))
      
      inline def setPaste(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "paste", js.Any.fromFunction2(value))
      
      inline def setPause(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pause", js.Any.fromFunction2(value))
      
      inline def setPlay(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "play", js.Any.fromFunction2(value))
      
      inline def setPlaying(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "playing", js.Any.fromFunction2(value))
      
      inline def setPointerCancel(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerCancel", js.Any.fromFunction2(value))
      
      inline def setPointerDown(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerDown", js.Any.fromFunction2(value))
      
      inline def setPointerEnter(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerEnter", js.Any.fromFunction2(value))
      
      inline def setPointerLeave(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerLeave", js.Any.fromFunction2(value))
      
      inline def setPointerMove(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerMove", js.Any.fromFunction2(value))
      
      inline def setPointerOut(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerOut", js.Any.fromFunction2(value))
      
      inline def setPointerOver(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerOver", js.Any.fromFunction2(value))
      
      inline def setPointerUp(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerUp", js.Any.fromFunction2(value))
      
      inline def setPopState(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "popState", js.Any.fromFunction2(value))
      
      inline def setProgress(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      inline def setRateChange(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "rateChange", js.Any.fromFunction2(value))
      
      inline def setReset(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "reset", js.Any.fromFunction2(value))
      
      inline def setScroll(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction2(value))
      
      inline def setSeeked(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "seeked", js.Any.fromFunction2(value))
      
      inline def setSeeking(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "seeking", js.Any.fromFunction2(value))
      
      inline def setSelect(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      inline def setStalled(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "stalled", js.Any.fromFunction2(value))
      
      inline def setSubmit(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "submit", js.Any.fromFunction2(value))
      
      inline def setSuspend(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "suspend", js.Any.fromFunction2(value))
      
      inline def setTimeUpdate(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "timeUpdate", js.Any.fromFunction2(value))
      
      inline def setTouchCancel(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "touchCancel", js.Any.fromFunction2(value))
      
      inline def setTouchEnd(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "touchEnd", js.Any.fromFunction2(value))
      
      inline def setTouchMove(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "touchMove", js.Any.fromFunction2(value))
      
      inline def setTouchStart(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "touchStart", js.Any.fromFunction2(value))
      
      inline def setTransitionEnd(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction2(value))
      
      inline def setVolumeChange(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "volumeChange", js.Any.fromFunction2(value))
      
      inline def setWaiting(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "waiting", js.Any.fromFunction2(value))
      
      inline def setWheel(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "wheel", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined parent @testing-library/dom.@testing-library/dom.BoundFunctions<{ readonly getAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly getByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly queryByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly queryByLabelText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly getAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly findByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly getAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly queryAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly getAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly queryAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTitle :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly findAllByText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly findAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly queryAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getByTitle :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly getByLabelText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly queryAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByAltText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly getByRole :@testing-library/dom.@testing-library/dom/types/queries.GetByRole,  readonly queryByTestId :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryByRole :@testing-library/dom.@testing-library/dom/types/queries.QueryByRole,  readonly queryAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly findByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly getAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly findAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findAllByRole :@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole,  readonly findAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly findAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByTestId :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findByRole :@testing-library/dom.@testing-library/dom/types/queries.FindByRole,  readonly getByText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly queryByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly getByAltText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute}> */
  @js.native
  trait ComponentHarness extends StObject {
    
    var baseElement: HTMLElement = js.native
    
    var container: HTMLElement = js.native
    
    def debug(): Unit = js.native
    def debug(el: js.Array[HTMLElement]): Unit = js.native
    def debug(el: HTMLElement): Unit = js.native
    
    def emitted(): StringDictionary[js.Array[js.Array[js.Any]]] = js.native
    
    var findAllByAltText: BoundFunction[FindAllByBoundAttribute] = js.native
    
    var findAllByDisplayValue: BoundFunction[FindAllByBoundAttribute] = js.native
    
    var findAllByLabelText: BoundFunction[FindAllByText_] = js.native
    
    var findAllByPlaceholderText: BoundFunction[FindAllByBoundAttribute] = js.native
    
    var findAllByRole: BoundFunction[FindAllByRole_] = js.native
    
    var findAllByTestId: BoundFunction[FindAllByBoundAttribute] = js.native
    
    var findAllByText: BoundFunction[FindAllByText_] = js.native
    
    var findAllByTitle: BoundFunction[FindAllByBoundAttribute] = js.native
    
    var findByAltText: BoundFunction[FindByBoundAttribute] = js.native
    
    var findByDisplayValue: BoundFunction[FindByBoundAttribute] = js.native
    
    var findByLabelText: BoundFunction[FindByText_] = js.native
    
    var findByPlaceholderText: BoundFunction[FindByBoundAttribute] = js.native
    
    var findByRole: BoundFunction[FindByRole_] = js.native
    
    var findByTestId: BoundFunction[FindByBoundAttribute] = js.native
    
    var findByText: BoundFunction[FindByText_] = js.native
    
    var findByTitle: BoundFunction[FindByBoundAttribute] = js.native
    
    var getAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    
    var getAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    
    var getAllByLabelText: BoundFunction[AllByText] = js.native
    
    var getAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    
    var getAllByRole: BoundFunction[AllByRole] = js.native
    
    var getAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    
    var getAllByText: BoundFunction[AllByText] = js.native
    
    var getAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    
    var getByAltText: BoundFunction[GetByBoundAttribute] = js.native
    
    var getByDisplayValue: BoundFunction[GetByBoundAttribute] = js.native
    
    var getByLabelText: BoundFunction[GetByText_] = js.native
    
    var getByPlaceholderText: BoundFunction[GetByBoundAttribute] = js.native
    
    var getByRole: BoundFunction[GetByRole_] = js.native
    
    var getByTestId: BoundFunction[GetByBoundAttribute] = js.native
    
    var getByText: BoundFunction[GetByText_] = js.native
    
    var getByTitle: BoundFunction[GetByBoundAttribute] = js.native
    
    def html(): String = js.native
    
    def isUnmounted(): Boolean = js.native
    
    var queryAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    
    var queryAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    
    var queryAllByLabelText: BoundFunction[AllByText] = js.native
    
    var queryAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    
    var queryAllByRole: BoundFunction[AllByRole] = js.native
    
    var queryAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    
    var queryAllByText: BoundFunction[AllByText] = js.native
    
    var queryAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    
    var queryByAltText: BoundFunction[QueryByBoundAttribute] = js.native
    
    var queryByDisplayValue: BoundFunction[QueryByBoundAttribute] = js.native
    
    var queryByLabelText: BoundFunction[QueryByText_] = js.native
    
    var queryByPlaceholderText: BoundFunction[QueryByBoundAttribute] = js.native
    
    var queryByRole: BoundFunction[QueryByRole_] = js.native
    
    var queryByTestId: BoundFunction[QueryByBoundAttribute] = js.native
    
    var queryByText: BoundFunction[QueryByText_] = js.native
    
    var queryByTitle: BoundFunction[QueryByBoundAttribute] = js.native
    
    def unmount(): Unit = js.native
    
    def updateProps(props: js.Object): js.Promise[Unit] = js.native
  }
  
  type ConfigurationCallback[V /* <: Vue */] = js.Function3[
    /* localVue */ VueConstructor[Vue], 
    /* store */ Store[js.Any], 
    /* router */ default, 
    Partial[ThisTypedMountOptions[V]] | Unit
  ]
  
  /* Inlined parent // The props and store options special-cased by vue-testing-library and NOT passed to mount().
  // In TS 3.5+: Omit<ThisTypedMountOptions<V>, "store" | "props">
  std.Pick<@vue/test-utils.@vue/test-utils.ThisTypedMountOptions<V>, std.Exclude<keyof @vue/test-utils.@vue/test-utils.ThisTypedMountOptions<V>, 'store' | 'props'>> */
  trait RenderOptions[V /* <: Vue */, S] extends StObject {
    
    var activated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var attachTo: js.UndefOr[Element | String] = js.undefined
    
    var attachToDocument: js.UndefOr[Boolean] = js.undefined
    
    var attrs: js.UndefOr[Record[String, String]] = js.undefined
    
    var baseElement: js.UndefOr[HTMLElement] = js.undefined
    
    var beforeCreate: js.UndefOr[js.ThisFunction0[/* this */ V, Unit]] = js.undefined
    
    var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeMount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var comments: js.UndefOr[Boolean] = js.undefined
    
    var components: js.UndefOr[
        StringDictionary[
          (Component[js.Any, js.Any, js.Any, js.Any]) | (AsyncComponent[js.Any, js.Any, js.Any, js.Any])
        ]
      ] = js.undefined
    
    var computed: js.UndefOr[js.Object] = js.undefined
    
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    var context: js.UndefOr[VNodeData] = js.undefined
    
    var created: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var data: js.UndefOr[DefaultData[V]] = js.undefined
    
    var deactivated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var delimiters: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var destroyed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var directives: js.UndefOr[StringDictionary[DirectiveFunction | DirectiveOptions]] = js.undefined
    
    var el: js.UndefOr[Element | String] = js.undefined
    
    var errorCaptured: js.UndefOr[js.Function3[/* err */ Error, /* vm */ Vue, /* info */ String, Boolean | Unit]] = js.undefined
    
    var `extends`: js.UndefOr[
        (ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]) | VueConstructor[Vue]
      ] = js.undefined
    
    var filters: js.UndefOr[StringDictionary[js.Function]] = js.undefined
    
    var inheritAttrs: js.UndefOr[Boolean] = js.undefined
    
    var inject: js.UndefOr[InjectOptions] = js.undefined
    
    var listeners: js.UndefOr[Record[String, js.Function | js.Array[js.Function]]] = js.undefined
    
    var localVue: js.UndefOr[VueConstructor[Vue]] = js.undefined
    
    var methods: js.UndefOr[DefaultMethods[V]] = js.undefined
    
    var mixins: js.UndefOr[
        js.Array[
          (ComponentOptions[
            Vue, 
            DefaultData[Vue], 
            DefaultMethods[Vue], 
            DefaultComputed, 
            PropsDefinition[DefaultProps], 
            DefaultProps
          ]) | VueConstructor[Vue]
        ]
      ] = js.undefined
    
    var mocks: js.UndefOr[js.Object | `false`] = js.undefined
    
    var model: js.UndefOr[Event] = js.undefined
    
    var mounted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[Vue] = js.undefined
    
    var parentComponent: js.UndefOr[
        Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]
      ] = js.undefined
    
    var props: js.UndefOr[js.Object] = js.undefined
    
    var propsData: js.UndefOr[js.Object] = js.undefined
    
    var provide: js.UndefOr[js.Object | js.Function0[js.Object]] = js.undefined
    
    var render: js.UndefOr[
        js.Function2[/* createElement */ CreateElement, /* hack */ RenderContext[DefaultProps], VNode]
      ] = js.undefined
    
    var renderError: js.UndefOr[js.Function2[/* createElement */ CreateElement, /* err */ Error, VNode]] = js.undefined
    
    var routes: js.UndefOr[js.Array[RouteConfig]] = js.undefined
    
    var scopedSlots: js.UndefOr[Record[String, String | js.Function]] = js.undefined
    
    var serverPrefetch: js.UndefOr[js.ThisFunction0[/* this */ V, js.Promise[Unit]]] = js.undefined
    
    var slots: js.UndefOr[Slots] = js.undefined
    
    var staticRenderFns: js.UndefOr[js.Array[js.Function1[/* createElement */ CreateElement, VNode]]] = js.undefined
    
    var store: js.UndefOr[StoreOptions[S]] = js.undefined
    
    var stubs: js.UndefOr[Stubs | `false`] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var transitions: js.UndefOr[StringDictionary[js.Object]] = js.undefined
    
    var updated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var watch: js.UndefOr[Record[String, WatchOptionsWithHandler[js.Any] | WatchHandler[js.Any] | String]] = js.undefined
  }
  object RenderOptions {
    
    inline def apply[V /* <: Vue */, S](): RenderOptions[V, S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions[V, S]]
    }
    
    extension [Self <: RenderOptions[?, ?], V /* <: Vue */, S](x: Self & (RenderOptions[V, S])) {
      
      inline def setActivated(value: () => Unit): Self = StObject.set(x, "activated", js.Any.fromFunction0(value))
      
      inline def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
      
      inline def setAttachTo(value: Element | String): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      inline def setAttachToDocument(value: Boolean): Self = StObject.set(x, "attachToDocument", value.asInstanceOf[js.Any])
      
      inline def setAttachToDocumentUndefined: Self = StObject.set(x, "attachToDocument", js.undefined)
      
      inline def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      inline def setAttrs(value: Record[String, String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setBaseElement(value: HTMLElement): Self = StObject.set(x, "baseElement", value.asInstanceOf[js.Any])
      
      inline def setBaseElementUndefined: Self = StObject.set(x, "baseElement", js.undefined)
      
      inline def setBeforeCreate(value: js.ThisFunction0[/* this */ V, Unit]): Self = StObject.set(x, "beforeCreate", value.asInstanceOf[js.Any])
      
      inline def setBeforeCreateUndefined: Self = StObject.set(x, "beforeCreate", js.undefined)
      
      inline def setBeforeDestroy(value: () => Unit): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction0(value))
      
      inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
      
      inline def setBeforeMount(value: () => Unit): Self = StObject.set(x, "beforeMount", js.Any.fromFunction0(value))
      
      inline def setBeforeMountUndefined: Self = StObject.set(x, "beforeMount", js.undefined)
      
      inline def setBeforeUpdate(value: () => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction0(value))
      
      inline def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setComponents(
        value: StringDictionary[
              (Component[js.Any, js.Any, js.Any, js.Any]) | (AsyncComponent[js.Any, js.Any, js.Any, js.Any])
            ]
      ): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setComputed(value: js.Object): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContext(value: VNodeData): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setData(value: DefaultData[V]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDeactivated(value: () => Unit): Self = StObject.set(x, "deactivated", js.Any.fromFunction0(value))
      
      inline def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", js.undefined)
      
      inline def setDelimiters(value: js.Tuple2[String, String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      inline def setDestroyed(value: () => Unit): Self = StObject.set(x, "destroyed", js.Any.fromFunction0(value))
      
      inline def setDestroyedUndefined: Self = StObject.set(x, "destroyed", js.undefined)
      
      inline def setDirectives(value: StringDictionary[DirectiveFunction | DirectiveOptions]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      inline def setEl(value: Element | String): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setErrorCaptured(value: (/* err */ Error, /* vm */ Vue, /* info */ String) => Boolean | Unit): Self = StObject.set(x, "errorCaptured", js.Any.fromFunction3(value))
      
      inline def setErrorCapturedUndefined: Self = StObject.set(x, "errorCaptured", js.undefined)
      
      inline def setExtends(
        value: (ComponentOptions[
              Vue, 
              DefaultData[Vue], 
              DefaultMethods[Vue], 
              DefaultComputed, 
              PropsDefinition[DefaultProps], 
              DefaultProps
            ]) | VueConstructor[Vue]
      ): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setFilters(value: StringDictionary[js.Function]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setInheritAttrs(value: Boolean): Self = StObject.set(x, "inheritAttrs", value.asInstanceOf[js.Any])
      
      inline def setInheritAttrsUndefined: Self = StObject.set(x, "inheritAttrs", js.undefined)
      
      inline def setInject(value: InjectOptions): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setInjectVarargs(value: String*): Self = StObject.set(x, "inject", js.Array(value :_*))
      
      inline def setListeners(value: Record[String, js.Function | js.Array[js.Function]]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setLocalVue(value: VueConstructor[Vue]): Self = StObject.set(x, "localVue", value.asInstanceOf[js.Any])
      
      inline def setLocalVueUndefined: Self = StObject.set(x, "localVue", js.undefined)
      
      inline def setMethods(value: DefaultMethods[V]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMixins(
        value: js.Array[
              (ComponentOptions[
                Vue, 
                DefaultData[Vue], 
                DefaultMethods[Vue], 
                DefaultComputed, 
                PropsDefinition[DefaultProps], 
                DefaultProps
              ]) | VueConstructor[Vue]
            ]
      ): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setMixinsVarargs(
        value: ((ComponentOptions[
              Vue, 
              DefaultData[Vue], 
              DefaultMethods[Vue], 
              DefaultComputed, 
              PropsDefinition[DefaultProps], 
              DefaultProps
            ]) | VueConstructor[Vue])*
      ): Self = StObject.set(x, "mixins", js.Array(value :_*))
      
      inline def setMocks(value: js.Object | `false`): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
      
      inline def setMocksUndefined: Self = StObject.set(x, "mocks", js.undefined)
      
      inline def setModel(value: Event): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setMounted(value: () => Unit): Self = StObject.set(x, "mounted", js.Any.fromFunction0(value))
      
      inline def setMountedUndefined: Self = StObject.set(x, "mounted", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParent(value: Vue): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentComponent(
        value: Component[
              DefaultData[scala.Nothing], 
              DefaultMethods[scala.Nothing], 
              DefaultComputed, 
              DefaultProps
            ]
      ): Self = StObject.set(x, "parentComponent", value.asInstanceOf[js.Any])
      
      inline def setParentComponentUndefined: Self = StObject.set(x, "parentComponent", js.undefined)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setProps(value: js.Object): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsData(value: js.Object): Self = StObject.set(x, "propsData", value.asInstanceOf[js.Any])
      
      inline def setPropsDataUndefined: Self = StObject.set(x, "propsData", js.undefined)
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setProvide(value: js.Object | js.Function0[js.Object]): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      inline def setProvideFunction0(value: () => js.Object): Self = StObject.set(x, "provide", js.Any.fromFunction0(value))
      
      inline def setProvideUndefined: Self = StObject.set(x, "provide", js.undefined)
      
      inline def setRender(value: (/* createElement */ CreateElement, /* hack */ RenderContext[DefaultProps]) => VNode): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderError(value: (/* createElement */ CreateElement, /* err */ Error) => VNode): Self = StObject.set(x, "renderError", js.Any.fromFunction2(value))
      
      inline def setRenderErrorUndefined: Self = StObject.set(x, "renderError", js.undefined)
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setRoutes(value: js.Array[RouteConfig]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: RouteConfig*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      inline def setScopedSlots(value: Record[String, String | js.Function]): Self = StObject.set(x, "scopedSlots", value.asInstanceOf[js.Any])
      
      inline def setScopedSlotsUndefined: Self = StObject.set(x, "scopedSlots", js.undefined)
      
      inline def setServerPrefetch(value: js.ThisFunction0[/* this */ V, js.Promise[Unit]]): Self = StObject.set(x, "serverPrefetch", value.asInstanceOf[js.Any])
      
      inline def setServerPrefetchUndefined: Self = StObject.set(x, "serverPrefetch", js.undefined)
      
      inline def setSlots(value: Slots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setStaticRenderFns(value: js.Array[js.Function1[/* createElement */ CreateElement, VNode]]): Self = StObject.set(x, "staticRenderFns", value.asInstanceOf[js.Any])
      
      inline def setStaticRenderFnsUndefined: Self = StObject.set(x, "staticRenderFns", js.undefined)
      
      inline def setStaticRenderFnsVarargs(value: (js.Function1[/* createElement */ CreateElement, VNode])*): Self = StObject.set(x, "staticRenderFns", js.Array(value :_*))
      
      inline def setStore(value: StoreOptions[S]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setStubs(value: Stubs | `false`): Self = StObject.set(x, "stubs", value.asInstanceOf[js.Any])
      
      inline def setStubsUndefined: Self = StObject.set(x, "stubs", js.undefined)
      
      inline def setStubsVarargs(value: String*): Self = StObject.set(x, "stubs", js.Array(value :_*))
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTransitions(value: StringDictionary[js.Object]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      inline def setUpdated(value: () => Unit): Self = StObject.set(x, "updated", js.Any.fromFunction0(value))
      
      inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
      
      inline def setWatch(value: Record[String, WatchOptionsWithHandler[js.Any] | WatchHandler[js.Any] | String]): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  @js.native
  trait VueFireObject
    extends StObject
       with AsyncFireObject {
    
    def apply(element: Document, event: typings.std.Event): js.Promise[Unit] = js.native
    def apply(element: Element, event: typings.std.Event): js.Promise[Unit] = js.native
    def apply(element: Window, event: typings.std.Event): js.Promise[Unit] = js.native
    
    def touch(element: Document): js.Promise[Unit] = js.native
    def touch(element: Element): js.Promise[Unit] = js.native
    def touch(element: Window): js.Promise[Unit] = js.native
    
    def update(element: HTMLElement): js.Promise[Unit] = js.native
    def update(element: HTMLElement, value: String): js.Promise[Unit] = js.native
    def update(element: HTMLInputElement, value: String): js.Promise[Unit] = js.native
    def update(element: HTMLOptionElement): js.Promise[Unit] = js.native
    def update(element: HTMLSelectElement, value: String): js.Promise[Unit] = js.native
    def update(element: HTMLTextAreaElement, value: String): js.Promise[Unit] = js.native
  }
}
