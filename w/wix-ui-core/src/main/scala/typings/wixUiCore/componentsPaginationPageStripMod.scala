package typings.wixUiCore

import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.wixUiCore.anon.ResponsiveLayout
import typings.wixUiCore.componentsPaginationPageStripLayoutMod.PageStripLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPaginationPageStripMod {
  
  @JSImport("wix-ui-core/src/components/pagination/PageStrip", "PageStrip")
  @js.native
  class PageStrip protected ()
    extends Component[PageStripProps, PageStripState, js.Any] {
    def this(props: PageStripProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PageStripProps, context: js.Any) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MPageStrip(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPageStrip(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPageStrip(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPageStrip(): Unit = js.native
    
    var forceRepaintInMsEdge: js.Any = js.native
    
    var getLayout: js.Any = js.native
    
    var isResponsive: js.Any = js.native
    
    var renderLayout: js.Any = js.native
    
    var responsiveLayoutIsFresh: js.Any = js.native
    
    var rootNode: js.Any = js.native
    
    @JSName("state")
    var state_PageStrip: ResponsiveLayout = js.native
    
    var unmounted: js.Any = js.native
    
    var updateLayoutIfNeeded: js.Any = js.native
  }
  
  trait PageStripProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var currentPage: Double
    
    var disabled: Boolean
    
    var gapLabel: ReactNode
    
    var id: js.UndefOr[String] = js.undefined
    
    var maxPagesToShow: Double
    
    def onPageClick(event: MouseEvent[Element, NativeMouseEvent], page: Double): Unit
    
    def onPageKeyDown(event: KeyboardEvent[Element], page: Double): Unit
    
    var pageUrl: js.UndefOr[js.Function1[/* pageNumber */ Double, String]] = js.undefined
    
    var responsive: Boolean
    
    var showFirstPage: Boolean
    
    var showLastPage: Boolean
    
    var totalPages: Double
    
    def updateResponsiveLayout(callback: js.Function0[Unit]): Unit
  }
  object PageStripProps {
    
    @scala.inline
    def apply(
      currentPage: Double,
      disabled: Boolean,
      maxPagesToShow: Double,
      onPageClick: (MouseEvent[Element, NativeMouseEvent], Double) => Unit,
      onPageKeyDown: (KeyboardEvent[Element], Double) => Unit,
      responsive: Boolean,
      showFirstPage: Boolean,
      showLastPage: Boolean,
      totalPages: Double,
      updateResponsiveLayout: js.Function0[Unit] => Unit
    ): PageStripProps = {
      val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], maxPagesToShow = maxPagesToShow.asInstanceOf[js.Any], onPageClick = js.Any.fromFunction2(onPageClick), onPageKeyDown = js.Any.fromFunction2(onPageKeyDown), responsive = responsive.asInstanceOf[js.Any], showFirstPage = showFirstPage.asInstanceOf[js.Any], showLastPage = showLastPage.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], updateResponsiveLayout = js.Any.fromFunction1(updateResponsiveLayout))
      __obj.asInstanceOf[PageStripProps]
    }
    
    @scala.inline
    implicit class PageStripPropsMutableBuilder[Self <: PageStripProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapLabel(value: ReactNode): Self = StObject.set(x, "gapLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapLabelUndefined: Self = StObject.set(x, "gapLabel", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMaxPagesToShow(value: Double): Self = StObject.set(x, "maxPagesToShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPageClick(value: (MouseEvent[Element, NativeMouseEvent], Double) => Unit): Self = StObject.set(x, "onPageClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPageKeyDown(value: (KeyboardEvent[Element], Double) => Unit): Self = StObject.set(x, "onPageKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPageUrl(value: /* pageNumber */ Double => String): Self = StObject.set(x, "pageUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFirstPage(value: Boolean): Self = StObject.set(x, "showFirstPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLastPage(value: Boolean): Self = StObject.set(x, "showLastPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateResponsiveLayout(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "updateResponsiveLayout", js.Any.fromFunction1(value))
    }
  }
  
  trait PageStripState extends StObject {
    
    var responsiveLayout: PageStripLayout | Null
  }
  object PageStripState {
    
    @scala.inline
    def apply(): PageStripState = {
      val __obj = js.Dynamic.literal(responsiveLayout = null)
      __obj.asInstanceOf[PageStripState]
    }
    
    @scala.inline
    implicit class PageStripStateMutableBuilder[Self <: PageStripState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponsiveLayout(value: PageStripLayout): Self = StObject.set(x, "responsiveLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveLayoutNull: Self = StObject.set(x, "responsiveLayout", null)
      
      @scala.inline
      def setResponsiveLayoutVarargs(value: Double*): Self = StObject.set(x, "responsiveLayout", js.Array(value :_*))
    }
  }
}
