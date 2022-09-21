package typings.testingLibraryReact

import typings.prettyFormat.mod.OptionsReceived
import typings.react.mod.JSXElementConstructor
import typings.react.mod.ReactElement
import typings.reactDom.testUtilsMod.VoidOrUndefinedOnly
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Parameters
import typings.std.ReturnType
import typings.testingLibraryDom.getQueriesForElementMod.BoundFunction
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: ReactElement
  }
  object Children {
    
    inline def apply(children: ReactElement): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait Current[Result] extends StObject {
    
    /**
      * The value returned by your renderHook callback
      */
    var current: Result
  }
  object Current {
    
    inline def apply[Result](current: Result): Current[Result] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current[Result]]
    }
    
    extension [Self <: Current[?], Result](x: Self & Current[Result]) {
      
      inline def setCurrent(value: Result): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(callback: js.Function0[VoidOrUndefinedOnly]): Unit = js.native
  }
  
  /* Inlined @testing-library/react.@testing-library/react.Omit<@testing-library/react.@testing-library/react.RenderOptions<{readonly getAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly getByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly findAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly queryByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly queryAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly findByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>, readonly queryByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>, readonly getAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>, readonly findByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly getAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>, readonly queryAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly getAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly queryAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly findAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>, readonly findAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly queryAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly getAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly getByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly getAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly findByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly findByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly getByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>, readonly queryAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly getByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByRole<T>>, readonly queryByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly queryByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByRole<T>>, readonly queryAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>, readonly findByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>, readonly getAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly getByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly findAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>, readonly findAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly getAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole<T>>, readonly findAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly findAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly getByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly findByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByRole<T>>, readonly getByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>, readonly queryByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly getByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>}, std.HTMLElement, std.HTMLElement>, 'queries'> */
  trait OmitRenderOptionsreadonly extends StObject {
    
    var baseElement: js.UndefOr[HTMLElement] = js.undefined
    
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    var hydrate: js.UndefOr[Boolean] = js.undefined
    
    var legacyRoot: js.UndefOr[Boolean] = js.undefined
    
    var wrapper: js.UndefOr[JSXElementConstructor[Children]] = js.undefined
  }
  object OmitRenderOptionsreadonly {
    
    inline def apply(): OmitRenderOptionsreadonly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitRenderOptionsreadonly]
    }
    
    extension [Self <: OmitRenderOptionsreadonly](x: Self) {
      
      inline def setBaseElement(value: HTMLElement): Self = StObject.set(x, "baseElement", value.asInstanceOf[js.Any])
      
      inline def setBaseElementUndefined: Self = StObject.set(x, "baseElement", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setHydrate(value: Boolean): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
      
      inline def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
      
      inline def setLegacyRoot(value: Boolean): Self = StObject.set(x, "legacyRoot", value.asInstanceOf[js.Any])
      
      inline def setLegacyRootUndefined: Self = StObject.set(x, "legacyRoot", js.undefined)
      
      inline def setWrapper(value: JSXElementConstructor[Children]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperFunction1(value: Children => ReactElement | Null): Self = StObject.set(x, "wrapper", js.Any.fromFunction1(value))
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  /* Inlined @testing-library/react.@testing-library/react.RenderResult<{readonly getAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly getByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly findAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly queryByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly queryAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly findByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>, readonly queryByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>, readonly getAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>, readonly findByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly getAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>, readonly queryAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly getAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly queryAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly findAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>, readonly findAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly queryAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly getAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly getByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly getAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly findByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly findByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly getByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>, readonly queryAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly getByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByRole<T>>, readonly queryByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly queryByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByRole<T>>, readonly queryAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>, readonly findByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>, readonly getAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly getByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly findAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>, readonly findAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly getAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole<T>>, readonly findAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly findAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly getByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly findByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByRole<T>>, readonly getByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>, readonly queryByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly getByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>}, std.HTMLElement, std.HTMLElement> */
  @js.native
  trait RenderResultreadonlygetAl extends StObject {
    
    def asFragment(): DocumentFragment = js.native
    
    var baseElement: HTMLElement = js.native
    
    var container: HTMLElement = js.native
    
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
    
    var findAllByAltText: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
          ReturnType[FindAllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var findAllByDisplayValue: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
          ReturnType[FindAllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var findAllByLabelText: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByText_[HTMLElement]], 
          ReturnType[FindAllByText_[HTMLElement]]
        ]
      ] = js.native
    
    var findAllByPlaceholderText: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
          ReturnType[FindAllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var findAllByRole: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByRole_[HTMLElement]], 
          ReturnType[FindAllByRole_[HTMLElement]]
        ]
      ] = js.native
    
    var findAllByTestId: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
          ReturnType[FindAllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var findAllByText: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByText_[HTMLElement]], 
          ReturnType[FindAllByText_[HTMLElement]]
        ]
      ] = js.native
    
    var findAllByTitle: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
          ReturnType[FindAllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var findByAltText: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
          ReturnType[FindByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var findByDisplayValue: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
          ReturnType[FindByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var findByLabelText: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindByText_[HTMLElement]], 
          ReturnType[FindByText_[HTMLElement]]
        ]
      ] = js.native
    
    var findByPlaceholderText: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
          ReturnType[FindByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var findByRole: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindByRole_[HTMLElement]], 
          ReturnType[FindByRole_[HTMLElement]]
        ]
      ] = js.native
    
    var findByTestId: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
          ReturnType[FindByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var findByText: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindByText_[HTMLElement]], 
          ReturnType[FindByText_[HTMLElement]]
        ]
      ] = js.native
    
    var findByTitle: BoundFunction[
        js.Function1[
          /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
          ReturnType[FindByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var getAllByAltText: BoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var getAllByDisplayValue: BoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var getAllByLabelText: BoundFunction[
        js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
      ] = js.native
    
    var getAllByPlaceholderText: BoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var getAllByRole: BoundFunction[
        js.Function1[/* args */ Parameters[AllByRole[HTMLElement]], ReturnType[AllByRole[HTMLElement]]]
      ] = js.native
    
    var getAllByTestId: BoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var getAllByText: BoundFunction[
        js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
      ] = js.native
    
    var getAllByTitle: BoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var getByAltText: BoundFunction[
        js.Function1[
          /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
          ReturnType[GetByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var getByDisplayValue: BoundFunction[
        js.Function1[
          /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
          ReturnType[GetByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var getByLabelText: BoundFunction[
        js.Function1[
          /* args */ Parameters[GetByText_[HTMLElement]], 
          ReturnType[GetByText_[HTMLElement]]
        ]
      ] = js.native
    
    var getByPlaceholderText: BoundFunction[
        js.Function1[
          /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
          ReturnType[GetByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var getByRole: BoundFunction[
        js.Function1[
          /* args */ Parameters[GetByRole_[HTMLElement]], 
          ReturnType[GetByRole_[HTMLElement]]
        ]
      ] = js.native
    
    var getByTestId: BoundFunction[
        js.Function1[
          /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
          ReturnType[GetByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var getByText: BoundFunction[
        js.Function1[
          /* args */ Parameters[GetByText_[HTMLElement]], 
          ReturnType[GetByText_[HTMLElement]]
        ]
      ] = js.native
    
    var getByTitle: BoundFunction[
        js.Function1[
          /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
          ReturnType[GetByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var queryAllByAltText: BoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var queryAllByDisplayValue: BoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var queryAllByLabelText: BoundFunction[
        js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
      ] = js.native
    
    var queryAllByPlaceholderText: BoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var queryAllByRole: BoundFunction[
        js.Function1[/* args */ Parameters[AllByRole[HTMLElement]], ReturnType[AllByRole[HTMLElement]]]
      ] = js.native
    
    var queryAllByTestId: BoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var queryAllByText: BoundFunction[
        js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
      ] = js.native
    
    var queryAllByTitle: BoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var queryByAltText: BoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
          ReturnType[QueryByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var queryByDisplayValue: BoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
          ReturnType[QueryByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var queryByLabelText: BoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByText_[HTMLElement]], 
          ReturnType[QueryByText_[HTMLElement]]
        ]
      ] = js.native
    
    var queryByPlaceholderText: BoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
          ReturnType[QueryByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var queryByRole: BoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByRole_[HTMLElement]], 
          ReturnType[QueryByRole_[HTMLElement]]
        ]
      ] = js.native
    
    var queryByTestId: BoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
          ReturnType[QueryByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    var queryByText: BoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByText_[HTMLElement]], 
          ReturnType[QueryByText_[HTMLElement]]
        ]
      ] = js.native
    
    var queryByTitle: BoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
          ReturnType[QueryByBoundAttribute[HTMLElement]]
        ]
      ] = js.native
    
    def rerender(ui: ReactElement): Unit = js.native
    
    def unmount(): Unit = js.native
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
