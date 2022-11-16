package typings.testingLibraryReact

import org.scalablytyped.runtime.StringDictionary
import typings.prettyFormat.anon.RequiredPartialreadonlyco
import typings.prettyFormat.mod.NewPlugin
import typings.prettyFormat.mod.OptionsReceived
import typings.react.mod.JSXElementConstructor
import typings.react.mod.ReactElement
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Exclude
import typings.std.HTMLDocument
import typings.std.HTMLElement
import typings.std.Parameters
import typings.std.Pick
import typings.std.ReturnType
import typings.testingLibraryDom.anon.PartialConfig
import typings.testingLibraryDom.anon.Typeofqueries
import typings.testingLibraryDom.typesConfigMod.Config
import typings.testingLibraryDom.typesConfigMod.ConfigFn
import typings.testingLibraryDom.typesEventsMod.CreateFunction
import typings.testingLibraryDom.typesEventsMod.CreateObject
import typings.testingLibraryDom.typesEventsMod.FireFunction
import typings.testingLibraryDom.typesEventsMod.FireObject
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
import typings.testingLibraryReact.anon.Children
import typings.testingLibraryReact.anon.Current
import typings.testingLibraryReact.anon.OmitRenderOptionsreadonly
import typings.testingLibraryReact.anon.RenderResultreadonlygetAl
import typings.testingLibraryReact.testingLibraryReactBooleans.`false`
import typings.testingLibraryReact.testingLibraryReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@testing-library/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@testing-library/react", "act")
  @js.native
  val act: /* import warning: importer.ImportType#apply Failed type conversion: {None (callback : (): react-dom.react-dom/test-utils.VoidOrUndefinedOnly): std.Promise<void>, None <T>(callback : (): T | std.Promise<T>): std.Promise<T>} extends undefined ? (callback : (): void): void : {None (callback : (): react-dom.react-dom/test-utils.VoidOrUndefinedOnly): std.Promise<void>, None <T>(callback : (): T | std.Promise<T>): std.Promise<T>} */ js.Any = js.native
  
  inline def buildQueries[Arguments /* <: js.Array[Any] */](
    queryAllBy: GetAllBy[Arguments],
    getMultipleError: GetErrorFunction[Arguments],
    getMissingError: GetErrorFunction[Arguments]
  ): BuiltQueryMethods[Arguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueries")(queryAllBy.asInstanceOf[js.Any], getMultipleError.asInstanceOf[js.Any], getMissingError.asInstanceOf[js.Any])).asInstanceOf[BuiltQueryMethods[Arguments]]
  
  inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
  
  inline def computeHeadingLevel(element: Element): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeHeadingLevel")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def configure(configDelta: PartialConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def configure(configDelta: ConfigFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@testing-library/react", "createEvent")
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
  
  @JSImport("@testing-library/react", "fireEvent")
  @js.native
  val fireEvent: FireFunction & FireObject = js.native
  
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
    
    @JSImport("@testing-library/react", "prettyFormat")
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
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS.callToJSON")
      @js.native
      def callToJSON: `true` = js.native
      inline def callToJSON_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("callToJSON")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS.compareKeys")
      @js.native
      def compareKeys: /* undefined */ Any = js.native
      inline def compareKeys_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS.escapeRegex")
      @js.native
      def escapeRegex: `false` = js.native
      inline def escapeRegex_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeRegex")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS.escapeString")
      @js.native
      def escapeString: `true` = js.native
      inline def escapeString_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeString")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS.highlight")
      @js.native
      def highlight: `false` = js.native
      inline def highlight_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlight")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS.indent")
      @js.native
      def indent: Double = js.native
      inline def indent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indent")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS.maxDepth")
      @js.native
      def maxDepth: Double = js.native
      inline def maxDepth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS.maxWidth")
      @js.native
      def maxWidth: Double = js.native
      inline def maxWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS.min")
      @js.native
      def min: `false` = js.native
      inline def min_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS.plugins")
      @js.native
      def plugins: js.Array[scala.Nothing] = js.native
      inline def plugins_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS.printBasicPrototype")
      @js.native
      def printBasicPrototype: `true` = js.native
      inline def printBasicPrototype_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("printBasicPrototype")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS.printFunctionName")
      @js.native
      def printFunctionName: `true` = js.native
      inline def printFunctionName_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("printFunctionName")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react", "prettyFormat.DEFAULT_OPTIONS.theme")
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
      
      @JSImport("@testing-library/react", "prettyFormat.plugins")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@testing-library/react", "prettyFormat.plugins.AsymmetricMatcher")
      @js.native
      def AsymmetricMatcher: NewPlugin = js.native
      inline def AsymmetricMatcher_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsymmetricMatcher")(x.asInstanceOf[js.Any])
      
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
    
    @JSImport("@testing-library/react", "queries")
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
  
  @JSImport("@testing-library/react", "queryAllByAttribute")
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
  
  @JSImport("@testing-library/react", "queryByAttribute")
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
    
    @JSImport("@testing-library/react", "queryHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildQueries[Arguments /* <: js.Array[Any] */](
      queryAllBy: GetAllBy[Arguments],
      getMultipleError: GetErrorFunction[Arguments],
      getMissingError: GetErrorFunction[Arguments]
    ): BuiltQueryMethods[Arguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueries")(queryAllBy.asInstanceOf[js.Any], getMultipleError.asInstanceOf[js.Any], getMissingError.asInstanceOf[js.Any])).asInstanceOf[BuiltQueryMethods[Arguments]]
    
    inline def getElementError(message: String, container: HTMLElement): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementError")(message.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Error]
    inline def getElementError(message: Null, container: HTMLElement): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementError")(message.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Error]
    
    @JSImport("@testing-library/react", "queryHelpers.queryAllByAttribute")
    @js.native
    val queryAllByAttribute: AllByAttribute = js.native
    
    @JSImport("@testing-library/react", "queryHelpers.queryByAttribute")
    @js.native
    val queryByAttribute: QueryByAttribute_ = js.native
  }
  
  inline def render(ui: ReactElement): RenderResultreadonlygetAl = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(ui.asInstanceOf[js.Any]).asInstanceOf[RenderResultreadonlygetAl]
  inline def render(ui: ReactElement, options: OmitRenderOptionsreadonly): RenderResultreadonlygetAl = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(ui.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RenderResultreadonlygetAl]
  inline def render[Q /* <: Queries */, Container /* <: Element | DocumentFragment */, BaseElement /* <: Element | DocumentFragment */](ui: ReactElement, options: RenderOptions[Q, Container, BaseElement]): RenderResult[Q, Container, BaseElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(ui.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RenderResult[Q, Container, BaseElement]]
  
  inline def renderHook[Result, Props, Q /* <: Queries */, Container /* <: Element | DocumentFragment */, BaseElement /* <: Element | DocumentFragment */](render: js.Function1[/* initialProps */ Props, Result]): RenderHookResult[Result, Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderHook")(render.asInstanceOf[js.Any]).asInstanceOf[RenderHookResult[Result, Props]]
  inline def renderHook[Result, Props, Q /* <: Queries */, Container /* <: Element | DocumentFragment */, BaseElement /* <: Element | DocumentFragment */](
    render: js.Function1[/* initialProps */ Props, Result],
    options: RenderHookOptions[Props, Q, Container, BaseElement]
  ): RenderHookResult[Result, Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderHook")(render.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RenderHookResult[Result, Props]]
  
  @JSImport("@testing-library/react", "screen")
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
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait RenderHookOptions[Props, Q /* <: Queries */, Container /* <: Element | DocumentFragment */, BaseElement /* <: Element | DocumentFragment */]
    extends StObject
       with RenderOptions[Q, Container, BaseElement] {
    
    /**
      * The argument passed to the renderHook callback. Can be useful if you plan
      * to use the rerender utility to change the values passed to your hook.
      */
    var initialProps: js.UndefOr[Props] = js.undefined
  }
  object RenderHookOptions {
    
    inline def apply[Props, Q /* <: Queries */, Container /* <: Element | DocumentFragment */, BaseElement /* <: Element | DocumentFragment */](): RenderHookOptions[Props, Q, Container, BaseElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderHookOptions[Props, Q, Container, BaseElement]]
    }
    
    extension [Self <: RenderHookOptions[?, ?, ?, ?], Props, Q /* <: Queries */, Container /* <: Element | DocumentFragment */, BaseElement /* <: Element | DocumentFragment */](x: Self & (RenderHookOptions[Props, Q, Container, BaseElement])) {
      
      inline def setInitialProps(value: Props): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
      
      inline def setInitialPropsUndefined: Self = StObject.set(x, "initialProps", js.undefined)
    }
  }
  
  @js.native
  trait RenderHookResult[Result, Props] extends StObject {
    
    /**
      * Triggers a re-render. The props will be passed to your renderHook callback.
      */
    def rerender(): Unit = js.native
    def rerender(props: Props): Unit = js.native
    
    /**
      * This is a stable reference to the latest value returned by your renderHook
      * callback
      */
    var result: Current[Result] = js.native
    
    /**
      * Unmounts the test component. This is useful for when you need to test
      * any cleanup your useEffects have.
      */
    def unmount(): Unit = js.native
  }
  
  trait RenderOptions[Q /* <: Queries */, Container /* <: Element | DocumentFragment */, BaseElement /* <: Element | DocumentFragment */] extends StObject {
    
    /**
      * Defaults to the container if the container is specified. Otherwise `document.body` is used for the default. This is used as
      *  the base element for the queries as well as what is printed when you use `debug()`.
      *
      *  @see https://testing-library.com/docs/react-testing-library/api/#baseelement
      */
    var baseElement: js.UndefOr[BaseElement] = js.undefined
    
    /**
      * By default, React Testing Library will create a div and append that div to the document.body. Your React component will be rendered in the created div. If you provide your own HTMLElement container via this option,
      *  it will not be appended to the document.body automatically.
      *
      *  For example: If you are unit testing a `<tbody>` element, it cannot be a child of a div. In this case, you can
      *  specify a table as the render container.
      *
      *  @see https://testing-library.com/docs/react-testing-library/api/#container
      */
    var container: js.UndefOr[Container] = js.undefined
    
    /**
      * If `hydrate` is set to `true`, then it will render with `ReactDOM.hydrate`. This may be useful if you are using server-side
      *  rendering and use ReactDOM.hydrate to mount your components.
      *
      *  @see https://testing-library.com/docs/react-testing-library/api/#hydrate)
      */
    var hydrate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` if you want to force synchronous `ReactDOM.render`.
      * Otherwise `render` will default to concurrent React if available.
      */
    var legacyRoot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Queries to bind. Overrides the default set from DOM Testing Library unless merged.
      *
      *  @see https://testing-library.com/docs/react-testing-library/api/#queries
      */
    var queries: js.UndefOr[Q] = js.undefined
    
    /**
      * Pass a React Component as the wrapper option to have it rendered around the inner element. This is most useful for creating
      *  reusable custom render functions for common data providers. See setup for examples.
      *
      *  @see https://testing-library.com/docs/react-testing-library/api/#wrapper
      */
    var wrapper: js.UndefOr[JSXElementConstructor[Children]] = js.undefined
  }
  object RenderOptions {
    
    inline def apply[Q /* <: Queries */, Container /* <: Element | DocumentFragment */, BaseElement /* <: Element | DocumentFragment */](): RenderOptions[Q, Container, BaseElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions[Q, Container, BaseElement]]
    }
    
    extension [Self <: RenderOptions[?, ?, ?], Q /* <: Queries */, Container /* <: Element | DocumentFragment */, BaseElement /* <: Element | DocumentFragment */](x: Self & (RenderOptions[Q, Container, BaseElement])) {
      
      inline def setBaseElement(value: BaseElement): Self = StObject.set(x, "baseElement", value.asInstanceOf[js.Any])
      
      inline def setBaseElementUndefined: Self = StObject.set(x, "baseElement", js.undefined)
      
      inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setHydrate(value: Boolean): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
      
      inline def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
      
      inline def setLegacyRoot(value: Boolean): Self = StObject.set(x, "legacyRoot", value.asInstanceOf[js.Any])
      
      inline def setLegacyRootUndefined: Self = StObject.set(x, "legacyRoot", js.undefined)
      
      inline def setQueries(value: Q): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
      
      inline def setWrapper(value: JSXElementConstructor[Children]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperFunction1(value: Children => ReactElement | Null): Self = StObject.set(x, "wrapper", js.Any.fromFunction1(value))
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  @js.native
  trait RenderResult[Q /* <: Queries */, Container /* <: Element | DocumentFragment */, BaseElement /* <: Element | DocumentFragment */] extends StObject {
    
    def asFragment(): DocumentFragment = js.native
    
    var baseElement: BaseElement = js.native
    
    var container: Container = js.native
    
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
    
    def unmount(): Unit = js.native
  }
}
