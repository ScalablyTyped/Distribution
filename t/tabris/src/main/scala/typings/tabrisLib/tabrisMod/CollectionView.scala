package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A scrollable list that displays data items in cells, one per row. Cells are created on demand by the
  * *createCell* callback and reused on scrolling.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._CollectionViewProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined cellHeight, cellType, columnCount, createCell, itemCount, refreshEnabled, refreshIndicator, refreshMessage, updateCell */ @JSImport("tabris", "CollectionView")
@js.native
class CollectionView () extends Widget {
  def this(properties: tabrisLib.Properties[CollectionView, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * The height of a collection cell. If set to `"auto"`, the cell height will be calculated individually
    * for each cell. If set to a function, this function will be called for every item, providing the item
    * index and the cell type as parameters, and must return the cell height for the given item.
    */
  var cellHeight: scala.Double | tabrisLib.tabrisLibStrings.auto | (js.Function2[
    /* index */ scala.Double, 
    /* cellType */ java.lang.String, 
    scala.Double | tabrisLib.tabrisLibStrings.auto
  ]) = js.native
  /**
    * The name of the cell type to use for the item at the given index. This name will be passed to the
    * `createCell` and `cellHeight` callbacks. Cells will be reused only for those items that map to the
    * same cell type. If set to a function, this function will be called for every item, providing the item
    * index as a parameter, and must return a unique name for the cell type to use for the given item.
    */
  var cellType: java.lang.String | (js.Function1[/* index */ scala.Double, java.lang.String]) | scala.Null = js.native
  /**
    * The number of columns to display in the collection view. If set to a value `n > 1`, each row will
    * contain `n` items. The available space will be equally distributed between columns. On Windows, this
    * feature cannot be combined with variable cell height.
    */
  var columnCount: scala.Double = js.native
  /**
    * The index of the first item that is currently visible on screen.
    */
  val firstVisibleIndex: scala.Double = js.native
  /**
    * The number of items to display. To add or remove items later, use the methods `insert()` and
    * `remove()` instead of setting the `itemCount`. To display a new list of items, use the `load()`
    * method.
    */
  var itemCount: scala.Double = js.native
  /**
    * The index of the last item that is currently visible on screen.
    */
  val lastVisibleIndex: scala.Double = js.native
  /**
    * Enables the user to trigger a refresh by using the pull-to-refresh gesture.
    */
  var refreshEnabled: scala.Boolean = js.native
  /**
    * Whether the refresh indicator is currently visible. Will be set to `true` when a *refresh* event is
    * triggered. Reset it to `false` when the refresh is finished.
    */
  var refreshIndicator: scala.Boolean = js.native
  /**
    * The message text displayed together with the refresh indicator. Currently not supported on Android.
    */
  var refreshMessage: java.lang.String = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_CollectionView: tabrisLib.CollectionViewProperties = js.native
  /**
    * A callback used to create a new reusable cell widget for a given type. This callback will be called
    * by the framework and the created cell will be reused for different items. The created widget should
    * be populated in the `updateCell` function.
    * @static
    */
  def createCell(cellType: java.lang.String): Widget = js.native
  /**
    * Inserts one or more items at the given index. When no *count* is specified, a single item will be
    * added at the given *index*. New cells may be created if needed. The `updateCell` callback will only
    * be called for those new items that become immediately visible. Note that inserting new items changes
    * the index of all subsequent items. This operation will update the `itemCount` property.
    * @param index 
    * @param count The position to insert the items at. A negative index is interpreted as relative to the end. If the given index is greater than the item count, new items will be appended at the end.
    */
  def insert(index: scala.Double): scala.Unit = js.native
  def insert(index: scala.Double, count: scala.Double): scala.Unit = js.native
  /**
    * Loads a new model with the given *itemCount*. This operation will update the `itemCount` property.
    * @param itemCount The number of items in the model to load.
    */
  def load(itemCount: scala.Double): scala.Unit = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: CollectionViewEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: CollectionViewEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: CollectionViewEvents): this.type = js.native
  /**
    * Triggers an update of the item at the given *index* by calling the `updateCell` callback of the
    * corresponding. If no *index* is given, all visible items will be updated.
    * @param index The index of the item that was changed.
    */
  def refresh(): scala.Unit = js.native
  def refresh(index: scala.Double): scala.Unit = js.native
  /**
    * Removes one or more items beginning with the given index. When no *count* is given, only the item at
    * *index* will be removed. Note that this changes the index of all subsequent items, however. This
    * operation will update the `itemCount` property.
    * @param index The index of the first item to remove. A negative value is interpreted as relative to the end.
    * @param count The number of items to remove.
    */
  def remove(index: scala.Double): scala.Unit = js.native
  def remove(index: scala.Double, count: scala.Double): scala.Unit = js.native
  /**
    * Scrolls the item with the given index into view.
    * @param index The index of the item to reveal. If this is negative, it is interpreted as relative to the end
    */
  def reveal(index: scala.Double): scala.Unit = js.native
  /**
    * A callback used to update a given cell widget to display the item with the given index. This callback
    * will be called by the framework.
    * @static
    */
  def updateCell(cell: Widget, index: scala.Double): scala.Unit = js.native
}

