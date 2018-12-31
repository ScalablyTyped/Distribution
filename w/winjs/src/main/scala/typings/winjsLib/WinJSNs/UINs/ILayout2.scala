package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a layout for the ListView.
  **/
trait ILayout2 extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the orientation of the layout.
    **/
  var orientation: js.Any
  //#region Methods
  /**
    * Called when the ListView finishes a drag operation.
    **/
  def dragLeave(): scala.Unit
  /**
    * Called when the ListView initiates a drag operation.
    * @param x The x-coordinate of the drag.
    * @param y The y-coordinate of the drag.
    * @param dragInfo An object that indicates whether the item is selected.
    **/
  def dragOver(x: scala.Double, y: scala.Double, dragInfo: scala.Double): scala.Unit
  /**
    * Called when the ListView requests that the ILayout2 execute animations.
    **/
  def executeAnimations(): scala.Unit
  /**
    * Determines the next item to receive keyboard focus.
    * @param currentItem An object that describes the current item. It has these properties: index, type.
    * @param pressedKey The key that was pressed.
    * @returns An object that describes the next item that should receive focus. It has these properties: index, type.
    **/
  def getAdjacent(currentItem: js.Any, pressedKey: winjsLib.WinJSNs.UtilitiesNs.Key): js.Any
  /**
    * Gets the item at the specified hit-test coordinates. These coordinates are absolute coordinates (they are not relative to the layout's content area).
    * @param x The x-coordinate to test for.
    * @param y The y-coordinate to test for.
    * @returns An object that describes the item at the hit test coordinates. It has these properties: type, index.
    **/
  def hitTest(x: scala.Double, y: scala.Double): js.Any
  /**
    * Sets the rendering site and specifies whether the layout supports groups. This method is called by the ListView to initialize the layout.
    * @param site The rendering site for the layout.
    * @param groupsEnabled Set to true if this layout supports groups; set to false if it does not.
    **/
  def initialize(site: ILayoutSite2, groupsEnabled: scala.Boolean): scala.Unit
  /**
    * Retrieves the indexes of the items in the specified pixel range.
    * @param firstPixel The first pixel the range of items falls between.
    * @param lastPixel The last pixel the range of items falls between.
    **/
  def itemsFromRange(firstPixel: scala.Double, lastPixel: scala.Double): scala.Unit
  /**
    * Performs a layout pass.
    * @param tree A structure representing the layout tree that is returned from the ListView.
    * @param changedRange An object that lists the index of the first item in the changed item range. This object has these properties: startIndex.
    * @param modifiedItems An object that contains the old and new indexes of the items that have been modified in the tree.
    * @param modifiedGroups An object that contains the old and new indexes of the group elements that have been modified in the tree.
    * @returns A Promise that executes after layout is complete, or an object that contains two Promise objects: realizedRangeComplete, layoutComplete.
    **/
  def layout(tree: js.Any, changedRange: js.Any, modifiedItems: js.Any, modifiedGroups: js.Any): js.Any
  /**
    * Called when the ListView requests that the ILayout2 set up animations.
    **/
  def setupAnimations(): scala.Unit
  /**
    * Releases resources that were obtained during the call to initialize.
    **/
  def uninitialize(): scala.Unit
}

