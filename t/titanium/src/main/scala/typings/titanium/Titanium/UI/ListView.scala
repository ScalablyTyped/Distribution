package typings.titanium.Titanium.UI

import typings.titanium.AnimatedOptions
import typings.titanium.AnimatedWithDurationOptions
import typings.titanium.HorizontalInsets
import typings.titanium.ListItemEventType
import typings.titanium.ListViewAnimationProperties
import typings.titanium.ListViewIndexEntry
import typings.titanium.ListViewMarkerProps
import typings.titanium.Padding
import typings.titanium.Point
import typings.titanium.Titanium.UI.Android.SearchView
import typings.titanium.titaniumStrings.cancelprefetch
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.delete
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.dragend_
import typings.titanium.titaniumStrings.dragstart_
import typings.titanium.titaniumStrings.editaction
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.indexclick
import typings.titanium.titaniumStrings.insert
import typings.titanium.titaniumStrings.itemclick
import typings.titanium.titaniumStrings.itemsselected
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.marker
import typings.titanium.titaniumStrings.move
import typings.titanium.titaniumStrings.noresults
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.prefetch
import typings.titanium.titaniumStrings.pull
import typings.titanium.titaniumStrings.pullend
import typings.titanium.titaniumStrings.scrollend
import typings.titanium.titaniumStrings.scrolling
import typings.titanium.titaniumStrings.scrollstart
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list view is used to present information, organized in to sections and items,
  * in a vertically-scrolling view.
  */
