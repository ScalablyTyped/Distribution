package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vis", "Timeline")
@js.native
class Timeline protected () extends js.Object {
  def this(container: stdLib.HTMLElement, items: DataItemCollectionType) = this()
  def this(container: stdLib.HTMLElement, items: DataItemCollectionType, groups: DataGroupCollectionType) = this()
  def this(container: stdLib.HTMLElement, items: DataItemCollectionType, options: TimelineOptions) = this()
  def this(container: stdLib.HTMLElement, items: DataItemCollectionType, groups: DataGroupCollectionType, options: TimelineOptions) = this()
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
  def destroy(): scala.Unit = js.native
  /**
    * Adjust the visible window such that it fits all items. See also focus(id).
    */
  def fit(): scala.Unit = js.native
  def fit(options: TimelineAnimationOptions): scala.Unit = js.native
  def focus(ids: js.Array[IdType]): scala.Unit = js.native
  def focus(ids: js.Array[IdType], options: TimelineAnimationOptions): scala.Unit = js.native
  /**
    * Adjust the visible window such that the selected item (or multiple items) are centered on screen. See also function fit()
    */
  def focus(ids: IdType): scala.Unit = js.native
  def focus(ids: IdType, options: TimelineAnimationOptions): scala.Unit = js.native
  def focus(selection: js.Any): scala.Unit = js.native
  /**
    * Get the current time. Only applicable when option showCurrentTime is true.
    */
  def getCurrentTime(): stdLib.Date = js.native
  /**
    * Retrieve the custom time from the custom time bar with given id.
    * @param id Id is undefined by default.
    */
  def getCustomTime(): stdLib.Date = js.native
  def getCustomTime(id: IdType): stdLib.Date = js.native
  def getEventProperties(event: stdLib.Event): TimelineEventPropertiesResult = js.native
  /**
    * Get the range of all the items as an object containing min date and max date
    */
  def getItemRange(): visLib.Anon_Max = js.native
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
  def moveTo(time: DateType): scala.Unit = js.native
  def moveTo(time: DateType, options: TimelineAnimationOptions): scala.Unit = js.native
  def moveTo(
    time: DateType,
    options: TimelineAnimationOptions,
    callback: js.Function1[/* properties */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def off(event: java.lang.String): scala.Unit = js.native
  def off(event: java.lang.String, callback: js.Function1[/* properties */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  /**
    * Remove an event listener created before via function on(event[, callback]).
    */
  def off(event: TimelineEvents): scala.Unit = js.native
  def off(event: TimelineEvents, callback: js.Function1[/* properties */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def on(): scala.Unit = js.native
  def on(event: java.lang.String): scala.Unit = js.native
  def on(event: java.lang.String, callback: js.Function1[/* properties */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Create an event listener. The callback function is invoked every time the event is triggered.
    */
  def on(event: TimelineEvents): scala.Unit = js.native
  def on(event: TimelineEvents, callback: js.Function1[/* properties */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  /**
    * Force a redraw of the Timeline. The size of all items will be recalculated.
    * Can be useful to manually redraw when option autoResize=false and the window has been resized, or when the items CSS has been changed.
    */
  def redraw(): scala.Unit = js.native
  /**
    * Remove vertical bars previously added to the timeline via addCustomTime method.
    * @param id ID of the custom vertical bar returned by addCustomTime method.
    */
  def removeCustomTime(id: IdType): scala.Unit = js.native
  /**
    * Set a current time. This can be used for example to ensure that a client's time is synchronized with a shared server time.
    * Only applicable when option showCurrentTime is true.
    */
  def setCurrentTime(time: DateType): scala.Unit = js.native
  /**
    * Adjust the time of a custom time bar.
    * @param time The time the custom time bar should point to
    * @param id Id of the custom time bar, and is undefined by default.
    */
  def setCustomTime(time: DateType): scala.Unit = js.native
  def setCustomTime(time: DateType, id: IdType): scala.Unit = js.native
  /**
    * Adjust the title attribute of a custom time bar.
    * @param title The title shown when hover over time bar
    * @param id Id of the custom time bar, and is undefined by default.
    */
  def setCustomTimeTitle(title: java.lang.String): scala.Unit = js.native
  def setCustomTimeTitle(title: java.lang.String, id: IdType): scala.Unit = js.native
  /**
    * Set both groups and items at once. Both properties are optional.
    * This is a convenience method for individually calling both setItems(items) and setGroups(groups).
    * Both items and groups can be an Array with Objects, a DataSet (offering 2 way data binding), or a DataView (offering 1 way data binding).
    */
  def setData(data: visLib.Anon_Groups): scala.Unit = js.native
  /**
    * Set a data set with groups for the Timeline.
    */
  def setGroups(): scala.Unit = js.native
  def setGroups(groups: js.Array[TimelineGroup]): scala.Unit = js.native
  def setGroups(groups: DataGroupCollectionType): scala.Unit = js.native
  def setItems(): scala.Unit = js.native
  def setItems(items: js.Array[TimelineItem]): scala.Unit = js.native
  /**
    * Set a data set with items for the Timeline.
    */
  def setItems(items: DataItemCollectionType): scala.Unit = js.native
  /**
    * Set or update options. It is possible to change any option of the timeline at any time.
    * You can for example switch orientation on the fly.
    */
  def setOptions(options: TimelineOptions): scala.Unit = js.native
  def setSelection(ids: js.Array[IdType]): scala.Unit = js.native
  def setSelection(ids: js.Array[IdType], options: visLib.Anon_Animation): scala.Unit = js.native
  /**
    * Select one or multiple items by their id. The currently selected items will be unselected.
    * To unselect all selected items, call `setSelection([])`.
    */
  def setSelection(ids: IdType): scala.Unit = js.native
  def setSelection(ids: IdType, options: visLib.Anon_Animation): scala.Unit = js.native
  def setWindow(start: js.Any, date: js.Any): scala.Unit = js.native
  /**
    * Set the current visible window.
    * @param start If the parameter value of start is null, the parameter will be left unchanged.
    * @param end If the parameter value of end is null, the parameter will be left unchanged.
    * @param options Timeline animation options. See {@link TimelineAnimationOptions}
    * @param callback The callback function
    */
  def setWindow(start: DateType, end: DateType): scala.Unit = js.native
  def setWindow(start: DateType, end: DateType, options: TimelineAnimationOptions): scala.Unit = js.native
  def setWindow(
    start: DateType,
    end: DateType,
    options: TimelineAnimationOptions,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Toggle rollingMode.
    */
  def toggleRollingMode(): scala.Unit = js.native
  /**
    * Zoom in the current visible window.
    * @param percentage A number and must be between 0 and 1. If null, the window will be left unchanged.
    * @param options Timeline animation options. See {@link TimelineAnimationOptions}
    * @param callback The callback function
    */
  def zoomIn(percentage: scala.Double): scala.Unit = js.native
  def zoomIn(percentage: scala.Double, options: TimelineAnimationOptions): scala.Unit = js.native
  def zoomIn(percentage: scala.Double, options: TimelineAnimationOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Zoom out the current visible window.
    * @param percentage A number and must be between 0 and 1. If null, the window will be left unchanged.
    * @param options Timeline animation options. See {@link TimelineAnimationOptions}
    * @param callback The callback function
    */
  def zoomOut(percentage: scala.Double): scala.Unit = js.native
  def zoomOut(percentage: scala.Double, options: TimelineAnimationOptions): scala.Unit = js.native
  def zoomOut(percentage: scala.Double, options: TimelineAnimationOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

