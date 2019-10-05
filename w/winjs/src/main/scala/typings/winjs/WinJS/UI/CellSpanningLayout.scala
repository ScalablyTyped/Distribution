package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Utilities.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a layout for the ListView in which items are arranged in a grid and items can span multiple grid cells.
  **/
@JSGlobal("WinJS.UI.CellSpanningLayout")
@js.native
//#region Constructors
/**
  * Creates a new CellSpanningLayout.
  * @constructor
  * @param options An object that contains one or more property/value pairs to apply to the new CellSpanningLayout. Each property of the options object corresponds to one of the object's properties or events. Event names must begin with "on".
  **/
class CellSpanningLayout () extends js.Object {
  def this(options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the position of group headers relative to their items.
    **/
  var groupHeaderPosition: HeaderPosition = js.native
  /**
    * Gets or sets a function that enables cell-spanning and establishes base cell dimensions.
    **/
  var groupInfo: js.Function = js.native
  /**
    * Gets or sets a function that returns the width and height of an item, as well as whether it should appear in a new column. Setting this function improves performance because the ListView can allocate space for an item without having to measure it first.
    **/
  var itemInfo: js.Function = js.native
  /**
    * Gets or set the maximum number of rows or columns, depending on the orientation, to display before content begins to wrap.
    **/
  var maximumRowsOrColumns: Double = js.native
  /**
    * This API supports the Windows Library for JavaScript infrastructure and is not intended to be used directly from your code.
    **/
  var numberOfItemsPerItemsBlock: js.Any = js.native
  /**
    * Gets the orientation of the CellSpanningLayout. For a CellSpanningLayout, this property always returns Orientation.horizontal.
    **/
  var orientation: Orientation = js.native
  //#endregion Constructors
  //#region Methods
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def dragLeave(): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def dragOver(): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def executeAnimations(): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param currentItem An object that describes the current item. It has these properties: index, type.
    * @param pressedKey The key that was pressed.
    * @returns An object that describes the next item that should receive focus. It has these properties: index, type.
    **/
  def getAdjacent(currentItem: js.Any, pressedKey: Key): js.Any = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param x The x-coordinate, or the horizontal position on the screen.
    * @param y The y-coordinate, or the vertical position on the screen.
    **/
  def hitTest(x: Double, y: Double): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param site The rendering site for the layout.
    * @param groupsEnabled Set to true if this layout supports groups; set to false if it does not.
    **/
  def initialize(site: ILayoutSite2, groupsEnabled: Boolean): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param firstPixel The first pixel the range of items falls between.
    * @param lastPixel The last pixel the range of items falls between.
    **/
  def itemsFromRange(firstPixel: Double, lastPixel: Double): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param tree
    * @param changedRange
    * @param modifiedItems
    * @param modifiedGroups
    **/
  def layout(tree: ILayoutSite2, changedRange: js.Any, modifiedItems: js.Any, modifiedGroups: js.Any): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def setupAnimations(): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def uninitialize(): Unit = js.native
}

/* static members */
@JSGlobal("WinJS.UI.CellSpanningLayout")
@js.native
object CellSpanningLayout extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

