package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// CollectionView
trait _CollectionViewProperties extends _WidgetProperties {
  /**
    * The height of a collection cell. If set to `"auto"`, the cell height will be calculated individually
    * for each cell. If set to a function, this function will be called for every item, providing the item
    * index and the cell type as parameters, and must return the cell height for the given item.
    */
  var cellHeight: scala.Double | tabrisLib.tabrisLibStrings.auto | (js.Function2[
    /* index */ scala.Double, 
    /* cellType */ java.lang.String, 
    scala.Double | tabrisLib.tabrisLibStrings.auto
  ])
  /**
    * The name of the cell type to use for the item at the given index. This name will be passed to the
    * `createCell` and `cellHeight` callbacks. Cells will be reused only for those items that map to the
    * same cell type. If set to a function, this function will be called for every item, providing the item
    * index as a parameter, and must return a unique name for the cell type to use for the given item.
    */
  var cellType: java.lang.String | (js.Function1[/* index */ scala.Double, java.lang.String]) | scala.Null
  /**
    * The number of columns to display in the collection view. If set to a value `n > 1`, each row will
    * contain `n` items. The available space will be equally distributed between columns. On Windows, this
    * feature cannot be combined with variable cell height.
    */
  var columnCount: scala.Double
  /**
    * The number of items to display. To add or remove items later, use the methods `insert()` and
    * `remove()` instead of setting the `itemCount`. To display a new list of items, use the `load()`
    * method.
    */
  var itemCount: scala.Double
  /**
    * Enables the user to trigger a refresh by using the pull-to-refresh gesture.
    */
  var refreshEnabled: scala.Boolean
  /**
    * Whether the refresh indicator is currently visible. Will be set to `true` when a *refresh* event is
    * triggered. Reset it to `false` when the refresh is finished.
    */
  var refreshIndicator: scala.Boolean
  /**
    * The message text displayed together with the refresh indicator. Currently not supported on Android.
    */
  var refreshMessage: java.lang.String
  /**
    * A callback used to create a new reusable cell widget for a given type. This callback will be called
    * by the framework and the created cell will be reused for different items. The created widget should
    * be populated in the `updateCell` function.
    * @static
    */
  def createCell(cellType: java.lang.String): Widget
  /**
    * A callback used to update a given cell widget to display the item with the given index. This callback
    * will be called by the framework.
    * @static
    */
  def updateCell(cell: Widget, index: scala.Double): scala.Unit
}

object _CollectionViewProperties {
  @scala.inline
  def apply(
    background: tabrisLib.Color,
    backgroundImage: tabrisLib.Image,
    baseline: Widget | tabrisLib.Selector,
    bottom: tabrisLib.margin,
    cellHeight: scala.Double | tabrisLib.tabrisLibStrings.auto | (js.Function2[
      /* index */ scala.Double, 
      /* cellType */ java.lang.String, 
      scala.Double | tabrisLib.tabrisLibStrings.auto
    ]),
    centerX: tabrisLib.offset,
    centerY: tabrisLib.offset,
    `class`: java.lang.String,
    classList: js.Array[java.lang.String],
    columnCount: scala.Double,
    cornerRadius: scala.Double,
    createCell: java.lang.String => Widget,
    elevation: scala.Double,
    enabled: scala.Boolean,
    height: tabrisLib.dimension,
    highlightOnTouch: scala.Boolean,
    id: java.lang.String,
    itemCount: scala.Double,
    layoutData: LayoutData,
    left: tabrisLib.margin,
    opacity: scala.Double,
    refreshEnabled: scala.Boolean,
    refreshIndicator: scala.Boolean,
    refreshMessage: java.lang.String,
    right: tabrisLib.margin,
    top: tabrisLib.margin,
    transform: Transformation,
    updateCell: (Widget, scala.Double) => scala.Unit,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    cellType: java.lang.String | (js.Function1[/* index */ scala.Double, java.lang.String]) = null,
    font: tabrisLib.Font = null
  ): _CollectionViewProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, cellHeight = cellHeight.asInstanceOf[js.Any], centerX = centerX, centerY = centerY, classList = classList, columnCount = columnCount, cornerRadius = cornerRadius, createCell = js.Any.fromFunction1(createCell), elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, itemCount = itemCount, layoutData = layoutData, left = left, opacity = opacity, refreshEnabled = refreshEnabled, refreshIndicator = refreshIndicator, refreshMessage = refreshMessage, right = right, top = top, transform = transform, updateCell = js.Any.fromFunction2(updateCell), visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (cellType != null) __obj.updateDynamic("cellType")(cellType.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_CollectionViewProperties]
  }
}

