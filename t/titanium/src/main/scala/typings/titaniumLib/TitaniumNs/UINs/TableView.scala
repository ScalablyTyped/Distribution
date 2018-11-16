package typings
package titaniumLib.TitaniumNs.UINs

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
  var allowsSelection: scala.Boolean = js.native
  /**
  			 * Determines whether this table's rows can be selected while editing the table.
  			 */
  var allowsSelectionDuringEditing: scala.Boolean = js.native
  /**
  			 * Rows of the table view.
  			 */
  var data: js.Array[TableViewRow] | js.Array[TableViewSection] = js.native
  /**
  			 * A Boolean indicating whether the underlying content is dimmed during a search.
  			 */
  var dimBackgroundForSearch: scala.Boolean = js.native
  /**
  			 * Determines the rows' default editable behavior, which allows them to be deleted by the user
  			 * when the table is in `editing` or `moving` mode.
  			 */
  var editable: scala.Boolean = js.native
  /**
  			 * Determines whether row editing mode is active.
  			 */
  var editing: scala.Boolean = js.native
  /**
  			 * Determines whether the search is limited to the start of the string
  			 */
  var filterAnchored: scala.Boolean = js.native
  /**
  			 * Filter attribute to be used when searching.
  			 */
  var filterAttribute: java.lang.String = js.native
  /**
  			 * Determines whether the search is case insensitive.
  			 */
  var filterCaseInsensitive: scala.Boolean = js.native
  /**
  			 * When set to false, the ListView will not draw the divider before the footer view.
  			 */
  var footerDividersEnabled: scala.Boolean = js.native
  /**
  			 * Table view footer title.
  			 */
  var footerTitle: java.lang.String = js.native
  /**
  			 * Table view footer as a view that will be rendered instead of a label.
  			 */
  var footerView: View = js.native
  /**
  			 * When set to false, the ListView will not draw the divider after the header view.
  			 */
  var headerDividersEnabled: scala.Boolean = js.native
  /**
  			 * View positioned above the first row that is only revealed when the user drags the table
  			 * contents down.
  			 */
  var headerPullView: View = js.native
  /**
  			 * Table view header title.
  			 */
  var headerTitle: java.lang.String = js.native
  /**
  			 * Table view header as a view that will be rendered instead of a label.
  			 */
  var headerView: View = js.native
  /**
  			 * Determines whether the search field should hide on completion.
  			 */
  var hideSearchOnSelection: scala.Boolean = js.native
  /**
  			 * Array of objects (with `title` and `index` properties) to control the table view index.
  			 */
  var index: js.Array[titaniumLib.TableViewIndexEntry] = js.native
  /**
  			 * Max number of row class names.
  			 */
  var maxClassname: scala.Double = js.native
  /**
  			 * Maximum row height for table view rows.
  			 */
  var maxRowHeight: scala.Double = js.native
  /**
  			 * Minimum row height for table view rows.
  			 */
  var minRowHeight: scala.Double = js.native
  /**
  			 * Determines the rows' default moveable behavior, which allows them to be re-ordered by the
  			 * user when the table is in `editing` or `moving` mode.
  			 */
  var moveable: scala.Boolean = js.native
  /**
  			 * Determines whether row moving mode is active.
  			 */
  var moving: scala.Boolean = js.native
  /**
  			 * Determines the behavior when the user overscrolls the view.
  			 */
  var overScrollMode: scala.Double = js.native
  /**
  			 * View positioned above the first row that is only revealed when the user drags the list view contents down.
  			 */
  var refreshControl: RefreshControl = js.native
  /**
  			 * The background color of the search results (iOS-only).
  			 */
  var resultsBackgroundColor: java.lang.String = js.native
  /**
  			 * Separator line color between rows inside search results,
  			 * as a color name or hex triplet (iOS-only).
  			 */
  var resultsSeparatorColor: java.lang.String = js.native
  /**
  			 * The insets for search results separators (applies to all cells & iOS-only).
  			 */
  var resultsSeparatorInsets: js.Any = js.native
  /**
  			 * The separator style of the search results (iOS-only).
  			 */
  var resultsSeparatorStyle: scala.Double = js.native
  /**
  			 * Default row height for table view rows.
  			 */
  var rowHeight: scala.Double = js.native
  /**
  			 * The insets for table view cells (applies to all cells).
  			 */
  var rowSeparatorInsets: js.Any = js.native
  /**
  			 * Style of the scrollbar.
  			 */
  var scrollIndicatorStyle: scala.Double = js.native
  /**
  			 * If `true`, the tableview can be scrolled.
  			 */
  var scrollable: scala.Boolean = js.native
  /**
  			 * Controls whether the scroll-to-top gesture is effective.
  			 */
  var scrollsToTop: scala.Boolean = js.native
  /**
  			 * Search field to use for the table view.
  			 */
  var search: SearchBar | titaniumLib.TitaniumNs.UINs.AndroidNs.SearchView = js.native
  /**
  			 * Determines whether the [SearchBar](Titanium.UI.SearchBar) or [SearchView](Titanium.UI.Android.SearchView) appears as part of the TableView.
  			 */
  var searchAsChild: scala.Boolean = js.native
  /**
  			 * Determines whether the search field is visible.
  			 */
  var searchHidden: scala.Boolean = js.native
  /**
  			 * Number of sections in this table view.
  			 */
  val sectionCount: scala.Double = js.native
  /**
  			 * Sections of this table.
  			 */
  var sections: js.Array[TableViewSection] = js.native
  /**
  			 * Separator line color between rows, as a color name or hex triplet.
  			 */
  var separatorColor: java.lang.String = js.native
  /**
  			 * The insets for table view separators (applies to all cells).
  			 */
  var separatorInsets: js.Any = js.native
  /**
  			 * Separator style constant.
  			 */
  var separatorStyle: scala.Double = js.native
  /**
  			 * Determines whether this table view displays a vertical scroll indicator.
  			 */
  var showVerticalScrollIndicator: scala.Boolean = js.native
  /**
  			 * Style of the table view, specified using one of the constants from
  			 * <Titanium.UI.iOS.TableViewStyle>.
  			 */
  var style: scala.Double = js.native
  /**
  			 * The insets for the table view header and footer.
  			 */
  var tableSeparatorInsets: js.Any = js.native
  /**
  			 * Appends a single row or an array of rows to the end of the table.
  			 */
  def appendRow(row: js.Any): scala.Unit = js.native
  /**
  			 * Appends a single row or an array of rows to the end of the table.
  			 */
  def appendRow(row: js.Any, animation: titaniumLib.TableViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Appends a single section or an array of sections to the end of the table.
  			 */
  def appendSection(section: js.Any): scala.Unit = js.native
  /**
  			 * Appends a single section or an array of sections to the end of the table.
  			 */
  def appendSection(section: js.Any, animation: titaniumLib.TableViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Deletes an existing row.
  			 */
  def deleteRow(row: scala.Double): scala.Unit = js.native
  /**
  			 * Deletes an existing row.
  			 */
  def deleteRow(row: scala.Double, animation: titaniumLib.TableViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Deletes an existing row.
  			 */
  def deleteRow(row: TableViewRow): scala.Unit = js.native
  /**
  			 * Deletes an existing row.
  			 */
  def deleteRow(row: TableViewRow, animation: titaniumLib.TableViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Deletes an existing section.
  			 */
  def deleteSection(section: scala.Double): scala.Unit = js.native
  /**
  			 * Deletes an existing section.
  			 */
  def deleteSection(section: scala.Double, animation: titaniumLib.TableViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Programmatically deselects a row.
  			 */
  def deselectRow(row: scala.Double): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.allowsSelection> property.
  			 */
  def getAllowsSelection(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.allowsSelectionDuringEditing> property.
  			 */
  def getAllowsSelectionDuringEditing(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.data> property.
  			 */
  def getData(): js.Array[TableViewRow] | js.Array[TableViewSection] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.dimBackgroundForSearch> property.
  			 */
  def getDimBackgroundForSearch(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.editable> property.
  			 */
  def getEditable(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.editing> property.
  			 */
  def getEditing(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.filterAnchored> property.
  			 */
  def getFilterAnchored(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.filterAttribute> property.
  			 */
  def getFilterAttribute(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.filterCaseInsensitive> property.
  			 */
  def getFilterCaseInsensitive(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.footerDividersEnabled> property.
  			 */
  def getFooterDividersEnabled(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.footerTitle> property.
  			 */
  def getFooterTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.footerView> property.
  			 */
  def getFooterView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.headerDividersEnabled> property.
  			 */
  def getHeaderDividersEnabled(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.headerPullView> property.
  			 */
  def getHeaderPullView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.headerTitle> property.
  			 */
  def getHeaderTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.headerView> property.
  			 */
  def getHeaderView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.hideSearchOnSelection> property.
  			 */
  def getHideSearchOnSelection(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.index> property.
  			 */
  def getIndex(): js.Array[titaniumLib.TableViewIndexEntry] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.maxClassname> property.
  			 */
  def getMaxClassname(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.maxRowHeight> property.
  			 */
  def getMaxRowHeight(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.minRowHeight> property.
  			 */
  def getMinRowHeight(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.moveable> property.
  			 */
  def getMoveable(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.moving> property.
  			 */
  def getMoving(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.overScrollMode> property.
  			 */
  def getOverScrollMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.refreshControl> property.
  			 */
  def getRefreshControl(): RefreshControl = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.resultsBackgroundColor> property.
  			 */
  def getResultsBackgroundColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.resultsSeparatorColor> property.
  			 */
  def getResultsSeparatorColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.resultsSeparatorInsets> property.
  			 */
  def getResultsSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.resultsSeparatorStyle> property.
  			 */
  def getResultsSeparatorStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.rowHeight> property.
  			 */
  def getRowHeight(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.rowSeparatorInsets> property.
  			 */
  def getRowSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.scrollIndicatorStyle> property.
  			 */
  def getScrollIndicatorStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.scrollable> property.
  			 */
  def getScrollable(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.scrollsToTop> property.
  			 */
  def getScrollsToTop(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.search> property.
  			 */
  def getSearch(): SearchBar | titaniumLib.TitaniumNs.UINs.AndroidNs.SearchView = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.searchAsChild> property.
  			 */
  def getSearchAsChild(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.searchHidden> property.
  			 */
  def getSearchHidden(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.sectionCount> property.
  			 */
  def getSectionCount(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.sections> property.
  			 */
  def getSections(): js.Array[TableViewSection] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.separatorColor> property.
  			 */
  def getSeparatorColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.separatorInsets> property.
  			 */
  def getSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.separatorStyle> property.
  			 */
  def getSeparatorStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.showVerticalScrollIndicator> property.
  			 */
  def getShowVerticalScrollIndicator(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.style> property.
  			 */
  def getStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableView.tableSeparatorInsets> property.
  			 */
  def getTableSeparatorInsets(): js.Any = js.native
  /**
  			 * Inserts a row after another row.
  			 */
  def insertRowAfter(index: scala.Double, row: js.Any): scala.Unit = js.native
  /**
  			 * Inserts a row after another row.
  			 */
  def insertRowAfter(index: scala.Double, row: js.Any, animation: titaniumLib.TableViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Inserts a row before another row.
  			 */
  def insertRowBefore(index: scala.Double, row: js.Any): scala.Unit = js.native
  /**
  			 * Inserts a row before another row.
  			 */
  def insertRowBefore(index: scala.Double, row: js.Any, animation: titaniumLib.TableViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Inserts a section after another section.
  			 */
  def insertSectionAfter(index: scala.Double, section: js.Any): scala.Unit = js.native
  /**
  			 * Inserts a section after another section.
  			 */
  def insertSectionAfter(index: scala.Double, section: js.Any, animation: titaniumLib.TableViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Inserts a section before another section.
  			 */
  def insertSectionBefore(index: scala.Double, section: js.Any): scala.Unit = js.native
  /**
  			 * Inserts a section before another section.
  			 */
  def insertSectionBefore(index: scala.Double, section: js.Any, animation: titaniumLib.TableViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Scrolls the table view to ensure that the specified row is on screen.
  			 */
  def scrollToIndex(index: scala.Double): scala.Unit = js.native
  /**
  			 * Scrolls the table view to ensure that the specified row is on screen.
  			 */
  def scrollToIndex(index: scala.Double, animation: titaniumLib.TableViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Scrolls the table to a specific top position where 0 is the topmost y position in the
  			 * table view.
  			 */
  def scrollToTop(top: scala.Double): scala.Unit = js.native
  /**
  			 * Scrolls the table to a specific top position where 0 is the topmost y position in the
  			 * table view.
  			 */
  def scrollToTop(top: scala.Double, animation: titaniumLib.TableViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Programmatically selects a row. In Android, it sets the currently selected item. If in touch mode,
  			 * the item will not be selected but it will still be positioned appropriately. If the specified
  			 * selection position is less than 0, then the item at position 0 will be selected.
  			 */
  def selectRow(row: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.allowsSelection> property.
  			 */
  def setAllowsSelection(allowsSelection: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.allowsSelectionDuringEditing> property.
  			 */
  def setAllowsSelectionDuringEditing(allowsSelectionDuringEditing: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets this tableview's content insets.
  			 */
  def setContentInsets(edgeInsets: titaniumLib.TableViewEdgeInsets): scala.Unit = js.native
  /**
  			 * Sets this tableview's content insets.
  			 */
  def setContentInsets(edgeInsets: titaniumLib.TableViewEdgeInsets, animated: titaniumLib.TableViewContentInsetOption): scala.Unit = js.native
  /**
  			 * Sets the value of the content offset of the table view without animation by default.
  			 */
  def setContentOffset(contentOffset: js.Any): scala.Unit = js.native
  /**
  			 * Sets the data in the table.
  			 */
  def setData(data: js.Any, animation: titaniumLib.TableViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.data> property.
  			 */
  def setData(data: js.Array[TableViewRow | TableViewSection]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.dimBackgroundForSearch> property.
  			 */
  def setDimBackgroundForSearch(dimBackgroundForSearch: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.editable> property.
  			 */
  def setEditable(editable: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.editing> property.
  			 */
  def setEditing(editing: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.filterAnchored> property.
  			 */
  def setFilterAnchored(filterAnchored: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.filterAttribute> property.
  			 */
  def setFilterAttribute(filterAttribute: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.filterCaseInsensitive> property.
  			 */
  def setFilterCaseInsensitive(filterCaseInsensitive: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.footerDividersEnabled> property.
  			 */
  def setFooterDividersEnabled(footerDividersEnabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.footerTitle> property.
  			 */
  def setFooterTitle(footerTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.footerView> property.
  			 */
  def setFooterView(footerView: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.headerDividersEnabled> property.
  			 */
  def setHeaderDividersEnabled(headerDividersEnabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the [Titanium.UI.TableView.headerPullView] property.
  			 */
  def setHeaderPullView(view: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.headerTitle> property.
  			 */
  def setHeaderTitle(headerTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.headerView> property.
  			 */
  def setHeaderView(headerView: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.hideSearchOnSelection> property.
  			 */
  def setHideSearchOnSelection(hideSearchOnSelection: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.index> property.
  			 */
  def setIndex(index: js.Array[titaniumLib.TableViewIndexEntry]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.maxClassname> property.
  			 */
  def setMaxClassname(maxClassname: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.maxRowHeight> property.
  			 */
  def setMaxRowHeight(maxRowHeight: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.minRowHeight> property.
  			 */
  def setMinRowHeight(minRowHeight: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.moveable> property.
  			 */
  def setMoveable(moveable: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.moving> property.
  			 */
  def setMoving(moving: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.overScrollMode> property.
  			 */
  def setOverScrollMode(overScrollMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.refreshControl> property.
  			 */
  def setRefreshControl(refreshControl: RefreshControl): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.resultsBackgroundColor> property.
  			 */
  def setResultsBackgroundColor(resultsBackgroundColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.resultsSeparatorColor> property.
  			 */
  def setResultsSeparatorColor(resultsSeparatorColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.resultsSeparatorInsets> property.
  			 */
  def setResultsSeparatorInsets(resultsSeparatorInsets: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.resultsSeparatorStyle> property.
  			 */
  def setResultsSeparatorStyle(resultsSeparatorStyle: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.rowHeight> property.
  			 */
  def setRowHeight(rowHeight: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.rowSeparatorInsets> property.
  			 */
  def setRowSeparatorInsets(rowSeparatorInsets: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.scrollIndicatorStyle> property.
  			 */
  def setScrollIndicatorStyle(scrollIndicatorStyle: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.scrollable> property.
  			 */
  def setScrollable(scrollable: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.scrollsToTop> property.
  			 */
  def setScrollsToTop(scrollsToTop: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.search> property.
  			 */
  def setSearch(search: titaniumLib.TitaniumNs.UINs.AndroidNs.SearchView): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.search> property.
  			 */
  def setSearch(search: SearchBar): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.searchAsChild> property.
  			 */
  def setSearchAsChild(searchAsChild: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.searchHidden> property.
  			 */
  def setSearchHidden(searchHidden: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.sections> property.
  			 */
  def setSections(sections: js.Array[TableViewSection]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.separatorColor> property.
  			 */
  def setSeparatorColor(separatorColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.separatorInsets> property.
  			 */
  def setSeparatorInsets(separatorInsets: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.separatorStyle> property.
  			 */
  def setSeparatorStyle(separatorStyle: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.showVerticalScrollIndicator> property.
  			 */
  def setShowVerticalScrollIndicator(showVerticalScrollIndicator: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.style> property.
  			 */
  def setStyle(style: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableView.tableSeparatorInsets> property.
  			 */
  def setTableSeparatorInsets(tableSeparatorInsets: js.Any): scala.Unit = js.native
  /**
  			 * Updates an existing row, optionally with animation.
  			 */
  def updateRow(index: scala.Double, row: TableViewRow, animation: titaniumLib.TableViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Updates an existing section, optionally with animation.
  			 */
  def updateSection(
    index: scala.Double,
    section: TableViewSection,
    animation: titaniumLib.TableViewAnimationProperties
  ): scala.Unit = js.native
}

