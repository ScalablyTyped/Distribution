package typings.wixUiCore

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.wixUiCore.anon.Event
import typings.wixUiCore.anon.PageInputHasError
import typings.wixUiCore.anon.PartialPaginationPropsCurrentPage
import typings.wixUiCore.wixUiCoreStrings.compact
import typings.wixUiCore.wixUiCoreStrings.input
import typings.wixUiCore.wixUiCoreStrings.pages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsPaginationPaginationMod {
  
  @JSImport("wix-ui-core/src/components/pagination/Pagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/src/components/pagination/Pagination", "Pagination")
  @js.native
  class Pagination protected ()
    extends Component[PaginationProps, PaginationState, js.Any] {
    def this(props: PaginationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaginationProps, context: js.Any) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MPagination(nextProps: js.Any): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPagination(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPagination(): Unit = js.native
    
    var getId: js.Any = js.native
    
    val getMaxPagesToShow: js.Any = js.native
    
    val handlePageClick: js.Any = js.native
    
    val handlePageInputBlur: js.Any = js.native
    
    val handlePageInputChange: js.Any = js.native
    
    val handlePageInputKeyDown: js.Any = js.native
    
    val handlePageKeyDown: js.Any = js.native
    
    var renderEmptyButton: js.Any = js.native
    
    var renderNavButton: js.Any = js.native
    
    var renderPageCompact: js.Any = js.native
    
    var renderPageForm: js.Any = js.native
    
    var renderPageStrip: js.Any = js.native
    
    var renderPages: js.Any = js.native
    
    var rootNode: js.Any = js.native
    
    @JSName("state")
    var state_Pagination: PageInputHasError = js.native
    
    var updateRootMinWidth: js.Any = js.native
  }
  /* static members */
  object Pagination {
    
    @JSImport("wix-ui-core/src/components/pagination/Pagination", "Pagination")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/pagination/Pagination", "Pagination.defaultProps")
    @js.native
    def defaultProps: PartialPaginationPropsCurrentPage = js.native
    @scala.inline
    def defaultProps_=(x: PartialPaginationPropsCurrentPage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/pagination/Pagination", "Pagination.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def calculateWidth(totalPages: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateWidth")(totalPages.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[String]
  @scala.inline
  def getId(idPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(idPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getId(idPrefix: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getId")(idPrefix.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getId(idPrefix: Unit, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getId")(idPrefix.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixUiCore.wixUiCoreStrings.pages
    - typings.wixUiCore.wixUiCoreStrings.compact
    - typings.wixUiCore.wixUiCoreStrings.input
  */
  trait PaginationMode extends StObject
  object PaginationMode {
    
    @scala.inline
    def Compact: compact = "compact".asInstanceOf[compact]
    
    @scala.inline
    def Input: input = "input".asInstanceOf[input]
    
    @scala.inline
    def Pages: pages = "pages".asInstanceOf[pages]
  }
  
  trait PaginationProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var currentPage: js.UndefOr[Double] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var firstLabel: js.UndefOr[ReactNode] = js.undefined
    
    var gapLabel: js.UndefOr[ReactNode] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var lastLabel: js.UndefOr[ReactNode] = js.undefined
    
    var maxPagesToShow: js.UndefOr[Double] = js.undefined
    
    var nextLabel: js.UndefOr[ReactNode] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, typings.std.Event], Unit]] = js.undefined
    
    var onDoubleClick: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, typings.std.Event], Unit]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, typings.std.Event], Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, typings.std.Event], Unit]] = js.undefined
    
    var pageUrl: js.UndefOr[js.Function1[/* pageNumber */ Double, String]] = js.undefined
    
    var paginationMode: js.UndefOr[pages | input | compact | PaginationMode] = js.undefined
    
    var previousLabel: js.UndefOr[ReactNode] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var showFirstLastNavButtons: js.UndefOr[Boolean] = js.undefined
    
    var showFirstPage: js.UndefOr[Boolean] = js.undefined
    
    var showInputModeTotalPages: js.UndefOr[Boolean] = js.undefined
    
    var showLastPage: js.UndefOr[Boolean] = js.undefined
    
    var showNextLabel: js.UndefOr[Boolean] = js.undefined
    
    var showPreviousLabel: js.UndefOr[Boolean] = js.undefined
    
    var slashLabel: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var totalPages: Double
    
    var updateResponsiveLayout: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PaginationProps {
    
    @scala.inline
    def apply(totalPages: Double): PaginationProps = {
      val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
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
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFirstLabel(value: ReactNode): Self = StObject.set(x, "firstLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstLabelUndefined: Self = StObject.set(x, "firstLabel", js.undefined)
      
      @scala.inline
      def setGapLabel(value: ReactNode): Self = StObject.set(x, "gapLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapLabelUndefined: Self = StObject.set(x, "gapLabel", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLastLabel(value: ReactNode): Self = StObject.set(x, "lastLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastLabelUndefined: Self = StObject.set(x, "lastLabel", js.undefined)
      
      @scala.inline
      def setMaxPagesToShow(value: Double): Self = StObject.set(x, "maxPagesToShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPagesToShowUndefined: Self = StObject.set(x, "maxPagesToShow", js.undefined)
      
      @scala.inline
      def setNextLabel(value: ReactNode): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* event */ Event => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ SyntheticEvent[Element, typings.std.Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: /* event */ SyntheticEvent[Element, typings.std.Event] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: /* event */ SyntheticEvent[Element, typings.std.Event] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* event */ SyntheticEvent[Element, typings.std.Event] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setPageUrl(value: /* pageNumber */ Double => String): Self = StObject.set(x, "pageUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
      
      @scala.inline
      def setPaginationMode(value: pages | input | compact | PaginationMode): Self = StObject.set(x, "paginationMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationModeUndefined: Self = StObject.set(x, "paginationMode", js.undefined)
      
      @scala.inline
      def setPreviousLabel(value: ReactNode): Self = StObject.set(x, "previousLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousLabelUndefined: Self = StObject.set(x, "previousLabel", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setShowFirstLastNavButtons(value: Boolean): Self = StObject.set(x, "showFirstLastNavButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFirstLastNavButtonsUndefined: Self = StObject.set(x, "showFirstLastNavButtons", js.undefined)
      
      @scala.inline
      def setShowFirstPage(value: Boolean): Self = StObject.set(x, "showFirstPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFirstPageUndefined: Self = StObject.set(x, "showFirstPage", js.undefined)
      
      @scala.inline
      def setShowInputModeTotalPages(value: Boolean): Self = StObject.set(x, "showInputModeTotalPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInputModeTotalPagesUndefined: Self = StObject.set(x, "showInputModeTotalPages", js.undefined)
      
      @scala.inline
      def setShowLastPage(value: Boolean): Self = StObject.set(x, "showLastPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLastPageUndefined: Self = StObject.set(x, "showLastPage", js.undefined)
      
      @scala.inline
      def setShowNextLabel(value: Boolean): Self = StObject.set(x, "showNextLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNextLabelUndefined: Self = StObject.set(x, "showNextLabel", js.undefined)
      
      @scala.inline
      def setShowPreviousLabel(value: Boolean): Self = StObject.set(x, "showPreviousLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPreviousLabelUndefined: Self = StObject.set(x, "showPreviousLabel", js.undefined)
      
      @scala.inline
      def setSlashLabel(value: ReactNode): Self = StObject.set(x, "slashLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlashLabelUndefined: Self = StObject.set(x, "slashLabel", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateResponsiveLayout(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "updateResponsiveLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateResponsiveLayoutUndefined: Self = StObject.set(x, "updateResponsiveLayout", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PaginationState extends StObject {
    
    var pageInputHasError: Boolean
    
    var pageInputValue: String
  }
  object PaginationState {
    
    @scala.inline
    def apply(pageInputHasError: Boolean, pageInputValue: String): PaginationState = {
      val __obj = js.Dynamic.literal(pageInputHasError = pageInputHasError.asInstanceOf[js.Any], pageInputValue = pageInputValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationState]
    }
    
    @scala.inline
    implicit class PaginationStateMutableBuilder[Self <: PaginationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageInputHasError(value: Boolean): Self = StObject.set(x, "pageInputHasError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageInputValue(value: String): Self = StObject.set(x, "pageInputValue", value.asInstanceOf[js.Any])
    }
  }
}
