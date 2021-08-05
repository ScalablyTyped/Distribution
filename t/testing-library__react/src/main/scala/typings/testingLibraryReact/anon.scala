package typings.testingLibraryReact

import typings.prettyFormat.mod.OptionsReceived
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.testingLibraryDom.getQueriesForElementMod.BoundFunction
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
  trait FnCall extends StObject {
    
    def apply(callback: js.Function0[js.UndefOr[Unit]]): Unit = js.native
  }
  
  /* Inlined @testing-library/react.@testing-library/react.Omit<@testing-library/react.@testing-library/react.RenderOptions<{ readonly getAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly getByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly queryByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly queryByLabelText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly getAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly findByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly getAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly queryAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly getAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly queryAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTitle :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly findAllByText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly findAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly queryAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getByTitle :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly getByLabelText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly queryAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByAltText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly getByRole :@testing-library/dom.@testing-library/dom/types/queries.GetByRole,  readonly queryByTestId :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryByRole :@testing-library/dom.@testing-library/dom/types/queries.QueryByRole,  readonly queryAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly findByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly getAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly findAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findAllByRole :@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole,  readonly findAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly findAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByTestId :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findByRole :@testing-library/dom.@testing-library/dom/types/queries.FindByRole,  readonly getByText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly queryByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly getByAltText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute}>, 'queries'> */
  trait OmitRenderOptionsreadonly extends StObject {
    
    var baseElement: js.UndefOr[Element] = js.undefined
    
    var container: js.UndefOr[Element] = js.undefined
    
    var hydrate: js.UndefOr[Boolean] = js.undefined
    
    var wrapper: js.UndefOr[ComponentType[js.Object]] = js.undefined
  }
  object OmitRenderOptionsreadonly {
    
    inline def apply(): OmitRenderOptionsreadonly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitRenderOptionsreadonly]
    }
    
    extension [Self <: OmitRenderOptionsreadonly](x: Self) {
      
      inline def setBaseElement(value: Element): Self = StObject.set(x, "baseElement", value.asInstanceOf[js.Any])
      
      inline def setBaseElementUndefined: Self = StObject.set(x, "baseElement", js.undefined)
      
      inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setHydrate(value: Boolean): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
      
      inline def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
      
      inline def setWrapper(value: ComponentType[js.Object]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  /* Inlined @testing-library/react.@testing-library/react.RenderResult<{ readonly getAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly getByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly queryByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly queryByLabelText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly getAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly findByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly getAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly queryAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly getAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly queryAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTitle :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly findAllByText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly findAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly queryAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getByTitle :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly getByLabelText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly queryAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByAltText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly getByRole :@testing-library/dom.@testing-library/dom/types/queries.GetByRole,  readonly queryByTestId :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryByRole :@testing-library/dom.@testing-library/dom/types/queries.QueryByRole,  readonly queryAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly findByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly getAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly findAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findAllByRole :@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole,  readonly findAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly findAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByTestId :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findByRole :@testing-library/dom.@testing-library/dom/types/queries.FindByRole,  readonly getByText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly queryByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly getByAltText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute}> */
  @js.native
  trait RenderResultreadonlygetAl extends StObject {
    
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
    
    def rerender(ui: ReactElement): Unit = js.native
    
    def unmount(): Boolean = js.native
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
    
    inline def apply(
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
    
    extension [Self <: Typeofqueries](x: Self) {
      
      inline def setFindAllByAltText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByAltText", js.Any.fromFunction4(value))
      
      inline def setFindAllByDisplayValue(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByDisplayValue", js.Any.fromFunction4(value))
      
      inline def setFindAllByLabelText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByLabelText", js.Any.fromFunction4(value))
      
      inline def setFindAllByPlaceholderText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByPlaceholderText", js.Any.fromFunction4(value))
      
      inline def setFindAllByRole(
        value: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByRole", js.Any.fromFunction4(value))
      
      inline def setFindAllByTestId(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByTestId", js.Any.fromFunction4(value))
      
      inline def setFindAllByText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByText", js.Any.fromFunction4(value))
      
      inline def setFindAllByTitle(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[js.Array[HTMLElement]]
      ): Self = StObject.set(x, "findAllByTitle", js.Any.fromFunction4(value))
      
      inline def setFindByAltText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByAltText", js.Any.fromFunction4(value))
      
      inline def setFindByDisplayValue(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByDisplayValue", js.Any.fromFunction4(value))
      
      inline def setFindByLabelText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByLabelText", js.Any.fromFunction4(value))
      
      inline def setFindByPlaceholderText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByPlaceholderText", js.Any.fromFunction4(value))
      
      inline def setFindByRole(
        value: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByRole", js.Any.fromFunction4(value))
      
      inline def setFindByTestId(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByTestId", js.Any.fromFunction4(value))
      
      inline def setFindByText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByText", js.Any.fromFunction4(value))
      
      inline def setFindByTitle(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[waitForOptions]) => js.Promise[HTMLElement]
      ): Self = StObject.set(x, "findByTitle", js.Any.fromFunction4(value))
      
      inline def setGetAllByAltText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByAltText", js.Any.fromFunction3(value))
      
      inline def setGetAllByDisplayValue(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByDisplayValue", js.Any.fromFunction3(value))
      
      inline def setGetAllByLabelText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByLabelText", js.Any.fromFunction3(value))
      
      inline def setGetAllByPlaceholderText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByPlaceholderText", js.Any.fromFunction3(value))
      
      inline def setGetAllByRole(
        value: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByRole", js.Any.fromFunction3(value))
      
      inline def setGetAllByTestId(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByTestId", js.Any.fromFunction3(value))
      
      inline def setGetAllByText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByText", js.Any.fromFunction3(value))
      
      inline def setGetAllByTitle(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getAllByTitle", js.Any.fromFunction3(value))
      
      inline def setGetByAltText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByAltText", js.Any.fromFunction3(value))
      
      inline def setGetByDisplayValue(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByDisplayValue", js.Any.fromFunction3(value))
      
      inline def setGetByLabelText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByLabelText", js.Any.fromFunction3(value))
      
      inline def setGetByPlaceholderText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByPlaceholderText", js.Any.fromFunction3(value))
      
      inline def setGetByRole(
        value: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByRole", js.Any.fromFunction3(value))
      
      inline def setGetByTestId(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByTestId", js.Any.fromFunction3(value))
      
      inline def setGetByText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByText", js.Any.fromFunction3(value))
      
      inline def setGetByTitle(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement
      ): Self = StObject.set(x, "getByTitle", js.Any.fromFunction3(value))
      
      inline def setQueryAllByAltText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByAltText", js.Any.fromFunction3(value))
      
      inline def setQueryAllByDisplayValue(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByDisplayValue", js.Any.fromFunction3(value))
      
      inline def setQueryAllByLabelText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByLabelText", js.Any.fromFunction3(value))
      
      inline def setQueryAllByPlaceholderText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByPlaceholderText", js.Any.fromFunction3(value))
      
      inline def setQueryAllByRole(
        value: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByRole", js.Any.fromFunction3(value))
      
      inline def setQueryAllByTestId(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByTestId", js.Any.fromFunction3(value))
      
      inline def setQueryAllByText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByText", js.Any.fromFunction3(value))
      
      inline def setQueryAllByTitle(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "queryAllByTitle", js.Any.fromFunction3(value))
      
      inline def setQueryByAltText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByAltText", js.Any.fromFunction3(value))
      
      inline def setQueryByDisplayValue(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByDisplayValue", js.Any.fromFunction3(value))
      
      inline def setQueryByLabelText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByLabelText", js.Any.fromFunction3(value))
      
      inline def setQueryByPlaceholderText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByPlaceholderText", js.Any.fromFunction3(value))
      
      inline def setQueryByRole(
        value: (/* container */ HTMLElement, /* role */ ByRoleMatcher, /* options */ js.UndefOr[ByRoleOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByRole", js.Any.fromFunction3(value))
      
      inline def setQueryByTestId(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByTestId", js.Any.fromFunction3(value))
      
      inline def setQueryByText(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByText", js.Any.fromFunction3(value))
      
      inline def setQueryByTitle(
        value: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null
      ): Self = StObject.set(x, "queryByTitle", js.Any.fromFunction3(value))
    }
  }
}
