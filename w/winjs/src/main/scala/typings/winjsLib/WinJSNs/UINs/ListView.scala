package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays data items in a customizable list or grid.
  **/
@JSGlobal("WinJS.UI.ListView")
@js.native
//#region Constructors
/**
  * Creates a new ListView.
  * @constructor
  * @param element The DOM element that hosts the ListView control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the selectionchanged event, add a property named "onselectionchanged" to the options object and set its value to the event handler.
  **/
class ListView[T] () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets a value that indicates whether the next set of pages is automatically loaded when the user scrolls beyond the number of pages specified by the pagesToLoadThreshold property.
    **/
  var automaticallyLoadPages: scala.Boolean = js.native
  /**
    * Gets or sets an IListViewItem that indicates which item should have keyboard focus and the focus state of that item.
    **/
  var currentItem: IListViewItem = js.native
  /**
    * Gets the HTML element that hosts this ListView.
    **/
  var element: stdLib.HTMLElement = js.native
  /**
    * Gets or sets the footer of the ListView.
    **/
  var footer: stdLib.HTMLElement = js.native
  /**
    * Gets or sets the data source that contains the groups for the items in the itemDataSource.
    **/
  var groupDataSource: IListDataSource[T] = js.native
  /**
    * Gets or sets how the ListView reacts when the user taps or clicks a group header.
    **/
  var groupHeaderTapBehavior: GroupHeaderTapBehavior = js.native
  /**
    * Gets or sets the Template or function that creates the DOM elements for each group header in the groupDataSource. Each group header can contain multiple elements, but it must have a single root element.
    **/
  var groupHeaderTemplate: js.Any = js.native
  /**
    * Gets or sets the header of the ListView.
    **/
  var header: stdLib.HTMLElement = js.native
  /**
    * Gets or sets the first visible item.
    **/
  var indexOfFirstVisible: scala.Double = js.native
  /**
    * Gets the index of the last visible item in the ListView.
    **/
  var indexOfLastVisible: scala.Double = js.native
  /**
    * Gets or sets the data source that provides the ListView with items.
    **/
  var itemDataSource: IListDataSource[T] = js.native
  /**
    * Gets or sets the WinJS.Binding.Template or templating function that creates the DOM elements for each item in the itemDataSource. Each item can contain multiple elements, but it must have a single root element.
    **/
  var itemTemplate: js.Any = js.native
  /**
    * Go Gets or sets a value that specifies whether items can be dragged. When this is set to true the ListView provides built in behaviors related to item dragging.
    **/
  var itemsDraggable: scala.Boolean = js.native
  /**
    * Gets or sets whether the ListView control's items can be reordered within itself by dragging and dropping.
    **/
  var itemsReorderable: scala.Boolean = js.native
  /**
    * Gets or sets an object that controls the layout of the ListView.
    **/
  var layout: ILayout2 = js.native
  /**
    * Gets or sets a value that specifies how the ListView fetches items and adds and removes them to the DOM. Don't change the value of this property after the ListView has begun loading data.
    **/
  var loadingBehavior: java.lang.String = js.native
  /**
    * Gets a value that indicates whether the ListView is still loading or whether loading is complete.
    **/
  var loadingState: java.lang.String = js.native
  /**
    * Gets or sets the maximum number of realized items.
    **/
  var maxDeferredItemCleanup: scala.Double = js.native
  /**
    * Gets or sets the maximum number of pages to prefetch in the leading buffer for virtualization.
    **/
  var maxLeadingPages: scala.Double = js.native
  /**
    * Gets or sets the maximum number of pages to prefetch in the trailing buffer for virtualization.
    **/
  var maxTrailingPages: scala.Double = js.native
  /**
    * This property is deprecated. Gets or sets the number of pages to load when the loadingBehavior property is set to "incremental" and the user scrolls beyond the threshold specified by the pagesToLoadThreshold property.
    **/
  var pagesToLoad: scala.Double = js.native
  /**
    * This property is deprecated. Gets or sets the threshold (in pages) for initiating an incremental load. When the last visible item is within the specified number of pages from the end of the loaded portion of the list, and if automaticallyLoadPages is true and loadingBehavior is set to "incremental", the ListView initiates an incremental load.
    **/
  var pagesToLoadThreshold: scala.Double = js.native
  /**
    * Gets or sets the distance, in pixels, of the start of the viewable area within the viewport.
    **/
  var scrollPosition: scala.Double = js.native
  /**
    * Gets an ISelection that contains the range of currently selected items.
    **/
  var selection: ISelection[T] = js.native
  /**
    * Gets or sets the selection mode of the ListView.
    **/
  var selectionMode: SelectionMode = js.native
  /**
    * Gets or sets how the ListView reacts to the swipe gesture. The swipe gesture can select the swiped items or can have no effect on the current selection.
    **/
  var swipeBehavior: SwipeBehavior = js.native
  /**
    * Gets or sets how the ListView reacts when the user taps or clicks an item.
    **/
  var tapBehavior: TapBehavior = js.native
  /**
    * Gets a ZoomableView that supports semantic zoom functionality. This API supports the SemanticZoom infrastructure and is not intended to be used directly from your code.
    **/
  var zoomableView: IZoomableView[ListView[T]] = js.native
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle. See the ListView object page for a list of events. Note that you drop the "on" when specifying the event name for the addEventListener method. For example, instead of specifying "onselectionchange", you specify "selectionchange".
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  /**
    * Releases resources held by this object. Call this method when the object is no longer needed. After calling this method, the object becomes unusable.
    **/
  def dispose(): scala.Unit = js.native
  /**
    * Returns the DOM element that represents the item at the specified index.
    * @param itemIndex The index of the item.
    * @returns The DOM element that represents the item at the specified index.
    **/
  def elementFromIndex(itemIndex: scala.Double): stdLib.HTMLElement = js.native
  /**
    * Makes the item at the specified index visible. If necessary, the ListView will scroll to the item.
    * @param itemIndex The index of the item to scroll into view.
    **/
  def ensureVisible(itemIndex: scala.Double): scala.Unit = js.native
  /**
    * Forces the ListView to update its layout. Use this function when making the ListView visible again after its style.display property had been set to "none".
    **/
  def forceLayout(): scala.Unit = js.native
  /**
    * Returns the index of the item that the specified DOM element displays.
    * @param element The DOM element that displays the item.
    * @returns The index of the item displayed by element.
    **/
  def indexOfElement(element: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Loads the next set of pages if the ListView control's loadingBehavior is set to "incremental" (otherwise, it does nothing). The number of pages to be loaded is determined by the pagesToLoad property.
    **/
  def loadMorePages(): scala.Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Raised when the accessibility attributes have been added to the ListView items.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties detail.firstIndex, detail.lastIndex, detail.firstHeaderIndex, detail.lastHeaderIndex.
    **/
  def onaccessibilityannotationcomplete(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Occurs when the ListView is about to play an entrance or contentTransition animation.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.type, detail.setPromise.
    **/
  def oncontentanimating(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Raised when the footer's visibility property changes.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.visible.
    **/
  def onfootervisibilitychanged(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Raised when the user taps or clicks a group header.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.groupHeaderIndex, detail.groupHeaderPromise.
    **/
  def ongroupheaderinvoked(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Raised when the header's visibility property changes.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.visible.
    **/
  def onheadervisibilitychanged(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Raised when the ListView is a drop target and the onitemdragenter has been disabled. This is raised every time the cursor is moved between a new pair of items. If you call preventDefault on this event, then the ListView does not move the items slightly above/below the cursor to provide visual feedback for a drop.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains additional information about the event.
    **/
  def onitemdragbetween(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Raised when the user is dragging an item from the ListView and the datasource changes while the user is dragging.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains additional information about the event.
    **/
  def onitemdragchanged(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Raised when an item is dropped onto the ListView as the result of a drag operation.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.dataTransfer, detail.index, detail.insertAfterIndex.
    **/
  def onitemdragdrop(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Raised when the user drops an item dragged from a ListView.
    * @param eventInfo An object that contains information about the event.
    **/
  def onitemdragend(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Raised when an dragged item enters the bounds of the ListView control.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.dataTransfer.
    **/
  def onitemdragenter(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Raised when a draggable item leaves the bounds of a ListView control.
    * @param eventInfo An object that contains information about the event.
    **/
  def onitemdragleave(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Raised when the user begins to drag an item from a ListView control.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.dataTransfer, detail.dragInfo.
    **/
  def onitemdragstart(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Occurs when the user taps or clicks an item.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.itemIndex.
    **/
  def oniteminvoked(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Raised when the focused item changes.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.oldFocus, detail.oldNewFocus.
    **/
  def onkeyboardnavigating(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Occurs when the ListView control's loadingState changes.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.scrolling.
    **/
  def onloadingstatechanged(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Occurs after the current selection changes.
    * @param eventInfo An object that contains information about the event. The detail property of this object is null. To obtain the selected items, use the ListView.selection property.
    **/
  def onselectionchanged(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Occurs just before the current selection changes.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.newSelection, detail.preventTapBehavior.
    **/
  def onselectionchanging(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Repositions all the visible items in the ListView to adjust for items whose sizes have changed. Most apps won’t ever need to call this method. For more info, see the Remarks section.
    **/
  def recalculateItemPosition(): scala.Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function): scala.Unit = js.native
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Gets or sets the function that is called when the ListView discards or recycles the element representation of a group header.
    **/
  def resetGroupHeader(header: js.Any, element: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Gets or sets the function that is called when an item is removed, an item is changed, or an item falls outside of the realized range of the ListView.
    **/
  def resetItem(item: T, element: stdLib.HTMLElement): scala.Unit = js.native
}

/**
  * Displays data items in a customizable list or grid.
  **/
@JSGlobal("WinJS.UI.ListView")
@js.native
object ListView extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
  /**
    * Triggers the ListView disposal service manually.
    **/
  def triggerDispose(): scala.Unit = js.native
}

