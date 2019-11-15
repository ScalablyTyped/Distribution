package typings.titanium.Titanium.UI

import typings.titanium.ListItemEventType
import typings.titanium.ListViewAnimationProperties
import typings.titanium.ListViewContentInsetOption
import typings.titanium.ListViewEdgeInsets
import typings.titanium.ListViewIndexEntry
import typings.titanium.ListViewMarkerProps
import typings.titanium.Titanium.UI.Android.SearchView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A list view is used to present information, organized in to sections and items,
		 * in a vertically-scrolling view.
		 */
@js.native
trait ListView extends View {
  /**
  			 * Determines whether multiple items of this list view can be selected at the same time while editing the table.
  			 */
  var allowsMultipleSelectionDuringEditing: Boolean = js.native
  /**
  			 * Determines whether this item can be selected.
  			 */
  var allowsSelection: Boolean = js.native
  /**
  			 * Determines whether this list view items can be selected while editing the table.
  			 */
  var allowsSelectionDuringEditing: Boolean = js.native
  /**
  			 * Determines if the list view can scroll in response to user actions.
  			 */
  var canScroll: Boolean = js.native
  /**
  			 * Determines if the search performed is case insensitive.
  			 */
  var caseInsensitiveSearch: Boolean = js.native
  /**
  			 * Sets the default template for list data items that do not specify the `template` property.
  			 */
  var defaultItemTemplate: String | Double = js.native
  /**
  			 * A Boolean indicating whether the underlying content is dimmed during a search.
  			 */
  var dimBackgroundForSearch: Boolean = js.native
  /**
  			 * Determines whether the scroll-bounce of the list view should be disabled.
  			 */
  var disableBounce: Boolean = js.native
  /**
  			 * Determines if the list view is currently in editing mode.
  			 */
  var editing: Boolean = js.native
  /**
  			 * Sets the fastScroll mode on Android ListViews.
  			 */
  var fastScroll: Boolean = js.native
  /**
  			 * When set to false, the ListView will not draw the divider before the footer view.
  			 */
  var footerDividersEnabled: Boolean = js.native
  /**
  			 * List view footer title.
  			 */
  var footerTitle: String = js.native
  /**
  			 * List view footer as a view that will be rendered instead of a label.
  			 */
  var footerView: View = js.native
  /**
  			 * When set to false, the ListView will not draw the divider after the header view.
  			 */
  var headerDividersEnabled: Boolean = js.native
  /**
  			 * List view header title.
  			 */
  var headerTitle: String = js.native
  /**
  			 * List view header as a view that will be rendered instead of a label.
  			 */
  var headerView: View = js.native
  /**
  			 * Determines if the section information is displayed in the search results when using the `searchText` property.
  			 */
  var keepSectionsInSearch: Boolean = js.native
  /**
  			 * The manner in which the keyboard is dismissed when a drag begins in the list view.
  			 */
  var keyboardDismissMode: Double = js.native
  /**
  			 * Determines if the list view should use lazy loading to load remote images.
  			 */
  var lazyLoadingEnabled: Boolean = js.native
  /**
  			 * The insets for the list view header and footer.
  			 */
  var listSeparatorInsets: js.Any = js.native
  /**
  			 * Determines if empty sections are retained when the user completes editing the list view.
  			 */
  var pruneSectionsOnEdit: Boolean = js.native
  /**
  			 * View positioned above the first row that is only revealed when the user drags the list view contents down.
  			 */
  var pullView: View = js.native
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
  			 * The insets for list view cells (applies to all cells).
  			 */
  var rowSeparatorInsets: js.Any = js.native
  /**
  			 * Style of the scrollbar.
  			 */
  var scrollIndicatorStyle: Double = js.native
  /**
  			 * The string to use as the search parameter.
  			 */
  var searchText: String = js.native
  /**
  			 * Search field to use for the list view.
  			 */
  var searchView: SearchBar | SearchView = js.native
  /**
  			 * Number of sections in this list view.
  			 */
  val sectionCount: Double = js.native
  /**
  			 * Array of objects (with `title` and `index` properties) to control the list view index.
  			 */
  var sectionIndexTitles: js.Array[ListViewIndexEntry] = js.native
  /**
  			 * Sections of this list.
  			 */
  var sections: js.Array[ListSection] = js.native
  /**
  			 * Returns the selected list view items.
  			 */
  var selectedItems: js.Array[ListItemEventType] = js.native
  /**
  			 * Separator line color between items, as a color name or hex triplet.
  			 */
  var separatorColor: String = js.native
  /**
  			 * height of the ListView separator.
  			 */
  var separatorHeight: String | Double = js.native
  /**
  			 * The insets for list view separators (applies to all cells).
  			 */
  var separatorInsets: js.Any = js.native
  /**
  			 * Separator style constant.
  			 */
  var separatorStyle: Double = js.native
  /**
  			 * Determines whether this list view displays a vertical scroll indicator.
  			 */
  var showVerticalScrollIndicator: Boolean = js.native
  /**
  			 * Style of the list view.
  			 */
  var style: Double = js.native
  /**
  			 * The insets for the table view header and footer.
  			 */
  var tableSeparatorInsets: js.Any = js.native
  /**
  			 * Contain key-value pairs mapping a style name (key) to an <ItemTemplate> (value).
  			 */
  var templates: js.Any = js.native
  /**
  			 * Controls the scroll-to-top gesture.
  			 */
  var willScrollOnStatusTap: Boolean = js.native
  /**
  			 * Adds a reference item in the list view.
  			 */
  def addMarker(markerProps: ListViewMarkerProps): Unit = js.native
  /**
  			 * Appends a single section or an array of sections to the end of the list.
  			 */
  def appendSection(section: js.Array[ListSection]): Unit = js.native
  def appendSection(section: js.Array[ListSection], animation: ListViewAnimationProperties): Unit = js.native
  /**
  			 * Appends a single section or an array of sections to the end of the list.
  			 */
  def appendSection(section: ListSection): Unit = js.native
  def appendSection(section: ListSection, animation: ListViewAnimationProperties): Unit = js.native
  /**
  			 * Deletes an existing section.
  			 */
  def deleteSectionAt(sectionIndex: Double): Unit = js.native
  def deleteSectionAt(sectionIndex: Double, animation: ListViewAnimationProperties): Unit = js.native
  /**
  			 * Deselects a specific item.
  			 */
  def deselectItem(sectionIndex: Double, itemIndex: Double): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.allowsMultipleSelectionDuringEditing> property.
  			 */
  def getAllowsMultipleSelectionDuringEditing(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.allowsSelection> property.
  			 */
  def getAllowsSelection(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.allowsSelectionDuringEditing> property.
  			 */
  def getAllowsSelectionDuringEditing(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.canScroll> property.
  			 */
  def getCanScroll(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.caseInsensitiveSearch> property.
  			 */
  def getCaseInsensitiveSearch(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.defaultItemTemplate> property.
  			 */
  def getDefaultItemTemplate(): String | Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.dimBackgroundForSearch> property.
  			 */
  def getDimBackgroundForSearch(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.disableBounce> property.
  			 */
  def getDisableBounce(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.editing> property.
  			 */
  def getEditing(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.fastScroll> property.
  			 */
  def getFastScroll(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.footerDividersEnabled> property.
  			 */
  def getFooterDividersEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.footerTitle> property.
  			 */
  def getFooterTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.footerView> property.
  			 */
  def getFooterView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.headerDividersEnabled> property.
  			 */
  def getHeaderDividersEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.headerTitle> property.
  			 */
  def getHeaderTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.headerView> property.
  			 */
  def getHeaderView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.keepSectionsInSearch> property.
  			 */
  def getKeepSectionsInSearch(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.keyboardDismissMode> property.
  			 */
  def getKeyboardDismissMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.lazyLoadingEnabled> property.
  			 */
  def getLazyLoadingEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.listSeparatorInsets> property.
  			 */
  def getListSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.pruneSectionsOnEdit> property.
  			 */
  def getPruneSectionsOnEdit(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.pullView> property.
  			 */
  def getPullView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.refreshControl> property.
  			 */
  def getRefreshControl(): RefreshControl = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.resultsBackgroundColor> property.
  			 */
  def getResultsBackgroundColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.resultsSeparatorColor> property.
  			 */
  def getResultsSeparatorColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.resultsSeparatorInsets> property.
  			 */
  def getResultsSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.resultsSeparatorStyle> property.
  			 */
  def getResultsSeparatorStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.rowSeparatorInsets> property.
  			 */
  def getRowSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.scrollIndicatorStyle> property.
  			 */
  def getScrollIndicatorStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.searchText> property.
  			 */
  def getSearchText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.searchView> property.
  			 */
  def getSearchView(): SearchBar | SearchView = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.sectionCount> property.
  			 */
  def getSectionCount(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.sectionIndexTitles> property.
  			 */
  def getSectionIndexTitles(): js.Array[ListViewIndexEntry] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.sections> property.
  			 */
  def getSections(): js.Array[ListSection] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.selectedItems> property.
  			 */
  def getSelectedItems(): js.Array[ListItemEventType] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.separatorColor> property.
  			 */
  def getSeparatorColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.separatorHeight> property.
  			 */
  def getSeparatorHeight(): String | Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.separatorInsets> property.
  			 */
  def getSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.separatorStyle> property.
  			 */
  def getSeparatorStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.showVerticalScrollIndicator> property.
  			 */
  def getShowVerticalScrollIndicator(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.style> property.
  			 */
  def getStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.tableSeparatorInsets> property.
  			 */
  def getTableSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.templates> property.
  			 */
  def getTemplates(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.willScrollOnStatusTap> property.
  			 */
  def getWillScrollOnStatusTap(): Boolean = js.native
  /**
  			 * Inserts a section or an array of sections at a specific index.
  			 */
  def insertSectionAt(sectionIndex: Double, section: js.Array[ListSection]): Unit = js.native
  def insertSectionAt(sectionIndex: Double, section: js.Array[ListSection], animation: ListViewAnimationProperties): Unit = js.native
  /**
  			 * Inserts a section or an array of sections at a specific index.
  			 */
  def insertSectionAt(sectionIndex: Double, section: ListSection): Unit = js.native
  def insertSectionAt(sectionIndex: Double, section: ListSection, animation: ListViewAnimationProperties): Unit = js.native
  /**
  			 * Replaces an existing section.
  			 */
  def replaceSectionAt(sectionIndex: Double, section: ListSection): Unit = js.native
  def replaceSectionAt(sectionIndex: Double, section: ListSection, animation: ListViewAnimationProperties): Unit = js.native
  /**
  			 * Scrolls to a specific item.
  			 */
  def scrollToItem(sectionIndex: Double, itemIndex: Double): Unit = js.native
  def scrollToItem(sectionIndex: Double, itemIndex: Double, animation: ListViewAnimationProperties): Unit = js.native
  /**
  			 * Selects an item in the list using the specified item and section indices.
  			 */
  def selectItem(sectionIndex: Double, itemIndex: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.allowsMultipleSelectionDuringEditing> property.
  			 */
  def setAllowsMultipleSelectionDuringEditing(allowsMultipleSelectionDuringEditing: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.allowsSelection> property.
  			 */
  def setAllowsSelection(allowsSelection: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.allowsSelectionDuringEditing> property.
  			 */
  def setAllowsSelectionDuringEditing(allowsSelectionDuringEditing: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.canScroll> property.
  			 */
  def setCanScroll(canScroll: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.caseInsensitiveSearch> property.
  			 */
  def setCaseInsensitiveSearch(caseInsensitiveSearch: Boolean): Unit = js.native
  /**
  			 * Sets this list view's content insets.
  			 */
  def setContentInsets(edgeInsets: ListViewEdgeInsets): Unit = js.native
  def setContentInsets(edgeInsets: ListViewEdgeInsets, animated: ListViewContentInsetOption): Unit = js.native
  /**
  			 * Sets the value of the content offset of the list view without animation by default.
  			 */
  def setContentOffset(contentOffset: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.defaultItemTemplate> property.
  			 */
  def setDefaultItemTemplate(defaultItemTemplate: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.defaultItemTemplate> property.
  			 */
  def setDefaultItemTemplate(defaultItemTemplate: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.dimBackgroundForSearch> property.
  			 */
  def setDimBackgroundForSearch(dimBackgroundForSearch: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.disableBounce> property.
  			 */
  def setDisableBounce(disableBounce: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.editing> property.
  			 */
  def setEditing(editing: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.fastScroll> property.
  			 */
  def setFastScroll(fastScroll: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.footerDividersEnabled> property.
  			 */
  def setFooterDividersEnabled(footerDividersEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.footerTitle> property.
  			 */
  def setFooterTitle(footerTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.footerView> property.
  			 */
  def setFooterView(footerView: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.headerDividersEnabled> property.
  			 */
  def setHeaderDividersEnabled(headerDividersEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.headerTitle> property.
  			 */
  def setHeaderTitle(headerTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.headerView> property.
  			 */
  def setHeaderView(headerView: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.keepSectionsInSearch> property.
  			 */
  def setKeepSectionsInSearch(keepSectionsInSearch: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.keyboardDismissMode> property.
  			 */
  def setKeyboardDismissMode(keyboardDismissMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.lazyLoadingEnabled> property.
  			 */
  def setLazyLoadingEnabled(lazyLoadingEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.listSeparatorInsets> property.
  			 */
  def setListSeparatorInsets(listSeparatorInsets: js.Any): Unit = js.native
  /**
  			 * Sets a reference item in the list view.
  			 */
  def setMarker(markerProps: ListViewMarkerProps): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.pruneSectionsOnEdit> property.
  			 */
  def setPruneSectionsOnEdit(pruneSectionsOnEdit: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.pullView> property.
  			 */
  def setPullView(pullView: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.refreshControl> property.
  			 */
  def setRefreshControl(refreshControl: RefreshControl): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.resultsBackgroundColor> property.
  			 */
  def setResultsBackgroundColor(resultsBackgroundColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.resultsSeparatorColor> property.
  			 */
  def setResultsSeparatorColor(resultsSeparatorColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.resultsSeparatorInsets> property.
  			 */
  def setResultsSeparatorInsets(resultsSeparatorInsets: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.resultsSeparatorStyle> property.
  			 */
  def setResultsSeparatorStyle(resultsSeparatorStyle: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.rowSeparatorInsets> property.
  			 */
  def setRowSeparatorInsets(rowSeparatorInsets: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.scrollIndicatorStyle> property.
  			 */
  def setScrollIndicatorStyle(scrollIndicatorStyle: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.searchText> property.
  			 */
  def setSearchText(searchText: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.searchView> property.
  			 */
  def setSearchView(searchView: SearchView): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.searchView> property.
  			 */
  def setSearchView(searchView: SearchBar): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.sectionIndexTitles> property.
  			 */
  def setSectionIndexTitles(sectionIndexTitles: js.Array[ListViewIndexEntry]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.sections> property.
  			 */
  def setSections(sections: js.Array[ListSection]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.selectedItems> property.
  			 */
  def setSelectedItems(selectedItems: js.Array[ListItemEventType]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.separatorColor> property.
  			 */
  def setSeparatorColor(separatorColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.separatorHeight> property.
  			 */
  def setSeparatorHeight(separatorHeight: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.separatorHeight> property.
  			 */
  def setSeparatorHeight(separatorHeight: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.separatorInsets> property.
  			 */
  def setSeparatorInsets(separatorInsets: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.separatorStyle> property.
  			 */
  def setSeparatorStyle(separatorStyle: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.showVerticalScrollIndicator> property.
  			 */
  def setShowVerticalScrollIndicator(showVerticalScrollIndicator: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.style> property.
  			 */
  def setStyle(style: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.tableSeparatorInsets> property.
  			 */
  def setTableSeparatorInsets(tableSeparatorInsets: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.templates> property.
  			 */
  def setTemplates(templates: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.willScrollOnStatusTap> property.
  			 */
  def setWillScrollOnStatusTap(willScrollOnStatusTap: Boolean): Unit = js.native
}

