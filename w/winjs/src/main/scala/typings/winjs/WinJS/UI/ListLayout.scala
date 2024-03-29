package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Utilities.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a layout for the ListView in which items are arranged in a vertical list.
  **/
trait ListLayout extends StObject {
  
  //#endregion Methods
  //#region Properties
  /**
    * This property is no longer supported. Starting with Windows Library for JavaScript 2.0, use the .win-listview.win-container.win-backdrop CSS selector.
    **/
  var backdropColor: String
  
  /**
    * This property is no longer supported. Starting with Windows Library for JavaScript 2.0, use the .win-listview.win-container.win-backdrop CSS selector.
    **/
  var disableBackdrop: Boolean
  
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
    * Determines the next item to receive keyboard focus.
    * @param currentItem An object that describes the current item. It has these properties: index, type.
    * @param pressedKey The key that was pressed.
    * @returns An object that describes the next item that should receive focus. It has these properties: index, type.
    **/
  def getAdjacent(currentItem: Any, pressedKey: Key): Any
  
  /**
    * Gets or sets the position of group headers.
    **/
  var groupHeaderPosition: HeaderPosition
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param x The x-coordinate, or the horizontal position on the screen.
    * @param y The y-coordinate, or the vertical position on the screen.
    **/
  def hitTest(x: Double, y: Double): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def initialize(): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param firstPixel
    * @param lastPixel
    **/
  def itemsFromRange(firstPixel: Double, lastPixel: Double): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param tree
    * @param changedRange
    * @param modifiedItems
    * @param modifiedGroups
    **/
  def layout(tree: Any, changedRange: Any, modifiedItems: Any, modifiedGroups: Any): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var numberOfItemsPerItemsBlock: Any
  
  /**
    * Gets or sets the orientation of the GridLayout.
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
object ListLayout {
  
  inline def apply(
    backdropColor: String,
    disableBackdrop: Boolean,
    dragLeave: () => Unit,
    dragOver: () => Unit,
    executeAnimations: () => Unit,
    getAdjacent: (Any, Key) => Any,
    groupHeaderPosition: HeaderPosition,
    hitTest: (Double, Double) => Unit,
    initialize: () => Unit,
    itemsFromRange: (Double, Double) => Unit,
    layout: (Any, Any, Any, Any) => Unit,
    numberOfItemsPerItemsBlock: Any,
    orientation: Orientation,
    setupAnimations: () => Unit,
    uninitialize: () => Unit
  ): ListLayout = {
    val __obj = js.Dynamic.literal(backdropColor = backdropColor.asInstanceOf[js.Any], disableBackdrop = disableBackdrop.asInstanceOf[js.Any], dragLeave = js.Any.fromFunction0(dragLeave), dragOver = js.Any.fromFunction0(dragOver), executeAnimations = js.Any.fromFunction0(executeAnimations), getAdjacent = js.Any.fromFunction2(getAdjacent), groupHeaderPosition = groupHeaderPosition.asInstanceOf[js.Any], hitTest = js.Any.fromFunction2(hitTest), initialize = js.Any.fromFunction0(initialize), itemsFromRange = js.Any.fromFunction2(itemsFromRange), layout = js.Any.fromFunction4(layout), numberOfItemsPerItemsBlock = numberOfItemsPerItemsBlock.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], setupAnimations = js.Any.fromFunction0(setupAnimations), uninitialize = js.Any.fromFunction0(uninitialize))
    __obj.asInstanceOf[ListLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLayout] (val x: Self) extends AnyVal {
    
    inline def setBackdropColor(value: String): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
    
    inline def setDisableBackdrop(value: Boolean): Self = StObject.set(x, "disableBackdrop", value.asInstanceOf[js.Any])
    
    inline def setDragLeave(value: () => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction0(value))
    
    inline def setDragOver(value: () => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction0(value))
    
    inline def setExecuteAnimations(value: () => Unit): Self = StObject.set(x, "executeAnimations", js.Any.fromFunction0(value))
    
    inline def setGetAdjacent(value: (Any, Key) => Any): Self = StObject.set(x, "getAdjacent", js.Any.fromFunction2(value))
    
    inline def setGroupHeaderPosition(value: HeaderPosition): Self = StObject.set(x, "groupHeaderPosition", value.asInstanceOf[js.Any])
    
    inline def setHitTest(value: (Double, Double) => Unit): Self = StObject.set(x, "hitTest", js.Any.fromFunction2(value))
    
    inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    inline def setItemsFromRange(value: (Double, Double) => Unit): Self = StObject.set(x, "itemsFromRange", js.Any.fromFunction2(value))
    
    inline def setLayout(value: (Any, Any, Any, Any) => Unit): Self = StObject.set(x, "layout", js.Any.fromFunction4(value))
    
    inline def setNumberOfItemsPerItemsBlock(value: Any): Self = StObject.set(x, "numberOfItemsPerItemsBlock", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setSetupAnimations(value: () => Unit): Self = StObject.set(x, "setupAnimations", js.Any.fromFunction0(value))
    
    inline def setUninitialize(value: () => Unit): Self = StObject.set(x, "uninitialize", js.Any.fromFunction0(value))
  }
}
