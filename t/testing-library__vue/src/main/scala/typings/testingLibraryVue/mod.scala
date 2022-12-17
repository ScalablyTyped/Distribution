package typings.testingLibraryVue

import org.scalablytyped.runtime.StringDictionary
import typings.prettyFormat.anon.RequiredPartialreadonlyco
import typings.prettyFormat.mod.NewPlugin
import typings.prettyFormat.mod.OptionsReceived
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDocument
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLOptionElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import typings.std.Parameters
import typings.std.Record
import typings.std.ReturnType
import typings.std.Window
import typings.testingLibraryDom.anon.PartialConfig
import typings.testingLibraryDom.anon.Typeofqueries
import typings.testingLibraryDom.typesConfigMod.Config
import typings.testingLibraryDom.typesConfigMod.ConfigFn
import typings.testingLibraryDom.typesEventsMod.CreateFunction
import typings.testingLibraryDom.typesEventsMod.CreateObject
import typings.testingLibraryDom.typesGetQueriesForElementMod.BoundFunctions
import typings.testingLibraryDom.typesGetQueriesForElementMod.Queries
import typings.testingLibraryDom.typesMatchesMod.DefaultNormalizerOptions
import typings.testingLibraryDom.typesMatchesMod.NormalizerFn
import typings.testingLibraryDom.typesPrettyDomMod.PrettyDOMOptions
import typings.testingLibraryDom.typesQueriesMod.AllByBoundAttribute
import typings.testingLibraryDom.typesQueriesMod.AllByRole
import typings.testingLibraryDom.typesQueriesMod.AllByText
import typings.testingLibraryDom.typesQueriesMod.FindAllByBoundAttribute
import typings.testingLibraryDom.typesQueriesMod.FindAllByRole_
import typings.testingLibraryDom.typesQueriesMod.FindAllByText_
import typings.testingLibraryDom.typesQueriesMod.FindByBoundAttribute
import typings.testingLibraryDom.typesQueriesMod.FindByRole_
import typings.testingLibraryDom.typesQueriesMod.FindByText_
import typings.testingLibraryDom.typesQueriesMod.GetByBoundAttribute
import typings.testingLibraryDom.typesQueriesMod.GetByRole_
import typings.testingLibraryDom.typesQueriesMod.GetByText_
import typings.testingLibraryDom.typesQueriesMod.QueryByBoundAttribute
import typings.testingLibraryDom.typesQueriesMod.QueryByRole_
import typings.testingLibraryDom.typesQueriesMod.QueryByText_
import typings.testingLibraryDom.typesQueryHelpersMod.AllByAttribute
import typings.testingLibraryDom.typesQueryHelpersMod.BuiltQueryMethods
import typings.testingLibraryDom.typesQueryHelpersMod.GetAllBy
import typings.testingLibraryDom.typesQueryHelpersMod.GetErrorFunction
import typings.testingLibraryDom.typesQueryHelpersMod.QueryByAttribute_
import typings.testingLibraryDom.typesScreenMod.Screen_
import typings.testingLibraryDom.typesSuggestionsMod.Method
import typings.testingLibraryDom.typesSuggestionsMod.Suggestion
import typings.testingLibraryDom.typesSuggestionsMod.Variant
import typings.testingLibraryDom.typesWaitForMod.waitForOptions
import typings.testingLibraryVue.testingLibraryVueBooleans.`false`
import typings.testingLibraryVue.testingLibraryVueBooleans.`true`
import typings.vueTestUtils.anon.SlotDictionarydefaultSlot
import typings.vueTestUtils.distTypesMod.GlobalMountOptions
import typings.vueTestUtils.distTypesMod.RawProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@testing-library/vue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildQueries[Arguments /* <: js.Array[Any] */](
    queryAllBy: GetAllBy[Arguments],
    getMultipleError: GetErrorFunction[Arguments],
    getMissingError: GetErrorFunction[Arguments]
  ): BuiltQueryMethods[Arguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueries")(queryAllBy.asInstanceOf[js.Any], getMultipleError.asInstanceOf[js.Any], getMissingError.asInstanceOf[js.Any])).asInstanceOf[BuiltQueryMethods[Arguments]]
  
  inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
  
  inline def computeHeadingLevel(element: Element): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeHeadingLevel")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def configure(configDelta: PartialConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def configure(configDelta: ConfigFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@testing-library/vue", "createEvent")
  @js.native
  val createEvent: CreateObject & CreateFunction = js.native
  
  inline def findAllByAltText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
  ): ReturnType[FindAllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByAltText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByBoundAttribute[T]]]
  
  inline def findAllByDisplayValue[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
  ): ReturnType[FindAllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByDisplayValue")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByBoundAttribute[T]]]
  
  inline def findAllByLabelText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByText<T>> is not an array type */ args: Parameters[FindAllByText_[T]]
  ): ReturnType[FindAllByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByLabelText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByText_[T]]]
  
  inline def findAllByPlaceholderText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
  ): ReturnType[FindAllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByPlaceholderText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByBoundAttribute[T]]]
  
  inline def findAllByRole[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByRole<T>> is not an array type */ args: Parameters[FindAllByRole_[T]]
  ): ReturnType[FindAllByRole_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByRole")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByRole_[T]]]
  
  inline def findAllByTestId[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
  ): ReturnType[FindAllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByTestId")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByBoundAttribute[T]]]
  
  inline def findAllByText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByText<T>> is not an array type */ args: Parameters[FindAllByText_[T]]
  ): ReturnType[FindAllByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByText_[T]]]
  
  inline def findAllByTitle[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
  ): ReturnType[FindAllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByTitle")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByBoundAttribute[T]]]
  
  inline def findByAltText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
  ): ReturnType[FindByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByAltText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByBoundAttribute[T]]]
  
  inline def findByDisplayValue[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
  ): ReturnType[FindByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByDisplayValue")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByBoundAttribute[T]]]
  
  inline def findByLabelText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByText<T>> is not an array type */ args: Parameters[FindByText_[T]]
  ): ReturnType[FindByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByLabelText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByText_[T]]]
  
  inline def findByPlaceholderText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
  ): ReturnType[FindByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByPlaceholderText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByBoundAttribute[T]]]
  
  inline def findByRole[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByRole<T>> is not an array type */ args: Parameters[FindByRole_[T]]
  ): ReturnType[FindByRole_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByRole")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByRole_[T]]]
  
  inline def findByTestId[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
  ): ReturnType[FindByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByTestId")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByBoundAttribute[T]]]
  
  inline def findByText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByText<T>> is not an array type */ args: Parameters[FindByText_[T]]
  ): ReturnType[FindByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByText_[T]]]
  
  inline def findByTitle[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
  ): ReturnType[FindByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByTitle")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByBoundAttribute[T]]]
  
  @JSImport("@testing-library/vue", "fireEvent")
  @js.native
  val fireEvent: VueFireEventObject = js.native
  
  inline def getAllByAltText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
  ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByAltText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
  
  inline def getAllByDisplayValue[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
  ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByDisplayValue")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
  
  inline def getAllByLabelText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByText<T>> is not an array type */ args: Parameters[AllByText[T]]
  ): ReturnType[AllByText[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByLabelText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByText[T]]]
  
  inline def getAllByPlaceholderText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
  ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByPlaceholderText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
  
  inline def getAllByRole[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByRole<T>> is not an array type */ args: Parameters[AllByRole[T]]
  ): ReturnType[AllByRole[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByRole")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByRole[T]]]
  
  inline def getAllByTestId[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
  ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByTestId")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
  
  inline def getAllByText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByText<T>> is not an array type */ args: Parameters[AllByText[T]]
  ): ReturnType[AllByText[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByText[T]]]
  
  inline def getAllByTitle[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
  ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByTitle")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
  
  inline def getByAltText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
  ): ReturnType[GetByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByAltText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByBoundAttribute[T]]]
  
  inline def getByDisplayValue[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
  ): ReturnType[GetByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByDisplayValue")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByBoundAttribute[T]]]
  
  inline def getByLabelText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByText<T>> is not an array type */ args: Parameters[GetByText_[T]]
  ): ReturnType[GetByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByLabelText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByText_[T]]]
  
  inline def getByPlaceholderText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
  ): ReturnType[GetByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByPlaceholderText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByBoundAttribute[T]]]
  
  inline def getByRole[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByRole<T>> is not an array type */ args: Parameters[GetByRole_[T]]
  ): ReturnType[GetByRole_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByRole")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByRole_[T]]]
  
  inline def getByTestId[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
  ): ReturnType[GetByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByTestId")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByBoundAttribute[T]]]
  
  inline def getByText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByText<T>> is not an array type */ args: Parameters[GetByText_[T]]
  ): ReturnType[GetByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByText_[T]]]
  
  inline def getByTitle[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
  ): ReturnType[GetByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByTitle")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByBoundAttribute[T]]]
  
  inline def getConfig(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")().asInstanceOf[Config]
  
  inline def getDefaultNormalizer(): NormalizerFn = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNormalizer")().asInstanceOf[NormalizerFn]
  inline def getDefaultNormalizer(options: DefaultNormalizerOptions): NormalizerFn = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNormalizer")(options.asInstanceOf[js.Any]).asInstanceOf[NormalizerFn]
  
  inline def getElementError(message: String, container: HTMLElement): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementError")(message.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  inline def getElementError(message: Null, container: HTMLElement): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementError")(message.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def getNodeText(node: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeText")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getQueriesForElement[QueriesToBind /* <: Queries */, // Extra type parameter required for reassignment.
  T /* <: QueriesToBind */](element: HTMLElement): BoundFunctions[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueriesForElement")(element.asInstanceOf[js.Any]).asInstanceOf[BoundFunctions[T]]
  inline def getQueriesForElement[QueriesToBind /* <: Queries */, // Extra type parameter required for reassignment.
  T /* <: QueriesToBind */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueriesForElement")(element.asInstanceOf[js.Any], queriesToBind.asInstanceOf[js.Any])).asInstanceOf[BoundFunctions[T]]
  
  inline def getRoles(container: HTMLElement): StringDictionary[js.Array[HTMLElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoles")(container.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Array[HTMLElement]]]
  
  inline def getSuggestedQuery(element: HTMLElement): js.UndefOr[Suggestion] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Suggestion]]
  inline def getSuggestedQuery(element: HTMLElement, variant: Unit, method: Method): js.UndefOr[Suggestion] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any], variant.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Suggestion]]
  inline def getSuggestedQuery(element: HTMLElement, variant: Variant): js.UndefOr[Suggestion] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Suggestion]]
  inline def getSuggestedQuery(element: HTMLElement, variant: Variant, method: Method): js.UndefOr[Suggestion] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any], variant.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Suggestion]]
  
  inline def isInaccessible(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInaccessible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def logDOM(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")().asInstanceOf[Unit]
  inline def logDOM(dom: Unit, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: Unit, maxLength: Double, options: PrettyDOMOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: Unit, maxLength: Unit, options: PrettyDOMOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def logDOM(dom: Element, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: Element, maxLength: Double, options: PrettyDOMOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: Element, maxLength: Unit, options: PrettyDOMOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: HTMLDocument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def logDOM(dom: HTMLDocument, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: HTMLDocument, maxLength: Double, options: PrettyDOMOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logDOM(dom: HTMLDocument, maxLength: Unit, options: PrettyDOMOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logRoles(container: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("logRoles")(container.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def prettyDOM(): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")().asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Unit, maxLength: Double): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Unit, maxLength: Double, options: PrettyDOMOptions): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Unit, maxLength: Unit, options: PrettyDOMOptions): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Element): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Element, maxLength: Double): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Element, maxLength: Double, options: PrettyDOMOptions): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: Element, maxLength: Unit, options: PrettyDOMOptions): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: HTMLDocument): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: HTMLDocument, maxLength: Double): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: HTMLDocument, maxLength: Double, options: PrettyDOMOptions): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def prettyDOM(dom: HTMLDocument, maxLength: Unit, options: PrettyDOMOptions): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyDOM")(dom.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  
  object prettyFormat {
    
    @JSImport("@testing-library/vue", "prettyFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a presentation string of your `val` object
      * @param val any potential JavaScript object
      * @param options Custom settings
      */
    inline def default(`val`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def default(`val`: Any, options: OptionsReceived): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    object DEFAULT_OPTIONS {
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS.callToJSON")
      @js.native
      def callToJSON: `true` = js.native
      inline def callToJSON_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("callToJSON")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS.compareKeys")
      @js.native
      def compareKeys: /* undefined */ Any = js.native
      inline def compareKeys_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS.escapeRegex")
      @js.native
      def escapeRegex: `false` = js.native
      inline def escapeRegex_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeRegex")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS.escapeString")
      @js.native
      def escapeString: `true` = js.native
      inline def escapeString_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeString")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS.highlight")
      @js.native
      def highlight: `false` = js.native
      inline def highlight_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlight")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS.indent")
      @js.native
      def indent: Double = js.native
      inline def indent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indent")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS.maxDepth")
      @js.native
      def maxDepth: Double = js.native
      inline def maxDepth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS.maxWidth")
      @js.native
      def maxWidth: Double = js.native
      inline def maxWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS.min")
      @js.native
      def min: `false` = js.native
      inline def min_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS.plugins")
      @js.native
      def plugins: js.Array[scala.Nothing] = js.native
      inline def plugins_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS.printBasicPrototype")
      @js.native
      def printBasicPrototype: `true` = js.native
      inline def printBasicPrototype_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("printBasicPrototype")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS.printFunctionName")
      @js.native
      def printFunctionName: `true` = js.native
      inline def printFunctionName_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("printFunctionName")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/vue", "prettyFormat.DEFAULT_OPTIONS.theme")
      @js.native
      def theme: RequiredPartialreadonlyco = js.native
      inline def theme_=(x: RequiredPartialreadonlyco): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Returns a presentation string of your `val` object
      * @param val any potential JavaScript object
      * @param options Custom settings
      */
    inline def format(`val`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def format(`val`: Any, options: OptionsReceived): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    object plugins {
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@testing-library/vue", "prettyFormat.plugins.AsymmetricMatcher")
      @js.native
      def AsymmetricMatcher: NewPlugin = js.native
      inline def AsymmetricMatcher_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsymmetricMatcher")(x.asInstanceOf[js.Any])
      
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
    
    @JSImport("@testing-library/vue", "queries")
    @js.native
    val ^ : js.Any = js.native
    
    inline def findAllByAltText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
    ): ReturnType[FindAllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByAltText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByBoundAttribute[T]]]
    
    inline def findAllByDisplayValue[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
    ): ReturnType[FindAllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByDisplayValue")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByBoundAttribute[T]]]
    
    inline def findAllByLabelText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByText<T>> is not an array type */ args: Parameters[FindAllByText_[T]]
    ): ReturnType[FindAllByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByLabelText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByText_[T]]]
    
    inline def findAllByPlaceholderText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
    ): ReturnType[FindAllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByPlaceholderText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByBoundAttribute[T]]]
    
    inline def findAllByRole[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByRole<T>> is not an array type */ args: Parameters[FindAllByRole_[T]]
    ): ReturnType[FindAllByRole_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByRole")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByRole_[T]]]
    
    inline def findAllByTestId[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
    ): ReturnType[FindAllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByTestId")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByBoundAttribute[T]]]
    
    inline def findAllByText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByText<T>> is not an array type */ args: Parameters[FindAllByText_[T]]
    ): ReturnType[FindAllByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByText_[T]]]
    
    inline def findAllByTitle[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
    ): ReturnType[FindAllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByTitle")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindAllByBoundAttribute[T]]]
    
    inline def findByAltText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
    ): ReturnType[FindByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByAltText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByBoundAttribute[T]]]
    
    inline def findByDisplayValue[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
    ): ReturnType[FindByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByDisplayValue")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByBoundAttribute[T]]]
    
    inline def findByLabelText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByText<T>> is not an array type */ args: Parameters[FindByText_[T]]
    ): ReturnType[FindByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByLabelText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByText_[T]]]
    
    inline def findByPlaceholderText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
    ): ReturnType[FindByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByPlaceholderText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByBoundAttribute[T]]]
    
    inline def findByRole[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByRole<T>> is not an array type */ args: Parameters[FindByRole_[T]]
    ): ReturnType[FindByRole_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByRole")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByRole_[T]]]
    
    inline def findByTestId[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
    ): ReturnType[FindByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByTestId")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByBoundAttribute[T]]]
    
    inline def findByText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByText<T>> is not an array type */ args: Parameters[FindByText_[T]]
    ): ReturnType[FindByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByText_[T]]]
    
    inline def findByTitle[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
    ): ReturnType[FindByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByTitle")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FindByBoundAttribute[T]]]
    
    inline def getAllByAltText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByAltText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
    
    inline def getAllByDisplayValue[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByDisplayValue")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
    
    inline def getAllByLabelText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByText<T>> is not an array type */ args: Parameters[AllByText[T]]
    ): ReturnType[AllByText[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByLabelText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByText[T]]]
    
    inline def getAllByPlaceholderText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByPlaceholderText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
    
    inline def getAllByRole[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByRole<T>> is not an array type */ args: Parameters[AllByRole[T]]
    ): ReturnType[AllByRole[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByRole")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByRole[T]]]
    
    inline def getAllByTestId[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByTestId")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
    
    inline def getAllByText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByText<T>> is not an array type */ args: Parameters[AllByText[T]]
    ): ReturnType[AllByText[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByText[T]]]
    
    inline def getAllByTitle[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByTitle")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
    
    inline def getByAltText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
    ): ReturnType[GetByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByAltText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByBoundAttribute[T]]]
    
    inline def getByDisplayValue[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
    ): ReturnType[GetByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByDisplayValue")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByBoundAttribute[T]]]
    
    inline def getByLabelText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByText<T>> is not an array type */ args: Parameters[GetByText_[T]]
    ): ReturnType[GetByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByLabelText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByText_[T]]]
    
    inline def getByPlaceholderText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
    ): ReturnType[GetByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByPlaceholderText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByBoundAttribute[T]]]
    
    inline def getByRole[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByRole<T>> is not an array type */ args: Parameters[GetByRole_[T]]
    ): ReturnType[GetByRole_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByRole")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByRole_[T]]]
    
    inline def getByTestId[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
    ): ReturnType[GetByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByTestId")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByBoundAttribute[T]]]
    
    inline def getByText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByText<T>> is not an array type */ args: Parameters[GetByText_[T]]
    ): ReturnType[GetByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByText_[T]]]
    
    inline def getByTitle[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
    ): ReturnType[GetByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByTitle")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[GetByBoundAttribute[T]]]
    
    inline def queryAllByAltText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByAltText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
    
    inline def queryAllByDisplayValue[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByDisplayValue")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
    
    inline def queryAllByLabelText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByText<T>> is not an array type */ args: Parameters[AllByText[T]]
    ): ReturnType[AllByText[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByLabelText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByText[T]]]
    
    inline def queryAllByPlaceholderText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByPlaceholderText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
    
    inline def queryAllByRole[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByRole<T>> is not an array type */ args: Parameters[AllByRole[T]]
    ): ReturnType[AllByRole[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByRole")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByRole[T]]]
    
    inline def queryAllByTestId[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByTestId")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
    
    inline def queryAllByText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByText<T>> is not an array type */ args: Parameters[AllByText[T]]
    ): ReturnType[AllByText[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByText[T]]]
    
    inline def queryAllByTitle[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByTitle")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
    
    inline def queryByAltText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
    ): ReturnType[QueryByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByAltText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByBoundAttribute[T]]]
    
    inline def queryByDisplayValue[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
    ): ReturnType[QueryByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByDisplayValue")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByBoundAttribute[T]]]
    
    inline def queryByLabelText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByText<T>> is not an array type */ args: Parameters[QueryByText_[T]]
    ): ReturnType[QueryByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByLabelText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByText_[T]]]
    
    inline def queryByPlaceholderText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
    ): ReturnType[QueryByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByPlaceholderText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByBoundAttribute[T]]]
    
    inline def queryByRole[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByRole<T>> is not an array type */ args: Parameters[QueryByRole_[T]]
    ): ReturnType[QueryByRole_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByRole")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByRole_[T]]]
    
    inline def queryByTestId[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
    ): ReturnType[QueryByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByTestId")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByBoundAttribute[T]]]
    
    inline def queryByText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByText<T>> is not an array type */ args: Parameters[QueryByText_[T]]
    ): ReturnType[QueryByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByText_[T]]]
    
    inline def queryByTitle[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
    ): ReturnType[QueryByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByTitle")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByBoundAttribute[T]]]
  }
  
  inline def queryAllByAltText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
  ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByAltText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
  
  @JSImport("@testing-library/vue", "queryAllByAttribute")
  @js.native
  val queryAllByAttribute: AllByAttribute = js.native
  
  inline def queryAllByDisplayValue[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
  ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByDisplayValue")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
  
  inline def queryAllByLabelText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByText<T>> is not an array type */ args: Parameters[AllByText[T]]
  ): ReturnType[AllByText[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByLabelText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByText[T]]]
  
  inline def queryAllByPlaceholderText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
  ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByPlaceholderText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
  
  inline def queryAllByRole[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByRole<T>> is not an array type */ args: Parameters[AllByRole[T]]
  ): ReturnType[AllByRole[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByRole")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByRole[T]]]
  
  inline def queryAllByTestId[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
  ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByTestId")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
  
  inline def queryAllByText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByText<T>> is not an array type */ args: Parameters[AllByText[T]]
  ): ReturnType[AllByText[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByText[T]]]
  
  inline def queryAllByTitle[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
  ): ReturnType[AllByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByTitle")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[AllByBoundAttribute[T]]]
  
  inline def queryByAltText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
  ): ReturnType[QueryByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByAltText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByBoundAttribute[T]]]
  
  @JSImport("@testing-library/vue", "queryByAttribute")
  @js.native
  val queryByAttribute: QueryByAttribute_ = js.native
  
  inline def queryByDisplayValue[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
  ): ReturnType[QueryByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByDisplayValue")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByBoundAttribute[T]]]
  
  inline def queryByLabelText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByText<T>> is not an array type */ args: Parameters[QueryByText_[T]]
  ): ReturnType[QueryByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByLabelText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByText_[T]]]
  
  inline def queryByPlaceholderText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
  ): ReturnType[QueryByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByPlaceholderText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByBoundAttribute[T]]]
  
  inline def queryByRole[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByRole<T>> is not an array type */ args: Parameters[QueryByRole_[T]]
  ): ReturnType[QueryByRole_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByRole")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByRole_[T]]]
  
  inline def queryByTestId[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
  ): ReturnType[QueryByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByTestId")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByBoundAttribute[T]]]
  
  inline def queryByText[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByText<T>> is not an array type */ args: Parameters[QueryByText_[T]]
  ): ReturnType[QueryByText_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByText")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByText_[T]]]
  
  inline def queryByTitle[T /* <: HTMLElement */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
  ): ReturnType[QueryByBoundAttribute[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByTitle")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[QueryByBoundAttribute[T]]]
  
  object queryHelpers {
    
    @JSImport("@testing-library/vue", "queryHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildQueries[Arguments /* <: js.Array[Any] */](
      queryAllBy: GetAllBy[Arguments],
      getMultipleError: GetErrorFunction[Arguments],
      getMissingError: GetErrorFunction[Arguments]
    ): BuiltQueryMethods[Arguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueries")(queryAllBy.asInstanceOf[js.Any], getMultipleError.asInstanceOf[js.Any], getMissingError.asInstanceOf[js.Any])).asInstanceOf[BuiltQueryMethods[Arguments]]
    
    inline def getElementError(message: String, container: HTMLElement): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementError")(message.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Error]
    inline def getElementError(message: Null, container: HTMLElement): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementError")(message.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Error]
    
    @JSImport("@testing-library/vue", "queryHelpers.queryAllByAttribute")
    @js.native
    val queryAllByAttribute: AllByAttribute = js.native
    
    @JSImport("@testing-library/vue", "queryHelpers.queryByAttribute")
    @js.native
    val queryByAttribute: QueryByAttribute_ = js.native
  }
  
  inline def render(TestComponent: Any): RenderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(TestComponent.asInstanceOf[js.Any]).asInstanceOf[RenderResult]
  inline def render(TestComponent: Any, // this makes me sad :sob:
  options: RenderOptions): RenderResult = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(TestComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RenderResult]
  
  @JSImport("@testing-library/vue", "screen")
  @js.native
  val screen: Screen_[Typeofqueries] = js.native
  
  inline def waitFor[T](callback: js.Function0[js.Promise[T] | T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def waitFor[T](callback: js.Function0[js.Promise[T] | T], options: waitForOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def waitForElementToBeRemoved[T](callback: T): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitForElementToBeRemoved[T](callback: T, options: waitForOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForElementToBeRemoved[T](callback: js.Function0[T]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitForElementToBeRemoved[T](callback: js.Function0[T], options: waitForOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* was `typeof getQueriesForElement` */
  inline def within[QueriesToBind /* <: Queries */, // Extra type parameter required for reassignment.
  T /* <: QueriesToBind */](element: HTMLElement): BoundFunctions[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("within")(element.asInstanceOf[js.Any]).asInstanceOf[BoundFunctions[T]]
  inline def within[QueriesToBind /* <: Queries */, // Extra type parameter required for reassignment.
  T /* <: QueriesToBind */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(element.asInstanceOf[js.Any], queriesToBind.asInstanceOf[js.Any])).asInstanceOf[BoundFunctions[T]]
  
  /* Inlined {[ K in @testing-library/dom.@testing-library/dom.EventType ]: (element : std.Document | std.Element | std.Window, options : {} | undefined): std.Promise<void>} */
  trait AsyncFireObject extends StObject {
    
    def abort(element: Document): js.Promise[Unit]
    def abort(element: Document, options: js.Object): js.Promise[Unit]
    def abort(element: Element): js.Promise[Unit]
    def abort(element: Element, options: js.Object): js.Promise[Unit]
    def abort(element: Window): js.Promise[Unit]
    def abort(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("abort")
    var abort_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def animationEnd(element: Document): js.Promise[Unit]
    def animationEnd(element: Document, options: js.Object): js.Promise[Unit]
    def animationEnd(element: Element): js.Promise[Unit]
    def animationEnd(element: Element, options: js.Object): js.Promise[Unit]
    def animationEnd(element: Window): js.Promise[Unit]
    def animationEnd(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("animationEnd")
    var animationEnd_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def animationIteration(element: Document): js.Promise[Unit]
    def animationIteration(element: Document, options: js.Object): js.Promise[Unit]
    def animationIteration(element: Element): js.Promise[Unit]
    def animationIteration(element: Element, options: js.Object): js.Promise[Unit]
    def animationIteration(element: Window): js.Promise[Unit]
    def animationIteration(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("animationIteration")
    var animationIteration_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def animationStart(element: Document): js.Promise[Unit]
    def animationStart(element: Document, options: js.Object): js.Promise[Unit]
    def animationStart(element: Element): js.Promise[Unit]
    def animationStart(element: Element, options: js.Object): js.Promise[Unit]
    def animationStart(element: Window): js.Promise[Unit]
    def animationStart(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("animationStart")
    var animationStart_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def blur(element: Document): js.Promise[Unit]
    def blur(element: Document, options: js.Object): js.Promise[Unit]
    def blur(element: Element): js.Promise[Unit]
    def blur(element: Element, options: js.Object): js.Promise[Unit]
    def blur(element: Window): js.Promise[Unit]
    def blur(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("blur")
    var blur_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def canPlay(element: Document): js.Promise[Unit]
    def canPlay(element: Document, options: js.Object): js.Promise[Unit]
    def canPlay(element: Element): js.Promise[Unit]
    def canPlay(element: Element, options: js.Object): js.Promise[Unit]
    def canPlay(element: Window): js.Promise[Unit]
    def canPlay(element: Window, options: js.Object): js.Promise[Unit]
    
    def canPlayThrough(element: Document): js.Promise[Unit]
    def canPlayThrough(element: Document, options: js.Object): js.Promise[Unit]
    def canPlayThrough(element: Element): js.Promise[Unit]
    def canPlayThrough(element: Element, options: js.Object): js.Promise[Unit]
    def canPlayThrough(element: Window): js.Promise[Unit]
    def canPlayThrough(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("canPlayThrough")
    var canPlayThrough_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    @JSName("canPlay")
    var canPlay_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def change(element: Document): js.Promise[Unit]
    def change(element: Document, options: js.Object): js.Promise[Unit]
    def change(element: Element): js.Promise[Unit]
    def change(element: Element, options: js.Object): js.Promise[Unit]
    def change(element: Window): js.Promise[Unit]
    def change(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("change")
    var change_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def click(element: Document): js.Promise[Unit]
    def click(element: Document, options: js.Object): js.Promise[Unit]
    def click(element: Element): js.Promise[Unit]
    def click(element: Element, options: js.Object): js.Promise[Unit]
    def click(element: Window): js.Promise[Unit]
    def click(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("click")
    var click_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def compositionEnd(element: Document): js.Promise[Unit]
    def compositionEnd(element: Document, options: js.Object): js.Promise[Unit]
    def compositionEnd(element: Element): js.Promise[Unit]
    def compositionEnd(element: Element, options: js.Object): js.Promise[Unit]
    def compositionEnd(element: Window): js.Promise[Unit]
    def compositionEnd(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("compositionEnd")
    var compositionEnd_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def compositionStart(element: Document): js.Promise[Unit]
    def compositionStart(element: Document, options: js.Object): js.Promise[Unit]
    def compositionStart(element: Element): js.Promise[Unit]
    def compositionStart(element: Element, options: js.Object): js.Promise[Unit]
    def compositionStart(element: Window): js.Promise[Unit]
    def compositionStart(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("compositionStart")
    var compositionStart_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def compositionUpdate(element: Document): js.Promise[Unit]
    def compositionUpdate(element: Document, options: js.Object): js.Promise[Unit]
    def compositionUpdate(element: Element): js.Promise[Unit]
    def compositionUpdate(element: Element, options: js.Object): js.Promise[Unit]
    def compositionUpdate(element: Window): js.Promise[Unit]
    def compositionUpdate(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("compositionUpdate")
    var compositionUpdate_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def contextMenu(element: Document): js.Promise[Unit]
    def contextMenu(element: Document, options: js.Object): js.Promise[Unit]
    def contextMenu(element: Element): js.Promise[Unit]
    def contextMenu(element: Element, options: js.Object): js.Promise[Unit]
    def contextMenu(element: Window): js.Promise[Unit]
    def contextMenu(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("contextMenu")
    var contextMenu_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def copy(element: Document): js.Promise[Unit]
    def copy(element: Document, options: js.Object): js.Promise[Unit]
    def copy(element: Element): js.Promise[Unit]
    def copy(element: Element, options: js.Object): js.Promise[Unit]
    def copy(element: Window): js.Promise[Unit]
    def copy(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("copy")
    var copy_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def cut(element: Document): js.Promise[Unit]
    def cut(element: Document, options: js.Object): js.Promise[Unit]
    def cut(element: Element): js.Promise[Unit]
    def cut(element: Element, options: js.Object): js.Promise[Unit]
    def cut(element: Window): js.Promise[Unit]
    def cut(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("cut")
    var cut_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def dblClick(element: Document): js.Promise[Unit]
    def dblClick(element: Document, options: js.Object): js.Promise[Unit]
    def dblClick(element: Element): js.Promise[Unit]
    def dblClick(element: Element, options: js.Object): js.Promise[Unit]
    def dblClick(element: Window): js.Promise[Unit]
    def dblClick(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("dblClick")
    var dblClick_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def doubleClick(element: Document): js.Promise[Unit]
    def doubleClick(element: Document, options: js.Object): js.Promise[Unit]
    def doubleClick(element: Element): js.Promise[Unit]
    def doubleClick(element: Element, options: js.Object): js.Promise[Unit]
    def doubleClick(element: Window): js.Promise[Unit]
    def doubleClick(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("doubleClick")
    var doubleClick_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def drag(element: Document): js.Promise[Unit]
    def drag(element: Document, options: js.Object): js.Promise[Unit]
    def drag(element: Element): js.Promise[Unit]
    def drag(element: Element, options: js.Object): js.Promise[Unit]
    def drag(element: Window): js.Promise[Unit]
    def drag(element: Window, options: js.Object): js.Promise[Unit]
    
    def dragEnd(element: Document): js.Promise[Unit]
    def dragEnd(element: Document, options: js.Object): js.Promise[Unit]
    def dragEnd(element: Element): js.Promise[Unit]
    def dragEnd(element: Element, options: js.Object): js.Promise[Unit]
    def dragEnd(element: Window): js.Promise[Unit]
    def dragEnd(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("dragEnd")
    var dragEnd_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def dragEnter(element: Document): js.Promise[Unit]
    def dragEnter(element: Document, options: js.Object): js.Promise[Unit]
    def dragEnter(element: Element): js.Promise[Unit]
    def dragEnter(element: Element, options: js.Object): js.Promise[Unit]
    def dragEnter(element: Window): js.Promise[Unit]
    def dragEnter(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("dragEnter")
    var dragEnter_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def dragExit(element: Document): js.Promise[Unit]
    def dragExit(element: Document, options: js.Object): js.Promise[Unit]
    def dragExit(element: Element): js.Promise[Unit]
    def dragExit(element: Element, options: js.Object): js.Promise[Unit]
    def dragExit(element: Window): js.Promise[Unit]
    def dragExit(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("dragExit")
    var dragExit_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def dragLeave(element: Document): js.Promise[Unit]
    def dragLeave(element: Document, options: js.Object): js.Promise[Unit]
    def dragLeave(element: Element): js.Promise[Unit]
    def dragLeave(element: Element, options: js.Object): js.Promise[Unit]
    def dragLeave(element: Window): js.Promise[Unit]
    def dragLeave(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("dragLeave")
    var dragLeave_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def dragOver(element: Document): js.Promise[Unit]
    def dragOver(element: Document, options: js.Object): js.Promise[Unit]
    def dragOver(element: Element): js.Promise[Unit]
    def dragOver(element: Element, options: js.Object): js.Promise[Unit]
    def dragOver(element: Window): js.Promise[Unit]
    def dragOver(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("dragOver")
    var dragOver_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def dragStart(element: Document): js.Promise[Unit]
    def dragStart(element: Document, options: js.Object): js.Promise[Unit]
    def dragStart(element: Element): js.Promise[Unit]
    def dragStart(element: Element, options: js.Object): js.Promise[Unit]
    def dragStart(element: Window): js.Promise[Unit]
    def dragStart(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("dragStart")
    var dragStart_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    @JSName("drag")
    var drag_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def drop(element: Document): js.Promise[Unit]
    def drop(element: Document, options: js.Object): js.Promise[Unit]
    def drop(element: Element): js.Promise[Unit]
    def drop(element: Element, options: js.Object): js.Promise[Unit]
    def drop(element: Window): js.Promise[Unit]
    def drop(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("drop")
    var drop_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def durationChange(element: Document): js.Promise[Unit]
    def durationChange(element: Document, options: js.Object): js.Promise[Unit]
    def durationChange(element: Element): js.Promise[Unit]
    def durationChange(element: Element, options: js.Object): js.Promise[Unit]
    def durationChange(element: Window): js.Promise[Unit]
    def durationChange(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("durationChange")
    var durationChange_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def emptied(element: Document): js.Promise[Unit]
    def emptied(element: Document, options: js.Object): js.Promise[Unit]
    def emptied(element: Element): js.Promise[Unit]
    def emptied(element: Element, options: js.Object): js.Promise[Unit]
    def emptied(element: Window): js.Promise[Unit]
    def emptied(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("emptied")
    var emptied_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def encrypted(element: Document): js.Promise[Unit]
    def encrypted(element: Document, options: js.Object): js.Promise[Unit]
    def encrypted(element: Element): js.Promise[Unit]
    def encrypted(element: Element, options: js.Object): js.Promise[Unit]
    def encrypted(element: Window): js.Promise[Unit]
    def encrypted(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("encrypted")
    var encrypted_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def ended(element: Document): js.Promise[Unit]
    def ended(element: Document, options: js.Object): js.Promise[Unit]
    def ended(element: Element): js.Promise[Unit]
    def ended(element: Element, options: js.Object): js.Promise[Unit]
    def ended(element: Window): js.Promise[Unit]
    def ended(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("ended")
    var ended_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def error(element: Document): js.Promise[Unit]
    def error(element: Document, options: js.Object): js.Promise[Unit]
    def error(element: Element): js.Promise[Unit]
    def error(element: Element, options: js.Object): js.Promise[Unit]
    def error(element: Window): js.Promise[Unit]
    def error(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("error")
    var error_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def focus(element: Document): js.Promise[Unit]
    def focus(element: Document, options: js.Object): js.Promise[Unit]
    def focus(element: Element): js.Promise[Unit]
    def focus(element: Element, options: js.Object): js.Promise[Unit]
    def focus(element: Window): js.Promise[Unit]
    def focus(element: Window, options: js.Object): js.Promise[Unit]
    
    def focusIn(element: Document): js.Promise[Unit]
    def focusIn(element: Document, options: js.Object): js.Promise[Unit]
    def focusIn(element: Element): js.Promise[Unit]
    def focusIn(element: Element, options: js.Object): js.Promise[Unit]
    def focusIn(element: Window): js.Promise[Unit]
    def focusIn(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("focusIn")
    var focusIn_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def focusOut(element: Document): js.Promise[Unit]
    def focusOut(element: Document, options: js.Object): js.Promise[Unit]
    def focusOut(element: Element): js.Promise[Unit]
    def focusOut(element: Element, options: js.Object): js.Promise[Unit]
    def focusOut(element: Window): js.Promise[Unit]
    def focusOut(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("focusOut")
    var focusOut_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    @JSName("focus")
    var focus_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def gotPointerCapture(element: Document): js.Promise[Unit]
    def gotPointerCapture(element: Document, options: js.Object): js.Promise[Unit]
    def gotPointerCapture(element: Element): js.Promise[Unit]
    def gotPointerCapture(element: Element, options: js.Object): js.Promise[Unit]
    def gotPointerCapture(element: Window): js.Promise[Unit]
    def gotPointerCapture(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("gotPointerCapture")
    var gotPointerCapture_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def input(element: Document): js.Promise[Unit]
    def input(element: Document, options: js.Object): js.Promise[Unit]
    def input(element: Element): js.Promise[Unit]
    def input(element: Element, options: js.Object): js.Promise[Unit]
    def input(element: Window): js.Promise[Unit]
    def input(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("input")
    var input_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def invalid(element: Document): js.Promise[Unit]
    def invalid(element: Document, options: js.Object): js.Promise[Unit]
    def invalid(element: Element): js.Promise[Unit]
    def invalid(element: Element, options: js.Object): js.Promise[Unit]
    def invalid(element: Window): js.Promise[Unit]
    def invalid(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("invalid")
    var invalid_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def keyDown(element: Document): js.Promise[Unit]
    def keyDown(element: Document, options: js.Object): js.Promise[Unit]
    def keyDown(element: Element): js.Promise[Unit]
    def keyDown(element: Element, options: js.Object): js.Promise[Unit]
    def keyDown(element: Window): js.Promise[Unit]
    def keyDown(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("keyDown")
    var keyDown_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def keyPress(element: Document): js.Promise[Unit]
    def keyPress(element: Document, options: js.Object): js.Promise[Unit]
    def keyPress(element: Element): js.Promise[Unit]
    def keyPress(element: Element, options: js.Object): js.Promise[Unit]
    def keyPress(element: Window): js.Promise[Unit]
    def keyPress(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("keyPress")
    var keyPress_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def keyUp(element: Document): js.Promise[Unit]
    def keyUp(element: Document, options: js.Object): js.Promise[Unit]
    def keyUp(element: Element): js.Promise[Unit]
    def keyUp(element: Element, options: js.Object): js.Promise[Unit]
    def keyUp(element: Window): js.Promise[Unit]
    def keyUp(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("keyUp")
    var keyUp_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def load(element: Document): js.Promise[Unit]
    def load(element: Document, options: js.Object): js.Promise[Unit]
    def load(element: Element): js.Promise[Unit]
    def load(element: Element, options: js.Object): js.Promise[Unit]
    def load(element: Window): js.Promise[Unit]
    def load(element: Window, options: js.Object): js.Promise[Unit]
    
    def loadStart(element: Document): js.Promise[Unit]
    def loadStart(element: Document, options: js.Object): js.Promise[Unit]
    def loadStart(element: Element): js.Promise[Unit]
    def loadStart(element: Element, options: js.Object): js.Promise[Unit]
    def loadStart(element: Window): js.Promise[Unit]
    def loadStart(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("loadStart")
    var loadStart_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    @JSName("load")
    var load_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def loadedData(element: Document): js.Promise[Unit]
    def loadedData(element: Document, options: js.Object): js.Promise[Unit]
    def loadedData(element: Element): js.Promise[Unit]
    def loadedData(element: Element, options: js.Object): js.Promise[Unit]
    def loadedData(element: Window): js.Promise[Unit]
    def loadedData(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("loadedData")
    var loadedData_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def loadedMetadata(element: Document): js.Promise[Unit]
    def loadedMetadata(element: Document, options: js.Object): js.Promise[Unit]
    def loadedMetadata(element: Element): js.Promise[Unit]
    def loadedMetadata(element: Element, options: js.Object): js.Promise[Unit]
    def loadedMetadata(element: Window): js.Promise[Unit]
    def loadedMetadata(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("loadedMetadata")
    var loadedMetadata_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def lostPointerCapture(element: Document): js.Promise[Unit]
    def lostPointerCapture(element: Document, options: js.Object): js.Promise[Unit]
    def lostPointerCapture(element: Element): js.Promise[Unit]
    def lostPointerCapture(element: Element, options: js.Object): js.Promise[Unit]
    def lostPointerCapture(element: Window): js.Promise[Unit]
    def lostPointerCapture(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("lostPointerCapture")
    var lostPointerCapture_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def mouseDown(element: Document): js.Promise[Unit]
    def mouseDown(element: Document, options: js.Object): js.Promise[Unit]
    def mouseDown(element: Element): js.Promise[Unit]
    def mouseDown(element: Element, options: js.Object): js.Promise[Unit]
    def mouseDown(element: Window): js.Promise[Unit]
    def mouseDown(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("mouseDown")
    var mouseDown_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def mouseEnter(element: Document): js.Promise[Unit]
    def mouseEnter(element: Document, options: js.Object): js.Promise[Unit]
    def mouseEnter(element: Element): js.Promise[Unit]
    def mouseEnter(element: Element, options: js.Object): js.Promise[Unit]
    def mouseEnter(element: Window): js.Promise[Unit]
    def mouseEnter(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("mouseEnter")
    var mouseEnter_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def mouseLeave(element: Document): js.Promise[Unit]
    def mouseLeave(element: Document, options: js.Object): js.Promise[Unit]
    def mouseLeave(element: Element): js.Promise[Unit]
    def mouseLeave(element: Element, options: js.Object): js.Promise[Unit]
    def mouseLeave(element: Window): js.Promise[Unit]
    def mouseLeave(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("mouseLeave")
    var mouseLeave_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def mouseMove(element: Document): js.Promise[Unit]
    def mouseMove(element: Document, options: js.Object): js.Promise[Unit]
    def mouseMove(element: Element): js.Promise[Unit]
    def mouseMove(element: Element, options: js.Object): js.Promise[Unit]
    def mouseMove(element: Window): js.Promise[Unit]
    def mouseMove(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("mouseMove")
    var mouseMove_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def mouseOut(element: Document): js.Promise[Unit]
    def mouseOut(element: Document, options: js.Object): js.Promise[Unit]
    def mouseOut(element: Element): js.Promise[Unit]
    def mouseOut(element: Element, options: js.Object): js.Promise[Unit]
    def mouseOut(element: Window): js.Promise[Unit]
    def mouseOut(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("mouseOut")
    var mouseOut_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def mouseOver(element: Document): js.Promise[Unit]
    def mouseOver(element: Document, options: js.Object): js.Promise[Unit]
    def mouseOver(element: Element): js.Promise[Unit]
    def mouseOver(element: Element, options: js.Object): js.Promise[Unit]
    def mouseOver(element: Window): js.Promise[Unit]
    def mouseOver(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("mouseOver")
    var mouseOver_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def mouseUp(element: Document): js.Promise[Unit]
    def mouseUp(element: Document, options: js.Object): js.Promise[Unit]
    def mouseUp(element: Element): js.Promise[Unit]
    def mouseUp(element: Element, options: js.Object): js.Promise[Unit]
    def mouseUp(element: Window): js.Promise[Unit]
    def mouseUp(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("mouseUp")
    var mouseUp_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def paste(element: Document): js.Promise[Unit]
    def paste(element: Document, options: js.Object): js.Promise[Unit]
    def paste(element: Element): js.Promise[Unit]
    def paste(element: Element, options: js.Object): js.Promise[Unit]
    def paste(element: Window): js.Promise[Unit]
    def paste(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("paste")
    var paste_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def pause(element: Document): js.Promise[Unit]
    def pause(element: Document, options: js.Object): js.Promise[Unit]
    def pause(element: Element): js.Promise[Unit]
    def pause(element: Element, options: js.Object): js.Promise[Unit]
    def pause(element: Window): js.Promise[Unit]
    def pause(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("pause")
    var pause_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def play(element: Document): js.Promise[Unit]
    def play(element: Document, options: js.Object): js.Promise[Unit]
    def play(element: Element): js.Promise[Unit]
    def play(element: Element, options: js.Object): js.Promise[Unit]
    def play(element: Window): js.Promise[Unit]
    def play(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("play")
    var play_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def playing(element: Document): js.Promise[Unit]
    def playing(element: Document, options: js.Object): js.Promise[Unit]
    def playing(element: Element): js.Promise[Unit]
    def playing(element: Element, options: js.Object): js.Promise[Unit]
    def playing(element: Window): js.Promise[Unit]
    def playing(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("playing")
    var playing_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def pointerCancel(element: Document): js.Promise[Unit]
    def pointerCancel(element: Document, options: js.Object): js.Promise[Unit]
    def pointerCancel(element: Element): js.Promise[Unit]
    def pointerCancel(element: Element, options: js.Object): js.Promise[Unit]
    def pointerCancel(element: Window): js.Promise[Unit]
    def pointerCancel(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("pointerCancel")
    var pointerCancel_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def pointerDown(element: Document): js.Promise[Unit]
    def pointerDown(element: Document, options: js.Object): js.Promise[Unit]
    def pointerDown(element: Element): js.Promise[Unit]
    def pointerDown(element: Element, options: js.Object): js.Promise[Unit]
    def pointerDown(element: Window): js.Promise[Unit]
    def pointerDown(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("pointerDown")
    var pointerDown_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def pointerEnter(element: Document): js.Promise[Unit]
    def pointerEnter(element: Document, options: js.Object): js.Promise[Unit]
    def pointerEnter(element: Element): js.Promise[Unit]
    def pointerEnter(element: Element, options: js.Object): js.Promise[Unit]
    def pointerEnter(element: Window): js.Promise[Unit]
    def pointerEnter(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("pointerEnter")
    var pointerEnter_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def pointerLeave(element: Document): js.Promise[Unit]
    def pointerLeave(element: Document, options: js.Object): js.Promise[Unit]
    def pointerLeave(element: Element): js.Promise[Unit]
    def pointerLeave(element: Element, options: js.Object): js.Promise[Unit]
    def pointerLeave(element: Window): js.Promise[Unit]
    def pointerLeave(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("pointerLeave")
    var pointerLeave_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def pointerMove(element: Document): js.Promise[Unit]
    def pointerMove(element: Document, options: js.Object): js.Promise[Unit]
    def pointerMove(element: Element): js.Promise[Unit]
    def pointerMove(element: Element, options: js.Object): js.Promise[Unit]
    def pointerMove(element: Window): js.Promise[Unit]
    def pointerMove(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("pointerMove")
    var pointerMove_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def pointerOut(element: Document): js.Promise[Unit]
    def pointerOut(element: Document, options: js.Object): js.Promise[Unit]
    def pointerOut(element: Element): js.Promise[Unit]
    def pointerOut(element: Element, options: js.Object): js.Promise[Unit]
    def pointerOut(element: Window): js.Promise[Unit]
    def pointerOut(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("pointerOut")
    var pointerOut_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def pointerOver(element: Document): js.Promise[Unit]
    def pointerOver(element: Document, options: js.Object): js.Promise[Unit]
    def pointerOver(element: Element): js.Promise[Unit]
    def pointerOver(element: Element, options: js.Object): js.Promise[Unit]
    def pointerOver(element: Window): js.Promise[Unit]
    def pointerOver(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("pointerOver")
    var pointerOver_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def pointerUp(element: Document): js.Promise[Unit]
    def pointerUp(element: Document, options: js.Object): js.Promise[Unit]
    def pointerUp(element: Element): js.Promise[Unit]
    def pointerUp(element: Element, options: js.Object): js.Promise[Unit]
    def pointerUp(element: Window): js.Promise[Unit]
    def pointerUp(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("pointerUp")
    var pointerUp_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def popState(element: Document): js.Promise[Unit]
    def popState(element: Document, options: js.Object): js.Promise[Unit]
    def popState(element: Element): js.Promise[Unit]
    def popState(element: Element, options: js.Object): js.Promise[Unit]
    def popState(element: Window): js.Promise[Unit]
    def popState(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("popState")
    var popState_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def progress(element: Document): js.Promise[Unit]
    def progress(element: Document, options: js.Object): js.Promise[Unit]
    def progress(element: Element): js.Promise[Unit]
    def progress(element: Element, options: js.Object): js.Promise[Unit]
    def progress(element: Window): js.Promise[Unit]
    def progress(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("progress")
    var progress_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def rateChange(element: Document): js.Promise[Unit]
    def rateChange(element: Document, options: js.Object): js.Promise[Unit]
    def rateChange(element: Element): js.Promise[Unit]
    def rateChange(element: Element, options: js.Object): js.Promise[Unit]
    def rateChange(element: Window): js.Promise[Unit]
    def rateChange(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("rateChange")
    var rateChange_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def reset(element: Document): js.Promise[Unit]
    def reset(element: Document, options: js.Object): js.Promise[Unit]
    def reset(element: Element): js.Promise[Unit]
    def reset(element: Element, options: js.Object): js.Promise[Unit]
    def reset(element: Window): js.Promise[Unit]
    def reset(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("reset")
    var reset_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def resize(element: Document): js.Promise[Unit]
    def resize(element: Document, options: js.Object): js.Promise[Unit]
    def resize(element: Element): js.Promise[Unit]
    def resize(element: Element, options: js.Object): js.Promise[Unit]
    def resize(element: Window): js.Promise[Unit]
    def resize(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("resize")
    var resize_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def scroll(element: Document): js.Promise[Unit]
    def scroll(element: Document, options: js.Object): js.Promise[Unit]
    def scroll(element: Element): js.Promise[Unit]
    def scroll(element: Element, options: js.Object): js.Promise[Unit]
    def scroll(element: Window): js.Promise[Unit]
    def scroll(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("scroll")
    var scroll_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def seeked(element: Document): js.Promise[Unit]
    def seeked(element: Document, options: js.Object): js.Promise[Unit]
    def seeked(element: Element): js.Promise[Unit]
    def seeked(element: Element, options: js.Object): js.Promise[Unit]
    def seeked(element: Window): js.Promise[Unit]
    def seeked(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("seeked")
    var seeked_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def seeking(element: Document): js.Promise[Unit]
    def seeking(element: Document, options: js.Object): js.Promise[Unit]
    def seeking(element: Element): js.Promise[Unit]
    def seeking(element: Element, options: js.Object): js.Promise[Unit]
    def seeking(element: Window): js.Promise[Unit]
    def seeking(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("seeking")
    var seeking_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def select(element: Document): js.Promise[Unit]
    def select(element: Document, options: js.Object): js.Promise[Unit]
    def select(element: Element): js.Promise[Unit]
    def select(element: Element, options: js.Object): js.Promise[Unit]
    def select(element: Window): js.Promise[Unit]
    def select(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("select")
    var select_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def stalled(element: Document): js.Promise[Unit]
    def stalled(element: Document, options: js.Object): js.Promise[Unit]
    def stalled(element: Element): js.Promise[Unit]
    def stalled(element: Element, options: js.Object): js.Promise[Unit]
    def stalled(element: Window): js.Promise[Unit]
    def stalled(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("stalled")
    var stalled_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def submit(element: Document): js.Promise[Unit]
    def submit(element: Document, options: js.Object): js.Promise[Unit]
    def submit(element: Element): js.Promise[Unit]
    def submit(element: Element, options: js.Object): js.Promise[Unit]
    def submit(element: Window): js.Promise[Unit]
    def submit(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("submit")
    var submit_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def suspend(element: Document): js.Promise[Unit]
    def suspend(element: Document, options: js.Object): js.Promise[Unit]
    def suspend(element: Element): js.Promise[Unit]
    def suspend(element: Element, options: js.Object): js.Promise[Unit]
    def suspend(element: Window): js.Promise[Unit]
    def suspend(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("suspend")
    var suspend_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def timeUpdate(element: Document): js.Promise[Unit]
    def timeUpdate(element: Document, options: js.Object): js.Promise[Unit]
    def timeUpdate(element: Element): js.Promise[Unit]
    def timeUpdate(element: Element, options: js.Object): js.Promise[Unit]
    def timeUpdate(element: Window): js.Promise[Unit]
    def timeUpdate(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("timeUpdate")
    var timeUpdate_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def touchCancel(element: Document): js.Promise[Unit]
    def touchCancel(element: Document, options: js.Object): js.Promise[Unit]
    def touchCancel(element: Element): js.Promise[Unit]
    def touchCancel(element: Element, options: js.Object): js.Promise[Unit]
    def touchCancel(element: Window): js.Promise[Unit]
    def touchCancel(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("touchCancel")
    var touchCancel_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def touchEnd(element: Document): js.Promise[Unit]
    def touchEnd(element: Document, options: js.Object): js.Promise[Unit]
    def touchEnd(element: Element): js.Promise[Unit]
    def touchEnd(element: Element, options: js.Object): js.Promise[Unit]
    def touchEnd(element: Window): js.Promise[Unit]
    def touchEnd(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("touchEnd")
    var touchEnd_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def touchMove(element: Document): js.Promise[Unit]
    def touchMove(element: Document, options: js.Object): js.Promise[Unit]
    def touchMove(element: Element): js.Promise[Unit]
    def touchMove(element: Element, options: js.Object): js.Promise[Unit]
    def touchMove(element: Window): js.Promise[Unit]
    def touchMove(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("touchMove")
    var touchMove_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def touchStart(element: Document): js.Promise[Unit]
    def touchStart(element: Document, options: js.Object): js.Promise[Unit]
    def touchStart(element: Element): js.Promise[Unit]
    def touchStart(element: Element, options: js.Object): js.Promise[Unit]
    def touchStart(element: Window): js.Promise[Unit]
    def touchStart(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("touchStart")
    var touchStart_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def transitionCancel(element: Document): js.Promise[Unit]
    def transitionCancel(element: Document, options: js.Object): js.Promise[Unit]
    def transitionCancel(element: Element): js.Promise[Unit]
    def transitionCancel(element: Element, options: js.Object): js.Promise[Unit]
    def transitionCancel(element: Window): js.Promise[Unit]
    def transitionCancel(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("transitionCancel")
    var transitionCancel_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def transitionEnd(element: Document): js.Promise[Unit]
    def transitionEnd(element: Document, options: js.Object): js.Promise[Unit]
    def transitionEnd(element: Element): js.Promise[Unit]
    def transitionEnd(element: Element, options: js.Object): js.Promise[Unit]
    def transitionEnd(element: Window): js.Promise[Unit]
    def transitionEnd(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("transitionEnd")
    var transitionEnd_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def transitionRun(element: Document): js.Promise[Unit]
    def transitionRun(element: Document, options: js.Object): js.Promise[Unit]
    def transitionRun(element: Element): js.Promise[Unit]
    def transitionRun(element: Element, options: js.Object): js.Promise[Unit]
    def transitionRun(element: Window): js.Promise[Unit]
    def transitionRun(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("transitionRun")
    var transitionRun_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def transitionStart(element: Document): js.Promise[Unit]
    def transitionStart(element: Document, options: js.Object): js.Promise[Unit]
    def transitionStart(element: Element): js.Promise[Unit]
    def transitionStart(element: Element, options: js.Object): js.Promise[Unit]
    def transitionStart(element: Window): js.Promise[Unit]
    def transitionStart(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("transitionStart")
    var transitionStart_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def volumeChange(element: Document): js.Promise[Unit]
    def volumeChange(element: Document, options: js.Object): js.Promise[Unit]
    def volumeChange(element: Element): js.Promise[Unit]
    def volumeChange(element: Element, options: js.Object): js.Promise[Unit]
    def volumeChange(element: Window): js.Promise[Unit]
    def volumeChange(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("volumeChange")
    var volumeChange_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def waiting(element: Document): js.Promise[Unit]
    def waiting(element: Document, options: js.Object): js.Promise[Unit]
    def waiting(element: Element): js.Promise[Unit]
    def waiting(element: Element, options: js.Object): js.Promise[Unit]
    def waiting(element: Window): js.Promise[Unit]
    def waiting(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("waiting")
    var waiting_Original: js.Function2[
        /* element */ Document | Element | Window, 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Unit]
      ]
    
    def wheel(element: Document): js.Promise[Unit]
    def wheel(element: Document, options: js.Object): js.Promise[Unit]
    def wheel(element: Element): js.Promise[Unit]
    def wheel(element: Element, options: js.Object): js.Promise[Unit]
    def wheel(element: Window): js.Promise[Unit]
    def wheel(element: Window, options: js.Object): js.Promise[Unit]
    @JSName("wheel")
    var wheel_Original: js.Function2[
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
      resize: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
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
      transitionCancel: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      transitionEnd: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      transitionRun: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      transitionStart: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      volumeChange: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      waiting: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit],
      wheel: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
    ): AsyncFireObject = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), animationEnd = js.Any.fromFunction2(animationEnd), animationIteration = js.Any.fromFunction2(animationIteration), animationStart = js.Any.fromFunction2(animationStart), blur = js.Any.fromFunction2(blur), canPlay = js.Any.fromFunction2(canPlay), canPlayThrough = js.Any.fromFunction2(canPlayThrough), change = js.Any.fromFunction2(change), click = js.Any.fromFunction2(click), compositionEnd = js.Any.fromFunction2(compositionEnd), compositionStart = js.Any.fromFunction2(compositionStart), compositionUpdate = js.Any.fromFunction2(compositionUpdate), contextMenu = js.Any.fromFunction2(contextMenu), copy = js.Any.fromFunction2(copy), cut = js.Any.fromFunction2(cut), dblClick = js.Any.fromFunction2(dblClick), doubleClick = js.Any.fromFunction2(doubleClick), drag = js.Any.fromFunction2(drag), dragEnd = js.Any.fromFunction2(dragEnd), dragEnter = js.Any.fromFunction2(dragEnter), dragExit = js.Any.fromFunction2(dragExit), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), dragStart = js.Any.fromFunction2(dragStart), drop = js.Any.fromFunction2(drop), durationChange = js.Any.fromFunction2(durationChange), emptied = js.Any.fromFunction2(emptied), encrypted = js.Any.fromFunction2(encrypted), ended = js.Any.fromFunction2(ended), error = js.Any.fromFunction2(error), focus = js.Any.fromFunction2(focus), focusIn = js.Any.fromFunction2(focusIn), focusOut = js.Any.fromFunction2(focusOut), gotPointerCapture = js.Any.fromFunction2(gotPointerCapture), input = js.Any.fromFunction2(input), invalid = js.Any.fromFunction2(invalid), keyDown = js.Any.fromFunction2(keyDown), keyPress = js.Any.fromFunction2(keyPress), keyUp = js.Any.fromFunction2(keyUp), load = js.Any.fromFunction2(load), loadStart = js.Any.fromFunction2(loadStart), loadedData = js.Any.fromFunction2(loadedData), loadedMetadata = js.Any.fromFunction2(loadedMetadata), lostPointerCapture = js.Any.fromFunction2(lostPointerCapture), mouseDown = js.Any.fromFunction2(mouseDown), mouseEnter = js.Any.fromFunction2(mouseEnter), mouseLeave = js.Any.fromFunction2(mouseLeave), mouseMove = js.Any.fromFunction2(mouseMove), mouseOut = js.Any.fromFunction2(mouseOut), mouseOver = js.Any.fromFunction2(mouseOver), mouseUp = js.Any.fromFunction2(mouseUp), paste = js.Any.fromFunction2(paste), pause = js.Any.fromFunction2(pause), play = js.Any.fromFunction2(play), playing = js.Any.fromFunction2(playing), pointerCancel = js.Any.fromFunction2(pointerCancel), pointerDown = js.Any.fromFunction2(pointerDown), pointerEnter = js.Any.fromFunction2(pointerEnter), pointerLeave = js.Any.fromFunction2(pointerLeave), pointerMove = js.Any.fromFunction2(pointerMove), pointerOut = js.Any.fromFunction2(pointerOut), pointerOver = js.Any.fromFunction2(pointerOver), pointerUp = js.Any.fromFunction2(pointerUp), popState = js.Any.fromFunction2(popState), progress = js.Any.fromFunction2(progress), rateChange = js.Any.fromFunction2(rateChange), reset = js.Any.fromFunction2(reset), resize = js.Any.fromFunction2(resize), scroll = js.Any.fromFunction2(scroll), seeked = js.Any.fromFunction2(seeked), seeking = js.Any.fromFunction2(seeking), select = js.Any.fromFunction2(select), stalled = js.Any.fromFunction2(stalled), submit = js.Any.fromFunction2(submit), suspend = js.Any.fromFunction2(suspend), timeUpdate = js.Any.fromFunction2(timeUpdate), touchCancel = js.Any.fromFunction2(touchCancel), touchEnd = js.Any.fromFunction2(touchEnd), touchMove = js.Any.fromFunction2(touchMove), touchStart = js.Any.fromFunction2(touchStart), transitionCancel = js.Any.fromFunction2(transitionCancel), transitionEnd = js.Any.fromFunction2(transitionEnd), transitionRun = js.Any.fromFunction2(transitionRun), transitionStart = js.Any.fromFunction2(transitionStart), volumeChange = js.Any.fromFunction2(volumeChange), waiting = js.Any.fromFunction2(waiting), wheel = js.Any.fromFunction2(wheel))
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
      
      inline def setResize(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
      
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
      
      inline def setTransitionCancel(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "transitionCancel", js.Any.fromFunction2(value))
      
      inline def setTransitionEnd(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction2(value))
      
      inline def setTransitionRun(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "transitionRun", js.Any.fromFunction2(value))
      
      inline def setTransitionStart(
        value: (/* element */ Document | Element | Window, /* options */ js.UndefOr[js.Object]) => js.Promise[Unit]
      ): Self = StObject.set(x, "transitionStart", js.Any.fromFunction2(value))
      
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
  
  type Debug = js.Function3[
    /* baseElement */ js.UndefOr[(js.Array[DocumentFragment | Element]) | DocumentFragment | Element], 
    /* maxLength */ js.UndefOr[Double], 
    /* options */ js.UndefOr[OptionsReceived], 
    Unit
  ]
  
  /* Inlined @testing-library/vue.@testing-library/vue.VueTestingLibraryRenderOptions & @testing-library/vue.@testing-library/vue.VueTestUtilsRenderOptions */
  trait RenderOptions extends StObject {
    
    var attrs: js.UndefOr[Record[String, Any]] = js.undefined
    
    var baseElement: js.UndefOr[Element] = js.undefined
    
    var container: js.UndefOr[Element] = js.undefined
    
    var data: js.UndefOr[
        js.Function0[
          /* import warning: importer.ImportType#apply Failed type conversion: {} extends {} ? any : {} extends object ? / * Inlined std.Partial<{}> * /
    {} : any */ js.Any
        ]
      ] = js.undefined
    
    var global: js.UndefOr[GlobalMountOptions] = js.undefined
    
    var props: js.UndefOr[
        (RawProps & (Record[String, Any])) | (/* import warning: importer.ImportType#apply Failed type conversion: {} extends std.Record<string, any> ? null : never */ js.Any)
      ] = js.undefined
    
    /**
      * @deprecated Add a Router instance through `global.plugins` array instead.
      */
    var routes: js.UndefOr[Any] = js.undefined
    
    var slots: js.UndefOr[SlotDictionarydefaultSlot] = js.undefined
    
    /**
      * @deprecated Add a Vuex instance through `global.plugins` array instead.
      */
    var store: js.UndefOr[Any] = js.undefined
  }
  object RenderOptions {
    
    inline def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    extension [Self <: RenderOptions](x: Self) {
      
      inline def setAttrs(value: Record[String, Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setBaseElement(value: Element): Self = StObject.set(x, "baseElement", value.asInstanceOf[js.Any])
      
      inline def setBaseElementUndefined: Self = StObject.set(x, "baseElement", js.undefined)
      
      inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setData(
        value: () => /* import warning: importer.ImportType#apply Failed type conversion: {} extends {} ? any : {} extends object ? / * Inlined std.Partial<{}> * /
      {} : any */ js.Any
      ): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setGlobal(value: GlobalMountOptions): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setProps(
        value: (RawProps & (Record[String, Any])) | (/* import warning: importer.ImportType#apply Failed type conversion: {} extends std.Record<string, any> ? null : never */ js.Any)
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setRoutes(value: Any): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setSlots(value: SlotDictionarydefaultSlot): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @testing-library/vue.anon.Typeofqueries extends {readonly getByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>, readonly getAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly queryByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>, readonly queryAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly findByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>, readonly findAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>, readonly getByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly getAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly queryAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly findAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly getByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>, readonly getAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly queryByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>, readonly queryAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly findByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>, readonly findAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>, readonly getByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly getAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly queryAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly findAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly getByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly getAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly queryAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly findAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly getByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly getAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly queryAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly findAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly getByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByRole<T>>, readonly getAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>, readonly queryByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByRole<T>>, readonly queryAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>, readonly findByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByRole<T>>, readonly findAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole<T>>, readonly getByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly getAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly queryAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly findAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>} ? {getByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>, getAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, queryByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>, queryAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, findByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>, findAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>, getByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, getAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, queryByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, queryAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, findByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, findAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, getByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>, getAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, queryByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>, queryAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, findByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>, findAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>, getByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, getAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, queryByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, queryAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, findByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, findAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, getByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, getAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, queryByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, queryAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, findByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, findAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, getByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, getAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, queryByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, queryAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, findByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, findAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, getByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.GetByRole<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByRole<T>>, getAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>, queryByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.QueryByRole<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByRole<T>>, queryAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>, findByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindByRole<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByRole<T>>, findAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole<T>>, getByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, getAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, queryByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, queryAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, findByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, findAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>} & {[ P in keyof @testing-library/vue.anon.Typeofqueries ]: @testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/vue.anon.Typeofqueries[P]>} : {[ P in keyof @testing-library/vue.anon.Typeofqueries ]: @testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<@testing-library/vue.anon.Typeofqueries[P]>} */ @js.native
  trait RenderResult extends StObject {
    
    var baseElement: Element = js.native
    
    var container: Element = js.native
    
    def debug(): Unit = js.native
    def debug(baseElement: js.Array[DocumentFragment | Element]): Unit = js.native
    def debug(baseElement: js.Array[DocumentFragment | Element], maxLength: Double): Unit = js.native
    def debug(baseElement: js.Array[DocumentFragment | Element], maxLength: Double, options: OptionsReceived): Unit = js.native
    def debug(baseElement: js.Array[DocumentFragment | Element], maxLength: Unit, options: OptionsReceived): Unit = js.native
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
    @JSName("debug")
    var debug_Original: Debug = js.native
    
    def emitted[T](): js.Array[T] = js.native
    def emitted[T](name: String): js.Array[T] = js.native
    @JSName("emitted")
    def emitted_T_Record[T](): Record[String, js.Array[T]] = js.native
    
    def html(): String = js.native
    
    def rerender(props: js.Object): js.Promise[Unit] = js.native
    
    def unmount(): Unit = js.native
  }
  
  @js.native
  trait VueFireEventObject
    extends StObject
       with AsyncFireObject {
    
    def apply(element: Document, event: Event): js.Promise[Unit] = js.native
    def apply(element: Element, event: Event): js.Promise[Unit] = js.native
    def apply(element: Window, event: Event): js.Promise[Unit] = js.native
    
    def touch(element: Document): js.Promise[Unit] = js.native
    def touch(element: Element): js.Promise[Unit] = js.native
    def touch(element: Window): js.Promise[Unit] = js.native
    
    def update(element: Element): js.Promise[Unit] = js.native
    def update(element: Element, value: String): js.Promise[Unit] = js.native
    def update(element: HTMLInputElement, value: String): js.Promise[Unit] = js.native
    def update(element: HTMLOptionElement): js.Promise[Unit] = js.native
    def update(element: HTMLSelectElement, value: String): js.Promise[Unit] = js.native
    def update(element: HTMLTextAreaElement, value: String): js.Promise[Unit] = js.native
  }
  
  /* Inlined std.Omit<@vue/test-utils.@vue/test-utils.MountingOptions<std.Record<string, any>, {}>, 'attachTo' | 'propsData' | 'shallow'> */
  trait VueTestUtilsRenderOptions extends StObject {
    
    var attrs: js.UndefOr[Record[String, Any]] = js.undefined
    
    var data: js.UndefOr[
        js.Function0[
          /* import warning: importer.ImportType#apply Failed type conversion: {} extends {} ? any : {} extends object ? / * Inlined std.Partial<{}> * /
    {} : any */ js.Any
        ]
      ] = js.undefined
    
    var global: js.UndefOr[GlobalMountOptions] = js.undefined
    
    var props: js.UndefOr[
        (RawProps & (Record[String, Any])) | (/* import warning: importer.ImportType#apply Failed type conversion: {} extends std.Record<string, any> ? null : never */ js.Any)
      ] = js.undefined
    
    var slots: js.UndefOr[SlotDictionarydefaultSlot] = js.undefined
  }
  object VueTestUtilsRenderOptions {
    
    inline def apply(): VueTestUtilsRenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VueTestUtilsRenderOptions]
    }
    
    extension [Self <: VueTestUtilsRenderOptions](x: Self) {
      
      inline def setAttrs(value: Record[String, Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setData(
        value: () => /* import warning: importer.ImportType#apply Failed type conversion: {} extends {} ? any : {} extends object ? / * Inlined std.Partial<{}> * /
      {} : any */ js.Any
      ): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setGlobal(value: GlobalMountOptions): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setProps(
        value: (RawProps & (Record[String, Any])) | (/* import warning: importer.ImportType#apply Failed type conversion: {} extends std.Record<string, any> ? null : never */ js.Any)
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setSlots(value: SlotDictionarydefaultSlot): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    }
  }
  
  trait VueTestingLibraryRenderOptions extends StObject {
    
    var baseElement: js.UndefOr[Element] = js.undefined
    
    var container: js.UndefOr[Element] = js.undefined
    
    /**
      * @deprecated Add a Router instance through `global.plugins` array instead.
      */
    var routes: js.UndefOr[Any] = js.undefined
    
    /**
      * @deprecated Add a Vuex instance through `global.plugins` array instead.
      */
    var store: js.UndefOr[Any] = js.undefined
  }
  object VueTestingLibraryRenderOptions {
    
    inline def apply(): VueTestingLibraryRenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VueTestingLibraryRenderOptions]
    }
    
    extension [Self <: VueTestingLibraryRenderOptions](x: Self) {
      
      inline def setBaseElement(value: Element): Self = StObject.set(x, "baseElement", value.asInstanceOf[js.Any])
      
      inline def setBaseElementUndefined: Self = StObject.set(x, "baseElement", js.undefined)
      
      inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setRoutes(value: Any): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
}
