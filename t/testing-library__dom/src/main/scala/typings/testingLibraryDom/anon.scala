package typings.testingLibraryDom

import typings.prettyFormat.mod.OptionsReceived
import typings.std.Element
import typings.std.Error
import typings.std.HTMLDocument
import typings.std.HTMLElement
import typings.testingLibraryDom.matchesMod.ByRoleMatcher
import typings.testingLibraryDom.matchesMod.Matcher
import typings.testingLibraryDom.matchesMod.MatcherOptions
import typings.testingLibraryDom.queriesMod.AllByBoundAttribute
import typings.testingLibraryDom.queriesMod.AllByRole
import typings.testingLibraryDom.queriesMod.AllByText
import typings.testingLibraryDom.queriesMod.ByRoleOptions
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
import typings.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions
import typings.testingLibraryDom.waitForMod.waitForOptions
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
      * Convenience function for `Testing Playground` which logs URL that
      * can be opened in a browser
      */
    def logTestingPlaygroundURL(): Unit = js.native
    def logTestingPlaygroundURL(element: Element): Unit = js.native
    def logTestingPlaygroundURL(element: HTMLDocument): Unit = js.native
  }
  
  trait DefaultInit extends StObject {
    
    var EventType: js.UndefOr[String] = js.undefined
    
    var defaultInit: js.UndefOr[js.Object] = js.undefined
  }
  object DefaultInit {
    
    @scala.inline
    def apply(): DefaultInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultInit]
    }
    
    @scala.inline
    implicit class DefaultInitMutableBuilder[Self <: DefaultInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultInit(value: js.Object): Self = StObject.set(x, "defaultInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultInitUndefined: Self = StObject.set(x, "defaultInit", js.undefined)
      
      @scala.inline
      def setEventType(value: String): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    }
  }
  
  trait Interval extends StObject {
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Interval {
    
    @scala.inline
    def apply(): Interval = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Interval]
    }
    
    @scala.inline
    implicit class IntervalMutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@testing-library/dom.@testing-library/dom/types/config.Config> */
  trait PartialConfig extends StObject {
    
    var asyncUtilTimeout: js.UndefOr[Double] = js.undefined
    
    var asyncWrapper: js.UndefOr[
        js.Function1[/* cb */ js.Function1[/* repeated */ js.Any, js.Any], js.Promise[js.Any]]
      ] = js.undefined
    
    var computedStyleSupportsPseudoElements: js.UndefOr[Boolean] = js.undefined
    
    var defaultHidden: js.UndefOr[Boolean] = js.undefined
    
    var eventWrapper: js.UndefOr[js.Function1[/* cb */ js.Function1[/* repeated */ js.Any, js.Any], Unit]] = js.undefined
    
    var getElementError: js.UndefOr[js.Function2[/* message */ String, /* container */ HTMLElement, Error]] = js.undefined
    
    var showOriginalStackTrace: js.UndefOr[Boolean] = js.undefined
    
    var testIdAttribute: js.UndefOr[String] = js.undefined
    
    var throwSuggestions: js.UndefOr[Boolean] = js.undefined
  }
  object PartialConfig {
    
    @scala.inline
    def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    @scala.inline
    implicit class PartialConfigMutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncUtilTimeout(value: Double): Self = StObject.set(x, "asyncUtilTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUtilTimeoutUndefined: Self = StObject.set(x, "asyncUtilTimeout", js.undefined)
      
      @scala.inline
      def setAsyncWrapper(value: /* cb */ js.Function1[/* repeated */ js.Any, js.Any] => js.Promise[js.Any]): Self = StObject.set(x, "asyncWrapper", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAsyncWrapperUndefined: Self = StObject.set(x, "asyncWrapper", js.undefined)
      
      @scala.inline
      def setComputedStyleSupportsPseudoElements(value: Boolean): Self = StObject.set(x, "computedStyleSupportsPseudoElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputedStyleSupportsPseudoElementsUndefined: Self = StObject.set(x, "computedStyleSupportsPseudoElements", js.undefined)
      
      @scala.inline
      def setDefaultHidden(value: Boolean): Self = StObject.set(x, "defaultHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultHiddenUndefined: Self = StObject.set(x, "defaultHidden", js.undefined)
      
      @scala.inline
      def setEventWrapper(value: /* cb */ js.Function1[/* repeated */ js.Any, js.Any] => Unit): Self = StObject.set(x, "eventWrapper", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEventWrapperUndefined: Self = StObject.set(x, "eventWrapper", js.undefined)
      
      @scala.inline
      def setGetElementError(value: (/* message */ String, /* container */ HTMLElement) => Error): Self = StObject.set(x, "getElementError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetElementErrorUndefined: Self = StObject.set(x, "getElementError", js.undefined)
      
      @scala.inline
      def setShowOriginalStackTrace(value: Boolean): Self = StObject.set(x, "showOriginalStackTrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOriginalStackTraceUndefined: Self = StObject.set(x, "showOriginalStackTrace", js.undefined)
      
      @scala.inline
      def setTestIdAttribute(value: String): Self = StObject.set(x, "testIdAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIdAttributeUndefined: Self = StObject.set(x, "testIdAttribute", js.undefined)
      
      @scala.inline
      def setThrowSuggestions(value: Boolean): Self = StObject.set(x, "throwSuggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowSuggestionsUndefined: Self = StObject.set(x, "throwSuggestions", js.undefined)
    }
  }
  
  trait Typeofqueries extends StObject {
    
    val findAllByAltText: FindAllByBoundAttribute
    
    val findAllByDisplayValue: FindAllByBoundAttribute
    
    val findAllByLabelText: FindAllByText_
    
    val findAllByPlaceholderText: FindAllByBoundAttribute
    
    val findAllByRole: FindAllByRole_
    
    val findAllByTestId: FindAllByBoundAttribute
    
    val findAllByText: FindAllByText_
    
    val findAllByTitle: FindAllByBoundAttribute
    
    val findByAltText: FindByBoundAttribute
    
    val findByDisplayValue: FindByBoundAttribute
    
    val findByLabelText: FindByText_
    
    val findByPlaceholderText: FindByBoundAttribute
    
    val findByRole: FindByRole_
    
    val findByTestId: FindByBoundAttribute
    
    val findByText: FindByText_
    
    val findByTitle: FindByBoundAttribute
    
    val getAllByAltText: AllByBoundAttribute
    
    val getAllByDisplayValue: AllByBoundAttribute
    
    val getAllByLabelText: AllByText
    
    val getAllByPlaceholderText: AllByBoundAttribute
    
    val getAllByRole: AllByRole
    
    val getAllByTestId: AllByBoundAttribute
    
    val getAllByText: AllByText
    
    val getAllByTitle: AllByBoundAttribute
    
    val getByAltText: GetByBoundAttribute
    
    val getByDisplayValue: GetByBoundAttribute
    
    val getByLabelText: GetByText_
    
    val getByPlaceholderText: GetByBoundAttribute
    
    val getByRole: GetByRole_
    
    val getByTestId: GetByBoundAttribute
    
    val getByText: GetByText_
    
    val getByTitle: GetByBoundAttribute
    
    val queryAllByAltText: AllByBoundAttribute
    
    val queryAllByDisplayValue: AllByBoundAttribute
    
    val queryAllByLabelText: AllByText
    
    val queryAllByPlaceholderText: AllByBoundAttribute
    
    val queryAllByRole: AllByRole
    
    val queryAllByTestId: AllByBoundAttribute
    
    val queryAllByText: AllByText
    
    val queryAllByTitle: AllByBoundAttribute
    
    val queryByAltText: QueryByBoundAttribute
    
    val queryByDisplayValue: QueryByBoundAttribute
    
    val queryByLabelText: QueryByText_
    
    val queryByPlaceholderText: QueryByBoundAttribute
    
    val queryByRole: QueryByRole_
    
    val queryByTestId: QueryByBoundAttribute
    
    val queryByText: QueryByText_
    
    val queryByTitle: QueryByBoundAttribute
  }
  object Typeofqueries {
    
    @scala.inline
    def apply(
      findAllByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]],
      findAllByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]],
      findAllByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]],
      findAllByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]],
      findAllByRole: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]],
      findAllByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]],
      findAllByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]],
      findAllByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]],
      findByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement],
      findByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement],
      findByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement],
      findByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement],
      findByRole: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement],
      findByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement],
      findByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement],
      findByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement],
      getAllByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
      getAllByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
      getAllByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement],
      getAllByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
      getAllByRole: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions]) => js.Array[HTMLElement],
      getAllByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
      getAllByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement],
      getAllByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
      getByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
      getByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
      getByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement,
      getByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
      getByRole: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions]) => HTMLElement,
      getByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
      getByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement,
      getByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
      queryAllByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
      queryAllByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
      queryAllByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement],
      queryAllByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
      queryAllByRole: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions]) => js.Array[HTMLElement],
      queryAllByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
      queryAllByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement],
      queryAllByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
      queryByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null,
      queryByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null,
      queryByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement | Null,
      queryByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null,
      queryByRole: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions]) => HTMLElement | Null,
      queryByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null,
      queryByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement | Null,
      queryByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null
    ): Typeofqueries = {
      val __obj = js.Dynamic.literal(findAllByAltText = js.Any.fromFunction4(findAllByAltText), findAllByDisplayValue = js.Any.fromFunction4(findAllByDisplayValue), findAllByLabelText = js.Any.fromFunction4(findAllByLabelText), findAllByPlaceholderText = js.Any.fromFunction4(findAllByPlaceholderText), findAllByRole = js.Any.fromFunction4(findAllByRole), findAllByTestId = js.Any.fromFunction4(findAllByTestId), findAllByText = js.Any.fromFunction4(findAllByText), findAllByTitle = js.Any.fromFunction4(findAllByTitle), findByAltText = js.Any.fromFunction4(findByAltText), findByDisplayValue = js.Any.fromFunction4(findByDisplayValue), findByLabelText = js.Any.fromFunction4(findByLabelText), findByPlaceholderText = js.Any.fromFunction4(findByPlaceholderText), findByRole = js.Any.fromFunction4(findByRole), findByTestId = js.Any.fromFunction4(findByTestId), findByText = js.Any.fromFunction4(findByText), findByTitle = js.Any.fromFunction4(findByTitle), getAllByAltText = js.Any.fromFunction3(getAllByAltText), getAllByDisplayValue = js.Any.fromFunction3(getAllByDisplayValue), getAllByLabelText = js.Any.fromFunction3(getAllByLabelText), getAllByPlaceholderText = js.Any.fromFunction3(getAllByPlaceholderText), getAllByRole = js.Any.fromFunction3(getAllByRole), getAllByTestId = js.Any.fromFunction3(getAllByTestId), getAllByText = js.Any.fromFunction3(getAllByText), getAllByTitle = js.Any.fromFunction3(getAllByTitle), getByAltText = js.Any.fromFunction3(getByAltText), getByDisplayValue = js.Any.fromFunction3(getByDisplayValue), getByLabelText = js.Any.fromFunction3(getByLabelText), getByPlaceholderText = js.Any.fromFunction3(getByPlaceholderText), getByRole = js.Any.fromFunction3(getByRole), getByTestId = js.Any.fromFunction3(getByTestId), getByText = js.Any.fromFunction3(getByText), getByTitle = js.Any.fromFunction3(getByTitle), queryAllByAltText = js.Any.fromFunction3(queryAllByAltText), queryAllByDisplayValue = js.Any.fromFunction3(queryAllByDisplayValue), queryAllByLabelText = js.Any.fromFunction3(queryAllByLabelText), queryAllByPlaceholderText = js.Any.fromFunction3(queryAllByPlaceholderText), queryAllByRole = js.Any.fromFunction3(queryAllByRole), queryAllByTestId = js.Any.fromFunction3(queryAllByTestId), queryAllByText = js.Any.fromFunction3(queryAllByText), queryAllByTitle = js.Any.fromFunction3(queryAllByTitle), queryByAltText = js.Any.fromFunction3(queryByAltText), queryByDisplayValue = js.Any.fromFunction3(queryByDisplayValue), queryByLabelText = js.Any.fromFunction3(queryByLabelText), queryByPlaceholderText = js.Any.fromFunction3(queryByPlaceholderText), queryByRole = js.Any.fromFunction3(queryByRole), queryByTestId = js.Any.fromFunction3(queryByTestId), queryByText = js.Any.fromFunction3(queryByText), queryByTitle = js.Any.fromFunction3(queryByTitle))
      __obj.asInstanceOf[Typeofqueries]
    }
    
    @scala.inline
    implicit class TypeofqueriesMutableBuilder[Self <: Typeofqueries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindAllByAltText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByAltText", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindAllByDisplayValue(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByDisplayValue", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindAllByLabelText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByLabelText", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindAllByPlaceholderText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByPlaceholderText", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindAllByRole(
        value: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByRole", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindAllByTestId(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByTestId", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindAllByText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByText", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindAllByTitle(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByTitle", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindByAltText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByAltText", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindByDisplayValue(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByDisplayValue", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindByLabelText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByLabelText", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindByPlaceholderText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByPlaceholderText", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindByRole(
        value: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByRole", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindByTestId(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByTestId", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindByText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByText", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindByTitle(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByTitle", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGetAllByAltText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByAltText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetAllByDisplayValue(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByDisplayValue", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetAllByLabelText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByLabelText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetAllByPlaceholderText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByPlaceholderText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetAllByRole(
        value: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByRole", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetAllByTestId(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByTestId", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetAllByText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetAllByTitle(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByTitle", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetByAltText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByAltText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetByDisplayValue(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByDisplayValue", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetByLabelText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByLabelText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetByPlaceholderText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByPlaceholderText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetByRole(
        value: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByRole", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetByTestId(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByTestId", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetByText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetByTitle(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByTitle", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryAllByAltText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByAltText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryAllByDisplayValue(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByDisplayValue", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryAllByLabelText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByLabelText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryAllByPlaceholderText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByPlaceholderText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryAllByRole(
        value: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByRole", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryAllByTestId(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByTestId", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryAllByText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryAllByTitle(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByTitle", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryByAltText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByAltText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryByDisplayValue(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByDisplayValue", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryByLabelText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByLabelText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryByPlaceholderText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByPlaceholderText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryByRole(
        value: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByRole", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryByTestId(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByTestId", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryByText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryByTitle(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByTitle", js.Any.fromFunction3(value))
    }
  }
}
