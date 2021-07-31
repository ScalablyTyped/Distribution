package typings.testingLibraryDom

import org.scalablytyped.runtime.StringDictionary
import typings.prettyFormat.mod.OptionsReceived
import typings.prettyFormat.typesMod.NewPlugin
import typings.std.Element
import typings.std.Error
import typings.std.HTMLDocument
import typings.std.HTMLElement
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
import typings.testingLibraryDom.testingLibraryDomBooleans.`false`
import typings.testingLibraryDom.waitForMod.waitForOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@testing-library/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buildQueries[Arguments /* <: js.Array[js.Any] */](
    queryByAll: GetAllBy[Arguments],
    getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
    getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
  ): BuiltQueryMethods[Arguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueries")(queryByAll.asInstanceOf[js.Any], getMultipleError.asInstanceOf[js.Any], getMissingError.asInstanceOf[js.Any])).asInstanceOf[BuiltQueryMethods[Arguments]]
  
  @scala.inline
  def computeHeadingLevel(element: Element): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeHeadingLevel")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def configure(configDelta: PartialConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def configure(configDelta: ConfigFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@testing-library/dom", "createEvent")
  @js.native
  val createEvent: CreateObject & CreateFunction = js.native
  
  @JSImport("@testing-library/dom", "findAllByAltText")
  @js.native
  val findAllByAltText: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "findAllByDisplayValue")
  @js.native
  val findAllByDisplayValue: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "findAllByLabelText")
  @js.native
  val findAllByLabelText: FindAllByText_ = js.native
  
  @JSImport("@testing-library/dom", "findAllByPlaceholderText")
  @js.native
  val findAllByPlaceholderText: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "findAllByRole")
  @js.native
  val findAllByRole: FindAllByRole_ = js.native
  
  @JSImport("@testing-library/dom", "findAllByTestId")
  @js.native
  val findAllByTestId: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "findAllByText")
  @js.native
  val findAllByText: FindAllByText_ = js.native
  
  @JSImport("@testing-library/dom", "findAllByTitle")
  @js.native
  val findAllByTitle: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "findByAltText")
  @js.native
  val findByAltText: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "findByDisplayValue")
  @js.native
  val findByDisplayValue: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "findByLabelText")
  @js.native
  val findByLabelText: FindByText_ = js.native
  
  @JSImport("@testing-library/dom", "findByPlaceholderText")
  @js.native
  val findByPlaceholderText: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "findByRole")
  @js.native
  val findByRole: FindByRole_ = js.native
  
  @JSImport("@testing-library/dom", "findByTestId")
  @js.native
  val findByTestId: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "findByText")
  @js.native
  val findByText: FindByText_ = js.native
  
  @JSImport("@testing-library/dom", "findByTitle")
  @js.native
  val findByTitle: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "fireEvent")
  @js.native
  val fireEvent: FireFunction & FireObject = js.native
  
  @JSImport("@testing-library/dom", "getAllByAltText")
  @js.native
  val getAllByAltText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "getAllByDisplayValue")
  @js.native
  val getAllByDisplayValue: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "getAllByLabelText")
  @js.native
  val getAllByLabelText: AllByText = js.native
  
  @JSImport("@testing-library/dom", "getAllByPlaceholderText")
  @js.native
  val getAllByPlaceholderText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "getAllByRole")
  @js.native
  val getAllByRole: AllByRole = js.native
  
  @JSImport("@testing-library/dom", "getAllByTestId")
  @js.native
  val getAllByTestId: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "getAllByText")
  @js.native
  val getAllByText: AllByText = js.native
  
  @JSImport("@testing-library/dom", "getAllByTitle")
  @js.native
  val getAllByTitle: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "getByAltText")
  @js.native
  val getByAltText: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "getByDisplayValue")
  @js.native
  val getByDisplayValue: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "getByLabelText")
  @js.native
  val getByLabelText: GetByText_ = js.native
  
  @JSImport("@testing-library/dom", "getByPlaceholderText")
  @js.native
  val getByPlaceholderText: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "getByRole")
  @js.native
  val getByRole: GetByRole_ = js.native
  
  @JSImport("@testing-library/dom", "getByTestId")
  @js.native
  val getByTestId: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "getByText")
  @js.native
  val getByText: GetByText_ = js.native
  
  @JSImport("@testing-library/dom", "getByTitle")
  @js.native
  val getByTitle: GetByBoundAttribute = js.native
  
  @scala.inline
  def getConfig(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")().asInstanceOf[Config]
  
  @scala.inline
  def getDefaultNormalizer(): NormalizerFn = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNormalizer")().asInstanceOf[NormalizerFn]
  @scala.inline
  def getDefaultNormalizer(options: DefaultNormalizerOptions): NormalizerFn = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNormalizer")(options.asInstanceOf[js.Any]).asInstanceOf[NormalizerFn]
  
  @scala.inline
  def getElementError(message: String, container: HTMLElement): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementError")(message.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  @scala.inline
  def getNodeText(node: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeText")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueriesForElement")(element.asInstanceOf[js.Any]).asInstanceOf[BoundFunctions[T]]
  @scala.inline
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueriesForElement")(element.asInstanceOf[js.Any], queriesToBind.asInstanceOf[js.Any])).asInstanceOf[BoundFunctions[T]]
  
  @scala.inline
  def getRoles(container: HTMLElement): StringDictionary[js.Array[HTMLElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoles")(container.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Array[HTMLElement]]]
  
  @scala.inline
  def getSuggestedQuery(element: HTMLElement): js.UndefOr[Suggestion] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Suggestion]]
  @scala.inline
  def getSuggestedQuery(element: HTMLElement, variant: Unit, method: Method): js.UndefOr[Suggestion] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any], variant.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Suggestion]]
  @scala.inline
  def getSuggestedQuery(element: HTMLElement, variant: Variant): js.UndefOr[Suggestion] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Suggestion]]
  @scala.inline
  def getSuggestedQuery(element: HTMLElement, variant: Variant, method: Method): js.UndefOr[Suggestion] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any], variant.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Suggestion]]
  
  @scala.inline
  def isInaccessible(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInaccessible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def logDOM(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")().asInstanceOf[Unit]
  @scala.inline
  def logDOM(dom: Unit, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def logDOM(dom: Unit, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def logDOM(dom: Unit, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def logDOM(dom: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def logDOM(dom: Element, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def logDOM(dom: Element, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def logDOM(dom: Element, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def logDOM(dom: HTMLDocument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def logDOM(dom: HTMLDocument, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def logDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def logDOM(dom: HTMLDocument, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def logRoles(container: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("logRoles")(container.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def prettyDOM(): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")().asInstanceOf[String | `false`]
  @scala.inline
  def prettyDOM(dom: Unit, maxLength: Double): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  @scala.inline
  def prettyDOM(dom: Unit, maxLength: Double, options: OptionsReceived): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  @scala.inline
  def prettyDOM(dom: Unit, maxLength: Unit, options: OptionsReceived): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  @scala.inline
  def prettyDOM(dom: Element): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  @scala.inline
  def prettyDOM(dom: Element, maxLength: Double): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  @scala.inline
  def prettyDOM(dom: Element, maxLength: Double, options: OptionsReceived): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  @scala.inline
  def prettyDOM(dom: Element, maxLength: Unit, options: OptionsReceived): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  @scala.inline
  def prettyDOM(dom: HTMLDocument): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  @scala.inline
  def prettyDOM(dom: HTMLDocument, maxLength: Double): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  @scala.inline
  def prettyDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  @scala.inline
  def prettyDOM(dom: HTMLDocument, maxLength: Unit, options: OptionsReceived): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  
  object prettyFormat {
    
    /**
      * Returns a presentation string of your `val` object
      * @param val any potential JavaScript object
      * @param options Custom settings
      */
    @scala.inline
    def apply(`val`: js.Any): String = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def apply(`val`: js.Any, options: typings.prettyFormat.typesMod.OptionsReceived): String = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@testing-library/dom", "prettyFormat")
    @js.native
    val ^ : js.Any = js.native
    
    object plugins {
      
      @JSImport("@testing-library/dom", "prettyFormat.plugins")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@testing-library/dom", "prettyFormat.plugins.AsymmetricMatcher")
      @js.native
      def AsymmetricMatcher: NewPlugin = js.native
      @scala.inline
      def AsymmetricMatcher_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsymmetricMatcher")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/dom", "prettyFormat.plugins.ConvertAnsi")
      @js.native
      def ConvertAnsi: NewPlugin = js.native
      @scala.inline
      def ConvertAnsi_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvertAnsi")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/dom", "prettyFormat.plugins.DOMCollection")
      @js.native
      def DOMCollection: NewPlugin = js.native
      @scala.inline
      def DOMCollection_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMCollection")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/dom", "prettyFormat.plugins.DOMElement")
      @js.native
      def DOMElement: NewPlugin = js.native
      @scala.inline
      def DOMElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMElement")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/dom", "prettyFormat.plugins.Immutable")
      @js.native
      def Immutable: NewPlugin = js.native
      @scala.inline
      def Immutable_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Immutable")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/dom", "prettyFormat.plugins.ReactElement")
      @js.native
      def ReactElement: NewPlugin = js.native
      @scala.inline
      def ReactElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactElement")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/dom", "prettyFormat.plugins.ReactTestComponent")
      @js.native
      def ReactTestComponent: NewPlugin = js.native
      @scala.inline
      def ReactTestComponent_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactTestComponent")(x.asInstanceOf[js.Any])
    }
  }
  
  object queries {
    
    @JSImport("@testing-library/dom", "queries.findAllByAltText")
    @js.native
    val findAllByAltText: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.findAllByDisplayValue")
    @js.native
    val findAllByDisplayValue: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.findAllByLabelText")
    @js.native
    val findAllByLabelText: FindAllByText_ = js.native
    
    @JSImport("@testing-library/dom", "queries.findAllByPlaceholderText")
    @js.native
    val findAllByPlaceholderText: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.findAllByRole")
    @js.native
    val findAllByRole: FindAllByRole_ = js.native
    
    @JSImport("@testing-library/dom", "queries.findAllByTestId")
    @js.native
    val findAllByTestId: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.findAllByText")
    @js.native
    val findAllByText: FindAllByText_ = js.native
    
    @JSImport("@testing-library/dom", "queries.findAllByTitle")
    @js.native
    val findAllByTitle: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.findByAltText")
    @js.native
    val findByAltText: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.findByDisplayValue")
    @js.native
    val findByDisplayValue: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.findByLabelText")
    @js.native
    val findByLabelText: FindByText_ = js.native
    
    @JSImport("@testing-library/dom", "queries.findByPlaceholderText")
    @js.native
    val findByPlaceholderText: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.findByRole")
    @js.native
    val findByRole: FindByRole_ = js.native
    
    @JSImport("@testing-library/dom", "queries.findByTestId")
    @js.native
    val findByTestId: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.findByText")
    @js.native
    val findByText: FindByText_ = js.native
    
    @JSImport("@testing-library/dom", "queries.findByTitle")
    @js.native
    val findByTitle: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.getAllByAltText")
    @js.native
    val getAllByAltText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.getAllByDisplayValue")
    @js.native
    val getAllByDisplayValue: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.getAllByLabelText")
    @js.native
    val getAllByLabelText: AllByText = js.native
    
    @JSImport("@testing-library/dom", "queries.getAllByPlaceholderText")
    @js.native
    val getAllByPlaceholderText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.getAllByRole")
    @js.native
    val getAllByRole: AllByRole = js.native
    
    @JSImport("@testing-library/dom", "queries.getAllByTestId")
    @js.native
    val getAllByTestId: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.getAllByText")
    @js.native
    val getAllByText: AllByText = js.native
    
    @JSImport("@testing-library/dom", "queries.getAllByTitle")
    @js.native
    val getAllByTitle: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.getByAltText")
    @js.native
    val getByAltText: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.getByDisplayValue")
    @js.native
    val getByDisplayValue: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.getByLabelText")
    @js.native
    val getByLabelText: GetByText_ = js.native
    
    @JSImport("@testing-library/dom", "queries.getByPlaceholderText")
    @js.native
    val getByPlaceholderText: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.getByRole")
    @js.native
    val getByRole: GetByRole_ = js.native
    
    @JSImport("@testing-library/dom", "queries.getByTestId")
    @js.native
    val getByTestId: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.getByText")
    @js.native
    val getByText: GetByText_ = js.native
    
    @JSImport("@testing-library/dom", "queries.getByTitle")
    @js.native
    val getByTitle: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.queryAllByAltText")
    @js.native
    val queryAllByAltText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.queryAllByDisplayValue")
    @js.native
    val queryAllByDisplayValue: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.queryAllByLabelText")
    @js.native
    val queryAllByLabelText: AllByText = js.native
    
    @JSImport("@testing-library/dom", "queries.queryAllByPlaceholderText")
    @js.native
    val queryAllByPlaceholderText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.queryAllByRole")
    @js.native
    val queryAllByRole: AllByRole = js.native
    
    @JSImport("@testing-library/dom", "queries.queryAllByTestId")
    @js.native
    val queryAllByTestId: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.queryAllByText")
    @js.native
    val queryAllByText: AllByText = js.native
    
    @JSImport("@testing-library/dom", "queries.queryAllByTitle")
    @js.native
    val queryAllByTitle: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.queryByAltText")
    @js.native
    val queryByAltText: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.queryByDisplayValue")
    @js.native
    val queryByDisplayValue: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.queryByLabelText")
    @js.native
    val queryByLabelText: QueryByText_ = js.native
    
    @JSImport("@testing-library/dom", "queries.queryByPlaceholderText")
    @js.native
    val queryByPlaceholderText: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.queryByRole")
    @js.native
    val queryByRole: QueryByRole_ = js.native
    
    @JSImport("@testing-library/dom", "queries.queryByTestId")
    @js.native
    val queryByTestId: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/dom", "queries.queryByText")
    @js.native
    val queryByText: QueryByText_ = js.native
    
    @JSImport("@testing-library/dom", "queries.queryByTitle")
    @js.native
    val queryByTitle: QueryByBoundAttribute = js.native
  }
  
  @JSImport("@testing-library/dom", "queryAllByAltText")
  @js.native
  val queryAllByAltText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "queryAllByAttribute")
  @js.native
  val queryAllByAttribute: AllByAttribute = js.native
  
  @JSImport("@testing-library/dom", "queryAllByDisplayValue")
  @js.native
  val queryAllByDisplayValue: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "queryAllByLabelText")
  @js.native
  val queryAllByLabelText: AllByText = js.native
  
  @JSImport("@testing-library/dom", "queryAllByPlaceholderText")
  @js.native
  val queryAllByPlaceholderText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "queryAllByRole")
  @js.native
  val queryAllByRole: AllByRole = js.native
  
  @JSImport("@testing-library/dom", "queryAllByTestId")
  @js.native
  val queryAllByTestId: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "queryAllByText")
  @js.native
  val queryAllByText: AllByText = js.native
  
  @JSImport("@testing-library/dom", "queryAllByTitle")
  @js.native
  val queryAllByTitle: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "queryByAltText")
  @js.native
  val queryByAltText: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "queryByAttribute")
  @js.native
  val queryByAttribute: QueryByAttribute_ = js.native
  
  @JSImport("@testing-library/dom", "queryByDisplayValue")
  @js.native
  val queryByDisplayValue: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "queryByLabelText")
  @js.native
  val queryByLabelText: QueryByText_ = js.native
  
  @JSImport("@testing-library/dom", "queryByPlaceholderText")
  @js.native
  val queryByPlaceholderText: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "queryByRole")
  @js.native
  val queryByRole: QueryByRole_ = js.native
  
  @JSImport("@testing-library/dom", "queryByTestId")
  @js.native
  val queryByTestId: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/dom", "queryByText")
  @js.native
  val queryByText: QueryByText_ = js.native
  
  @JSImport("@testing-library/dom", "queryByTitle")
  @js.native
  val queryByTitle: QueryByBoundAttribute = js.native
  
  object queryHelpers {
    
    @JSImport("@testing-library/dom", "queryHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def buildQueries[Arguments /* <: js.Array[js.Any] */](
      queryByAll: GetAllBy[Arguments],
      getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
      getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
    ): BuiltQueryMethods[Arguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueries")(queryByAll.asInstanceOf[js.Any], getMultipleError.asInstanceOf[js.Any], getMissingError.asInstanceOf[js.Any])).asInstanceOf[BuiltQueryMethods[Arguments]]
    
    @scala.inline
    def getElementError(message: String, container: HTMLElement): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementError")(message.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Error]
    
    @JSImport("@testing-library/dom", "queryHelpers.queryAllByAttribute")
    @js.native
    val queryAllByAttribute: AllByAttribute = js.native
    
    @JSImport("@testing-library/dom", "queryHelpers.queryByAttribute")
    @js.native
    val queryByAttribute: QueryByAttribute_ = js.native
  }
  
  /* Inlined @testing-library/dom.@testing-library/dom/types/screen.Screen<{ readonly getByLabelText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly getAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly queryByLabelText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly queryAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly findAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly getByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly getAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly queryByText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly queryAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly findAllByText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly getByAltText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByAltText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByTitle :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTitle :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByRole :@testing-library/dom.@testing-library/dom/types/queries.GetByRole,  readonly getAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly queryByRole :@testing-library/dom.@testing-library/dom/types/queries.QueryByRole,  readonly queryAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly findByRole :@testing-library/dom.@testing-library/dom/types/queries.FindByRole,  readonly findAllByRole :@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole,  readonly getByTestId :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTestId :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute}> */
  object screen {
    
    @JSImport("@testing-library/dom", "screen")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convenience function for `pretty-dom` which also allows an array
      * of elements
      */
    @scala.inline
    def debug(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")().asInstanceOf[Unit]
    @scala.inline
    def debug(element: js.Array[Element | HTMLDocument]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def debug(element: js.Array[Element | HTMLDocument], maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: js.Array[Element | HTMLDocument], maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: js.Array[Element | HTMLDocument], maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Unit, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Unit, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Unit, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Element, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Element, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Element, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: HTMLDocument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def debug(element: HTMLDocument, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: HTMLDocument, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@testing-library/dom", "screen.findAllByAltText")
    @js.native
    def findAllByAltText: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByAltText_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findAllByDisplayValue")
    @js.native
    def findAllByDisplayValue: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByDisplayValue_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findAllByLabelText")
    @js.native
    def findAllByLabelText: BoundFunction[FindAllByText_] = js.native
    @scala.inline
    def findAllByLabelText_=(x: BoundFunction[FindAllByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findAllByPlaceholderText")
    @js.native
    def findAllByPlaceholderText: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByPlaceholderText_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findAllByRole")
    @js.native
    def findAllByRole: BoundFunction[FindAllByRole_] = js.native
    @scala.inline
    def findAllByRole_=(x: BoundFunction[FindAllByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findAllByTestId")
    @js.native
    def findAllByTestId: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByTestId_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findAllByText")
    @js.native
    def findAllByText: BoundFunction[FindAllByText_] = js.native
    @scala.inline
    def findAllByText_=(x: BoundFunction[FindAllByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findAllByTitle")
    @js.native
    def findAllByTitle: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByTitle_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findByAltText")
    @js.native
    def findByAltText: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByAltText_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findByDisplayValue")
    @js.native
    def findByDisplayValue: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByDisplayValue_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findByLabelText")
    @js.native
    def findByLabelText: BoundFunction[FindByText_] = js.native
    @scala.inline
    def findByLabelText_=(x: BoundFunction[FindByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findByPlaceholderText")
    @js.native
    def findByPlaceholderText: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByPlaceholderText_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findByRole")
    @js.native
    def findByRole: BoundFunction[FindByRole_] = js.native
    @scala.inline
    def findByRole_=(x: BoundFunction[FindByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findByTestId")
    @js.native
    def findByTestId: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByTestId_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findByText")
    @js.native
    def findByText: BoundFunction[FindByText_] = js.native
    @scala.inline
    def findByText_=(x: BoundFunction[FindByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.findByTitle")
    @js.native
    def findByTitle: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByTitle_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getAllByAltText")
    @js.native
    def getAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByAltText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getAllByDisplayValue")
    @js.native
    def getAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByDisplayValue_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getAllByLabelText")
    @js.native
    def getAllByLabelText: BoundFunction[AllByText] = js.native
    @scala.inline
    def getAllByLabelText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getAllByPlaceholderText")
    @js.native
    def getAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByPlaceholderText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getAllByRole")
    @js.native
    def getAllByRole: BoundFunction[AllByRole] = js.native
    @scala.inline
    def getAllByRole_=(x: BoundFunction[AllByRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getAllByTestId")
    @js.native
    def getAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByTestId_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getAllByText")
    @js.native
    def getAllByText: BoundFunction[AllByText] = js.native
    @scala.inline
    def getAllByText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getAllByTitle")
    @js.native
    def getAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByTitle_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getByAltText")
    @js.native
    def getByAltText: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByAltText_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getByDisplayValue")
    @js.native
    def getByDisplayValue: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByDisplayValue_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getByLabelText")
    @js.native
    def getByLabelText: BoundFunction[GetByText_] = js.native
    @scala.inline
    def getByLabelText_=(x: BoundFunction[GetByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getByPlaceholderText")
    @js.native
    def getByPlaceholderText: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByPlaceholderText_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getByRole")
    @js.native
    def getByRole: BoundFunction[GetByRole_] = js.native
    @scala.inline
    def getByRole_=(x: BoundFunction[GetByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getByTestId")
    @js.native
    def getByTestId: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByTestId_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getByText")
    @js.native
    def getByText: BoundFunction[GetByText_] = js.native
    @scala.inline
    def getByText_=(x: BoundFunction[GetByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.getByTitle")
    @js.native
    def getByTitle: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByTitle_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByTitle")(x.asInstanceOf[js.Any])
    
    /**
      * Convenience function for `Testing Playground` which logs URL that
      * can be opened in a browser
      */
    @scala.inline
    def logTestingPlaygroundURL(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logTestingPlaygroundURL")().asInstanceOf[Unit]
    @scala.inline
    def logTestingPlaygroundURL(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logTestingPlaygroundURL")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def logTestingPlaygroundURL(element: HTMLDocument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logTestingPlaygroundURL")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@testing-library/dom", "screen.queryAllByAltText")
    @js.native
    def queryAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByAltText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryAllByDisplayValue")
    @js.native
    def queryAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByDisplayValue_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryAllByLabelText")
    @js.native
    def queryAllByLabelText: BoundFunction[AllByText] = js.native
    @scala.inline
    def queryAllByLabelText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryAllByPlaceholderText")
    @js.native
    def queryAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByPlaceholderText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryAllByRole")
    @js.native
    def queryAllByRole: BoundFunction[AllByRole] = js.native
    @scala.inline
    def queryAllByRole_=(x: BoundFunction[AllByRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryAllByTestId")
    @js.native
    def queryAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByTestId_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryAllByText")
    @js.native
    def queryAllByText: BoundFunction[AllByText] = js.native
    @scala.inline
    def queryAllByText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryAllByTitle")
    @js.native
    def queryAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByTitle_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryByAltText")
    @js.native
    def queryByAltText: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByAltText_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryByDisplayValue")
    @js.native
    def queryByDisplayValue: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByDisplayValue_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryByLabelText")
    @js.native
    def queryByLabelText: BoundFunction[QueryByText_] = js.native
    @scala.inline
    def queryByLabelText_=(x: BoundFunction[QueryByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryByPlaceholderText")
    @js.native
    def queryByPlaceholderText: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByPlaceholderText_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryByRole")
    @js.native
    def queryByRole: BoundFunction[QueryByRole_] = js.native
    @scala.inline
    def queryByRole_=(x: BoundFunction[QueryByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryByTestId")
    @js.native
    def queryByTestId: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByTestId_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryByText")
    @js.native
    def queryByText: BoundFunction[QueryByText_] = js.native
    @scala.inline
    def queryByText_=(x: BoundFunction[QueryByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom", "screen.queryByTitle")
    @js.native
    def queryByTitle: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByTitle_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByTitle")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def waitFor[T](callback: js.Function0[T | js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def waitFor[T](callback: js.Function0[T | js.Promise[T]], options: waitForOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def waitForDomChange(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForDomChange")().asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def waitForDomChange(options: waitForOptions): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForDomChange")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def waitForElement[T](callback: js.Function0[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForElement")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def waitForElement[T](callback: js.Function0[T], options: waitForOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElement")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def waitForElementToBeRemoved[T](callback: T): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForElementToBeRemoved[T](callback: T, options: waitForOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForElementToBeRemoved[T](callback: js.Function0[T]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForElementToBeRemoved[T](callback: js.Function0[T], options: waitForOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def wait_(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")().asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def wait_(callback: js.Function0[Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def wait_(callback: js.Function0[Unit], options: Interval): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def wait_(callback: Unit, options: Interval): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* was `typeof getQueriesForElement` */
  @scala.inline
  def within[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("within")(element.asInstanceOf[js.Any]).asInstanceOf[BoundFunctions[T]]
  @scala.inline
  def within[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(element.asInstanceOf[js.Any], queriesToBind.asInstanceOf[js.Any])).asInstanceOf[BoundFunctions[T]]
}
