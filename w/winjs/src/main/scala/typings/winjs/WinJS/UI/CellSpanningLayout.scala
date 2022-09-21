package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Utilities.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a layout for the ListView in which items are arranged in a grid and items can span multiple grid cells.
  **/
trait CellSpanningLayout extends StObject {
  
  //#endregion Constructors
  //#region Methods
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def dragLeave(): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def dragOver(): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def executeAnimations(): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param currentItem An object that describes the current item. It has these properties: index, type.
    * @param pressedKey The key that was pressed.
    * @returns An object that describes the next item that should receive focus. It has these properties: index, type.
    **/
  def getAdjacent(currentItem: Any, pressedKey: Key): Any
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the position of group headers relative to their items.
    **/
  var groupHeaderPosition: HeaderPosition
  
  /**
    * Gets or sets a function that enables cell-spanning and establishes base cell dimensions.
    **/
  var groupInfo: js.Function
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param x The x-coordinate, or the horizontal position on the screen.
    * @param y The y-coordinate, or the vertical position on the screen.
    **/
  def hitTest(x: Double, y: Double): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param site The rendering site for the layout.
    * @param groupsEnabled Set to true if this layout supports groups; set to false if it does not.
    **/
  def initialize(site: ILayoutSite2, groupsEnabled: Boolean): Unit
  
  /**
    * Gets or sets a function that returns the width and height of an item, as well as whether it should appear in a new column. Setting this function improves performance because the ListView can allocate space for an item without having to measure it first.
    **/
  var itemInfo: js.Function
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param firstPixel The first pixel the range of items falls between.
    * @param lastPixel The last pixel the range of items falls between.
    **/
  def itemsFromRange(firstPixel: Double, lastPixel: Double): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param tree
    * @param changedRange
    * @param modifiedItems
    * @param modifiedGroups
    **/
  def layout(tree: ILayoutSite2, changedRange: Any, modifiedItems: Any, modifiedGroups: Any): Unit
  
  /**
    * Gets or set the maximum number of rows or columns, depending on the orientation, to display before content begins to wrap.
    **/
  var maximumRowsOrColumns: Double
  
  /**
    * This API supports the Windows Library for JavaScript infrastructure and is not intended to be used directly from your code.
    **/
  var numberOfItemsPerItemsBlock: Any
  
  /**
    * Gets the orientation of the CellSpanningLayout. For a CellSpanningLayout, this property always returns Orientation.horizontal.
    **/
  var orientation: Orientation
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def setupAnimations(): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def uninitialize(): Unit
}
object CellSpanningLayout {
  
  inline def apply(
    dragLeave: () => Unit,
    dragOver: () => Unit,
    executeAnimations: () => Unit,
    getAdjacent: (Any, Key) => Any,
    groupHeaderPosition: HeaderPosition,
    groupInfo: js.Function,
    hitTest: (Double, Double) => Unit,
    initialize: (ILayoutSite2, Boolean) => Unit,
    itemInfo: js.Function,
    itemsFromRange: (Double, Double) => Unit,
    layout: (ILayoutSite2, Any, Any, Any) => Unit,
    maximumRowsOrColumns: Double,
    numberOfItemsPerItemsBlock: Any,
    orientation: Orientation,
    setupAnimations: () => Unit,
    uninitialize: () => Unit
  ): CellSpanningLayout = {
    val __obj = js.Dynamic.literal(dragLeave = js.Any.fromFunction0(dragLeave), dragOver = js.Any.fromFunction0(dragOver), executeAnimations = js.Any.fromFunction0(executeAnimations), getAdjacent = js.Any.fromFunction2(getAdjacent), groupHeaderPosition = groupHeaderPosition.asInstanceOf[js.Any], groupInfo = groupInfo.asInstanceOf[js.Any], hitTest = js.Any.fromFunction2(hitTest), initialize = js.Any.fromFunction2(initialize), itemInfo = itemInfo.asInstanceOf[js.Any], itemsFromRange = js.Any.fromFunction2(itemsFromRange), layout = js.Any.fromFunction4(layout), maximumRowsOrColumns = maximumRowsOrColumns.asInstanceOf[js.Any], numberOfItemsPerItemsBlock = numberOfItemsPerItemsBlock.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], setupAnimations = js.Any.fromFunction0(setupAnimations), uninitialize = js.Any.fromFunction0(uninitialize))
    __obj.asInstanceOf[CellSpanningLayout]
  }
  
  extension [Self <: CellSpanningLayout](x: Self) {
    
    inline def setDragLeave(value: () => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction0(value))
    
    inline def setDragOver(value: () => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction0(value))
    
    inline def setExecuteAnimations(value: () => Unit): Self = StObject.set(x, "executeAnimations", js.Any.fromFunction0(value))
    
    inline def setGetAdjacent(value: (Any, Key) => Any): Self = StObject.set(x, "getAdjacent", js.Any.fromFunction2(value))
    
    inline def setGroupHeaderPosition(value: HeaderPosition): Self = StObject.set(x, "groupHeaderPosition", value.asInstanceOf[js.Any])
    
    inline def setGroupInfo(value: js.Function): Self = StObject.set(x, "groupInfo", value.asInstanceOf[js.Any])
    
    inline def setHitTest(value: (Double, Double) => Unit): Self = StObject.set(x, "hitTest", js.Any.fromFunction2(value))
    
    inline def setInitialize(value: (ILayoutSite2, Boolean) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    inline def setItemInfo(value: js.Function): Self = StObject.set(x, "itemInfo", value.asInstanceOf[js.Any])
    
    inline def setItemsFromRange(value: (Double, Double) => Unit): Self = StObject.set(x, "itemsFromRange", js.Any.fromFunction2(value))
    
    inline def setLayout(value: (ILayoutSite2, Any, Any, Any) => Unit): Self = StObject.set(x, "layout", js.Any.fromFunction4(value))
    
    inline def setMaximumRowsOrColumns(value: Double): Self = StObject.set(x, "maximumRowsOrColumns", value.asInstanceOf[js.Any])
    
    inline def setNumberOfItemsPerItemsBlock(value: Any): Self = StObject.set(x, "numberOfItemsPerItemsBlock", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setSetupAnimations(value: () => Unit): Self = StObject.set(x, "setupAnimations", js.Any.fromFunction0(value))
    
    inline def setUninitialize(value: () => Unit): Self = StObject.set(x, "uninitialize", js.Any.fromFunction0(value))
  }
}