@js.native
trait ListView extends View {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_cancelprefetch(
    name: cancelprefetch,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewCancelprefetchEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_delete(
    name: delete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewDeleteEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    name: dragend_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewDragendEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    name: dragstart_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewDragstartEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_editaction(
    name: editaction,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewEditactionEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_indexclick(
    name: indexclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewIndexclickEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_insert(
    name: insert,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewInsertEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemclick(
    name: itemclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewItemclickEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemsselected(
    name: itemsselected,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewItemsselectedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_marker(
    name: marker,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewMarkerEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_move(name: move, callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewMoveEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_noresults(
    name: noresults,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewNoresultsEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_prefetch(
    name: prefetch,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewPrefetchEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pull(name: pull, callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewPullEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pullend(
    name: pullend,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewPullendEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollend(
    name: scrollend,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewScrollendEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrolling(
    name: scrolling,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewScrollingEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollstart(
    name: scrollstart,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewScrollstartEvent, Unit]
  ): Unit = js.native
  
  /**
    * Adds a reference item in the list view.
    */
  def addMarker(markerProps: ListViewMarkerProps): Unit = js.native
  
  /**
    * Determines whether multiple items of this list view can be selected at the same time while editing the table.
    */
  var allowsMultipleSelectionDuringEditing: Boolean = js.native
  
  /**
    * Allows a two-finger pan gesture to automatically transition the table view into editing mode and start selecting rows.
    */
  var allowsMultipleSelectionInteraction: Boolean = js.native
  
  /**
    * Determines whether this item can be selected.
    */
  var allowsSelection: Boolean = js.native
  
  /**
    * Determines whether this list view items can be selected while editing the table.
    */
  var allowsSelectionDuringEditing: Boolean = js.native
  
  def appendSection(section: js.Array[ListSection]): Unit = js.native
  def appendSection(section: js.Array[ListSection], animation: ListViewAnimationProperties): Unit = js.native
  /**
    * Appends a single section or an array of sections to the end of the list.
    */
  def appendSection(section: ListSection): Unit = js.native
  def appendSection(section: ListSection, animation: ListViewAnimationProperties): Unit = js.native
  
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
    * Deletes an existing section.
    */
  def deleteSectionAt(sectionIndex: Double): Unit = js.native
  def deleteSectionAt(sectionIndex: Double, animation: ListViewAnimationProperties): Unit = js.native
  
  /**
    * Deselects a specific item.
    */
  def deselectItem(sectionIndex: Double, itemIndex: Double): Unit = js.native
  
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
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_cancelprefetch(name: cancelprefetch): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_cancelprefetch(name: cancelprefetch, event: ListViewCancelprefetchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ListViewClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: ListViewDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_delete(name: delete): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_delete(name: delete, event: ListViewDeleteEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: ListViewDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragend(name: dragend_): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragend(name: dragend_, event: ListViewDragendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragstart(name: dragstart_): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragstart(name: dragstart_, event: ListViewDragstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_editaction(name: editaction): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_editaction(name: editaction, event: ListViewEditactionEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: ListViewFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_indexclick(name: indexclick): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_indexclick(name: indexclick, event: ListViewIndexclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_insert(name: insert): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_insert(name: insert, event: ListViewInsertEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_itemclick(name: itemclick): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_itemclick(name: itemclick, event: ListViewItemclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_itemsselected(name: itemsselected): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_itemsselected(name: itemsselected, event: ListViewItemsselectedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: ListViewKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: ListViewLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: ListViewLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_marker(name: marker): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_marker(name: marker, event: ListViewMarkerEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_move(name: move): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_move(name: move, event: ListViewMoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_noresults(name: noresults): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_noresults(name: noresults, event: ListViewNoresultsEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: ListViewPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: ListViewPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_prefetch(name: prefetch): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_prefetch(name: prefetch, event: ListViewPrefetchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pull(name: pull): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pull(name: pull, event: ListViewPullEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pullend(name: pullend): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pullend(name: pullend, event: ListViewPullendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scrollend(name: scrollend): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scrollend(name: scrollend, event: ListViewScrollendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scrolling(name: scrolling): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scrolling(name: scrolling, event: ListViewScrollingEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scrollstart(name: scrollstart): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scrollstart(name: scrollstart, event: ListViewScrollstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: ListViewSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: ListViewSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: ListViewTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: ListViewTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: ListViewTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: ListViewTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: ListViewTwofingertapEvent): Unit = js.native
  
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
    * Gets the value of the <Titanium.UI.ListView.allowsMultipleSelectionDuringEditing> property.
    * @deprecated Access <Titanium.UI.ListView.allowsMultipleSelectionDuringEditing> instead.
    */
  def getAllowsMultipleSelectionDuringEditing(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.allowsMultipleSelectionInteraction> property.
    * @deprecated Access <Titanium.UI.ListView.allowsMultipleSelectionInteraction> instead.
    */
  def getAllowsMultipleSelectionInteraction(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.allowsSelection> property.
    * @deprecated Access <Titanium.UI.ListView.allowsSelection> instead.
    */
  def getAllowsSelection(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.allowsSelectionDuringEditing> property.
    * @deprecated Access <Titanium.UI.ListView.allowsSelectionDuringEditing> instead.
    */
  def getAllowsSelectionDuringEditing(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.canScroll> property.
    * @deprecated Access <Titanium.UI.ListView.canScroll> instead.
    */
  def getCanScroll(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.caseInsensitiveSearch> property.
    * @deprecated Access <Titanium.UI.ListView.caseInsensitiveSearch> instead.
    */
  def getCaseInsensitiveSearch(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.defaultItemTemplate> property.
    * @deprecated Access <Titanium.UI.ListView.defaultItemTemplate> instead.
    */
  def getDefaultItemTemplate(): String | Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.dimBackgroundForSearch> property.
    * @deprecated Access <Titanium.UI.ListView.dimBackgroundForSearch> instead.
    */
  def getDimBackgroundForSearch(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.disableBounce> property.
    * @deprecated Access <Titanium.UI.ListView.disableBounce> instead.
    */
  def getDisableBounce(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.editing> property.
    * @deprecated Access <Titanium.UI.ListView.editing> instead.
    */
  def getEditing(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.fastScroll> property.
    * @deprecated Access <Titanium.UI.ListView.fastScroll> instead.
    */
  def getFastScroll(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.footerDividersEnabled> property.
    * @deprecated Access <Titanium.UI.ListView.footerDividersEnabled> instead.
    */
  def getFooterDividersEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.footerTitle> property.
    * @deprecated Access <Titanium.UI.ListView.footerTitle> instead.
    */
  def getFooterTitle(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.footerView> property.
    * @deprecated Access <Titanium.UI.ListView.footerView> instead.
    */
  def getFooterView(): View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.headerDividersEnabled> property.
    * @deprecated Access <Titanium.UI.ListView.headerDividersEnabled> instead.
    */
  def getHeaderDividersEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.headerTitle> property.
    * @deprecated Access <Titanium.UI.ListView.headerTitle> instead.
    */
  def getHeaderTitle(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.headerView> property.
    * @deprecated Access <Titanium.UI.ListView.headerView> instead.
    */
  def getHeaderView(): View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.keepSectionsInSearch> property.
    * @deprecated Access <Titanium.UI.ListView.keepSectionsInSearch> instead.
    */
  def getKeepSectionsInSearch(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.keyboardDismissMode> property.
    * @deprecated Access <Titanium.UI.ListView.keyboardDismissMode> instead.
    */
  def getKeyboardDismissMode(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.lazyLoadingEnabled> property.
    * @deprecated Access <Titanium.UI.ListView.lazyLoadingEnabled> instead.
    */
  def getLazyLoadingEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.listSeparatorInsets> property.
    * @deprecated Access <Titanium.UI.ListView.listSeparatorInsets> instead.
    */
  def getListSeparatorInsets(): HorizontalInsets = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.pruneSectionsOnEdit> property.
    * @deprecated Access <Titanium.UI.ListView.pruneSectionsOnEdit> instead.
    */
  def getPruneSectionsOnEdit(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.pullView> property.
    * @deprecated Access <Titanium.UI.ListView.pullView> instead.
    */
  def getPullView(): View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.refreshControl> property.
    * @deprecated Access <Titanium.UI.ListView.refreshControl> instead.
    */
  def getRefreshControl(): RefreshControl = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.resultsBackgroundColor> property.
    * @deprecated Access <Titanium.UI.ListView.resultsBackgroundColor> instead.
    */
  def getResultsBackgroundColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.resultsSeparatorColor> property.
    * @deprecated Access <Titanium.UI.ListView.resultsSeparatorColor> instead.
    */
  def getResultsSeparatorColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.resultsSeparatorInsets> property.
    * @deprecated Access <Titanium.UI.ListView.resultsSeparatorInsets> instead.
    */
  def getResultsSeparatorInsets(): HorizontalInsets = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.resultsSeparatorStyle> property.
    * @deprecated Access <Titanium.UI.ListView.resultsSeparatorStyle> instead.
    */
  def getResultsSeparatorStyle(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.rowSeparatorInsets> property.
    * @deprecated Access <Titanium.UI.ListView.rowSeparatorInsets> instead.
    */
  def getRowSeparatorInsets(): HorizontalInsets = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.scrollIndicatorStyle> property.
    * @deprecated Access <Titanium.UI.ListView.scrollIndicatorStyle> instead.
    */
  def getScrollIndicatorStyle(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.searchText> property.
    * @deprecated Access <Titanium.UI.ListView.searchText> instead.
    */
  def getSearchText(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.searchView> property.
    * @deprecated Access <Titanium.UI.ListView.searchView> instead.
    */
  def getSearchView(): SearchBar | SearchView = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.sectionCount> property.
    * @deprecated Access <Titanium.UI.ListView.sectionCount> instead.
    */
  def getSectionCount(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.sectionIndexTitles> property.
    * @deprecated Access <Titanium.UI.ListView.sectionIndexTitles> instead.
    */
  def getSectionIndexTitles(): js.Array[ListViewIndexEntry] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.sections> property.
    * @deprecated Access <Titanium.UI.ListView.sections> instead.
    */
  def getSections(): js.Array[ListSection] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.selectedItems> property.
    * @deprecated Access <Titanium.UI.ListView.selectedItems> instead.
    */
  def getSelectedItems(): js.Array[ListItemEventType] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.separatorColor> property.
    * @deprecated Access <Titanium.UI.ListView.separatorColor> instead.
    */
  def getSeparatorColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.separatorHeight> property.
    * @deprecated Access <Titanium.UI.ListView.separatorHeight> instead.
    */
  def getSeparatorHeight(): String | Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.separatorInsets> property.
    * @deprecated Use [Titanium.UI.ListView.listSeparatorInsets](Titanium.UI.ListView.listSeparatorInsets) instead.
    */
  def getSeparatorInsets(): HorizontalInsets = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.separatorStyle> property.
    * @deprecated Access <Titanium.UI.ListView.separatorStyle> instead.
    */
  def getSeparatorStyle(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.showSearchBarInNavBar> property.
    * @deprecated Access <Titanium.UI.ListView.showSearchBarInNavBar> instead.
    */
  def getShowSearchBarInNavBar(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.showVerticalScrollIndicator> property.
    * @deprecated Access <Titanium.UI.ListView.showVerticalScrollIndicator> instead.
    */
  def getShowVerticalScrollIndicator(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.style> property.
    * @deprecated Access <Titanium.UI.ListView.style> instead.
    */
  def getStyle(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.tableSeparatorInsets> property.
    * @deprecated Use [Titanium.UI.ListView.listSeparatorInsets](Titanium.UI.ListView.listSeparatorInsets) instead.
    */
  def getTableSeparatorInsets(): HorizontalInsets = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.templates> property.
    * @deprecated Access <Titanium.UI.ListView.templates> instead.
    */
  def getTemplates(): js.Any = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListView.willScrollOnStatusTap> property.
    * @deprecated Access <Titanium.UI.ListView.willScrollOnStatusTap> instead.
    */
  def getWillScrollOnStatusTap(): Boolean = js.native
  
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
  
  def insertSectionAt(sectionIndex: Double, section: js.Array[ListSection]): Unit = js.native
  def insertSectionAt(sectionIndex: Double, section: js.Array[ListSection], animation: ListViewAnimationProperties): Unit = js.native
  /**
    * Inserts a section or an array of sections at a specific index.
    */
  def insertSectionAt(sectionIndex: Double, section: ListSection): Unit = js.native
  def insertSectionAt(sectionIndex: Double, section: ListSection, animation: ListViewAnimationProperties): Unit = js.native
  
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
  var listSeparatorInsets: HorizontalInsets = js.native
  
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
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_cancelprefetch(
    name: cancelprefetch,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewCancelprefetchEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_delete(
    name: delete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewDeleteEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    name: dragend_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewDragendEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    name: dragstart_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewDragstartEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_editaction(
    name: editaction,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewEditactionEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_indexclick(
    name: indexclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewIndexclickEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_insert(
    name: insert,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewInsertEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_itemclick(
    name: itemclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewItemclickEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_itemsselected(
    name: itemsselected,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewItemsselectedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_marker(
    name: marker,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewMarkerEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_move(name: move, callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewMoveEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_noresults(
    name: noresults,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewNoresultsEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_prefetch(
    name: prefetch,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewPrefetchEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pull(name: pull, callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewPullEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pullend(
    name: pullend,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewPullendEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scrollend(
    name: scrollend,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewScrollendEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scrolling(
    name: scrolling,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewScrollingEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scrollstart(
    name: scrollstart,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ListViewScrollstartEvent, Unit]
  ): Unit = js.native
  
  /**
    * Replaces an existing section.
    */
  def replaceSectionAt(sectionIndex: Double, section: ListSection): Unit = js.native
  def replaceSectionAt(sectionIndex: Double, section: ListSection, animation: ListViewAnimationProperties): Unit = js.native
  
  /**
    * The background color of the search results (iOS-only).
    */
  var resultsBackgroundColor: String | Color = js.native
  
  /**
    * Separator line color between rows inside search results,
    * as a color name or hex triplet (iOS-only).
    */
  var resultsSeparatorColor: String | Color = js.native
  
  /**
    * The insets for search results separators (applies to all cells & iOS-only).
    */
  var resultsSeparatorInsets: HorizontalInsets = js.native
  
  /**
    * The separator style of the search results (iOS-only).
    */
  var resultsSeparatorStyle: Double = js.native
  
  /**
    * The insets for list view cells (applies to all cells).
    */
  var rowSeparatorInsets: HorizontalInsets = js.native
  
  /**
    * Style of the scrollbar.
    */
  var scrollIndicatorStyle: Double = js.native
  
  /**
    * Scrolls to a specific item.
    */
  def scrollToItem(sectionIndex: Double, itemIndex: Double): Unit = js.native
  def scrollToItem(sectionIndex: Double, itemIndex: Double, animation: ListViewAnimationProperties): Unit = js.native
  
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
    * Selects an item in the list using the specified item and section indices.
    */
  def selectItem(sectionIndex: Double, itemIndex: Double): Unit = js.native
  
  /**
    * Returns the selected list view items.
    */
  var selectedItems: js.Array[ListItemEventType] = js.native
  
  /**
    * Separator line color between items, as a color name or hex triplet.
    */
  var separatorColor: String | Color = js.native
  
  /**
    * height of the ListView separator.
    */
  var separatorHeight: String | Double = js.native
  
  /**
    * The insets for list view separators (applies to all cells).
    * @deprecated Use [Titanium.UI.ListView.listSeparatorInsets](Titanium.UI.ListView.listSeparatorInsets) instead.
    */
  var separatorInsets: HorizontalInsets = js.native
  
  /**
    * Separator style constant.
    */
  var separatorStyle: Double = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.allowsMultipleSelectionDuringEditing> property.
    * @deprecated Set the value using <Titanium.UI.ListView.allowsMultipleSelectionDuringEditing> instead.
    */
  def setAllowsMultipleSelectionDuringEditing(allowsMultipleSelectionDuringEditing: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.allowsMultipleSelectionInteraction> property.
    * @deprecated Set the value using <Titanium.UI.ListView.allowsMultipleSelectionInteraction> instead.
    */
  def setAllowsMultipleSelectionInteraction(allowsMultipleSelectionInteraction: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.allowsSelection> property.
    * @deprecated Set the value using <Titanium.UI.ListView.allowsSelection> instead.
    */
  def setAllowsSelection(allowsSelection: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.allowsSelectionDuringEditing> property.
    * @deprecated Set the value using <Titanium.UI.ListView.allowsSelectionDuringEditing> instead.
    */
  def setAllowsSelectionDuringEditing(allowsSelectionDuringEditing: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.canScroll> property.
    * @deprecated Set the value using <Titanium.UI.ListView.canScroll> instead.
    */
  def setCanScroll(canScroll: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.caseInsensitiveSearch> property.
    * @deprecated Set the value using <Titanium.UI.ListView.caseInsensitiveSearch> instead.
    */
  def setCaseInsensitiveSearch(caseInsensitiveSearch: Boolean): Unit = js.native
  
  /**
    * Sets this list view's content insets.
    */
  def setContentInsets(edgeInsets: Padding): Unit = js.native
  def setContentInsets(edgeInsets: Padding, options: AnimatedWithDurationOptions): Unit = js.native
  
  /**
    * Sets the value of the content offset of the list view without animation by default.
    */
  def setContentOffset(contentOffset: Point): Unit = js.native
  def setContentOffset(contentOffset: Point, options: AnimatedOptions): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.defaultItemTemplate> property.
    * @deprecated Set the value using <Titanium.UI.ListView.defaultItemTemplate> instead.
    */
  def setDefaultItemTemplate(defaultItemTemplate: String): Unit = js.native
  def setDefaultItemTemplate(defaultItemTemplate: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.dimBackgroundForSearch> property.
    * @deprecated Set the value using <Titanium.UI.ListView.dimBackgroundForSearch> instead.
    */
  def setDimBackgroundForSearch(dimBackgroundForSearch: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.disableBounce> property.
    * @deprecated Set the value using <Titanium.UI.ListView.disableBounce> instead.
    */
  def setDisableBounce(disableBounce: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.editing> property.
    * @deprecated Set the value using <Titanium.UI.ListView.editing> instead.
    */
  def setEditing(editing: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.fastScroll> property.
    * @deprecated Set the value using <Titanium.UI.ListView.fastScroll> instead.
    */
  def setFastScroll(fastScroll: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.footerDividersEnabled> property.
    * @deprecated Set the value using <Titanium.UI.ListView.footerDividersEnabled> instead.
    */
  def setFooterDividersEnabled(footerDividersEnabled: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.footerTitle> property.
    * @deprecated Set the value using <Titanium.UI.ListView.footerTitle> instead.
    */
  def setFooterTitle(footerTitle: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.footerView> property.
    * @deprecated Set the value using <Titanium.UI.ListView.footerView> instead.
    */
  def setFooterView(footerView: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.headerDividersEnabled> property.
    * @deprecated Set the value using <Titanium.UI.ListView.headerDividersEnabled> instead.
    */
  def setHeaderDividersEnabled(headerDividersEnabled: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.headerTitle> property.
    * @deprecated Set the value using <Titanium.UI.ListView.headerTitle> instead.
    */
  def setHeaderTitle(headerTitle: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.headerView> property.
    * @deprecated Set the value using <Titanium.UI.ListView.headerView> instead.
    */
  def setHeaderView(headerView: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.keepSectionsInSearch> property.
    * @deprecated Set the value using <Titanium.UI.ListView.keepSectionsInSearch> instead.
    */
  def setKeepSectionsInSearch(keepSectionsInSearch: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.keyboardDismissMode> property.
    * @deprecated Set the value using <Titanium.UI.ListView.keyboardDismissMode> instead.
    */
  def setKeyboardDismissMode(keyboardDismissMode: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.lazyLoadingEnabled> property.
    * @deprecated Set the value using <Titanium.UI.ListView.lazyLoadingEnabled> instead.
    */
  def setLazyLoadingEnabled(lazyLoadingEnabled: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.listSeparatorInsets> property.
    * @deprecated Set the value using <Titanium.UI.ListView.listSeparatorInsets> instead.
    */
  def setListSeparatorInsets(listSeparatorInsets: HorizontalInsets): Unit = js.native
  
  /**
    * Sets a reference item in the list view.
    */
  def setMarker(markerProps: ListViewMarkerProps): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.pruneSectionsOnEdit> property.
    * @deprecated Set the value using <Titanium.UI.ListView.pruneSectionsOnEdit> instead.
    */
  def setPruneSectionsOnEdit(pruneSectionsOnEdit: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.pullView> property.
    * @deprecated Set the value using <Titanium.UI.ListView.pullView> instead.
    */
  def setPullView(pullView: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.refreshControl> property.
    * @deprecated Set the value using <Titanium.UI.ListView.refreshControl> instead.
    */
  def setRefreshControl(refreshControl: RefreshControl): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.resultsBackgroundColor> property.
    * @deprecated Set the value using <Titanium.UI.ListView.resultsBackgroundColor> instead.
    */
  def setResultsBackgroundColor(resultsBackgroundColor: String): Unit = js.native
  def setResultsBackgroundColor(resultsBackgroundColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.resultsSeparatorColor> property.
    * @deprecated Set the value using <Titanium.UI.ListView.resultsSeparatorColor> instead.
    */
  def setResultsSeparatorColor(resultsSeparatorColor: String): Unit = js.native
  def setResultsSeparatorColor(resultsSeparatorColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.resultsSeparatorInsets> property.
    * @deprecated Set the value using <Titanium.UI.ListView.resultsSeparatorInsets> instead.
    */
  def setResultsSeparatorInsets(resultsSeparatorInsets: HorizontalInsets): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.resultsSeparatorStyle> property.
    * @deprecated Set the value using <Titanium.UI.ListView.resultsSeparatorStyle> instead.
    */
  def setResultsSeparatorStyle(resultsSeparatorStyle: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.rowSeparatorInsets> property.
    * @deprecated Set the value using <Titanium.UI.ListView.rowSeparatorInsets> instead.
    */
  def setRowSeparatorInsets(rowSeparatorInsets: HorizontalInsets): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.scrollIndicatorStyle> property.
    * @deprecated Set the value using <Titanium.UI.ListView.scrollIndicatorStyle> instead.
    */
  def setScrollIndicatorStyle(scrollIndicatorStyle: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.searchText> property.
    * @deprecated Set the value using <Titanium.UI.ListView.searchText> instead.
    */
  def setSearchText(searchText: String): Unit = js.native
  
  def setSearchView(searchView: SearchView): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ListView.searchView> property.
    * @deprecated Set the value using <Titanium.UI.ListView.searchView> instead.
    */
  def setSearchView(searchView: SearchBar): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.sectionIndexTitles> property.
    * @deprecated Set the value using <Titanium.UI.ListView.sectionIndexTitles> instead.
    */
  def setSectionIndexTitles(sectionIndexTitles: js.Array[ListViewIndexEntry]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.sections> property.
    * @deprecated Set the value using <Titanium.UI.ListView.sections> instead.
    */
  def setSections(sections: js.Array[ListSection]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.selectedItems> property.
    * @deprecated Set the value using <Titanium.UI.ListView.selectedItems> instead.
    */
  def setSelectedItems(selectedItems: js.Array[ListItemEventType]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.separatorColor> property.
    * @deprecated Set the value using <Titanium.UI.ListView.separatorColor> instead.
    */
  def setSeparatorColor(separatorColor: String): Unit = js.native
  def setSeparatorColor(separatorColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.separatorHeight> property.
    * @deprecated Set the value using <Titanium.UI.ListView.separatorHeight> instead.
    */
  def setSeparatorHeight(separatorHeight: String): Unit = js.native
  def setSeparatorHeight(separatorHeight: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.separatorInsets> property.
    * @deprecated Use [Titanium.UI.ListView.listSeparatorInsets](Titanium.UI.ListView.listSeparatorInsets) instead.
    */
  def setSeparatorInsets(separatorInsets: HorizontalInsets): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.separatorStyle> property.
    * @deprecated Set the value using <Titanium.UI.ListView.separatorStyle> instead.
    */
  def setSeparatorStyle(separatorStyle: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.showSearchBarInNavBar> property.
    * @deprecated Set the value using <Titanium.UI.ListView.showSearchBarInNavBar> instead.
    */
  def setShowSearchBarInNavBar(showSearchBarInNavBar: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.showVerticalScrollIndicator> property.
    * @deprecated Set the value using <Titanium.UI.ListView.showVerticalScrollIndicator> instead.
    */
  def setShowVerticalScrollIndicator(showVerticalScrollIndicator: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.style> property.
    * @deprecated Set the value using <Titanium.UI.ListView.style> instead.
    */
  def setStyle(style: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.tableSeparatorInsets> property.
    * @deprecated Use [Titanium.UI.ListView.listSeparatorInsets](Titanium.UI.ListView.listSeparatorInsets) instead.
    */
  def setTableSeparatorInsets(tableSeparatorInsets: HorizontalInsets): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.templates> property.
    * @deprecated Set the value using <Titanium.UI.ListView.templates> instead.
    */
  def setTemplates(templates: js.Any): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListView.willScrollOnStatusTap> property.
    * @deprecated Set the value using <Titanium.UI.ListView.willScrollOnStatusTap> instead.
    */
  def setWillScrollOnStatusTap(willScrollOnStatusTap: Boolean): Unit = js.native
  
  /**
    * A Boolean indicating whether search bar will be in navigation bar.
    */
  var showSearchBarInNavBar: Boolean = js.native
  
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
    * @deprecated Use [Titanium.UI.ListView.listSeparatorInsets](Titanium.UI.ListView.listSeparatorInsets) instead.
    */
  var tableSeparatorInsets: HorizontalInsets = js.native
  
  /**
    * Contain key-value pairs mapping a style name (key) to an <ItemTemplate> (value).
    */
  var templates: js.Any = js.native
  
  /**
    * Controls the scroll-to-top gesture.
    */
  var willScrollOnStatusTap: Boolean = js.native
}
