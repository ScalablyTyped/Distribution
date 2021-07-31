package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("wix-style-react/dist/es/src/Pagination", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[PaginationProps, js.Object, js.Any]
  
  type Pagination = PureComponent[PaginationProps, js.Object, js.Any]
  
  trait PaginationProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var currentPage: js.UndefOr[Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var totalPages: js.UndefOr[Double] = js.undefined
  }
  object PaginationProps {
    
    @scala.inline
    def apply(): PaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit class PaginationPropsMutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* event */ Event => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
    }
  }
}
