package typings.vis.mod

import typings.std.Date
import typings.std.Event
import typings.std.HTMLElement
import typings.vis.anon.Animation
import typings.vis.anon.Groups
import typings.vis.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vis", "Timeline")
@js.native
class Timeline protected () extends js.Object {
  def this(container: HTMLElement, items: DataItemCollectionType) = this()
  def this(container: HTMLElement, items: DataItemCollectionType, groups: DataGroupCollectionType) = this()
  def this(container: HTMLElement, items: DataItemCollectionType, options: TimelineOptions) = this()
  def this(
    container: HTMLElement,
    items: DataItemCollectionType,
    groups: DataGroupCollectionType,
    options: TimelineOptions
  ) = this()
  /**
    * Add new vertical bar representing a custom time that can be dragged by the user.
    * Parameter time can be a Date, Number, or String, and is new Date() by default.
    * Parameter id can be Number or String and is undefined by default.
    * The id is added as CSS class name of the custom time bar, allowing to style multiple time bars differently.
    * The method returns id of the created bar.
    */
  def addCustomTime(time: DateType): IdType = js.native
  def addCustomTime(time: DateType, id: IdType): IdType = js.native
  /**
    * Destroy the Timeline. The timeline is removed from memory. all DOM elements and event listeners are cleaned up.
    */
  def destroy(): Unit = js.native
  /**
    * Adjust the visible window such that it fits all items. See also focus(id).
    */
  def fit(): Unit = js.native
  def fit(options: TimelineAnimationOptions): Unit = js.native
  def focus(ids: js.Array[IdType]): Unit = js.native
  def focus(ids: js.Array[IdType], options: TimelineAnimationOptions): Unit = js.native
  /**
    * Adjust the visible window such that the selected item (or multiple items) are centered on screen. See also function fit()
    */
  def focus(ids: IdType): Unit = js.native
  def focus(ids: IdType, options: TimelineAnimationOptions): Unit = js.native
  def focus(selection: js.Any): Unit = js.native
  /**
    * Get the current time. Only applicable when option showCurrentTime is true.
    */
  def getCurrentTime(): Date = js.native
  /**
    * Retrieve the custom time from the custom time bar with given id.
    * @param id Id is undefined by default.
    */
  def getCustomTime(): Date = js.native
  def getCustomTime(id: IdType): Date = js.native
  def getEventProperties(event: Event): TimelineEventPropertiesResult = js.native
  /**
    * Get the range of all the items as an object containing min date and max date
    */
  def getItemRange(): Max = js.native
  /**
    * Get an array with the ids of the currently selected items
    */
  def getSelection(): js.Array[IdType] = js.native
  /**
    * Get an array with the ids of the currently visible items.
    */
  def getVisibleItems(): js.Array[IdType] = js.native
  /**
    * Get the current visible window.
    */
  def getWindow(): TimelineWindow = js.native
  /**
    * Move the window such that given time is centered on screen.
    */
  def moveTo(time: DateType): Unit = js.native
  def moveTo(time: DateType, options: TimelineAnimationOptions): Unit = js.native
  def moveTo(
    time: DateType,
    options: TimelineAnimationOptions,
    callback: js.Function1[/* properties */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def off(event: String): Unit = js.native
  def off(event: String, callback: js.Function1[/* properties */ js.UndefOr[js.Any], Unit]): Unit = js.native
  /**
    * Remove an event listener created before via function on(event[, callback]).
    */
  def off(event: TimelineEvents): Unit = js.native
  def off(event: TimelineEvents, callback: js.Function1[/* properties */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def on(): Unit = js.native
  def on(event: String): Unit = js.native
  def on(event: String, callback: js.Function1[/* properties */ js.Any, Unit]): Unit = js.native
  /**
    * Create an event listener. The callback function is invoked every time the event is triggered.
    */
  def on(event: TimelineEvents): Unit = js.native
  def on(event: TimelineEvents, callback: js.Function1[/* properties */ js.UndefOr[js.Any], Unit]): Unit = js.native
  /**
    * Force a redraw of the Timeline. The size of all items will be recalculated.
    * Can be useful to manually redraw when option autoResize=false and the window has been resized, or when the items CSS has been changed.
    */
  def redraw(): Unit = js.native
  /**
    * Remove vertical bars previously added to the timeline via addCustomTime method.
    * @param id ID of the custom vertical bar returned by addCustomTime method.
    */
  def removeCustomTime(id: IdType): Unit = js.native
  /**
    * Set a current time. This can be used for example to ensure that a client's time is synchronized with a shared server time.
    * Only applicable when option showCurrentTime is true.
    */
  def setCurrentTime(time: DateType): Unit = js.native
  /**
    * Adjust the time of a custom time bar.
    * @param time The time the custom time bar should point to
    * @param id Id of the custom time bar, and is undefined by default.
    */
  def setCustomTime(time: DateType): Unit = js.native
  def setCustomTime(time: DateType, id: IdType): Unit = js.native
  /**
    * Adjust the title attribute of a custom time bar.
    * @param title The title shown when hover over time bar
    * @param id Id of the custom time bar, and is undefined by default.
    */
  def setCustomTimeTitle(title: String): Unit = js.native
  def setCustomTimeTitle(title: String, id: IdType): Unit = js.native
  /**
    * Set both groups and items at once. Both properties are optional.
    * This is a convenience method for individually calling both setItems(items) and setGroups(groups).
    * Both items and groups can be an Array with Objects, a DataSet (offering 2 way data binding), or a DataView (offering 1 way data binding).
    */
  def setData(data: Groups): Unit = js.native
  /**
    * Set a data set with groups for the Timeline.
    */
  def setGroups(): Unit = js.native
  def setGroups(groups: js.Array[TimelineGroup]): Unit = js.native
  def setGroups(groups: DataGroupCollectionType): Unit = js.native
  def setItems(): Unit = js.native
  def setItems(items: js.Array[TimelineItem]): Unit = js.native
  /**
    * Set a data set with items for the Timeline.
    */
  def setItems(items: DataItemCollectionType): Unit = js.native
  /**
    * Set or update options. It is possible to change any option of the timeline at any time.
    * You can for example switch orientation on the fly.
    */
  def setOptions(options: TimelineOptions): Unit = js.native
  def setSelection(ids: js.Array[IdType]): Unit = js.native
  def setSelection(ids: js.Array[IdType], options: Animation): Unit = js.native
  /**
    * Select one or multiple items by their id. The currently selected items will be unselected.
    * To unselect all selected items, call `setSelection([])`.
    */
  def setSelection(ids: IdType): Unit = js.native
  def setSelection(ids: IdType, options: Animation): Unit = js.native
  def setWindow(start: js.Any, date: js.Any): Unit = js.native
  /**
    * Set the current visible window.
    * @param start If the parameter value of start is null, the parameter will be left unchanged.
    * @param end If the parameter value of end is null, the parameter will be left unchanged.
    * @param options Timeline animation options. See {@link TimelineAnimationOptions}
    * @param callback The callback function
    */
  def setWindow(start: DateType, end: DateType): Unit = js.native
  def setWindow(start: DateType, end: DateType, options: TimelineAnimationOptions): Unit = js.native
  def setWindow(start: DateType, end: DateType, options: TimelineAnimationOptions, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Toggle rollingMode.
    */
  def toggleRollingMode(): Unit = js.native
  /**
    * Zoom in the current visible window.
    * @param percentage A number and must be between 0 and 1. If null, the window will be left unchanged.
    * @param options Timeline animation options. See {@link TimelineAnimationOptions}
    * @param callback The callback function
    */
  def zoomIn(percentage: Double): Unit = js.native
  def zoomIn(percentage: Double, options: TimelineAnimationOptions): Unit = js.native
  def zoomIn(percentage: Double, options: TimelineAnimationOptions, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Zoom out the current visible window.
    * @param percentage A number and must be between 0 and 1. If null, the window will be left unchanged.
    * @param options Timeline animation options. See {@link TimelineAnimationOptions}
    * @param callback The callback function
    */
  def zoomOut(percentage: Double): Unit = js.native
  def zoomOut(percentage: Double, options: TimelineAnimationOptions): Unit = js.native
  def zoomOut(percentage: Double, options: TimelineAnimationOptions, callback: js.Function0[Unit]): Unit = js.native
}

