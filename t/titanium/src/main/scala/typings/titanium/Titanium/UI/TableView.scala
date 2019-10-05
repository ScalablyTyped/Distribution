package typings.titanium.Titanium.UI

import typings.titanium.TableViewAnimationProperties
import typings.titanium.TableViewContentInsetOption
import typings.titanium.TableViewEdgeInsets
import typings.titanium.TableViewIndexEntry
import typings.titanium.Titanium.UI.Android.SearchView
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
  var resultsSeparatorInsets: js.Any = js.native
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
  var rowSeparatorInsets: js.Any = js.native
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
  			 */
  var separatorInsets: js.Any = js.native
  /**
  			 * Separator style constant.
  			 */
  var separatorStyle: Double = js.native
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
  var tableSeparatorInsets: js.Any = js.native
  /**
  			 * Appends a single row or an array of rows to the end of the table.
  			 */
  def appendRow(row: js.Any): Unit = js.native
  def appendRow(row: js.Any, animation: TableViewAnimationProperties): Unit = js.native
  /**
  			 * Appends a single section or an array of sections to the end of the table.
  			 */
  def appendSection(section: js.Any): Unit = js.native
  def appendSection(section: js.Any, animation: TableViewAnimationProperties): Unit = js.native
  /**
  			 * Deletes an existing row.
  			 */
  def deleteRow(row: Double): Unit = js.native
  def deleteRow(row: Double, animation: TableViewAnimationProperties): Unit = js.native
  /**
  			 * Deletes an existing row.
  			 */
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
  /**
  			 * Gets the value of the <Titanium.UI.TableView.allowsSelection> property.
  			 */
  def getAllowsSelection(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.allowsSelectionDuringEditing> property.
  			 */
  def getAllowsSelectionDuringEditing(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.data> property.
  			 */
  def getData(): js.Array[TableViewRow | TableViewSection] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.dimBackgroundForSearch> property.
  			 */
  def getDimBackgroundForSearch(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.editable> property.
  			 */
  def getEditable(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.editing> property.
  			 */
  def getEditing(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.filterAnchored> property.
  			 */
  def getFilterAnchored(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.filterAttribute> property.
  			 */
  def getFilterAttribute(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.filterCaseInsensitive> property.
  			 */
  def getFilterCaseInsensitive(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.footerDividersEnabled> property.
  			 */
  def getFooterDividersEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.footerTitle> property.
  			 */
  def getFooterTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.footerView> property.
  			 */
  def getFooterView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.headerDividersEnabled> property.
  			 */
  def getHeaderDividersEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.headerPullView> property.
  			 */
  def getHeaderPullView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.headerTitle> property.
  			 */
  def getHeaderTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.headerView> property.
  			 */
  def getHeaderView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.hideSearchOnSelection> property.
  			 */
  def getHideSearchOnSelection(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.index> property.
  			 */
  def getIndex(): js.Array[TableViewIndexEntry] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.maxClassname> property.
  			 */
  def getMaxClassname(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.maxRowHeight> property.
  			 */
  def getMaxRowHeight(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.minRowHeight> property.
  			 */
  def getMinRowHeight(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.moveable> property.
  			 */
  def getMoveable(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.moving> property.
  			 */
  def getMoving(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.overScrollMode> property.
  			 */
  def getOverScrollMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.refreshControl> property.
  			 */
  def getRefreshControl(): RefreshControl = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.resultsBackgroundColor> property.
  			 */
  def getResultsBackgroundColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.resultsSeparatorColor> property.
  			 */
  def getResultsSeparatorColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.resultsSeparatorInsets> property.
  			 */
  def getResultsSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.resultsSeparatorStyle> property.
  			 */
  def getResultsSeparatorStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.rowHeight> property.
  			 */
  def getRowHeight(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.rowSeparatorInsets> property.
  			 */
  def getRowSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.scrollIndicatorStyle> property.
  			 */
  def getScrollIndicatorStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.scrollable> property.
  			 */
  def getScrollable(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.scrollsToTop> property.
  			 */
  def getScrollsToTop(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.search> property.
  			 */
  def getSearch(): SearchBar | SearchView = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.searchAsChild> property.
  			 */
  def getSearchAsChild(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.searchHidden> property.
  			 */
  def getSearchHidden(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.sectionCount> property.
  			 */
  def getSectionCount(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.sections> property.
  			 */
  def getSections(): js.Array[TableViewSection] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.separatorColor> property.
  			 */
  def getSeparatorColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.separatorInsets> property.
  			 */
  def getSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.separatorStyle> property.
  			 */
  def getSeparatorStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.showVerticalScrollIndicator> property.
  			 */
  def getShowVerticalScrollIndicator(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.style> property.
  			 */
  def getStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.tableSeparatorInsets> property.
  			 */
  def getTableSeparatorInsets(): js.Any = js.native
  /**
  			 * Inserts a row after another row.
  			 */
  def insertRowAfter(index: Double, row: js.Any): Unit = js.native
  def insertRowAfter(index: Double, row: js.Any, animation: TableViewAnimationProperties): Unit = js.native
  /**
  			 * Inserts a row before another row.
  			 */
  def insertRowBefore(index: Double, row: js.Any): Unit = js.native
  def insertRowBefore(index: Double, row: js.Any, animation: TableViewAnimationProperties): Unit = js.native
  /**
  			 * Inserts a section after another section.
  			 */
  def insertSectionAfter(index: Double, section: js.Any): Unit = js.native
  def insertSectionAfter(index: Double, section: js.Any, animation: TableViewAnimationProperties): Unit = js.native
  /**
  			 * Inserts a section before another section.
  			 */
  def insertSectionBefore(index: Double, section: js.Any): Unit = js.native
  def insertSectionBefore(index: Double, section: js.Any, animation: TableViewAnimationProperties): Unit = js.native
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
  			 * Sets the value of the <Titanium.UI.TableView.allowsSelection> property.
  			 */
  def setAllowsSelection(allowsSelection: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.allowsSelectionDuringEditing> property.
  			 */
  def setAllowsSelectionDuringEditing(allowsSelectionDuringEditing: Boolean): Unit = js.native
  /**
  			 * Sets this tableview's content insets.
  			 */
  def setContentInsets(edgeInsets: TableViewEdgeInsets): Unit = js.native
  def setContentInsets(edgeInsets: TableViewEdgeInsets, animated: TableViewContentInsetOption): Unit = js.native
  /**
  			 * Sets the value of the content offset of the table view without animation by default.
  			 */
  def setContentOffset(contentOffset: js.Any): Unit = js.native
  /**
  			 * Sets the data in the table.
  			 */
  def setData(data: js.Any, animation: TableViewAnimationProperties): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.dimBackgroundForSearch> property.
  			 */
  def setDimBackgroundForSearch(dimBackgroundForSearch: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.editable> property.
  			 */
  def setEditable(editable: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.editing> property.
  			 */
  def setEditing(editing: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.filterAnchored> property.
  			 */
  def setFilterAnchored(filterAnchored: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.filterAttribute> property.
  			 */
  def setFilterAttribute(filterAttribute: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.filterCaseInsensitive> property.
  			 */
  def setFilterCaseInsensitive(filterCaseInsensitive: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.footerDividersEnabled> property.
  			 */
  def setFooterDividersEnabled(footerDividersEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.footerTitle> property.
  			 */
  def setFooterTitle(footerTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.footerView> property.
  			 */
  def setFooterView(footerView: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.headerDividersEnabled> property.
  			 */
  def setHeaderDividersEnabled(headerDividersEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the [Titanium.UI.TableView.headerPullView] property.
  			 */
  def setHeaderPullView(view: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.headerTitle> property.
  			 */
  def setHeaderTitle(headerTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.headerView> property.
  			 */
  def setHeaderView(headerView: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.hideSearchOnSelection> property.
  			 */
  def setHideSearchOnSelection(hideSearchOnSelection: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.index> property.
  			 */
  def setIndex(index: js.Array[TableViewIndexEntry]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.maxClassname> property.
  			 */
  def setMaxClassname(maxClassname: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.maxRowHeight> property.
  			 */
  def setMaxRowHeight(maxRowHeight: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.minRowHeight> property.
  			 */
  def setMinRowHeight(minRowHeight: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.moveable> property.
  			 */
  def setMoveable(moveable: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.moving> property.
  			 */
  def setMoving(moving: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.overScrollMode> property.
  			 */
  def setOverScrollMode(overScrollMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.refreshControl> property.
  			 */
  def setRefreshControl(refreshControl: RefreshControl): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.resultsBackgroundColor> property.
  			 */
  def setResultsBackgroundColor(resultsBackgroundColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.resultsSeparatorColor> property.
  			 */
  def setResultsSeparatorColor(resultsSeparatorColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.resultsSeparatorInsets> property.
  			 */
  def setResultsSeparatorInsets(resultsSeparatorInsets: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.resultsSeparatorStyle> property.
  			 */
  def setResultsSeparatorStyle(resultsSeparatorStyle: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.rowHeight> property.
  			 */
  def setRowHeight(rowHeight: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.rowSeparatorInsets> property.
  			 */
  def setRowSeparatorInsets(rowSeparatorInsets: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.scrollIndicatorStyle> property.
  			 */
  def setScrollIndicatorStyle(scrollIndicatorStyle: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.scrollable> property.
  			 */
  def setScrollable(scrollable: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.scrollsToTop> property.
  			 */
  def setScrollsToTop(scrollsToTop: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.search> property.
  			 */
  def setSearch(search: SearchView): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.search> property.
  			 */
  def setSearch(search: SearchBar): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.searchAsChild> property.
  			 */
  def setSearchAsChild(searchAsChild: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.searchHidden> property.
  			 */
  def setSearchHidden(searchHidden: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.sections> property.
  			 */
  def setSections(sections: js.Array[TableViewSection]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.separatorColor> property.
  			 */
  def setSeparatorColor(separatorColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.separatorInsets> property.
  			 */
  def setSeparatorInsets(separatorInsets: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.separatorStyle> property.
  			 */
  def setSeparatorStyle(separatorStyle: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.showVerticalScrollIndicator> property.
  			 */
  def setShowVerticalScrollIndicator(showVerticalScrollIndicator: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.style> property.
  			 */
  def setStyle(style: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.tableSeparatorInsets> property.
  			 */
  def setTableSeparatorInsets(tableSeparatorInsets: js.Any): Unit = js.native
  /**
  			 * Updates an existing row, optionally with animation.
  			 */
  def updateRow(index: Double, row: TableViewRow, animation: TableViewAnimationProperties): Unit = js.native
  /**
  			 * Updates an existing section, optionally with animation.
  			 */
  def updateSection(index: Double, section: TableViewSection, animation: TableViewAnimationProperties): Unit = js.native
}

