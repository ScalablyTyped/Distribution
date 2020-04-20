package typings.tabris.mod

import typings.std.Partial
import typings.std.Pick
import typings.tabris.AnonAnimate
import typings.tabris.tabrisStrings.auto
import typings.tabris.tabrisStrings.cellHeight
import typings.tabris.tabrisStrings.cellType
import typings.tabris.tabrisStrings.columnCount
import typings.tabris.tabrisStrings.createCell
import typings.tabris.tabrisStrings.itemCount
import typings.tabris.tabrisStrings.refreshEnabled
import typings.tabris.tabrisStrings.refreshIndicator
import typings.tabris.tabrisStrings.refreshMessage
import typings.tabris.tabrisStrings.scrollbarVisible
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.updateCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "CollectionView")
@js.native
class CollectionView[CellWidgetType /* <: Widget */] () extends Composite[CellWidgetType] {
  def this(properties: (Properties[CollectionView[CellWidgetType], Omit[CollectionView[CellWidgetType], set]]) with (Partial[
        Pick[CollectionView[CellWidgetType], cellHeight | cellType | createCell | updateCell]
      ])) = this()
  /**
    * The height of a collection cell. If set to `'auto'`, the cell height will be calculated individually
    * for each cell. If set to a function, this function will be called for every item, providing the item
    * index and the cell type as parameters, and must return the cell height for the given item.
    * Note: On iOS `"auto"` may cause significant performance downgrade as it requires additional layouting
    * passes to calculate cell height internally. If possible please use a combination of fixed
    * `itemHeight` and `cellType` properties to specify different height for different cells.
    */
  var cellHeight: Double | auto | (js.Function2[/* index */ Double, /* cellType */ String, Double | auto]) = js.native
  /**
    * The name of the cell type to use for the item at the given index. This name will be passed to the
    * `createCell` and `cellHeight` callbacks. Cells will be reused only for those items that map to the
    * same cell type. If set to a function, this function will be called for every item, providing the item
    * index as a parameter, and must return a unique name for the cell type to use for the given item.
    */
  var cellType: String | (js.Function1[/* index */ Double, String]) | Null = js.native
  /**
    * The number of columns to display in the collection view. If set to a value `n > 1`, each row will
    * contain `n` items. The available space will be equally distributed between columns.
    */
  var columnCount: Double = js.native
  /**
    * The index of the first item that is currently visible on screen.
    */
  val firstVisibleIndex: Double = js.native
  /**
    * The number of items to display. To add or remove items later, use the methods `insert()` and
    * `remove()` instead of setting the `itemCount`. To display a new list of items, use the `load()`
    * method.
    */
  var itemCount: Double = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_CollectionView: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) with (Partial[
    Pick[CollectionView[CellWidgetType], cellHeight | cellType | createCell | updateCell]
  ]) with js.Object = js.native
  /**
    * The index of the last item that is currently visible on screen.
    */
  val lastVisibleIndex: Double = js.native
  /**
    * Fired when the [*cellHeight*](#cellHeight) property has changed.
    */
  var onCellHeightChanged: ChangeListeners[this.type, cellHeight] = js.native
  /**
    * Fired when the [*cellType*](#cellType) property has changed.
    */
  var onCellTypeChanged: ChangeListeners[this.type, cellType] = js.native
  /**
    * Fired when the [*columnCount*](#columnCount) property has changed.
    */
  var onColumnCountChanged: ChangeListeners[this.type, columnCount] = js.native
  /**
    * Fired when the [*createCell*](#createCell) property has changed.
    */
  var onCreateCellChanged: ChangeListeners[this.type, createCell] = js.native
  /**
    * Fired when the [*firstVisibleIndex*](#firstVisibleIndex) property has changed.
    */
  var onFirstVisibleIndexChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.firstVisibleIndex] = js.native
  /**
    * Fired when the [*itemCount*](#itemCount) property has changed.
    */
  var onItemCountChanged: ChangeListeners[this.type, itemCount] = js.native
  /**
    * Fired when the [*lastVisibleIndex*](#lastVisibleIndex) property has changed.
    */
  var onLastVisibleIndexChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.lastVisibleIndex] = js.native
  /**
    * Fired when the user requested a refresh. An event listener should reset the *refreshIndicator*
    * property when refresh is finished.
    */
  var onRefresh: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the [*refreshEnabled*](#refreshEnabled) property has changed.
    */
  var onRefreshEnabledChanged: ChangeListeners[this.type, refreshEnabled] = js.native
  /**
    * Fired when the [*refreshIndicator*](#refreshIndicator) property has changed.
    */
  var onRefreshIndicatorChanged: ChangeListeners[this.type, refreshIndicator] = js.native
  /**
    * Fired when the [*refreshMessage*](#refreshMessage) property has changed.
    */
  var onRefreshMessageChanged: ChangeListeners[this.type, refreshMessage] = js.native
  /**
    * Fired while the collection view is scrolling.
    */
  var onScroll: Listeners[CollectionViewScrollEvent[this.type]] = js.native
  /**
    * Fired when the [*scrollbarVisible*](#scrollbarVisible) property has changed.
    */
  var onScrollbarVisibleChanged: ChangeListeners[this.type, scrollbarVisible] = js.native
  /**
    * Fired when the [*updateCell*](#updateCell) property has changed.
    */
  var onUpdateCellChanged: ChangeListeners[this.type, updateCell] = js.native
  /**
    * Enables the user to trigger a refresh by using the pull-to-refresh gesture.
    */
  var refreshEnabled: Boolean = js.native
  /**
    * Whether the refresh indicator is currently visible. Will be set to `true` when a *refresh* event is
    * triggered. Reset it to `false` when the refresh is finished.
    */
  var refreshIndicator: Boolean = js.native
  /**
    * The message text displayed together with the refresh indicator.
    */
  var refreshMessage: String = js.native
  /**
    * Allows to show or hide the scroll bar. When the scroll bar is hidden, it will be briefly visible
    * while scrolling.
    */
  var scrollbarVisible: Boolean = js.native
  /**
    * Returns the cell currently associated with the given item index. Returns `null` if the item is not
    * currently displayed.
    * @param itemIndex The index of the item as given in `updateCell`.
    */
  def cellByItemIndex(itemIndex: Double): CellWidgetType | Null = js.native
  /**
    * A callback used to create a new reusable cell widget for a given type. This callback will be called
    * by the framework and the created cell will be reused for different items. The created widget should
    * be populated in the `updateCell` function.
    */
  def createCell(cellType: String): CellWidgetType = js.native
  /**
    * Inserts one or more items at the given index. When no *count* is specified, a single item will be
    * added at the given *index*. New cells may be created if needed. The `updateCell` callback will only
    * be called for those new items that become immediately visible. Note that inserting new items changes
    * the index of all subsequent items. This operation will update the `itemCount` property.
    * @param index
    * @param count The position to insert the items at. A negative index is interpreted as relative to the end. If the given index is greater than the item count, new items will be appended at the end.
    */
  def insert(index: Double): Unit = js.native
  def insert(index: Double, count: Double): Unit = js.native
  /**
    * Determines the item index currently associated with the given cell.
    * @param widget A widget instance created by `createCell`, or a child of that widget.
    */
  def itemIndex(widget: Widget): Double = js.native
  /**
    * Loads a new model with the given *itemCount*. This operation will update the `itemCount` property.
    * @param itemCount The number of items in the model to load.
    */
  def load(itemCount: Double): Unit = js.native
  /**
    * Triggers an update of the item at the given *index* by calling the `updateCell` callback of the
    * corresponding. If no *index* is given, all visible items will be updated.
    * @param index The index of the item that was changed.
    */
  def refresh(): Unit = js.native
  def refresh(index: Double): Unit = js.native
  /**
    * Removes one or more items beginning with the given index. When no *count* is given, only the item at
    * *index* will be removed. Note that this changes the index of all subsequent items, however. This
    * operation will update the `itemCount` property.
    * @param index The index of the first item to remove. A negative value is interpreted as relative to the end.
    * @param count The number of items to remove.
    */
  def remove(index: Double): Unit = js.native
  def remove(index: Double, count: Double): Unit = js.native
  /**
    * Scrolls the item with the given index into view.
    * @param index The index of the item to reveal. If this is negative, it is interpreted as relative to the end
    * @param options An additional object to control the animation. Set to `{animate: false}` to scroll without an animation. The `animate` property defaults to `true` when no options object is given.
    */
  def reveal(index: Double): Unit = js.native
  def reveal(index: Double, options: AnonAnimate): Unit = js.native
  /**
    * A callback used to update a given cell widget to display the item with the given index. This callback
    * will be called by the framework.
    */
  def updateCell(cell: CellWidgetType, index: Double): Unit = js.native
}

