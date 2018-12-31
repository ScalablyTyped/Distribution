package typings
package titaniumLib.TitaniumNs.UINs

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
  var allowsMultipleSelectionDuringEditing: scala.Boolean = js.native
  /**
  			 * Determines whether this item can be selected.
  			 */
  var allowsSelection: scala.Boolean = js.native
  /**
  			 * Determines whether this list view items can be selected while editing the table.
  			 */
  var allowsSelectionDuringEditing: scala.Boolean = js.native
  /**
  			 * Determines if the list view can scroll in response to user actions.
  			 */
  var canScroll: scala.Boolean = js.native
  /**
  			 * Determines if the search performed is case insensitive.
  			 */
  var caseInsensitiveSearch: scala.Boolean = js.native
  /**
  			 * Sets the default template for list data items that do not specify the `template` property.
  			 */
  var defaultItemTemplate: java.lang.String | scala.Double = js.native
  /**
  			 * A Boolean indicating whether the underlying content is dimmed during a search.
  			 */
  var dimBackgroundForSearch: scala.Boolean = js.native
  /**
  			 * Determines whether the scroll-bounce of the list view should be disabled.
  			 */
  var disableBounce: scala.Boolean = js.native
  /**
  			 * Determines if the list view is currently in editing mode.
  			 */
  var editing: scala.Boolean = js.native
  /**
  			 * When set to false, the ListView will not draw the divider before the footer view.
  			 */
  var footerDividersEnabled: scala.Boolean = js.native
  /**
  			 * List view footer title.
  			 */
  var footerTitle: java.lang.String = js.native
  /**
  			 * List view footer as a view that will be rendered instead of a label.
  			 */
  var footerView: View = js.native
  /**
  			 * When set to false, the ListView will not draw the divider after the header view.
  			 */
  var headerDividersEnabled: scala.Boolean = js.native
  /**
  			 * List view header title.
  			 */
  var headerTitle: java.lang.String = js.native
  /**
  			 * List view header as a view that will be rendered instead of a label.
  			 */
  var headerView: View = js.native
  /**
  			 * Determines if the section information is displayed in the search results when using the `searchText` property.
  			 */
  var keepSectionsInSearch: scala.Boolean = js.native
  /**
  			 * The manner in which the keyboard is dismissed when a drag begins in the list view.
  			 */
  var keyboardDismissMode: scala.Double = js.native
  /**
  			 * Determines if the list view should use lazy loading to load remote images.
  			 */
  var lazyLoadingEnabled: scala.Boolean = js.native
  /**
  			 * The insets for the list view header and footer.
  			 */
  var listSeparatorInsets: js.Any = js.native
  /**
  			 * Determines if empty sections are retained when the user completes editing the list view.
  			 */
  var pruneSectionsOnEdit: scala.Boolean = js.native
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
  			 * The insets for list view cells (applies to all cells).
  			 */
  var rowSeparatorInsets: js.Any = js.native
  /**
  			 * Style of the scrollbar.
  			 */
  var scrollIndicatorStyle: scala.Double = js.native
  /**
  			 * The string to use as the search parameter.
  			 */
  var searchText: java.lang.String = js.native
  /**
  			 * Search field to use for the list view.
  			 */
  var searchView: SearchBar | titaniumLib.TitaniumNs.UINs.AndroidNs.SearchView = js.native
  /**
  			 * Number of sections in this list view.
  			 */
  val sectionCount: scala.Double = js.native
  /**
  			 * Array of objects (with `title` and `index` properties) to control the list view index.
  			 */
  var sectionIndexTitles: js.Array[titaniumLib.ListViewIndexEntry] = js.native
  /**
  			 * Sections of this list.
  			 */
  var sections: js.Array[ListSection] = js.native
  /**
  			 * Returns the selected list view items.
  			 */
  var selectedItems: js.Array[titaniumLib.ListItemEventType] = js.native
  /**
  			 * Separator line color between items, as a color name or hex triplet.
  			 */
  var separatorColor: java.lang.String = js.native
  /**
  			 * height of the ListView separator.
  			 */
  var separatorHeight: java.lang.String | scala.Double = js.native
  /**
  			 * The insets for list view separators (applies to all cells).
  			 */
  var separatorInsets: js.Any = js.native
  /**
  			 * Separator style constant.
  			 */
  var separatorStyle: scala.Double = js.native
  /**
  			 * Determines whether this list view displays a vertical scroll indicator.
  			 */
  var showVerticalScrollIndicator: scala.Boolean = js.native
  /**
  			 * Style of the list view.
  			 */
  var style: scala.Double = js.native
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
  var willScrollOnStatusTap: scala.Boolean = js.native
  /**
  			 * Adds a reference item in the list view.
  			 */
  def addMarker(markerProps: titaniumLib.ListViewMarkerProps): scala.Unit = js.native
  /**
  			 * Appends a single section or an array of sections to the end of the list.
  			 */
  def appendSection(section: js.Array[ListSection]): scala.Unit = js.native
  def appendSection(section: js.Array[ListSection], animation: titaniumLib.ListViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Appends a single section or an array of sections to the end of the list.
  			 */
  def appendSection(section: ListSection): scala.Unit = js.native
  def appendSection(section: ListSection, animation: titaniumLib.ListViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Deletes an existing section.
  			 */
  def deleteSectionAt(sectionIndex: scala.Double): scala.Unit = js.native
  def deleteSectionAt(sectionIndex: scala.Double, animation: titaniumLib.ListViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Deselects a specific item.
  			 */
  def deselectItem(sectionIndex: scala.Double, itemIndex: scala.Double): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.allowsMultipleSelectionDuringEditing> property.
  			 */
  def getAllowsMultipleSelectionDuringEditing(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.allowsSelection> property.
  			 */
  def getAllowsSelection(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.allowsSelectionDuringEditing> property.
  			 */
  def getAllowsSelectionDuringEditing(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.canScroll> property.
  			 */
  def getCanScroll(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.caseInsensitiveSearch> property.
  			 */
  def getCaseInsensitiveSearch(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.defaultItemTemplate> property.
  			 */
  def getDefaultItemTemplate(): java.lang.String | scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.dimBackgroundForSearch> property.
  			 */
  def getDimBackgroundForSearch(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.disableBounce> property.
  			 */
  def getDisableBounce(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.editing> property.
  			 */
  def getEditing(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.footerDividersEnabled> property.
  			 */
  def getFooterDividersEnabled(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.footerTitle> property.
  			 */
  def getFooterTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.footerView> property.
  			 */
  def getFooterView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.headerDividersEnabled> property.
  			 */
  def getHeaderDividersEnabled(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.headerTitle> property.
  			 */
  def getHeaderTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.headerView> property.
  			 */
  def getHeaderView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.keepSectionsInSearch> property.
  			 */
  def getKeepSectionsInSearch(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.keyboardDismissMode> property.
  			 */
  def getKeyboardDismissMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.lazyLoadingEnabled> property.
  			 */
  def getLazyLoadingEnabled(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.listSeparatorInsets> property.
  			 */
  def getListSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.pruneSectionsOnEdit> property.
  			 */
  def getPruneSectionsOnEdit(): scala.Boolean = js.native
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
  def getResultsBackgroundColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.resultsSeparatorColor> property.
  			 */
  def getResultsSeparatorColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.resultsSeparatorInsets> property.
  			 */
  def getResultsSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.resultsSeparatorStyle> property.
  			 */
  def getResultsSeparatorStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.rowSeparatorInsets> property.
  			 */
  def getRowSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.scrollIndicatorStyle> property.
  			 */
  def getScrollIndicatorStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.searchText> property.
  			 */
  def getSearchText(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.searchView> property.
  			 */
  def getSearchView(): SearchBar | titaniumLib.TitaniumNs.UINs.AndroidNs.SearchView = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.sectionCount> property.
  			 */
  def getSectionCount(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.sectionIndexTitles> property.
  			 */
  def getSectionIndexTitles(): js.Array[titaniumLib.ListViewIndexEntry] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.sections> property.
  			 */
  def getSections(): js.Array[ListSection] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.selectedItems> property.
  			 */
  def getSelectedItems(): js.Array[titaniumLib.ListItemEventType] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.separatorColor> property.
  			 */
  def getSeparatorColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.separatorHeight> property.
  			 */
  def getSeparatorHeight(): java.lang.String | scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.separatorInsets> property.
  			 */
  def getSeparatorInsets(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.separatorStyle> property.
  			 */
  def getSeparatorStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.showVerticalScrollIndicator> property.
  			 */
  def getShowVerticalScrollIndicator(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListView.style> property.
  			 */
  def getStyle(): scala.Double = js.native
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
  def getWillScrollOnStatusTap(): scala.Boolean = js.native
  /**
  			 * Inserts a section or an array of sections at a specific index.
  			 */
  def insertSectionAt(sectionIndex: scala.Double, section: js.Array[ListSection]): scala.Unit = js.native
  def insertSectionAt(
    sectionIndex: scala.Double,
    section: js.Array[ListSection],
    animation: titaniumLib.ListViewAnimationProperties
  ): scala.Unit = js.native
  /**
  			 * Inserts a section or an array of sections at a specific index.
  			 */
  def insertSectionAt(sectionIndex: scala.Double, section: ListSection): scala.Unit = js.native
  def insertSectionAt(
    sectionIndex: scala.Double,
    section: ListSection,
    animation: titaniumLib.ListViewAnimationProperties
  ): scala.Unit = js.native
  /**
  			 * Replaces an existing section.
  			 */
  def replaceSectionAt(
    sectionIndex: scala.Double,
    section: ListSection,
    animation: titaniumLib.ListViewAnimationProperties
  ): scala.Unit = js.native
  /**
  			 * Scrolls to a specific item.
  			 */
  def scrollToItem(sectionIndex: scala.Double, itemIndex: scala.Double): scala.Unit = js.native
  def scrollToItem(
    sectionIndex: scala.Double,
    itemIndex: scala.Double,
    animation: titaniumLib.ListViewAnimationProperties
  ): scala.Unit = js.native
  /**
  			 * Selects an item in the list using the specified item and section indices.
  			 */
  def selectItem(sectionIndex: scala.Double, itemIndex: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.allowsMultipleSelectionDuringEditing> property.
  			 */
  def setAllowsMultipleSelectionDuringEditing(allowsMultipleSelectionDuringEditing: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.allowsSelection> property.
  			 */
  def setAllowsSelection(allowsSelection: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.allowsSelectionDuringEditing> property.
  			 */
  def setAllowsSelectionDuringEditing(allowsSelectionDuringEditing: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.canScroll> property.
  			 */
  def setCanScroll(canScroll: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.caseInsensitiveSearch> property.
  			 */
  def setCaseInsensitiveSearch(caseInsensitiveSearch: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets this list view's content insets.
  			 */
  def setContentInsets(edgeInsets: titaniumLib.ListViewEdgeInsets): scala.Unit = js.native
  def setContentInsets(edgeInsets: titaniumLib.ListViewEdgeInsets, animated: titaniumLib.ListViewContentInsetOption): scala.Unit = js.native
  /**
  			 * Sets the value of the content offset of the list view without animation by default.
  			 */
  def setContentOffset(contentOffset: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.defaultItemTemplate> property.
  			 */
  def setDefaultItemTemplate(defaultItemTemplate: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.defaultItemTemplate> property.
  			 */
  def setDefaultItemTemplate(defaultItemTemplate: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.dimBackgroundForSearch> property.
  			 */
  def setDimBackgroundForSearch(dimBackgroundForSearch: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.disableBounce> property.
  			 */
  def setDisableBounce(disableBounce: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.editing> property.
  			 */
  def setEditing(editing: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.footerDividersEnabled> property.
  			 */
  def setFooterDividersEnabled(footerDividersEnabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.footerTitle> property.
  			 */
  def setFooterTitle(footerTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.footerView> property.
  			 */
  def setFooterView(footerView: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.headerDividersEnabled> property.
  			 */
  def setHeaderDividersEnabled(headerDividersEnabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.headerTitle> property.
  			 */
  def setHeaderTitle(headerTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.headerView> property.
  			 */
  def setHeaderView(headerView: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.keepSectionsInSearch> property.
  			 */
  def setKeepSectionsInSearch(keepSectionsInSearch: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.keyboardDismissMode> property.
  			 */
  def setKeyboardDismissMode(keyboardDismissMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.lazyLoadingEnabled> property.
  			 */
  def setLazyLoadingEnabled(lazyLoadingEnabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.listSeparatorInsets> property.
  			 */
  def setListSeparatorInsets(listSeparatorInsets: js.Any): scala.Unit = js.native
  /**
  			 * Sets a reference item in the list view.
  			 */
  def setMarker(markerProps: titaniumLib.ListViewMarkerProps): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.pruneSectionsOnEdit> property.
  			 */
  def setPruneSectionsOnEdit(pruneSectionsOnEdit: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.pullView> property.
  			 */
  def setPullView(pullView: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.refreshControl> property.
  			 */
  def setRefreshControl(refreshControl: RefreshControl): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.resultsBackgroundColor> property.
  			 */
  def setResultsBackgroundColor(resultsBackgroundColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.resultsSeparatorColor> property.
  			 */
  def setResultsSeparatorColor(resultsSeparatorColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.resultsSeparatorInsets> property.
  			 */
  def setResultsSeparatorInsets(resultsSeparatorInsets: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.resultsSeparatorStyle> property.
  			 */
  def setResultsSeparatorStyle(resultsSeparatorStyle: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.rowSeparatorInsets> property.
  			 */
  def setRowSeparatorInsets(rowSeparatorInsets: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.scrollIndicatorStyle> property.
  			 */
  def setScrollIndicatorStyle(scrollIndicatorStyle: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.searchText> property.
  			 */
  def setSearchText(searchText: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.searchView> property.
  			 */
  def setSearchView(searchView: titaniumLib.TitaniumNs.UINs.AndroidNs.SearchView): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.searchView> property.
  			 */
  def setSearchView(searchView: SearchBar): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.sectionIndexTitles> property.
  			 */
  def setSectionIndexTitles(sectionIndexTitles: js.Array[titaniumLib.ListViewIndexEntry]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.sections> property.
  			 */
  def setSections(sections: js.Array[ListSection]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.selectedItems> property.
  			 */
  def setSelectedItems(selectedItems: js.Array[titaniumLib.ListItemEventType]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.separatorColor> property.
  			 */
  def setSeparatorColor(separatorColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.separatorHeight> property.
  			 */
  def setSeparatorHeight(separatorHeight: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.separatorHeight> property.
  			 */
  def setSeparatorHeight(separatorHeight: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.separatorInsets> property.
  			 */
  def setSeparatorInsets(separatorInsets: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.separatorStyle> property.
  			 */
  def setSeparatorStyle(separatorStyle: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.showVerticalScrollIndicator> property.
  			 */
  def setShowVerticalScrollIndicator(showVerticalScrollIndicator: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.style> property.
  			 */
  def setStyle(style: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.tableSeparatorInsets> property.
  			 */
  def setTableSeparatorInsets(tableSeparatorInsets: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.templates> property.
  			 */
  def setTemplates(templates: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListView.willScrollOnStatusTap> property.
  			 */
  def setWillScrollOnStatusTap(willScrollOnStatusTap: scala.Boolean): scala.Unit = js.native
}

