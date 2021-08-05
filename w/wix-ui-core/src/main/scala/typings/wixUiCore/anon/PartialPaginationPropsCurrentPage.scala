package typings.wixUiCore.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.wixUiCore.srcComponentsPaginationPaginationMod.PaginationMode
import typings.wixUiCore.wixUiCoreStrings.compact
import typings.wixUiCore.wixUiCoreStrings.input
import typings.wixUiCore.wixUiCoreStrings.pages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-ui-core.wix-ui-core/src/components/pagination/Pagination.PaginationProps> */
trait PartialPaginationPropsCurrentPage extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var currentPage: js.UndefOr[Double] = js.undefined
  
  var `data-hook`: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var firstLabel: js.UndefOr[ReactNode] = js.undefined
  
  var gapLabel: js.UndefOr[ReactNode] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var lastLabel: js.UndefOr[ReactNode] = js.undefined
  
  var maxPagesToShow: js.UndefOr[Double] = js.undefined
  
  var nextLabel: js.UndefOr[ReactNode] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[typings.std.Element, typings.std.Event], Unit]
  ] = js.undefined
  
  var onDoubleClick: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[typings.std.Element, typings.std.Event], Unit]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[typings.std.Element, typings.std.Event], Unit]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[typings.std.Element, typings.std.Event], Unit]
  ] = js.undefined
  
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
  
  var totalPages: js.UndefOr[Double] = js.undefined
  
  var updateResponsiveLayout: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PartialPaginationPropsCurrentPage {
  
  inline def apply(): PartialPaginationPropsCurrentPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaginationPropsCurrentPage]
  }
  
  extension [Self <: PartialPaginationPropsCurrentPage](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
    
    inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFirstLabel(value: ReactNode): Self = StObject.set(x, "firstLabel", value.asInstanceOf[js.Any])
    
    inline def setFirstLabelUndefined: Self = StObject.set(x, "firstLabel", js.undefined)
    
    inline def setGapLabel(value: ReactNode): Self = StObject.set(x, "gapLabel", value.asInstanceOf[js.Any])
    
    inline def setGapLabelUndefined: Self = StObject.set(x, "gapLabel", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastLabel(value: ReactNode): Self = StObject.set(x, "lastLabel", value.asInstanceOf[js.Any])
    
    inline def setLastLabelUndefined: Self = StObject.set(x, "lastLabel", js.undefined)
    
    inline def setMaxPagesToShow(value: Double): Self = StObject.set(x, "maxPagesToShow", value.asInstanceOf[js.Any])
    
    inline def setMaxPagesToShowUndefined: Self = StObject.set(x, "maxPagesToShow", js.undefined)
    
    inline def setNextLabel(value: ReactNode): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
    
    inline def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
    
    inline def setOnChange(value: /* event */ Event => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: /* event */ SyntheticEvent[typings.std.Element, typings.std.Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnDoubleClick(value: /* event */ SyntheticEvent[typings.std.Element, typings.std.Event] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnMouseEnter(value: /* event */ SyntheticEvent[typings.std.Element, typings.std.Event] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: /* event */ SyntheticEvent[typings.std.Element, typings.std.Event] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setPageUrl(value: /* pageNumber */ Double => String): Self = StObject.set(x, "pageUrl", js.Any.fromFunction1(value))
    
    inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    
    inline def setPaginationMode(value: pages | input | compact | PaginationMode): Self = StObject.set(x, "paginationMode", value.asInstanceOf[js.Any])
    
    inline def setPaginationModeUndefined: Self = StObject.set(x, "paginationMode", js.undefined)
    
    inline def setPreviousLabel(value: ReactNode): Self = StObject.set(x, "previousLabel", value.asInstanceOf[js.Any])
    
    inline def setPreviousLabelUndefined: Self = StObject.set(x, "previousLabel", js.undefined)
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setShowFirstLastNavButtons(value: Boolean): Self = StObject.set(x, "showFirstLastNavButtons", value.asInstanceOf[js.Any])
    
    inline def setShowFirstLastNavButtonsUndefined: Self = StObject.set(x, "showFirstLastNavButtons", js.undefined)
    
    inline def setShowFirstPage(value: Boolean): Self = StObject.set(x, "showFirstPage", value.asInstanceOf[js.Any])
    
    inline def setShowFirstPageUndefined: Self = StObject.set(x, "showFirstPage", js.undefined)
    
    inline def setShowInputModeTotalPages(value: Boolean): Self = StObject.set(x, "showInputModeTotalPages", value.asInstanceOf[js.Any])
    
    inline def setShowInputModeTotalPagesUndefined: Self = StObject.set(x, "showInputModeTotalPages", js.undefined)
    
    inline def setShowLastPage(value: Boolean): Self = StObject.set(x, "showLastPage", value.asInstanceOf[js.Any])
    
    inline def setShowLastPageUndefined: Self = StObject.set(x, "showLastPage", js.undefined)
    
    inline def setShowNextLabel(value: Boolean): Self = StObject.set(x, "showNextLabel", value.asInstanceOf[js.Any])
    
    inline def setShowNextLabelUndefined: Self = StObject.set(x, "showNextLabel", js.undefined)
    
    inline def setShowPreviousLabel(value: Boolean): Self = StObject.set(x, "showPreviousLabel", value.asInstanceOf[js.Any])
    
    inline def setShowPreviousLabelUndefined: Self = StObject.set(x, "showPreviousLabel", js.undefined)
    
    inline def setSlashLabel(value: ReactNode): Self = StObject.set(x, "slashLabel", value.asInstanceOf[js.Any])
    
    inline def setSlashLabelUndefined: Self = StObject.set(x, "slashLabel", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    inline def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
    
    inline def setUpdateResponsiveLayout(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "updateResponsiveLayout", js.Any.fromFunction1(value))
    
    inline def setUpdateResponsiveLayoutUndefined: Self = StObject.set(x, "updateResponsiveLayout", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
