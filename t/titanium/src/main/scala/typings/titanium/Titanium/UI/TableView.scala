package typings.titanium.Titanium.UI

import typings.titanium.AnimatedOptions
import typings.titanium.AnimatedWithDurationOptions
import typings.titanium.Dictionary
import typings.titanium.HorizontalInsets
import typings.titanium.Padding
import typings.titanium.Point
import typings.titanium.TableViewAnimationProperties
import typings.titanium.TableViewIndexEntry
import typings.titanium.Titanium.UI.Android.SearchView
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.delete
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.dragend_
import typings.titanium.titaniumStrings.dragstart_
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.indexclick
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.move
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.rowsselected
import typings.titanium.titaniumStrings.scroll
import typings.titanium.titaniumStrings.scrollend
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A table view is used to present information, organized in sections and rows, in a
  * vertically-scrolling view.
  */
@js.native
trait TableView extends View {
  /**
    * Determines whether multiple items of this table view can be selected at the same time while editing the table.
    */
  var allowsMultipleSelectionDuringEditing: Boolean = js.native
  /**
    * Allows a two-finger pan gesture to automatically transition the table view into editing mode and start selecting rows.
    */
  var allowsMultipleSelectionInteraction: Boolean = js.native
  /**
    * Determines whether this table's rows can be selected.
    */
  var allowsSelection: Boolean = js.native
  /**
    * Determines whether this table's rows can be selected while editing the table.
    */
  var allowsSelectionDuringEditing: Boolean = js.native
  /**
    * Rows of the table view.
    */
  var data: js.Array[TableViewRow | TableViewSection] = js.native
  /**
    * A Boolean indicating whether the underlying content is dimmed during a search.
    */
  var dimBackgroundForSearch: Boolean = js.native
  /**
    * Determines the rows' default editable behavior, which allows them to be deleted by the user
    * when the table is in `editing` or `moving` mode.
    */
  var editable: Boolean = js.native
  /**
    * Determines whether row editing mode is active.
    */
  var editing: Boolean = js.native
  /**
    * Determines whether the search is limited to the start of the string
    */
  var filterAnchored: Boolean = js.native
  /**
    * Filter attribute to be used when searching.
    */
  var filterAttribute: String = js.native
  /**
    * Determines whether the search is case insensitive.
    */
  var filterCaseInsensitive: Boolean = js.native
  /**
    * When set to false, the ListView will not draw the divider before the footer view.
    */
  var footerDividersEnabled: Boolean = js.native
  /**
    * Table view footer title.
    */
  var footerTitle: String = js.native
  /**
    * Table view footer as a view that will be rendered instead of a label.
    */
  var footerView: View = js.native
  /**
    * When set to false, the ListView will not draw the divider after the header view.
    */
  var headerDividersEnabled: Boolean = js.native
  /**
    * View positioned above the first row that is only revealed when the user drags the table
    * contents down.
    */
  var headerPullView: View = js.native
  /**
    * Table view header title.
    */
  var headerTitle: String = js.native
  /**
    * Table view header as a view that will be rendered instead of a label.
    */
  var headerView: View = js.native
  /**
    * Determines whether the search field should hide on completion.
    */
  var hideSearchOnSelection: Boolean = js.native
  /**
    * Array of objects (with `title` and `index` properties) to control the table view index.
    */
  var index: js.Array[TableViewIndexEntry] = js.native
  /**
    * Max number of row class names.
    */
  var maxClassname: Double = js.native
  /**
    * Maximum row height for table view rows.
    */
  var maxRowHeight: Double = js.native
  /**
    * Minimum row height for table view rows.
    */
  var minRowHeight: Double = js.native
  /**
    * Determines the rows' default moveable behavior, which allows them to be re-ordered by the
    * user when the table is in `editing` or `moving` mode.
    */
  var moveable: Boolean = js.native
  /**
    * Determines whether row moving mode is active.
    */
  var moving: Boolean = js.native
  /**
    * Determines the behavior when the user overscrolls the view.
    */
  var overScrollMode: Double = js.native
  /**
    * View positioned above the first row that is only revealed when the user drags the list view contents down.
    */
  var refreshControl: RefreshControl = js.native
  /**
    * The background color of the search results (iOS-only).
    */
  var resultsBackgroundColor: String = js.native
  /**
    * Separator line color between rows inside search results,
    * as a color name or hex triplet (iOS-only).
    */
  var resultsSeparatorColor: String = js.native
  /**
    * The insets for search results separators (applies to all cells & iOS-only).
    */
  var resultsSeparatorInsets: HorizontalInsets = js.native
  /**
    * The separator style of the search results (iOS-only).
    */
  var resultsSeparatorStyle: Double = js.native
  /**
    * Default row height for table view rows.
    */
  var rowHeight: Double = js.native
  /**
    * The insets for table view cells (applies to all cells).
    */
  var rowSeparatorInsets: HorizontalInsets = js.native
  /**
    * Style of the scrollbar.
    */
  var scrollIndicatorStyle: Double = js.native
  /**
    * If `true`, the tableview can be scrolled.
    */
  var scrollable: Boolean = js.native
  /**
    * Controls whether the scroll-to-top gesture is effective.
    */
  var scrollsToTop: Boolean = js.native
  /**
    * Search field to use for the table view.
    */
  var search: SearchBar | SearchView = js.native
  /**
    * Determines whether the [SearchBar](Titanium.UI.SearchBar) or [SearchView](Titanium.UI.Android.SearchView) appears as part of the TableView.
    */
  var searchAsChild: Boolean = js.native
  /**
    * Determines whether the search field is visible.
    */
  var searchHidden: Boolean = js.native
  /**
    * Number of sections in this table view.
    */
  val sectionCount: Double = js.native
  /**
    * Sections of this table.
    */
  var sections: js.Array[TableViewSection] = js.native
  /**
    * Separator line color between rows, as a color name or hex triplet.
    */
  var separatorColor: String = js.native
  /**
    * The insets for table view separators (applies to all cells).
    * @deprecated Use [Titanium.UI.TableView.tableSeparatorInsets](Titanium.UI.TableView.tableSeparatorInsets) instead.
    */
  var separatorInsets: HorizontalInsets = js.native
  /**
    * Separator style constant.
    */
  var separatorStyle: Double = js.native
  /**
    * A Boolean indicating whether search bar will be in navigation bar.
    */
  var showSearchBarInNavBar: Boolean = js.native
  /**
    * Determines whether this table view displays a vertical scroll indicator.
    */
  var showVerticalScrollIndicator: Boolean = js.native
  /**
    * Style of the table view, specified using one of the constants from
    * <Titanium.UI.iOS.TableViewStyle>.
    */
  var style: Double = js.native
  /**
    * The insets for the table view header and footer.
    */
  var tableSeparatorInsets: HorizontalInsets = js.native
  @JSName("addEventListener")
  def addEventListener_delete(
    name: delete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewDeleteEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    name: dragend_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewDragendEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    name: dragstart_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewDragstartEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_indexclick(
    name: indexclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewIndexclickEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_move(name: move, callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewMoveEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsselected(
    name: rowsselected,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewRowsselectedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    name: scroll,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewScrollEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollend(
    name: scrollend,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewScrollendEvent, Unit]
  ): Unit = js.native
  def appendRow(row: js.Array[Dictionary[TableViewRow] | TableViewRow]): Unit = js.native
  def appendRow(row: js.Array[Dictionary[TableViewRow] | TableViewRow], animation: TableViewAnimationProperties): Unit = js.native
  def appendRow(row: Dictionary[TableViewRow]): Unit = js.native
  def appendRow(row: Dictionary[TableViewRow], animation: TableViewAnimationProperties): Unit = js.native
  /**
    * Appends a single row or an array of rows to the end of the table.
    */
  def appendRow(row: TableViewRow): Unit = js.native
  def appendRow(row: TableViewRow, animation: TableViewAnimationProperties): Unit = js.native
  def appendSection(section: js.Array[Dictionary[TableViewSection] | TableViewSection]): Unit = js.native
  def appendSection(
    section: js.Array[Dictionary[TableViewSection] | TableViewSection],
    animation: TableViewAnimationProperties
  ): Unit = js.native
  def appendSection(section: Dictionary[TableViewSection]): Unit = js.native
  def appendSection(section: Dictionary[TableViewSection], animation: TableViewAnimationProperties): Unit = js.native
  /**
    * Appends a single section or an array of sections to the end of the table.
    */
  def appendSection(section: TableViewSection): Unit = js.native
  def appendSection(section: TableViewSection, animation: TableViewAnimationProperties): Unit = js.native
  /**
    * Deletes an existing row.
    */
  def deleteRow(row: Double): Unit = js.native
  def deleteRow(row: Double, animation: TableViewAnimationProperties): Unit = js.native
  def deleteRow(row: TableViewRow): Unit = js.native
  def deleteRow(row: TableViewRow, animation: TableViewAnimationProperties): Unit = js.native
  /**
    * Deletes an existing section.
    */
  def deleteSection(section: Double): Unit = js.native
  def deleteSection(section: Double, animation: TableViewAnimationProperties): Unit = js.native
  /**
    * Programmatically deselects a row.
    */
  def deselectRow(row: Double): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: TableViewClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: TableViewDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_delete(name: delete): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_delete(name: delete, event: TableViewDeleteEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: TableViewDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragend(name: dragend_): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragend(name: dragend_, event: TableViewDragendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragstart(name: dragstart_): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragstart(name: dragstart_, event: TableViewDragstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: TableViewFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_indexclick(name: indexclick): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_indexclick(name: indexclick, event: TableViewIndexclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: TableViewKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: TableViewLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: TableViewLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_move(name: move): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_move(name: move, event: TableViewMoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: TableViewPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: TableViewPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_rowsselected(name: rowsselected): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_rowsselected(name: rowsselected, event: TableViewRowsselectedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scroll(name: scroll): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scroll(name: scroll, event: TableViewScrollEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scrollend(name: scrollend): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scrollend(name: scrollend, event: TableViewScrollendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: TableViewSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: TableViewSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: TableViewTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: TableViewTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: TableViewTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: TableViewTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: TableViewTwofingertapEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.allowsMultipleSelectionDuringEditing> property.
    * @deprecated Access <Titanium.UI.TableView.allowsMultipleSelectionDuringEditing> instead.
    */
  def getAllowsMultipleSelectionDuringEditing(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.allowsMultipleSelectionInteraction> property.
    * @deprecated Access <Titanium.UI.TableView.allowsMultipleSelectionInteraction> instead.
    */
  def getAllowsMultipleSelectionInteraction(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.allowsSelection> property.
    * @deprecated Access <Titanium.UI.TableView.allowsSelection> instead.
    */
  def getAllowsSelection(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.allowsSelectionDuringEditing> property.
    * @deprecated Access <Titanium.UI.TableView.allowsSelectionDuringEditing> instead.
    */
  def getAllowsSelectionDuringEditing(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.data> property.
    * @deprecated Access <Titanium.UI.TableView.data> instead.
    */
  def getData(): js.Array[TableViewRow | TableViewSection] = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.dimBackgroundForSearch> property.
    * @deprecated Access <Titanium.UI.TableView.dimBackgroundForSearch> instead.
    */
  def getDimBackgroundForSearch(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.editable> property.
    * @deprecated Access <Titanium.UI.TableView.editable> instead.
    */
  def getEditable(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.editing> property.
    * @deprecated Access <Titanium.UI.TableView.editing> instead.
    */
  def getEditing(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.filterAnchored> property.
    * @deprecated Access <Titanium.UI.TableView.filterAnchored> instead.
    */
  def getFilterAnchored(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.filterAttribute> property.
    * @deprecated Access <Titanium.UI.TableView.filterAttribute> instead.
    */
  def getFilterAttribute(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.filterCaseInsensitive> property.
    * @deprecated Access <Titanium.UI.TableView.filterCaseInsensitive> instead.
    */
  def getFilterCaseInsensitive(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.footerDividersEnabled> property.
    * @deprecated Access <Titanium.UI.TableView.footerDividersEnabled> instead.
    */
  def getFooterDividersEnabled(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.footerTitle> property.
    * @deprecated Access <Titanium.UI.TableView.footerTitle> instead.
    */
  def getFooterTitle(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.footerView> property.
    * @deprecated Access <Titanium.UI.TableView.footerView> instead.
    */
  def getFooterView(): View = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.headerDividersEnabled> property.
    * @deprecated Access <Titanium.UI.TableView.headerDividersEnabled> instead.
    */
  def getHeaderDividersEnabled(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.headerPullView> property.
    * @deprecated Access <Titanium.UI.TableView.headerPullView> instead.
    */
  def getHeaderPullView(): View = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.headerTitle> property.
    * @deprecated Access <Titanium.UI.TableView.headerTitle> instead.
    */
  def getHeaderTitle(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.headerView> property.
    * @deprecated Access <Titanium.UI.TableView.headerView> instead.
    */
  def getHeaderView(): View = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.hideSearchOnSelection> property.
    * @deprecated Access <Titanium.UI.TableView.hideSearchOnSelection> instead.
    */
  def getHideSearchOnSelection(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.index> property.
    * @deprecated Access <Titanium.UI.TableView.index> instead.
    */
  def getIndex(): js.Array[TableViewIndexEntry] = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.maxClassname> property.
    * @deprecated Access <Titanium.UI.TableView.maxClassname> instead.
    */
  def getMaxClassname(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.maxRowHeight> property.
    * @deprecated Access <Titanium.UI.TableView.maxRowHeight> instead.
    */
  def getMaxRowHeight(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.minRowHeight> property.
    * @deprecated Access <Titanium.UI.TableView.minRowHeight> instead.
    */
  def getMinRowHeight(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.moveable> property.
    * @deprecated Access <Titanium.UI.TableView.moveable> instead.
    */
  def getMoveable(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.moving> property.
    * @deprecated Access <Titanium.UI.TableView.moving> instead.
    */
  def getMoving(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.overScrollMode> property.
    * @deprecated Access <Titanium.UI.TableView.overScrollMode> instead.
    */
  def getOverScrollMode(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.refreshControl> property.
    * @deprecated Access <Titanium.UI.TableView.refreshControl> instead.
    */
  def getRefreshControl(): RefreshControl = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.resultsBackgroundColor> property.
    * @deprecated Access <Titanium.UI.TableView.resultsBackgroundColor> instead.
    */
  def getResultsBackgroundColor(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.resultsSeparatorColor> property.
    * @deprecated Access <Titanium.UI.TableView.resultsSeparatorColor> instead.
    */
  def getResultsSeparatorColor(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.resultsSeparatorInsets> property.
    * @deprecated Access <Titanium.UI.TableView.resultsSeparatorInsets> instead.
    */
  def getResultsSeparatorInsets(): HorizontalInsets = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.resultsSeparatorStyle> property.
    * @deprecated Access <Titanium.UI.TableView.resultsSeparatorStyle> instead.
    */
  def getResultsSeparatorStyle(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.rowHeight> property.
    * @deprecated Access <Titanium.UI.TableView.rowHeight> instead.
    */
  def getRowHeight(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.rowSeparatorInsets> property.
    * @deprecated Access <Titanium.UI.TableView.rowSeparatorInsets> instead.
    */
  def getRowSeparatorInsets(): HorizontalInsets = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.scrollIndicatorStyle> property.
    * @deprecated Access <Titanium.UI.TableView.scrollIndicatorStyle> instead.
    */
  def getScrollIndicatorStyle(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.scrollable> property.
    * @deprecated Access <Titanium.UI.TableView.scrollable> instead.
    */
  def getScrollable(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.scrollsToTop> property.
    * @deprecated Access <Titanium.UI.TableView.scrollsToTop> instead.
    */
  def getScrollsToTop(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.search> property.
    * @deprecated Access <Titanium.UI.TableView.search> instead.
    */
  def getSearch(): SearchBar | SearchView = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.searchAsChild> property.
    * @deprecated Access <Titanium.UI.TableView.searchAsChild> instead.
    */
  def getSearchAsChild(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.searchHidden> property.
    * @deprecated Access <Titanium.UI.TableView.searchHidden> instead.
    */
  def getSearchHidden(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.sectionCount> property.
    * @deprecated Access <Titanium.UI.TableView.sectionCount> instead.
    */
  def getSectionCount(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.sections> property.
    * @deprecated Access <Titanium.UI.TableView.sections> instead.
    */
  def getSections(): js.Array[TableViewSection] = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.separatorColor> property.
    * @deprecated Access <Titanium.UI.TableView.separatorColor> instead.
    */
  def getSeparatorColor(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.separatorInsets> property.
    * @deprecated Use [Titanium.UI.TableView.tableSeparatorInsets](Titanium.UI.TableView.tableSeparatorInsets) instead.
    */
  def getSeparatorInsets(): HorizontalInsets = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.separatorStyle> property.
    * @deprecated Access <Titanium.UI.TableView.separatorStyle> instead.
    */
  def getSeparatorStyle(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.showSearchBarInNavBar> property.
    * @deprecated Access <Titanium.UI.TableView.showSearchBarInNavBar> instead.
    */
  def getShowSearchBarInNavBar(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.showVerticalScrollIndicator> property.
    * @deprecated Access <Titanium.UI.TableView.showVerticalScrollIndicator> instead.
    */
  def getShowVerticalScrollIndicator(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.style> property.
    * @deprecated Access <Titanium.UI.TableView.style> instead.
    */
  def getStyle(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.TableView.tableSeparatorInsets> property.
    * @deprecated Access <Titanium.UI.TableView.tableSeparatorInsets> instead.
    */
  def getTableSeparatorInsets(): HorizontalInsets = js.native
  def insertRowAfter(index: Double, row: Dictionary[TableViewRow]): Unit = js.native
  def insertRowAfter(index: Double, row: Dictionary[TableViewRow], animation: TableViewAnimationProperties): Unit = js.native
  /**
    * Inserts a row after another row.
    */
  def insertRowAfter(index: Double, row: TableViewRow): Unit = js.native
  def insertRowAfter(index: Double, row: TableViewRow, animation: TableViewAnimationProperties): Unit = js.native
  def insertRowBefore(index: Double, row: Dictionary[TableViewRow]): Unit = js.native
  def insertRowBefore(index: Double, row: Dictionary[TableViewRow], animation: TableViewAnimationProperties): Unit = js.native
  /**
    * Inserts a row before another row.
    */
  def insertRowBefore(index: Double, row: TableViewRow): Unit = js.native
  def insertRowBefore(index: Double, row: TableViewRow, animation: TableViewAnimationProperties): Unit = js.native
  def insertSectionAfter(index: Double, section: Dictionary[TableViewSection]): Unit = js.native
  def insertSectionAfter(index: Double, section: Dictionary[TableViewSection], animation: TableViewAnimationProperties): Unit = js.native
  /**
    * Inserts a section after another section.
    */
  def insertSectionAfter(index: Double, section: TableViewSection): Unit = js.native
  def insertSectionAfter(index: Double, section: TableViewSection, animation: TableViewAnimationProperties): Unit = js.native
  def insertSectionBefore(index: Double, section: Dictionary[TableViewSection]): Unit = js.native
  def insertSectionBefore(index: Double, section: Dictionary[TableViewSection], animation: TableViewAnimationProperties): Unit = js.native
  /**
    * Inserts a section before another section.
    */
  def insertSectionBefore(index: Double, section: TableViewSection): Unit = js.native
  def insertSectionBefore(index: Double, section: TableViewSection, animation: TableViewAnimationProperties): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_delete(
    name: delete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewDeleteEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    name: dragend_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewDragendEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    name: dragstart_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewDragstartEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_indexclick(
    name: indexclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewIndexclickEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_move(name: move, callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewMoveEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rowsselected(
    name: rowsselected,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewRowsselectedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    name: scroll,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewScrollEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scrollend(
    name: scrollend,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TableViewScrollendEvent, Unit]
  ): Unit = js.native
  /**
    * Scrolls the table view to ensure that the specified row is on screen.
    */
  def scrollToIndex(index: Double): Unit = js.native
  def scrollToIndex(index: Double, animation: TableViewAnimationProperties): Unit = js.native
  /**
    * Scrolls the table to a specific top position where 0 is the topmost y position in the
    * table view.
    */
  def scrollToTop(top: Double): Unit = js.native
  def scrollToTop(top: Double, animation: TableViewAnimationProperties): Unit = js.native
  /**
    * Programmatically selects a row. In Android, it sets the currently selected item. If in touch mode,
    * the item will not be selected but it will still be positioned appropriately. If the specified
    * selection position is less than 0, then the item at position 0 will be selected.
    */
  def selectRow(row: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.allowsMultipleSelectionDuringEditing> property.
    * @deprecated Set the value using <Titanium.UI.TableView.allowsMultipleSelectionDuringEditing> instead.
    */
  def setAllowsMultipleSelectionDuringEditing(allowsMultipleSelectionDuringEditing: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.allowsMultipleSelectionInteraction> property.
    * @deprecated Set the value using <Titanium.UI.TableView.allowsMultipleSelectionInteraction> instead.
    */
  def setAllowsMultipleSelectionInteraction(allowsMultipleSelectionInteraction: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.allowsSelection> property.
    * @deprecated Set the value using <Titanium.UI.TableView.allowsSelection> instead.
    */
  def setAllowsSelection(allowsSelection: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.allowsSelectionDuringEditing> property.
    * @deprecated Set the value using <Titanium.UI.TableView.allowsSelectionDuringEditing> instead.
    */
  def setAllowsSelectionDuringEditing(allowsSelectionDuringEditing: Boolean): Unit = js.native
  /**
    * Sets this tableview's content insets.
    */
  def setContentInsets(edgeInsets: Padding): Unit = js.native
  def setContentInsets(edgeInsets: Padding, options: AnimatedWithDurationOptions): Unit = js.native
  /**
    * Sets the value of the content offset of the table view without animation by default.
    */
  def setContentOffset(contentOffset: Point): Unit = js.native
  def setContentOffset(contentOffset: Point, options: AnimatedOptions): Unit = js.native
  /**
    * Sets the data in the table.
    */
  def setData(data: js.Array[Dictionary[TableViewRow] | TableViewRow | TableViewSection]): Unit = js.native
  def setData(
    data: js.Array[Dictionary[TableViewRow] | TableViewRow | TableViewSection],
    animation: TableViewAnimationProperties
  ): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.dimBackgroundForSearch> property.
    * @deprecated Set the value using <Titanium.UI.TableView.dimBackgroundForSearch> instead.
    */
  def setDimBackgroundForSearch(dimBackgroundForSearch: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.editable> property.
    * @deprecated Set the value using <Titanium.UI.TableView.editable> instead.
    */
  def setEditable(editable: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.editing> property.
    * @deprecated Set the value using <Titanium.UI.TableView.editing> instead.
    */
  def setEditing(editing: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.filterAnchored> property.
    * @deprecated Set the value using <Titanium.UI.TableView.filterAnchored> instead.
    */
  def setFilterAnchored(filterAnchored: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.filterAttribute> property.
    * @deprecated Set the value using <Titanium.UI.TableView.filterAttribute> instead.
    */
  def setFilterAttribute(filterAttribute: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.filterCaseInsensitive> property.
    * @deprecated Set the value using <Titanium.UI.TableView.filterCaseInsensitive> instead.
    */
  def setFilterCaseInsensitive(filterCaseInsensitive: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.footerDividersEnabled> property.
    * @deprecated Set the value using <Titanium.UI.TableView.footerDividersEnabled> instead.
    */
  def setFooterDividersEnabled(footerDividersEnabled: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.footerTitle> property.
    * @deprecated Set the value using <Titanium.UI.TableView.footerTitle> instead.
    */
  def setFooterTitle(footerTitle: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.footerView> property.
    * @deprecated Set the value using <Titanium.UI.TableView.footerView> instead.
    */
  def setFooterView(footerView: View): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.headerDividersEnabled> property.
    * @deprecated Set the value using <Titanium.UI.TableView.headerDividersEnabled> instead.
    */
  def setHeaderDividersEnabled(headerDividersEnabled: Boolean): Unit = js.native
  /**
    * Sets the value of the [Titanium.UI.TableView.headerPullView] property.
    */
  def setHeaderPullView(view: View): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.headerTitle> property.
    * @deprecated Set the value using <Titanium.UI.TableView.headerTitle> instead.
    */
  def setHeaderTitle(headerTitle: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.headerView> property.
    * @deprecated Set the value using <Titanium.UI.TableView.headerView> instead.
    */
  def setHeaderView(headerView: View): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.hideSearchOnSelection> property.
    * @deprecated Set the value using <Titanium.UI.TableView.hideSearchOnSelection> instead.
    */
  def setHideSearchOnSelection(hideSearchOnSelection: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.index> property.
    * @deprecated Set the value using <Titanium.UI.TableView.index> instead.
    */
  def setIndex(index: js.Array[TableViewIndexEntry]): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.maxClassname> property.
    * @deprecated Set the value using <Titanium.UI.TableView.maxClassname> instead.
    */
  def setMaxClassname(maxClassname: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.maxRowHeight> property.
    * @deprecated Set the value using <Titanium.UI.TableView.maxRowHeight> instead.
    */
  def setMaxRowHeight(maxRowHeight: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.minRowHeight> property.
    * @deprecated Set the value using <Titanium.UI.TableView.minRowHeight> instead.
    */
  def setMinRowHeight(minRowHeight: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.moveable> property.
    * @deprecated Set the value using <Titanium.UI.TableView.moveable> instead.
    */
  def setMoveable(moveable: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.moving> property.
    * @deprecated Set the value using <Titanium.UI.TableView.moving> instead.
    */
  def setMoving(moving: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.overScrollMode> property.
    * @deprecated Set the value using <Titanium.UI.TableView.overScrollMode> instead.
    */
  def setOverScrollMode(overScrollMode: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.refreshControl> property.
    * @deprecated Set the value using <Titanium.UI.TableView.refreshControl> instead.
    */
  def setRefreshControl(refreshControl: RefreshControl): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.resultsBackgroundColor> property.
    * @deprecated Set the value using <Titanium.UI.TableView.resultsBackgroundColor> instead.
    */
  def setResultsBackgroundColor(resultsBackgroundColor: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.resultsSeparatorColor> property.
    * @deprecated Set the value using <Titanium.UI.TableView.resultsSeparatorColor> instead.
    */
  def setResultsSeparatorColor(resultsSeparatorColor: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.resultsSeparatorInsets> property.
    * @deprecated Set the value using <Titanium.UI.TableView.resultsSeparatorInsets> instead.
    */
  def setResultsSeparatorInsets(resultsSeparatorInsets: HorizontalInsets): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.resultsSeparatorStyle> property.
    * @deprecated Set the value using <Titanium.UI.TableView.resultsSeparatorStyle> instead.
    */
  def setResultsSeparatorStyle(resultsSeparatorStyle: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.rowHeight> property.
    * @deprecated Set the value using <Titanium.UI.TableView.rowHeight> instead.
    */
  def setRowHeight(rowHeight: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.rowSeparatorInsets> property.
    * @deprecated Set the value using <Titanium.UI.TableView.rowSeparatorInsets> instead.
    */
  def setRowSeparatorInsets(rowSeparatorInsets: HorizontalInsets): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.scrollIndicatorStyle> property.
    * @deprecated Set the value using <Titanium.UI.TableView.scrollIndicatorStyle> instead.
    */
  def setScrollIndicatorStyle(scrollIndicatorStyle: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.scrollable> property.
    * @deprecated Set the value using <Titanium.UI.TableView.scrollable> instead.
    */
  def setScrollable(scrollable: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.scrollsToTop> property.
    * @deprecated Set the value using <Titanium.UI.TableView.scrollsToTop> instead.
    */
  def setScrollsToTop(scrollsToTop: Boolean): Unit = js.native
  def setSearch(search: SearchView): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.search> property.
    * @deprecated Set the value using <Titanium.UI.TableView.search> instead.
    */
  def setSearch(search: SearchBar): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.searchAsChild> property.
    * @deprecated Set the value using <Titanium.UI.TableView.searchAsChild> instead.
    */
  def setSearchAsChild(searchAsChild: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.searchHidden> property.
    * @deprecated Set the value using <Titanium.UI.TableView.searchHidden> instead.
    */
  def setSearchHidden(searchHidden: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.sections> property.
    * @deprecated Set the value using <Titanium.UI.TableView.sections> instead.
    */
  def setSections(sections: js.Array[TableViewSection]): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.separatorColor> property.
    * @deprecated Set the value using <Titanium.UI.TableView.separatorColor> instead.
    */
  def setSeparatorColor(separatorColor: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.separatorInsets> property.
    * @deprecated Use [Titanium.UI.TableView.tableSeparatorInsets](Titanium.UI.TableView.tableSeparatorInsets) instead.
    */
  def setSeparatorInsets(separatorInsets: HorizontalInsets): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.separatorStyle> property.
    * @deprecated Set the value using <Titanium.UI.TableView.separatorStyle> instead.
    */
  def setSeparatorStyle(separatorStyle: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.showSearchBarInNavBar> property.
    * @deprecated Set the value using <Titanium.UI.TableView.showSearchBarInNavBar> instead.
    */
  def setShowSearchBarInNavBar(showSearchBarInNavBar: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.showVerticalScrollIndicator> property.
    * @deprecated Set the value using <Titanium.UI.TableView.showVerticalScrollIndicator> instead.
    */
  def setShowVerticalScrollIndicator(showVerticalScrollIndicator: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.style> property.
    * @deprecated Set the value using <Titanium.UI.TableView.style> instead.
    */
  def setStyle(style: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableView.tableSeparatorInsets> property.
    * @deprecated Set the value using <Titanium.UI.TableView.tableSeparatorInsets> instead.
    */
  def setTableSeparatorInsets(tableSeparatorInsets: HorizontalInsets): Unit = js.native
  /**
    * Updates an existing row, optionally with animation.
    */
  def updateRow(index: Double, row: TableViewRow, animation: TableViewAnimationProperties): Unit = js.native
  /**
    * Updates an existing section, optionally with animation.
    */
  def updateSection(index: Double, section: TableViewSection, animation: TableViewAnimationProperties): Unit = js.native
}

