package typings.winjs.mod.UI

import typings.winjs.WinJS.UI.ILayoutSite2
import typings.winjs.WinJS.Utilities.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a layout for the ListView in which items are arranged in a grid and items can span multiple grid cells.
  **/
@JSImport("winjs", "UI.CellSpanningLayout")
@js.native
//#region Constructors
/**
  * Creates a new CellSpanningLayout.
  * @constructor
  * @param options An object that contains one or more property/value pairs to apply to the new CellSpanningLayout. Each property of the options object corresponds to one of the object's properties or events. Event names must begin with "on".
  **/
class CellSpanningLayout ()
  extends StObject
     with typings.winjs.WinJS.UI.CellSpanningLayout {
  def this(options: js.Any) = this()
  
  //#endregion Constructors
  //#region Methods
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  /* CompleteClass */
  override def dragLeave(): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  /* CompleteClass */
  override def dragOver(): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  /* CompleteClass */
  override def executeAnimations(): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param currentItem An object that describes the current item. It has these properties: index, type.
    * @param pressedKey The key that was pressed.
    * @returns An object that describes the next item that should receive focus. It has these properties: index, type.
    **/
  /* CompleteClass */
  override def getAdjacent(currentItem: js.Any, pressedKey: Key): js.Any = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the position of group headers relative to their items.
    **/
  /* CompleteClass */
  var groupHeaderPosition: typings.winjs.WinJS.UI.HeaderPosition = js.native
  
  /**
    * Gets or sets a function that enables cell-spanning and establishes base cell dimensions.
    **/
  /* CompleteClass */
  var groupInfo: js.Function = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param x The x-coordinate, or the horizontal position on the screen.
    * @param y The y-coordinate, or the vertical position on the screen.
    **/
  /* CompleteClass */
  override def hitTest(x: Double, y: Double): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param site The rendering site for the layout.
    * @param groupsEnabled Set to true if this layout supports groups; set to false if it does not.
    **/
  /* CompleteClass */
  override def initialize(site: ILayoutSite2, groupsEnabled: Boolean): Unit = js.native
  
  /**
    * Gets or sets a function that returns the width and height of an item, as well as whether it should appear in a new column. Setting this function improves performance because the ListView can allocate space for an item without having to measure it first.
    **/
  /* CompleteClass */
  var itemInfo: js.Function = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param firstPixel The first pixel the range of items falls between.
    * @param lastPixel The last pixel the range of items falls between.
    **/
  /* CompleteClass */
  override def itemsFromRange(firstPixel: Double, lastPixel: Double): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param tree
    * @param changedRange
    * @param modifiedItems
    * @param modifiedGroups
    **/
  /* CompleteClass */
  override def layout(tree: ILayoutSite2, changedRange: js.Any, modifiedItems: js.Any, modifiedGroups: js.Any): Unit = js.native
  
  /**
    * Gets or set the maximum number of rows or columns, depending on the orientation, to display before content begins to wrap.
    **/
  /* CompleteClass */
  var maximumRowsOrColumns: Double = js.native
  
  /**
    * This API supports the Windows Library for JavaScript infrastructure and is not intended to be used directly from your code.
    **/
  /* CompleteClass */
  var numberOfItemsPerItemsBlock: js.Any = js.native
  
  /**
    * Gets the orientation of the CellSpanningLayout. For a CellSpanningLayout, this property always returns Orientation.horizontal.
    **/
  /* CompleteClass */
  var orientation: typings.winjs.WinJS.UI.Orientation = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  /* CompleteClass */
  override def setupAnimations(): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  /* CompleteClass */
  override def uninitialize(): Unit = js.native
}
object CellSpanningLayout {
  
  @JSImport("winjs", "UI.CellSpanningLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.CellSpanningLayout.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
