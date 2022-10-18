package typings.testingLibraryDom

import typings.prettyFormat.mod.OptionsReceived
import typings.std.Element
import typings.std.HTMLDocument
import typings.std.HTMLElement
import typings.std.Parameters
import typings.std.ReturnType
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Debug extends StObject {
    
    /**
      * Convenience function for `pretty-dom` which also allows an array
      * of elements
      */
    def debug(): Unit = js.native
    def debug(element: js.Array[Element | HTMLDocument]): Unit = js.native
    def debug(element: js.Array[Element | HTMLDocument], maxLength: Double): Unit = js.native
    def debug(element: js.Array[Element | HTMLDocument], maxLength: Double, options: OptionsReceived): Unit = js.native
    def debug(element: js.Array[Element | HTMLDocument], maxLength: Unit, options: OptionsReceived): Unit = js.native
    def debug(element: Unit, maxLength: Double): Unit = js.native
    def debug(element: Unit, maxLength: Double, options: OptionsReceived): Unit = js.native
    def debug(element: Unit, maxLength: Unit, options: OptionsReceived): Unit = js.native
    def debug(element: Element): Unit = js.native
    def debug(element: Element, maxLength: Double): Unit = js.native
    def debug(element: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
    def debug(element: Element, maxLength: Unit, options: OptionsReceived): Unit = js.native
    def debug(element: HTMLDocument): Unit = js.native
    def debug(element: HTMLDocument, maxLength: Double): Unit = js.native
    def debug(element: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
    def debug(element: HTMLDocument, maxLength: Unit, options: OptionsReceived): Unit = js.native
    
    /**
      * Convenience function for `Testing Playground` which logs and returns the URL that
      * can be opened in a browser
      */
    def logTestingPlaygroundURL(): String = js.native
    def logTestingPlaygroundURL(element: Element): String = js.native
    def logTestingPlaygroundURL(element: HTMLDocument): String = js.native
  }
  
  trait DefaultInit extends StObject {
    
    var EventType: js.UndefOr[String] = js.undefined
    
    var defaultInit: js.UndefOr[js.Object] = js.undefined
  }
  object DefaultInit {
    
    inline def apply(): DefaultInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultInit]
    }
    
    extension [Self <: DefaultInit](x: Self) {
      
      inline def setDefaultInit(value: js.Object): Self = StObject.set(x, "defaultInit", value.asInstanceOf[js.Any])
      
      inline def setDefaultInitUndefined: Self = StObject.set(x, "defaultInit", js.undefined)
      
      inline def setEventType(value: String): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
      
      inline def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@testing-library/dom.@testing-library/dom/types/config.Config> */
  trait PartialConfig extends StObject {
    
    var asyncUtilTimeout: js.UndefOr[Double] = js.undefined
    
    var asyncWrapper: js.UndefOr[js.Function1[/* cb */ js.Function1[/* repeated */ Any, Any], js.Promise[Any]]] = js.undefined
    
    var computedStyleSupportsPseudoElements: js.UndefOr[Boolean] = js.undefined
    
    var defaultHidden: js.UndefOr[Boolean] = js.undefined
    
    var defaultIgnore: js.UndefOr[String] = js.undefined
    
    var eventWrapper: js.UndefOr[js.Function1[/* cb */ js.Function1[/* repeated */ Any, Any], Unit]] = js.undefined
    
    var getElementError: js.UndefOr[js.Function2[/* message */ String | Null, /* container */ Element, js.Error]] = js.undefined
    
    var showOriginalStackTrace: js.UndefOr[Boolean] = js.undefined
    
    var testIdAttribute: js.UndefOr[String] = js.undefined
    
    var throwSuggestions: js.UndefOr[Boolean] = js.undefined
    
    var unstable_advanceTimersWrapper: js.UndefOr[js.Function1[/* cb */ js.Function1[/* repeated */ Any, Any], Any]] = js.undefined
  }
  object PartialConfig {
    
    inline def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    extension [Self <: PartialConfig](x: Self) {
      
      inline def setAsyncUtilTimeout(value: Double): Self = StObject.set(x, "asyncUtilTimeout", value.asInstanceOf[js.Any])
      
      inline def setAsyncUtilTimeoutUndefined: Self = StObject.set(x, "asyncUtilTimeout", js.undefined)
      
      inline def setAsyncWrapper(value: /* cb */ js.Function1[/* repeated */ Any, Any] => js.Promise[Any]): Self = StObject.set(x, "asyncWrapper", js.Any.fromFunction1(value))
      
      inline def setAsyncWrapperUndefined: Self = StObject.set(x, "asyncWrapper", js.undefined)
      
      inline def setComputedStyleSupportsPseudoElements(value: Boolean): Self = StObject.set(x, "computedStyleSupportsPseudoElements", value.asInstanceOf[js.Any])
      
      inline def setComputedStyleSupportsPseudoElementsUndefined: Self = StObject.set(x, "computedStyleSupportsPseudoElements", js.undefined)
      
      inline def setDefaultHidden(value: Boolean): Self = StObject.set(x, "defaultHidden", value.asInstanceOf[js.Any])
      
      inline def setDefaultHiddenUndefined: Self = StObject.set(x, "defaultHidden", js.undefined)
      
      inline def setDefaultIgnore(value: String): Self = StObject.set(x, "defaultIgnore", value.asInstanceOf[js.Any])
      
      inline def setDefaultIgnoreUndefined: Self = StObject.set(x, "defaultIgnore", js.undefined)
      
      inline def setEventWrapper(value: /* cb */ js.Function1[/* repeated */ Any, Any] => Unit): Self = StObject.set(x, "eventWrapper", js.Any.fromFunction1(value))
      
      inline def setEventWrapperUndefined: Self = StObject.set(x, "eventWrapper", js.undefined)
      
      inline def setGetElementError(value: (/* message */ String | Null, /* container */ Element) => js.Error): Self = StObject.set(x, "getElementError", js.Any.fromFunction2(value))
      
      inline def setGetElementErrorUndefined: Self = StObject.set(x, "getElementError", js.undefined)
      
      inline def setShowOriginalStackTrace(value: Boolean): Self = StObject.set(x, "showOriginalStackTrace", value.asInstanceOf[js.Any])
      
      inline def setShowOriginalStackTraceUndefined: Self = StObject.set(x, "showOriginalStackTrace", js.undefined)
      
      inline def setTestIdAttribute(value: String): Self = StObject.set(x, "testIdAttribute", value.asInstanceOf[js.Any])
      
      inline def setTestIdAttributeUndefined: Self = StObject.set(x, "testIdAttribute", js.undefined)
      
      inline def setThrowSuggestions(value: Boolean): Self = StObject.set(x, "throwSuggestions", value.asInstanceOf[js.Any])
      
      inline def setThrowSuggestionsUndefined: Self = StObject.set(x, "throwSuggestions", js.undefined)
      
      inline def setUnstable_advanceTimersWrapper(value: /* cb */ js.Function1[/* repeated */ Any, Any] => Any): Self = StObject.set(x, "unstable_advanceTimersWrapper", js.Any.fromFunction1(value))
      
      inline def setUnstable_advanceTimersWrapperUndefined: Self = StObject.set(x, "unstable_advanceTimersWrapper", js.undefined)
    }
  }
  
  trait Typeofqueries extends StObject {
    
    def findAllByAltText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
    ): ReturnType[FindAllByBoundAttribute[T]]
    
    def findAllByDisplayValue[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
    ): ReturnType[FindAllByBoundAttribute[T]]
    
    def findAllByLabelText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByText<T>> is not an array type */ args: Parameters[FindAllByText_[T]]
    ): ReturnType[FindAllByText_[T]]
    
    def findAllByPlaceholderText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
    ): ReturnType[FindAllByBoundAttribute[T]]
    
    def findAllByRole[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByRole<T>> is not an array type */ args: Parameters[FindAllByRole_[T]]
    ): ReturnType[FindAllByRole_[T]]
    
    def findAllByTestId[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
    ): ReturnType[FindAllByBoundAttribute[T]]
    
    def findAllByText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByText<T>> is not an array type */ args: Parameters[FindAllByText_[T]]
    ): ReturnType[FindAllByText_[T]]
    
    def findAllByTitle[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindAllByBoundAttribute<T>> is not an array type */ args: Parameters[FindAllByBoundAttribute[T]]
    ): ReturnType[FindAllByBoundAttribute[T]]
    
    def findByAltText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
    ): ReturnType[FindByBoundAttribute[T]]
    
    def findByDisplayValue[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
    ): ReturnType[FindByBoundAttribute[T]]
    
    def findByLabelText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByText<T>> is not an array type */ args: Parameters[FindByText_[T]]
    ): ReturnType[FindByText_[T]]
    
    def findByPlaceholderText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
    ): ReturnType[FindByBoundAttribute[T]]
    
    def findByRole[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByRole<T>> is not an array type */ args: Parameters[FindByRole_[T]]
    ): ReturnType[FindByRole_[T]]
    
    def findByTestId[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
    ): ReturnType[FindByBoundAttribute[T]]
    
    def findByText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByText<T>> is not an array type */ args: Parameters[FindByText_[T]]
    ): ReturnType[FindByText_[T]]
    
    def findByTitle[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FindByBoundAttribute<T>> is not an array type */ args: Parameters[FindByBoundAttribute[T]]
    ): ReturnType[FindByBoundAttribute[T]]
    
    def getAllByAltText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]]
    
    def getAllByDisplayValue[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]]
    
    def getAllByLabelText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByText<T>> is not an array type */ args: Parameters[AllByText[T]]
    ): ReturnType[AllByText[T]]
    
    def getAllByPlaceholderText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]]
    
    def getAllByRole[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByRole<T>> is not an array type */ args: Parameters[AllByRole[T]]
    ): ReturnType[AllByRole[T]]
    
    def getAllByTestId[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]]
    
    def getAllByText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByText<T>> is not an array type */ args: Parameters[AllByText[T]]
    ): ReturnType[AllByText[T]]
    
    def getAllByTitle[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]]
    
    def getByAltText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
    ): ReturnType[GetByBoundAttribute[T]]
    
    def getByDisplayValue[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
    ): ReturnType[GetByBoundAttribute[T]]
    
    def getByLabelText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByText<T>> is not an array type */ args: Parameters[GetByText_[T]]
    ): ReturnType[GetByText_[T]]
    
    def getByPlaceholderText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
    ): ReturnType[GetByBoundAttribute[T]]
    
    def getByRole[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByRole<T>> is not an array type */ args: Parameters[GetByRole_[T]]
    ): ReturnType[GetByRole_[T]]
    
    def getByTestId[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
    ): ReturnType[GetByBoundAttribute[T]]
    
    def getByText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByText<T>> is not an array type */ args: Parameters[GetByText_[T]]
    ): ReturnType[GetByText_[T]]
    
    def getByTitle[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GetByBoundAttribute<T>> is not an array type */ args: Parameters[GetByBoundAttribute[T]]
    ): ReturnType[GetByBoundAttribute[T]]
    
    def queryAllByAltText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]]
    
    def queryAllByDisplayValue[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]]
    
    def queryAllByLabelText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByText<T>> is not an array type */ args: Parameters[AllByText[T]]
    ): ReturnType[AllByText[T]]
    
    def queryAllByPlaceholderText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]]
    
    def queryAllByRole[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByRole<T>> is not an array type */ args: Parameters[AllByRole[T]]
    ): ReturnType[AllByRole[T]]
    
    def queryAllByTestId[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]]
    
    def queryAllByText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByText<T>> is not an array type */ args: Parameters[AllByText[T]]
    ): ReturnType[AllByText[T]]
    
    def queryAllByTitle[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AllByBoundAttribute<T>> is not an array type */ args: Parameters[AllByBoundAttribute[T]]
    ): ReturnType[AllByBoundAttribute[T]]
    
    def queryByAltText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
    ): ReturnType[QueryByBoundAttribute[T]]
    
    def queryByDisplayValue[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
    ): ReturnType[QueryByBoundAttribute[T]]
    
    def queryByLabelText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByText<T>> is not an array type */ args: Parameters[QueryByText_[T]]
    ): ReturnType[QueryByText_[T]]
    
    def queryByPlaceholderText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
    ): ReturnType[QueryByBoundAttribute[T]]
    
    def queryByRole[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByRole<T>> is not an array type */ args: Parameters[QueryByRole_[T]]
    ): ReturnType[QueryByRole_[T]]
    
    def queryByTestId[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
    ): ReturnType[QueryByBoundAttribute[T]]
    
    def queryByText[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByText<T>> is not an array type */ args: Parameters[QueryByText_[T]]
    ): ReturnType[QueryByText_[T]]
    
    def queryByTitle[T /* <: HTMLElement */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<QueryByBoundAttribute<T>> is not an array type */ args: Parameters[QueryByBoundAttribute[T]]
    ): ReturnType[QueryByBoundAttribute[T]]
  }
  object Typeofqueries {
    
    inline def apply(
      findAllByAltText: Parameters[FindAllByBoundAttribute[Any]] => ReturnType[FindAllByBoundAttribute[Any]],
      findAllByDisplayValue: Parameters[FindAllByBoundAttribute[Any]] => ReturnType[FindAllByBoundAttribute[Any]],
      findAllByLabelText: Parameters[FindAllByText_[Any]] => ReturnType[FindAllByText_[Any]],
      findAllByPlaceholderText: Parameters[FindAllByBoundAttribute[Any]] => ReturnType[FindAllByBoundAttribute[Any]],
      findAllByRole: Parameters[FindAllByRole_[Any]] => ReturnType[FindAllByRole_[Any]],
      findAllByTestId: Parameters[FindAllByBoundAttribute[Any]] => ReturnType[FindAllByBoundAttribute[Any]],
      findAllByText: Parameters[FindAllByText_[Any]] => ReturnType[FindAllByText_[Any]],
      findAllByTitle: Parameters[FindAllByBoundAttribute[Any]] => ReturnType[FindAllByBoundAttribute[Any]],
      findByAltText: Parameters[FindByBoundAttribute[Any]] => ReturnType[FindByBoundAttribute[Any]],
      findByDisplayValue: Parameters[FindByBoundAttribute[Any]] => ReturnType[FindByBoundAttribute[Any]],
      findByLabelText: Parameters[FindByText_[Any]] => ReturnType[FindByText_[Any]],
      findByPlaceholderText: Parameters[FindByBoundAttribute[Any]] => ReturnType[FindByBoundAttribute[Any]],
      findByRole: Parameters[FindByRole_[Any]] => ReturnType[FindByRole_[Any]],
      findByTestId: Parameters[FindByBoundAttribute[Any]] => ReturnType[FindByBoundAttribute[Any]],
      findByText: Parameters[FindByText_[Any]] => ReturnType[FindByText_[Any]],
      findByTitle: Parameters[FindByBoundAttribute[Any]] => ReturnType[FindByBoundAttribute[Any]],
      getAllByAltText: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]],
      getAllByDisplayValue: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]],
      getAllByLabelText: Parameters[AllByText[Any]] => ReturnType[AllByText[Any]],
      getAllByPlaceholderText: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]],
      getAllByRole: Parameters[AllByRole[Any]] => ReturnType[AllByRole[Any]],
      getAllByTestId: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]],
      getAllByText: Parameters[AllByText[Any]] => ReturnType[AllByText[Any]],
      getAllByTitle: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]],
      getByAltText: Parameters[GetByBoundAttribute[Any]] => ReturnType[GetByBoundAttribute[Any]],
      getByDisplayValue: Parameters[GetByBoundAttribute[Any]] => ReturnType[GetByBoundAttribute[Any]],
      getByLabelText: Parameters[GetByText_[Any]] => ReturnType[GetByText_[Any]],
      getByPlaceholderText: Parameters[GetByBoundAttribute[Any]] => ReturnType[GetByBoundAttribute[Any]],
      getByRole: Parameters[GetByRole_[Any]] => ReturnType[GetByRole_[Any]],
      getByTestId: Parameters[GetByBoundAttribute[Any]] => ReturnType[GetByBoundAttribute[Any]],
      getByText: Parameters[GetByText_[Any]] => ReturnType[GetByText_[Any]],
      getByTitle: Parameters[GetByBoundAttribute[Any]] => ReturnType[GetByBoundAttribute[Any]],
      queryAllByAltText: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]],
      queryAllByDisplayValue: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]],
      queryAllByLabelText: Parameters[AllByText[Any]] => ReturnType[AllByText[Any]],
      queryAllByPlaceholderText: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]],
      queryAllByRole: Parameters[AllByRole[Any]] => ReturnType[AllByRole[Any]],
      queryAllByTestId: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]],
      queryAllByText: Parameters[AllByText[Any]] => ReturnType[AllByText[Any]],
      queryAllByTitle: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]],
      queryByAltText: Parameters[QueryByBoundAttribute[Any]] => ReturnType[QueryByBoundAttribute[Any]],
      queryByDisplayValue: Parameters[QueryByBoundAttribute[Any]] => ReturnType[QueryByBoundAttribute[Any]],
      queryByLabelText: Parameters[QueryByText_[Any]] => ReturnType[QueryByText_[Any]],
      queryByPlaceholderText: Parameters[QueryByBoundAttribute[Any]] => ReturnType[QueryByBoundAttribute[Any]],
      queryByRole: Parameters[QueryByRole_[Any]] => ReturnType[QueryByRole_[Any]],
      queryByTestId: Parameters[QueryByBoundAttribute[Any]] => ReturnType[QueryByBoundAttribute[Any]],
      queryByText: Parameters[QueryByText_[Any]] => ReturnType[QueryByText_[Any]],
      queryByTitle: Parameters[QueryByBoundAttribute[Any]] => ReturnType[QueryByBoundAttribute[Any]]
    ): Typeofqueries = {
      val __obj = js.Dynamic.literal(findAllByAltText = js.Any.fromFunction1(findAllByAltText), findAllByDisplayValue = js.Any.fromFunction1(findAllByDisplayValue), findAllByLabelText = js.Any.fromFunction1(findAllByLabelText), findAllByPlaceholderText = js.Any.fromFunction1(findAllByPlaceholderText), findAllByRole = js.Any.fromFunction1(findAllByRole), findAllByTestId = js.Any.fromFunction1(findAllByTestId), findAllByText = js.Any.fromFunction1(findAllByText), findAllByTitle = js.Any.fromFunction1(findAllByTitle), findByAltText = js.Any.fromFunction1(findByAltText), findByDisplayValue = js.Any.fromFunction1(findByDisplayValue), findByLabelText = js.Any.fromFunction1(findByLabelText), findByPlaceholderText = js.Any.fromFunction1(findByPlaceholderText), findByRole = js.Any.fromFunction1(findByRole), findByTestId = js.Any.fromFunction1(findByTestId), findByText = js.Any.fromFunction1(findByText), findByTitle = js.Any.fromFunction1(findByTitle), getAllByAltText = js.Any.fromFunction1(getAllByAltText), getAllByDisplayValue = js.Any.fromFunction1(getAllByDisplayValue), getAllByLabelText = js.Any.fromFunction1(getAllByLabelText), getAllByPlaceholderText = js.Any.fromFunction1(getAllByPlaceholderText), getAllByRole = js.Any.fromFunction1(getAllByRole), getAllByTestId = js.Any.fromFunction1(getAllByTestId), getAllByText = js.Any.fromFunction1(getAllByText), getAllByTitle = js.Any.fromFunction1(getAllByTitle), getByAltText = js.Any.fromFunction1(getByAltText), getByDisplayValue = js.Any.fromFunction1(getByDisplayValue), getByLabelText = js.Any.fromFunction1(getByLabelText), getByPlaceholderText = js.Any.fromFunction1(getByPlaceholderText), getByRole = js.Any.fromFunction1(getByRole), getByTestId = js.Any.fromFunction1(getByTestId), getByText = js.Any.fromFunction1(getByText), getByTitle = js.Any.fromFunction1(getByTitle), queryAllByAltText = js.Any.fromFunction1(queryAllByAltText), queryAllByDisplayValue = js.Any.fromFunction1(queryAllByDisplayValue), queryAllByLabelText = js.Any.fromFunction1(queryAllByLabelText), queryAllByPlaceholderText = js.Any.fromFunction1(queryAllByPlaceholderText), queryAllByRole = js.Any.fromFunction1(queryAllByRole), queryAllByTestId = js.Any.fromFunction1(queryAllByTestId), queryAllByText = js.Any.fromFunction1(queryAllByText), queryAllByTitle = js.Any.fromFunction1(queryAllByTitle), queryByAltText = js.Any.fromFunction1(queryByAltText), queryByDisplayValue = js.Any.fromFunction1(queryByDisplayValue), queryByLabelText = js.Any.fromFunction1(queryByLabelText), queryByPlaceholderText = js.Any.fromFunction1(queryByPlaceholderText), queryByRole = js.Any.fromFunction1(queryByRole), queryByTestId = js.Any.fromFunction1(queryByTestId), queryByText = js.Any.fromFunction1(queryByText), queryByTitle = js.Any.fromFunction1(queryByTitle))
      __obj.asInstanceOf[Typeofqueries]
    }
    
    extension [Self <: Typeofqueries](x: Self) {
      
      inline def setFindAllByAltText(value: Parameters[FindAllByBoundAttribute[Any]] => ReturnType[FindAllByBoundAttribute[Any]]): Self = StObject.set(x, "findAllByAltText", js.Any.fromFunction1(value))
      
      inline def setFindAllByDisplayValue(value: Parameters[FindAllByBoundAttribute[Any]] => ReturnType[FindAllByBoundAttribute[Any]]): Self = StObject.set(x, "findAllByDisplayValue", js.Any.fromFunction1(value))
      
      inline def setFindAllByLabelText(value: Parameters[FindAllByText_[Any]] => ReturnType[FindAllByText_[Any]]): Self = StObject.set(x, "findAllByLabelText", js.Any.fromFunction1(value))
      
      inline def setFindAllByPlaceholderText(value: Parameters[FindAllByBoundAttribute[Any]] => ReturnType[FindAllByBoundAttribute[Any]]): Self = StObject.set(x, "findAllByPlaceholderText", js.Any.fromFunction1(value))
      
      inline def setFindAllByRole(value: Parameters[FindAllByRole_[Any]] => ReturnType[FindAllByRole_[Any]]): Self = StObject.set(x, "findAllByRole", js.Any.fromFunction1(value))
      
      inline def setFindAllByTestId(value: Parameters[FindAllByBoundAttribute[Any]] => ReturnType[FindAllByBoundAttribute[Any]]): Self = StObject.set(x, "findAllByTestId", js.Any.fromFunction1(value))
      
      inline def setFindAllByText(value: Parameters[FindAllByText_[Any]] => ReturnType[FindAllByText_[Any]]): Self = StObject.set(x, "findAllByText", js.Any.fromFunction1(value))
      
      inline def setFindAllByTitle(value: Parameters[FindAllByBoundAttribute[Any]] => ReturnType[FindAllByBoundAttribute[Any]]): Self = StObject.set(x, "findAllByTitle", js.Any.fromFunction1(value))
      
      inline def setFindByAltText(value: Parameters[FindByBoundAttribute[Any]] => ReturnType[FindByBoundAttribute[Any]]): Self = StObject.set(x, "findByAltText", js.Any.fromFunction1(value))
      
      inline def setFindByDisplayValue(value: Parameters[FindByBoundAttribute[Any]] => ReturnType[FindByBoundAttribute[Any]]): Self = StObject.set(x, "findByDisplayValue", js.Any.fromFunction1(value))
      
      inline def setFindByLabelText(value: Parameters[FindByText_[Any]] => ReturnType[FindByText_[Any]]): Self = StObject.set(x, "findByLabelText", js.Any.fromFunction1(value))
      
      inline def setFindByPlaceholderText(value: Parameters[FindByBoundAttribute[Any]] => ReturnType[FindByBoundAttribute[Any]]): Self = StObject.set(x, "findByPlaceholderText", js.Any.fromFunction1(value))
      
      inline def setFindByRole(value: Parameters[FindByRole_[Any]] => ReturnType[FindByRole_[Any]]): Self = StObject.set(x, "findByRole", js.Any.fromFunction1(value))
      
      inline def setFindByTestId(value: Parameters[FindByBoundAttribute[Any]] => ReturnType[FindByBoundAttribute[Any]]): Self = StObject.set(x, "findByTestId", js.Any.fromFunction1(value))
      
      inline def setFindByText(value: Parameters[FindByText_[Any]] => ReturnType[FindByText_[Any]]): Self = StObject.set(x, "findByText", js.Any.fromFunction1(value))
      
      inline def setFindByTitle(value: Parameters[FindByBoundAttribute[Any]] => ReturnType[FindByBoundAttribute[Any]]): Self = StObject.set(x, "findByTitle", js.Any.fromFunction1(value))
      
      inline def setGetAllByAltText(value: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]]): Self = StObject.set(x, "getAllByAltText", js.Any.fromFunction1(value))
      
      inline def setGetAllByDisplayValue(value: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]]): Self = StObject.set(x, "getAllByDisplayValue", js.Any.fromFunction1(value))
      
      inline def setGetAllByLabelText(value: Parameters[AllByText[Any]] => ReturnType[AllByText[Any]]): Self = StObject.set(x, "getAllByLabelText", js.Any.fromFunction1(value))
      
      inline def setGetAllByPlaceholderText(value: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]]): Self = StObject.set(x, "getAllByPlaceholderText", js.Any.fromFunction1(value))
      
      inline def setGetAllByRole(value: Parameters[AllByRole[Any]] => ReturnType[AllByRole[Any]]): Self = StObject.set(x, "getAllByRole", js.Any.fromFunction1(value))
      
      inline def setGetAllByTestId(value: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]]): Self = StObject.set(x, "getAllByTestId", js.Any.fromFunction1(value))
      
      inline def setGetAllByText(value: Parameters[AllByText[Any]] => ReturnType[AllByText[Any]]): Self = StObject.set(x, "getAllByText", js.Any.fromFunction1(value))
      
      inline def setGetAllByTitle(value: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]]): Self = StObject.set(x, "getAllByTitle", js.Any.fromFunction1(value))
      
      inline def setGetByAltText(value: Parameters[GetByBoundAttribute[Any]] => ReturnType[GetByBoundAttribute[Any]]): Self = StObject.set(x, "getByAltText", js.Any.fromFunction1(value))
      
      inline def setGetByDisplayValue(value: Parameters[GetByBoundAttribute[Any]] => ReturnType[GetByBoundAttribute[Any]]): Self = StObject.set(x, "getByDisplayValue", js.Any.fromFunction1(value))
      
      inline def setGetByLabelText(value: Parameters[GetByText_[Any]] => ReturnType[GetByText_[Any]]): Self = StObject.set(x, "getByLabelText", js.Any.fromFunction1(value))
      
      inline def setGetByPlaceholderText(value: Parameters[GetByBoundAttribute[Any]] => ReturnType[GetByBoundAttribute[Any]]): Self = StObject.set(x, "getByPlaceholderText", js.Any.fromFunction1(value))
      
      inline def setGetByRole(value: Parameters[GetByRole_[Any]] => ReturnType[GetByRole_[Any]]): Self = StObject.set(x, "getByRole", js.Any.fromFunction1(value))
      
      inline def setGetByTestId(value: Parameters[GetByBoundAttribute[Any]] => ReturnType[GetByBoundAttribute[Any]]): Self = StObject.set(x, "getByTestId", js.Any.fromFunction1(value))
      
      inline def setGetByText(value: Parameters[GetByText_[Any]] => ReturnType[GetByText_[Any]]): Self = StObject.set(x, "getByText", js.Any.fromFunction1(value))
      
      inline def setGetByTitle(value: Parameters[GetByBoundAttribute[Any]] => ReturnType[GetByBoundAttribute[Any]]): Self = StObject.set(x, "getByTitle", js.Any.fromFunction1(value))
      
      inline def setQueryAllByAltText(value: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]]): Self = StObject.set(x, "queryAllByAltText", js.Any.fromFunction1(value))
      
      inline def setQueryAllByDisplayValue(value: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]]): Self = StObject.set(x, "queryAllByDisplayValue", js.Any.fromFunction1(value))
      
      inline def setQueryAllByLabelText(value: Parameters[AllByText[Any]] => ReturnType[AllByText[Any]]): Self = StObject.set(x, "queryAllByLabelText", js.Any.fromFunction1(value))
      
      inline def setQueryAllByPlaceholderText(value: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]]): Self = StObject.set(x, "queryAllByPlaceholderText", js.Any.fromFunction1(value))
      
      inline def setQueryAllByRole(value: Parameters[AllByRole[Any]] => ReturnType[AllByRole[Any]]): Self = StObject.set(x, "queryAllByRole", js.Any.fromFunction1(value))
      
      inline def setQueryAllByTestId(value: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]]): Self = StObject.set(x, "queryAllByTestId", js.Any.fromFunction1(value))
      
      inline def setQueryAllByText(value: Parameters[AllByText[Any]] => ReturnType[AllByText[Any]]): Self = StObject.set(x, "queryAllByText", js.Any.fromFunction1(value))
      
      inline def setQueryAllByTitle(value: Parameters[AllByBoundAttribute[Any]] => ReturnType[AllByBoundAttribute[Any]]): Self = StObject.set(x, "queryAllByTitle", js.Any.fromFunction1(value))
      
      inline def setQueryByAltText(value: Parameters[QueryByBoundAttribute[Any]] => ReturnType[QueryByBoundAttribute[Any]]): Self = StObject.set(x, "queryByAltText", js.Any.fromFunction1(value))
      
      inline def setQueryByDisplayValue(value: Parameters[QueryByBoundAttribute[Any]] => ReturnType[QueryByBoundAttribute[Any]]): Self = StObject.set(x, "queryByDisplayValue", js.Any.fromFunction1(value))
      
      inline def setQueryByLabelText(value: Parameters[QueryByText_[Any]] => ReturnType[QueryByText_[Any]]): Self = StObject.set(x, "queryByLabelText", js.Any.fromFunction1(value))
      
      inline def setQueryByPlaceholderText(value: Parameters[QueryByBoundAttribute[Any]] => ReturnType[QueryByBoundAttribute[Any]]): Self = StObject.set(x, "queryByPlaceholderText", js.Any.fromFunction1(value))
      
      inline def setQueryByRole(value: Parameters[QueryByRole_[Any]] => ReturnType[QueryByRole_[Any]]): Self = StObject.set(x, "queryByRole", js.Any.fromFunction1(value))
      
      inline def setQueryByTestId(value: Parameters[QueryByBoundAttribute[Any]] => ReturnType[QueryByBoundAttribute[Any]]): Self = StObject.set(x, "queryByTestId", js.Any.fromFunction1(value))
      
      inline def setQueryByText(value: Parameters[QueryByText_[Any]] => ReturnType[QueryByText_[Any]]): Self = StObject.set(x, "queryByText", js.Any.fromFunction1(value))
      
      inline def setQueryByTitle(value: Parameters[QueryByBoundAttribute[Any]] => ReturnType[QueryByBoundAttribute[Any]]): Self = StObject.set(x, "queryByTitle", js.Any.fromFunction1(value))
    }
  }
}
