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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@testing-library/vue", "buildQueries")
  @js.native
  def buildQueries[Arguments /* <: js.Array[_] */](
    queryByAll: GetAllBy[Arguments],
    getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
    getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
  ): BuiltQueryMethods[Arguments] = js.native
  
  @JSImport("@testing-library/vue", "cleanup")
  @js.native
  def cleanup(): Unit = js.native
  
  @JSImport("@testing-library/vue", "computeHeadingLevel")
  @js.native
  def computeHeadingLevel(element: Element): js.UndefOr[Double] = js.native
  
  @JSImport("@testing-library/vue", "configure")
  @js.native
  def configure(configDelta: PartialConfig): Unit = js.native
  @JSImport("@testing-library/vue", "configure")
  @js.native
  def configure(configDelta: ConfigFn): Unit = js.native
  
  @JSImport("@testing-library/vue", "createEvent")
  @js.native
  val createEvent: CreateObject with CreateFunction = js.native
  
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
  
  @JSImport("@testing-library/vue", "getConfig")
  @js.native
  def getConfig(): Config = js.native
  
  @JSImport("@testing-library/vue", "getDefaultNormalizer")
  @js.native
  def getDefaultNormalizer(): NormalizerFn = js.native
  @JSImport("@testing-library/vue", "getDefaultNormalizer")
  @js.native
  def getDefaultNormalizer(options: DefaultNormalizerOptions): NormalizerFn = js.native
  
  @JSImport("@testing-library/vue", "getElementError")
  @js.native
  def getElementError(message: String, container: HTMLElement): Error = js.native
  
  @JSImport("@testing-library/vue", "getNodeText")
  @js.native
  def getNodeText(node: HTMLElement): String = js.native
  
  @JSImport("@testing-library/vue", "getQueriesForElement")
  @js.native
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = js.native
  @JSImport("@testing-library/vue", "getQueriesForElement")
  @js.native
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = js.native
  
  @JSImport("@testing-library/vue", "getRoles")
  @js.native
  def getRoles(container: HTMLElement): StringDictionary[js.Array[HTMLElement]] = js.native
  
  @JSImport("@testing-library/vue", "getSuggestedQuery")
  @js.native
  def getSuggestedQuery(element: HTMLElement): js.UndefOr[Suggestion] = js.native
  @JSImport("@testing-library/vue", "getSuggestedQuery")
  @js.native
  def getSuggestedQuery(element: HTMLElement, variant: js.UndefOr[scala.Nothing], method: Method): js.UndefOr[Suggestion] = js.native
  @JSImport("@testing-library/vue", "getSuggestedQuery")
  @js.native
  def getSuggestedQuery(element: HTMLElement, variant: Variant): js.UndefOr[Suggestion] = js.native
  @JSImport("@testing-library/vue", "getSuggestedQuery")
  @js.native
  def getSuggestedQuery(element: HTMLElement, variant: Variant, method: Method): js.UndefOr[Suggestion] = js.native
  
  @JSImport("@testing-library/vue", "isInaccessible")
  @js.native
  def isInaccessible(element: Element): Boolean = js.native
  
  @JSImport("@testing-library/vue", "logDOM")
  @js.native
  def logDOM(): Unit = js.native
  @JSImport("@testing-library/vue", "logDOM")
  @js.native
  def logDOM(dom: js.UndefOr[scala.Nothing], maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/vue", "logDOM")
  @js.native
  def logDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double): Unit = js.native
  @JSImport("@testing-library/vue", "logDOM")
  @js.native
  def logDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double, options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/vue", "logDOM")
  @js.native
  def logDOM(dom: Element): Unit = js.native
  @JSImport("@testing-library/vue", "logDOM")
  @js.native
  def logDOM(dom: Element, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/vue", "logDOM")
  @js.native
  def logDOM(dom: Element, maxLength: Double): Unit = js.native
  @JSImport("@testing-library/vue", "logDOM")
  @js.native
  def logDOM(dom: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/vue", "logDOM")
  @js.native
  def logDOM(dom: HTMLDocument): Unit = js.native
  @JSImport("@testing-library/vue", "logDOM")
  @js.native
  def logDOM(dom: HTMLDocument, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/vue", "logDOM")
  @js.native
  def logDOM(dom: HTMLDocument, maxLength: Double): Unit = js.native
  @JSImport("@testing-library/vue", "logDOM")
  @js.native
  def logDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
  
  @JSImport("@testing-library/vue", "logRoles")
  @js.native
  def logRoles(container: HTMLElement): String = js.native
  
  @JSImport("@testing-library/vue", "prettyDOM")
  @js.native
  def prettyDOM(): String | `false` = js.native
  @JSImport("@testing-library/vue", "prettyDOM")
  @js.native
  def prettyDOM(dom: js.UndefOr[scala.Nothing], maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/vue", "prettyDOM")
  @js.native
  def prettyDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double): String | `false` = js.native
  @JSImport("@testing-library/vue", "prettyDOM")
  @js.native
  def prettyDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double, options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/vue", "prettyDOM")
  @js.native
  def prettyDOM(dom: Element): String | `false` = js.native
  @JSImport("@testing-library/vue", "prettyDOM")
  @js.native
  def prettyDOM(dom: Element, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/vue", "prettyDOM")
  @js.native
  def prettyDOM(dom: Element, maxLength: Double): String | `false` = js.native
  @JSImport("@testing-library/vue", "prettyDOM")
  @js.native
  def prettyDOM(dom: Element, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/vue", "prettyDOM")
  @js.native
  def prettyDOM(dom: HTMLDocument): String | `false` = js.native
  @JSImport("@testing-library/vue", "prettyDOM")
  @js.native
  def prettyDOM(dom: HTMLDocument, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/vue", "prettyDOM")
  @js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double): String | `false` = js.native
  @JSImport("@testing-library/vue", "prettyDOM")
  @js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  
  object prettyFormat {
    
    /**
      * Returns a presentation string of your `val` object
      * @param val any potential JavaScript object
      * @param options Custom settings
      */
    @JSImport("@testing-library/vue", "prettyFormat")
    @js.native
    def apply(`val`: js.Any): String = js.native
    @JSImport("@testing-library/vue", "prettyFormat")
    @js.native
    def apply(`val`: js.Any, options: typings.prettyFormat.typesMod.OptionsReceived): String = js.native
    
    object plugins {
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.AsymmetricMatcher")
      @js.native
      def AsymmetricMatcher: NewPlugin = js.native
      @scala.inline
      def AsymmetricMatcher_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsymmetricMatcher")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.ConvertAnsi")
      @js.native
      def ConvertAnsi: NewPlugin = js.native
      @scala.inline
      def ConvertAnsi_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvertAnsi")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.DOMCollection")
      @js.native
      def DOMCollection: NewPlugin = js.native
      @scala.inline
      def DOMCollection_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMCollection")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.DOMElement")
      @js.native
      def DOMElement: NewPlugin = js.native
      @scala.inline
      def DOMElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMElement")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.Immutable")
      @js.native
      def Immutable: NewPlugin = js.native
      @scala.inline
      def Immutable_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Immutable")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.ReactElement")
      @js.native
      def ReactElement: NewPlugin = js.native
      @scala.inline
      def ReactElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactElement")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.ReactTestComponent")
      @js.native
      def ReactTestComponent: NewPlugin = js.native
      @scala.inline
      def ReactTestComponent_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactTestComponent")(x.asInstanceOf[js.Any])
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
    
    @JSImport("@testing-library/vue", "queryHelpers.buildQueries")
    @js.native
    def buildQueries[Arguments /* <: js.Array[_] */](
      queryByAll: GetAllBy[Arguments],
      getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
      getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
    ): BuiltQueryMethods[Arguments] = js.native
    
    @JSImport("@testing-library/vue", "queryHelpers.getElementError")
    @js.native
    def getElementError(message: String, container: HTMLElement): Error = js.native
    
    @JSImport("@testing-library/vue", "queryHelpers.queryAllByAttribute")
    @js.native
    val queryAllByAttribute: AllByAttribute = js.native
    
    @JSImport("@testing-library/vue", "queryHelpers.queryByAttribute")
    @js.native
    val queryByAttribute: QueryByAttribute_ = js.native
  }
  
  @JSImport("@testing-library/vue", "render")
  @js.native
  def render[V /* <: Vue */](TestComponent: VueClass[V]): ComponentHarness = js.native
  @JSImport("@testing-library/vue", "render")
  @js.native
  def render[V /* <: Vue */](
    TestComponent: VueClass[V],
    options: js.UndefOr[scala.Nothing],
    configure: ConfigurationCallback[V]
  ): ComponentHarness = js.native
  @JSImport("@testing-library/vue", "render")
  @js.native
  def render[V /* <: Vue */](TestComponent: VueClass[V], options: RenderOptions[V, js.Object]): ComponentHarness = js.native
  @JSImport("@testing-library/vue", "render")
  @js.native
  def render[V /* <: Vue */](
    TestComponent: VueClass[V],
    options: RenderOptions[V, js.Object],
    configure: ConfigurationCallback[V]
  ): ComponentHarness = js.native
  
  /* Inlined @testing-library/dom.@testing-library/dom/types/screen.Screen<{ readonly getByLabelText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly getAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly queryByLabelText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly queryAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly findAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly getByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly getAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly queryByText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly queryAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly findAllByText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly getByAltText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByAltText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByTitle :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTitle :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByRole :@testing-library/dom.@testing-library/dom/types/queries.GetByRole,  readonly getAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly queryByRole :@testing-library/dom.@testing-library/dom/types/queries.QueryByRole,  readonly queryAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly findByRole :@testing-library/dom.@testing-library/dom/types/queries.FindByRole,  readonly findAllByRole :@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole,  readonly getByTestId :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTestId :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute}> */
  object screen {
    
    @JSImport("@testing-library/vue", "screen")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convenience function for `pretty-dom` which also allows an array
      * of elements
      */
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: js.UndefOr[scala.Nothing], maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: js.UndefOr[scala.Nothing], maxLength: Double): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: js.UndefOr[scala.Nothing], maxLength: Double, options: OptionsReceived): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: js.Array[Element | HTMLDocument]): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(
      element: js.Array[Element | HTMLDocument],
      maxLength: js.UndefOr[scala.Nothing],
      options: OptionsReceived
    ): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: js.Array[Element | HTMLDocument], maxLength: Double): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: js.Array[Element | HTMLDocument], maxLength: Double, options: OptionsReceived): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: Element): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: Element, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: Element, maxLength: Double): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: HTMLDocument): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: HTMLDocument, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: HTMLDocument, maxLength: Double): Unit = js.native
    @JSImport("@testing-library/vue", "screen.debug")
    @js.native
    def debug(element: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
    
    @JSImport("@testing-library/vue", "screen.findAllByAltText")
    @js.native
    def findAllByAltText: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByAltText_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByDisplayValue")
    @js.native
    def findAllByDisplayValue: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByDisplayValue_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByLabelText")
    @js.native
    def findAllByLabelText: BoundFunction[FindAllByText_] = js.native
    @scala.inline
    def findAllByLabelText_=(x: BoundFunction[FindAllByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByPlaceholderText")
    @js.native
    def findAllByPlaceholderText: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByPlaceholderText_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByRole")
    @js.native
    def findAllByRole: BoundFunction[FindAllByRole_] = js.native
    @scala.inline
    def findAllByRole_=(x: BoundFunction[FindAllByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByTestId")
    @js.native
    def findAllByTestId: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByTestId_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByText")
    @js.native
    def findAllByText: BoundFunction[FindAllByText_] = js.native
    @scala.inline
    def findAllByText_=(x: BoundFunction[FindAllByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findAllByTitle")
    @js.native
    def findAllByTitle: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByTitle_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByAltText")
    @js.native
    def findByAltText: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByAltText_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByDisplayValue")
    @js.native
    def findByDisplayValue: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByDisplayValue_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByLabelText")
    @js.native
    def findByLabelText: BoundFunction[FindByText_] = js.native
    @scala.inline
    def findByLabelText_=(x: BoundFunction[FindByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByPlaceholderText")
    @js.native
    def findByPlaceholderText: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByPlaceholderText_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByRole")
    @js.native
    def findByRole: BoundFunction[FindByRole_] = js.native
    @scala.inline
    def findByRole_=(x: BoundFunction[FindByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByTestId")
    @js.native
    def findByTestId: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByTestId_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByText")
    @js.native
    def findByText: BoundFunction[FindByText_] = js.native
    @scala.inline
    def findByText_=(x: BoundFunction[FindByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.findByTitle")
    @js.native
    def findByTitle: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByTitle_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByAltText")
    @js.native
    def getAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByAltText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByDisplayValue")
    @js.native
    def getAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByDisplayValue_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByLabelText")
    @js.native
    def getAllByLabelText: BoundFunction[AllByText] = js.native
    @scala.inline
    def getAllByLabelText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByPlaceholderText")
    @js.native
    def getAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByPlaceholderText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByRole")
    @js.native
    def getAllByRole: BoundFunction[AllByRole] = js.native
    @scala.inline
    def getAllByRole_=(x: BoundFunction[AllByRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByTestId")
    @js.native
    def getAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByTestId_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByText")
    @js.native
    def getAllByText: BoundFunction[AllByText] = js.native
    @scala.inline
    def getAllByText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getAllByTitle")
    @js.native
    def getAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByTitle_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByAltText")
    @js.native
    def getByAltText: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByAltText_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByDisplayValue")
    @js.native
    def getByDisplayValue: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByDisplayValue_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByLabelText")
    @js.native
    def getByLabelText: BoundFunction[GetByText_] = js.native
    @scala.inline
    def getByLabelText_=(x: BoundFunction[GetByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByPlaceholderText")
    @js.native
    def getByPlaceholderText: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByPlaceholderText_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByRole")
    @js.native
    def getByRole: BoundFunction[GetByRole_] = js.native
    @scala.inline
    def getByRole_=(x: BoundFunction[GetByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByTestId")
    @js.native
    def getByTestId: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByTestId_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByText")
    @js.native
    def getByText: BoundFunction[GetByText_] = js.native
    @scala.inline
    def getByText_=(x: BoundFunction[GetByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.getByTitle")
    @js.native
    def getByTitle: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByTitle_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByTitle")(x.asInstanceOf[js.Any])
    
    /**
      * Convenience function for `Testing Playground` which logs URL that
      * can be opened in a browser
      */
    @JSImport("@testing-library/vue", "screen.logTestingPlaygroundURL")
    @js.native
    def logTestingPlaygroundURL(): Unit = js.native
    @JSImport("@testing-library/vue", "screen.logTestingPlaygroundURL")
    @js.native
    def logTestingPlaygroundURL(element: Element): Unit = js.native
    @JSImport("@testing-library/vue", "screen.logTestingPlaygroundURL")
    @js.native
    def logTestingPlaygroundURL(element: HTMLDocument): Unit = js.native
    
    @JSImport("@testing-library/vue", "screen.queryAllByAltText")
    @js.native
    def queryAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByAltText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByDisplayValue")
    @js.native
    def queryAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByDisplayValue_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByLabelText")
    @js.native
    def queryAllByLabelText: BoundFunction[AllByText] = js.native
    @scala.inline
    def queryAllByLabelText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByPlaceholderText")
    @js.native
    def queryAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByPlaceholderText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByRole")
    @js.native
    def queryAllByRole: BoundFunction[AllByRole] = js.native
    @scala.inline
    def queryAllByRole_=(x: BoundFunction[AllByRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByTestId")
    @js.native
    def queryAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByTestId_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByText")
    @js.native
    def queryAllByText: BoundFunction[AllByText] = js.native
    @scala.inline
    def queryAllByText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryAllByTitle")
    @js.native
    def queryAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByTitle_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByAltText")
    @js.native
    def queryByAltText: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByAltText_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByDisplayValue")
    @js.native
    def queryByDisplayValue: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByDisplayValue_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByLabelText")
    @js.native
    def queryByLabelText: BoundFunction[QueryByText_] = js.native
    @scala.inline
    def queryByLabelText_=(x: BoundFunction[QueryByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByPlaceholderText")
    @js.native
    def queryByPlaceholderText: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByPlaceholderText_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByRole")
    @js.native
    def queryByRole: BoundFunction[QueryByRole_] = js.native
    @scala.inline
    def queryByRole_=(x: BoundFunction[QueryByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByTestId")
    @js.native
    def queryByTestId: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByTestId_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByText")
    @js.native
    def queryByText: BoundFunction[QueryByText_] = js.native
    @scala.inline
    def queryByText_=(x: BoundFunction[QueryByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/vue", "screen.queryByTitle")
    @js.native
    def queryByTitle: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByTitle_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByTitle")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@testing-library/vue", "waitFor")
  @js.native
  def waitFor[T](callback: js.Function0[T | js.Promise[T]]): js.Promise[T] = js.native
  @JSImport("@testing-library/vue", "waitFor")
  @js.native
  def waitFor[T](callback: js.Function0[T | js.Promise[T]], options: waitForOptions): js.Promise[T] = js.native
  
  @JSImport("@testing-library/vue", "waitForDomChange")
  @js.native
  def waitForDomChange(): js.Promise[_] = js.native
  @JSImport("@testing-library/vue", "waitForDomChange")
  @js.native
  def waitForDomChange(options: waitForOptions): js.Promise[_] = js.native
  
  @JSImport("@testing-library/vue", "waitForElement")
  @js.native
  def waitForElement[T](callback: js.Function0[T]): js.Promise[T] = js.native
  @JSImport("@testing-library/vue", "waitForElement")
  @js.native
  def waitForElement[T](callback: js.Function0[T], options: waitForOptions): js.Promise[T] = js.native
  
  @JSImport("@testing-library/vue", "waitForElementToBeRemoved")
  @js.native
  def waitForElementToBeRemoved[T](callback: T): js.Promise[Unit] = js.native
  @JSImport("@testing-library/vue", "waitForElementToBeRemoved")
  @js.native
  def waitForElementToBeRemoved[T](callback: T, options: waitForOptions): js.Promise[Unit] = js.native
  @JSImport("@testing-library/vue", "waitForElementToBeRemoved")
  @js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T]): js.Promise[Unit] = js.native
  @JSImport("@testing-library/vue", "waitForElementToBeRemoved")
  @js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T], options: waitForOptions): js.Promise[Unit] = js.native
  
  @JSImport("@testing-library/vue", "wait")
  @js.native
  def wait_(): js.Promise[Unit] = js.native
  @JSImport("@testing-library/vue", "wait")
  @js.native
  def wait_(callback: js.UndefOr[scala.Nothing], options: Interval): js.Promise[Unit] = js.native
  @JSImport("@testing-library/vue", "wait")
  @js.native
  def wait_(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  @JSImport("@testing-library/vue", "wait")
  @js.native
  def wait_(callback: js.Function0[Unit], options: Interval): js.Promise[Unit] = js.native
  
  /* was `typeof getQueriesForElement` */
  @JSImport("@testing-library/vue", "within")
  @js.native
  def within[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = js.native
  @JSImport("@testing-library/vue", "within")
  @js.native
  def within[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = js.native
  
  /* Inlined {[ K in @testing-library/dom.@testing-library/dom.EventType ]: (element : std.Document | std.Element | std.Window, options : {} | undefined): std.Promise<void>} */
  @js.native
  trait AsyncFireObject extends StObject {
    
    var abort: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var animationEnd: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var animationIteration: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var animationStart: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var blur: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var canPlay: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var canPlayThrough: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var change: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var click: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var compositionEnd: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var compositionStart: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var compositionUpdate: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var contextMenu: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var copy: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var cut: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var dblClick: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var doubleClick: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var drag: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var dragEnd: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var dragEnter: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var dragExit: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var dragLeave: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var dragOver: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var dragStart: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var drop: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var durationChange: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var emptied: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var encrypted: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var ended: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var error: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var focus: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var focusIn: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var focusOut: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var gotPointerCapture: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var input: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var invalid: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var keyDown: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var keyPress: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var keyUp: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var load: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var loadStart: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var loadedData: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var loadedMetadata: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var lostPointerCapture: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var mouseDown: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var mouseEnter: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var mouseLeave: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var mouseMove: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var mouseOut: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var mouseOver: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var mouseUp: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var paste: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var pause: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var play: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var playing: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var pointerCancel: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var pointerDown: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var pointerEnter: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var pointerLeave: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var pointerMove: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var pointerOut: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var pointerOver: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var pointerUp: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var popState: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var progress: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var rateChange: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var reset: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var scroll: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var seeked: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var seeking: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var select: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var stalled: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var submit: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var suspend: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var timeUpdate: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var touchCancel: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var touchEnd: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var touchMove: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var touchStart: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var transitionEnd: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var volumeChange: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var waiting: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
    
    var wheel: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ] = js.native
  }
  object AsyncFireObject {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class AsyncFireObjectMutableBuilder[Self <: AsyncFireObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "abort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationEnd(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "animationEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationIteration(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "animationIteration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationStart(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "animationStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlur(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanPlay(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "canPlay", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanPlayThrough(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "canPlayThrough", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChange(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClick(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionEnd(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "compositionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionStart(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "compositionStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionUpdate(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "compositionUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContextMenu(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "contextMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCopy(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCut(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "cut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDblClick(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dblClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDoubleClick(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "doubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDrag(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEnd(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEnter(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragExit(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dragExit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragLeave(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragOver(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragStart(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDrop(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDurationChange(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "durationChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmptied(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "emptied", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncrypted(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "encrypted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnded(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "ended", js.Any.fromFunction2(value))
      
      @scala.inline
      def setError(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocus(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocusIn(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "focusIn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocusOut(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "focusOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGotPointerCapture(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "gotPointerCapture", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInput(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvalid(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "invalid", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyDown(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "keyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyPress(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "keyPress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyUp(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "keyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoad(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadStart(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "loadStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadedData(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "loadedData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadedMetadata(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "loadedMetadata", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLostPointerCapture(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "lostPointerCapture", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseDown(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseEnter(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseLeave(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseMove(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOut(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOver(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseUp(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "mouseUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPaste(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "paste", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPause(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pause", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlay(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "play", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlaying(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "playing", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerCancel(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerDown(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerEnter(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerLeave(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerMove(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerOut(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerOver(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerUp(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "pointerUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPopState(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "popState", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgress(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRateChange(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "rateChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReset(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "reset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScroll(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeeked(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "seeked", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeeking(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "seeking", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelect(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStalled(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "stalled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubmit(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "submit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuspend(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "suspend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTimeUpdate(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "timeUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchCancel(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "touchCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchEnd(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "touchEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchMove(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "touchMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchStart(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "touchStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransitionEnd(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVolumeChange(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "volumeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWaiting(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "waiting", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWheel(
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
    
    def emitted(): StringDictionary[js.Array[js.Array[_]]] = js.native
    
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
  @js.native
  trait RenderOptions[V /* <: Vue */, S] extends StObject {
    
    var activated: js.UndefOr[js.Function0[Unit]] = js.native
    
    var attachTo: js.UndefOr[Element | String] = js.native
    
    var attachToDocument: js.UndefOr[Boolean] = js.native
    
    var attrs: js.UndefOr[Record[String, String]] = js.native
    
    var baseElement: js.UndefOr[HTMLElement] = js.native
    
    var beforeCreate: js.UndefOr[js.ThisFunction0[/* this */ V, Unit]] = js.native
    
    var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.native
    
    var beforeMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var beforeUpdate: js.UndefOr[js.Function0[Unit]] = js.native
    
    var comments: js.UndefOr[Boolean] = js.native
    
    var components: js.UndefOr[StringDictionary[(Component[_, _, _, _]) | (AsyncComponent[_, _, _, _])]] = js.native
    
    var computed: js.UndefOr[js.Object] = js.native
    
    var container: js.UndefOr[HTMLElement] = js.native
    
    var context: js.UndefOr[VNodeData] = js.native
    
    var created: js.UndefOr[js.Function0[Unit]] = js.native
    
    var data: js.UndefOr[DefaultData[V]] = js.native
    
    var deactivated: js.UndefOr[js.Function0[Unit]] = js.native
    
    var delimiters: js.UndefOr[js.Tuple2[String, String]] = js.native
    
    var destroyed: js.UndefOr[js.Function0[Unit]] = js.native
    
    var directives: js.UndefOr[StringDictionary[DirectiveFunction | DirectiveOptions]] = js.native
    
    var el: js.UndefOr[Element | String] = js.native
    
    var errorCaptured: js.UndefOr[js.Function3[/* err */ Error, /* vm */ Vue, /* info */ String, Boolean | Unit]] = js.native
    
    var `extends`: js.UndefOr[
        (ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]) | VueConstructor[Vue]
      ] = js.native
    
    var filters: js.UndefOr[StringDictionary[js.Function]] = js.native
    
    var inheritAttrs: js.UndefOr[Boolean] = js.native
    
    var inject: js.UndefOr[InjectOptions] = js.native
    
    var listeners: js.UndefOr[Record[String, js.Function | js.Array[js.Function]]] = js.native
    
    var localVue: js.UndefOr[VueConstructor[Vue]] = js.native
    
    var methods: js.UndefOr[DefaultMethods[V]] = js.native
    
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
      ] = js.native
    
    var mocks: js.UndefOr[js.Object | `false`] = js.native
    
    var model: js.UndefOr[Event] = js.native
    
    var mounted: js.UndefOr[js.Function0[Unit]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var parent: js.UndefOr[Vue] = js.native
    
    var parentComponent: js.UndefOr[
        Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]
      ] = js.native
    
    var props: js.UndefOr[js.Object] = js.native
    
    var propsData: js.UndefOr[js.Object] = js.native
    
    var provide: js.UndefOr[js.Object | js.Function0[js.Object]] = js.native
    
    var render: js.UndefOr[
        js.Function2[/* createElement */ CreateElement, /* hack */ RenderContext[DefaultProps], VNode]
      ] = js.native
    
    var renderError: js.UndefOr[js.Function2[/* createElement */ CreateElement, /* err */ Error, VNode]] = js.native
    
    var routes: js.UndefOr[js.Array[RouteConfig]] = js.native
    
    var scopedSlots: js.UndefOr[Record[String, String | js.Function]] = js.native
    
    var serverPrefetch: js.UndefOr[js.ThisFunction0[/* this */ V, js.Promise[Unit]]] = js.native
    
    var slots: js.UndefOr[Slots] = js.native
    
    var staticRenderFns: js.UndefOr[js.Array[js.Function1[/* createElement */ CreateElement, VNode]]] = js.native
    
    var store: js.UndefOr[StoreOptions[S]] = js.native
    
    var stubs: js.UndefOr[Stubs | `false`] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var transitions: js.UndefOr[StringDictionary[js.Object]] = js.native
    
    var updated: js.UndefOr[js.Function0[Unit]] = js.native
    
    var watch: js.UndefOr[Record[String, WatchOptionsWithHandler[_] | WatchHandler[_] | String]] = js.native
  }
  object RenderOptions {
    
    @scala.inline
    def apply[V /* <: Vue */, S](): RenderOptions[V, S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions[V, S]]
    }
    
    @scala.inline
    implicit class RenderOptionsMutableBuilder[Self <: RenderOptions[_, _], V /* <: Vue */, S] (val x: Self with (RenderOptions[V, S])) extends AnyVal {
      
      @scala.inline
      def setActivated(value: () => Unit): Self = StObject.set(x, "activated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
      
      @scala.inline
      def setAttachTo(value: Element | String): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachToDocument(value: Boolean): Self = StObject.set(x, "attachToDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachToDocumentUndefined: Self = StObject.set(x, "attachToDocument", js.undefined)
      
      @scala.inline
      def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      @scala.inline
      def setAttrs(value: Record[String, String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setBaseElement(value: HTMLElement): Self = StObject.set(x, "baseElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseElementUndefined: Self = StObject.set(x, "baseElement", js.undefined)
      
      @scala.inline
      def setBeforeCreate(value: js.ThisFunction0[/* this */ V, Unit]): Self = StObject.set(x, "beforeCreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCreateUndefined: Self = StObject.set(x, "beforeCreate", js.undefined)
      
      @scala.inline
      def setBeforeDestroy(value: () => Unit): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
      
      @scala.inline
      def setBeforeMount(value: () => Unit): Self = StObject.set(x, "beforeMount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeMountUndefined: Self = StObject.set(x, "beforeMount", js.undefined)
      
      @scala.inline
      def setBeforeUpdate(value: () => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
      
      @scala.inline
      def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setComponents(value: StringDictionary[(Component[_, _, _, _]) | (AsyncComponent[_, _, _, _])]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setComputed(value: js.Object): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setContext(value: VNodeData): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setData(value: DefaultData[V]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDeactivated(value: () => Unit): Self = StObject.set(x, "deactivated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", js.undefined)
      
      @scala.inline
      def setDelimiters(value: js.Tuple2[String, String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      @scala.inline
      def setDestroyed(value: () => Unit): Self = StObject.set(x, "destroyed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyedUndefined: Self = StObject.set(x, "destroyed", js.undefined)
      
      @scala.inline
      def setDirectives(value: StringDictionary[DirectiveFunction | DirectiveOptions]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      @scala.inline
      def setEl(value: Element | String): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      @scala.inline
      def setErrorCaptured(value: (/* err */ Error, /* vm */ Vue, /* info */ String) => Boolean | Unit): Self = StObject.set(x, "errorCaptured", js.Any.fromFunction3(value))
      
      @scala.inline
      def setErrorCapturedUndefined: Self = StObject.set(x, "errorCaptured", js.undefined)
      
      @scala.inline
      def setExtends(
        value: (ComponentOptions[
              Vue, 
              DefaultData[Vue], 
              DefaultMethods[Vue], 
              DefaultComputed, 
              PropsDefinition[DefaultProps], 
              DefaultProps
            ]) | VueConstructor[Vue]
      ): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      @scala.inline
      def setFilters(value: StringDictionary[js.Function]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setInheritAttrs(value: Boolean): Self = StObject.set(x, "inheritAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritAttrsUndefined: Self = StObject.set(x, "inheritAttrs", js.undefined)
      
      @scala.inline
      def setInject(value: InjectOptions): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      @scala.inline
      def setInjectVarargs(value: String*): Self = StObject.set(x, "inject", js.Array(value :_*))
      
      @scala.inline
      def setListeners(value: Record[String, js.Function | js.Array[js.Function]]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      @scala.inline
      def setLocalVue(value: VueConstructor[Vue]): Self = StObject.set(x, "localVue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalVueUndefined: Self = StObject.set(x, "localVue", js.undefined)
      
      @scala.inline
      def setMethods(value: DefaultMethods[V]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMixins(
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
      
      @scala.inline
      def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      @scala.inline
      def setMixinsVarargs(
        value: ((ComponentOptions[
              Vue, 
              DefaultData[Vue], 
              DefaultMethods[Vue], 
              DefaultComputed, 
              PropsDefinition[DefaultProps], 
              DefaultProps
            ]) | VueConstructor[Vue])*
      ): Self = StObject.set(x, "mixins", js.Array(value :_*))
      
      @scala.inline
      def setMocks(value: js.Object | `false`): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMocksUndefined: Self = StObject.set(x, "mocks", js.undefined)
      
      @scala.inline
      def setModel(value: Event): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setMounted(value: () => Unit): Self = StObject.set(x, "mounted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMountedUndefined: Self = StObject.set(x, "mounted", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParent(value: Vue): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentComponent(
        value: Component[
              DefaultData[scala.Nothing], 
              DefaultMethods[scala.Nothing], 
              DefaultComputed, 
              DefaultProps
            ]
      ): Self = StObject.set(x, "parentComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentComponentUndefined: Self = StObject.set(x, "parentComponent", js.undefined)
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setProps(value: js.Object): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsData(value: js.Object): Self = StObject.set(x, "propsData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsDataUndefined: Self = StObject.set(x, "propsData", js.undefined)
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setProvide(value: js.Object | js.Function0[js.Object]): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideFunction0(value: () => js.Object): Self = StObject.set(x, "provide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProvideUndefined: Self = StObject.set(x, "provide", js.undefined)
      
      @scala.inline
      def setRender(value: (/* createElement */ CreateElement, /* hack */ RenderContext[DefaultProps]) => VNode): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderError(value: (/* createElement */ CreateElement, /* err */ Error) => VNode): Self = StObject.set(x, "renderError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderErrorUndefined: Self = StObject.set(x, "renderError", js.undefined)
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setRoutes(value: js.Array[RouteConfig]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: RouteConfig*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setScopedSlots(value: Record[String, String | js.Function]): Self = StObject.set(x, "scopedSlots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopedSlotsUndefined: Self = StObject.set(x, "scopedSlots", js.undefined)
      
      @scala.inline
      def setServerPrefetch(value: js.ThisFunction0[/* this */ V, js.Promise[Unit]]): Self = StObject.set(x, "serverPrefetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerPrefetchUndefined: Self = StObject.set(x, "serverPrefetch", js.undefined)
      
      @scala.inline
      def setSlots(value: Slots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      @scala.inline
      def setStaticRenderFns(value: js.Array[js.Function1[/* createElement */ CreateElement, VNode]]): Self = StObject.set(x, "staticRenderFns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRenderFnsUndefined: Self = StObject.set(x, "staticRenderFns", js.undefined)
      
      @scala.inline
      def setStaticRenderFnsVarargs(value: (js.Function1[/* createElement */ CreateElement, VNode])*): Self = StObject.set(x, "staticRenderFns", js.Array(value :_*))
      
      @scala.inline
      def setStore(value: StoreOptions[S]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setStubs(value: Stubs | `false`): Self = StObject.set(x, "stubs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStubsUndefined: Self = StObject.set(x, "stubs", js.undefined)
      
      @scala.inline
      def setStubsVarargs(value: String*): Self = StObject.set(x, "stubs", js.Array(value :_*))
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTransitions(value: StringDictionary[js.Object]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      @scala.inline
      def setUpdated(value: () => Unit): Self = StObject.set(x, "updated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
      
      @scala.inline
      def setWatch(value: Record[String, WatchOptionsWithHandler[_] | WatchHandler[_] | String]): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  @js.native
  trait VueFireObject extends AsyncFireObject {
    
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
