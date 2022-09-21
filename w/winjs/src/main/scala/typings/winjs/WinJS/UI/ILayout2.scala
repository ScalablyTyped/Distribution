package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Utilities.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a layout for the ListView.
  **/
trait ILayout2 extends StObject {
  
  //#region Methods
  /**
    * Called when the ListView finishes a drag operation.
    **/
  def dragLeave(): Unit
  
  /**
    * Called when the ListView initiates a drag operation.
    * @param x The x-coordinate of the drag.
    * @param y The y-coordinate of the drag.
    * @param dragInfo An object that indicates whether the item is selected.
    **/
  def dragOver(x: Double, y: Double, dragInfo: Double): Unit
  
  /**
    * Called when the ListView requests that the ILayout2 execute animations.
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
    * Gets the item at the specified hit-test coordinates. These coordinates are absolute coordinates (they are not relative to the layout's content area).
    * @param x The x-coordinate to test for.
    * @param y The y-coordinate to test for.
    * @returns An object that describes the item at the hit test coordinates. It has these properties: type, index.
    **/
  def hitTest(x: Double, y: Double): Any
  
  /**
    * Sets the rendering site and specifies whether the layout supports groups. This method is called by the ListView to initialize the layout.
    * @param site The rendering site for the layout.
    * @param groupsEnabled Set to true if this layout supports groups; set to false if it does not.
    **/
  def initialize(site: ILayoutSite2, groupsEnabled: Boolean): Unit
  
  /**
    * Retrieves the indexes of the items in the specified pixel range.
    * @param firstPixel The first pixel the range of items falls between.
    * @param lastPixel The last pixel the range of items falls between.
    **/
  def itemsFromRange(firstPixel: Double, lastPixel: Double): Unit
  
  /**
    * Performs a layout pass.
    * @param tree A structure representing the layout tree that is returned from the ListView.
    * @param changedRange An object that lists the index of the first item in the changed item range. This object has these properties: startIndex.
    * @param modifiedItems An object that contains the old and new indexes of the items that have been modified in the tree.
    * @param modifiedGroups An object that contains the old and new indexes of the group elements that have been modified in the tree.
    * @returns A Promise that executes after layout is complete, or an object that contains two Promise objects: realizedRangeComplete, layoutComplete.
    **/
  def layout(tree: Any, changedRange: Any, modifiedItems: Any, modifiedGroups: Any): Any
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the orientation of the layout.
    **/
  var orientation: Any
  
  /**
    * Called when the ListView requests that the ILayout2 set up animations.
    **/
  def setupAnimations(): Unit
  
  /**
    * Releases resources that were obtained during the call to initialize.
    **/
  def uninitialize(): Unit
}
object ILayout2 {
  
  inline def apply(
    dragLeave: () => Unit,
    dragOver: (Double, Double, Double) => Unit,
    executeAnimations: () => Unit,
    getAdjacent: (Any, Key) => Any,
    hitTest: (Double, Double) => Any,
    initialize: (ILayoutSite2, Boolean) => Unit,
    itemsFromRange: (Double, Double) => Unit,
    layout: (Any, Any, Any, Any) => Any,
    orientation: Any,
    setupAnimations: () => Unit,
    uninitialize: () => Unit
  ): ILayout2 = {
    val __obj = js.Dynamic.literal(dragLeave = js.Any.fromFunction0(dragLeave), dragOver = js.Any.fromFunction3(dragOver), executeAnimations = js.Any.fromFunction0(executeAnimations), getAdjacent = js.Any.fromFunction2(getAdjacent), hitTest = js.Any.fromFunction2(hitTest), initialize = js.Any.fromFunction2(initialize), itemsFromRange = js.Any.fromFunction2(itemsFromRange), layout = js.Any.fromFunction4(layout), orientation = orientation.asInstanceOf[js.Any], setupAnimations = js.Any.fromFunction0(setupAnimations), uninitialize = js.Any.fromFunction0(uninitialize))
    __obj.asInstanceOf[ILayout2]
  }
  
  extension [Self <: ILayout2](x: Self) {
    
    inline def setDragLeave(value: () => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction0(value))
    
    inline def setDragOver(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction3(value))
    
    inline def setExecuteAnimations(value: () => Unit): Self = StObject.set(x, "executeAnimations", js.Any.fromFunction0(value))
    
    inline def setGetAdjacent(value: (Any, Key) => Any): Self = StObject.set(x, "getAdjacent", js.Any.fromFunction2(value))
    
    inline def setHitTest(value: (Double, Double) => Any): Self = StObject.set(x, "hitTest", js.Any.fromFunction2(value))
    
    inline def setInitialize(value: (ILayoutSite2, Boolean) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    inline def setItemsFromRange(value: (Double, Double) => Unit): Self = StObject.set(x, "itemsFromRange", js.Any.fromFunction2(value))
    
    inline def setLayout(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "layout", js.Any.fromFunction4(value))
    
    inline def setOrientation(value: Any): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setSetupAnimations(value: () => Unit): Self = StObject.set(x, "setupAnimations", js.Any.fromFunction0(value))
    
    inline def setUninitialize(value: () => Unit): Self = StObject.set(x, "uninitialize", js.Any.fromFunction0(value))
  }
}
