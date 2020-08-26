package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Utilities.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a layout for the ListView.
  **/
@js.native
trait ILayout2 extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the orientation of the layout.
    **/
  var orientation: js.Any = js.native
  //#region Methods
  /**
    * Called when the ListView finishes a drag operation.
    **/
  def dragLeave(): Unit = js.native
  /**
    * Called when the ListView initiates a drag operation.
    * @param x The x-coordinate of the drag.
    * @param y The y-coordinate of the drag.
    * @param dragInfo An object that indicates whether the item is selected.
    **/
  def dragOver(x: Double, y: Double, dragInfo: Double): Unit = js.native
  /**
    * Called when the ListView requests that the ILayout2 execute animations.
    **/
  def executeAnimations(): Unit = js.native
  /**
    * Determines the next item to receive keyboard focus.
    * @param currentItem An object that describes the current item. It has these properties: index, type.
    * @param pressedKey The key that was pressed.
    * @returns An object that describes the next item that should receive focus. It has these properties: index, type.
    **/
  def getAdjacent(currentItem: js.Any, pressedKey: Key): js.Any = js.native
  /**
    * Gets the item at the specified hit-test coordinates. These coordinates are absolute coordinates (they are not relative to the layout's content area).
    * @param x The x-coordinate to test for.
    * @param y The y-coordinate to test for.
    * @returns An object that describes the item at the hit test coordinates. It has these properties: type, index.
    **/
  def hitTest(x: Double, y: Double): js.Any = js.native
  /**
    * Sets the rendering site and specifies whether the layout supports groups. This method is called by the ListView to initialize the layout.
    * @param site The rendering site for the layout.
    * @param groupsEnabled Set to true if this layout supports groups; set to false if it does not.
    **/
  def initialize(site: ILayoutSite2, groupsEnabled: Boolean): Unit = js.native
  /**
    * Retrieves the indexes of the items in the specified pixel range.
    * @param firstPixel The first pixel the range of items falls between.
    * @param lastPixel The last pixel the range of items falls between.
    **/
  def itemsFromRange(firstPixel: Double, lastPixel: Double): Unit = js.native
  /**
    * Performs a layout pass.
    * @param tree A structure representing the layout tree that is returned from the ListView.
    * @param changedRange An object that lists the index of the first item in the changed item range. This object has these properties: startIndex.
    * @param modifiedItems An object that contains the old and new indexes of the items that have been modified in the tree.
    * @param modifiedGroups An object that contains the old and new indexes of the group elements that have been modified in the tree.
    * @returns A Promise that executes after layout is complete, or an object that contains two Promise objects: realizedRangeComplete, layoutComplete.
    **/
  def layout(tree: js.Any, changedRange: js.Any, modifiedItems: js.Any, modifiedGroups: js.Any): js.Any = js.native
  /**
    * Called when the ListView requests that the ILayout2 set up animations.
    **/
  def setupAnimations(): Unit = js.native
  /**
    * Releases resources that were obtained during the call to initialize.
    **/
  def uninitialize(): Unit = js.native
}

object ILayout2 {
  @scala.inline
  def apply(
    dragLeave: () => Unit,
    dragOver: (Double, Double, Double) => Unit,
    executeAnimations: () => Unit,
    getAdjacent: (js.Any, Key) => js.Any,
    hitTest: (Double, Double) => js.Any,
    initialize: (ILayoutSite2, Boolean) => Unit,
    itemsFromRange: (Double, Double) => Unit,
    layout: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    orientation: js.Any,
    setupAnimations: () => Unit,
    uninitialize: () => Unit
  ): ILayout2 = {
    val __obj = js.Dynamic.literal(dragLeave = js.Any.fromFunction0(dragLeave), dragOver = js.Any.fromFunction3(dragOver), executeAnimations = js.Any.fromFunction0(executeAnimations), getAdjacent = js.Any.fromFunction2(getAdjacent), hitTest = js.Any.fromFunction2(hitTest), initialize = js.Any.fromFunction2(initialize), itemsFromRange = js.Any.fromFunction2(itemsFromRange), layout = js.Any.fromFunction4(layout), orientation = orientation.asInstanceOf[js.Any], setupAnimations = js.Any.fromFunction0(setupAnimations), uninitialize = js.Any.fromFunction0(uninitialize))
    __obj.asInstanceOf[ILayout2]
  }
  @scala.inline
  implicit class ILayout2Ops[Self <: ILayout2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDragLeave(value: () => Unit): Self = this.set("dragLeave", js.Any.fromFunction0(value))
    @scala.inline
    def setDragOver(value: (Double, Double, Double) => Unit): Self = this.set("dragOver", js.Any.fromFunction3(value))
    @scala.inline
    def setExecuteAnimations(value: () => Unit): Self = this.set("executeAnimations", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAdjacent(value: (js.Any, Key) => js.Any): Self = this.set("getAdjacent", js.Any.fromFunction2(value))
    @scala.inline
    def setHitTest(value: (Double, Double) => js.Any): Self = this.set("hitTest", js.Any.fromFunction2(value))
    @scala.inline
    def setInitialize(value: (ILayoutSite2, Boolean) => Unit): Self = this.set("initialize", js.Any.fromFunction2(value))
    @scala.inline
    def setItemsFromRange(value: (Double, Double) => Unit): Self = this.set("itemsFromRange", js.Any.fromFunction2(value))
    @scala.inline
    def setLayout(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("layout", js.Any.fromFunction4(value))
    @scala.inline
    def setOrientation(value: js.Any): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetupAnimations(value: () => Unit): Self = this.set("setupAnimations", js.Any.fromFunction0(value))
    @scala.inline
    def setUninitialize(value: () => Unit): Self = this.set("uninitialize", js.Any.fromFunction0(value))
  }
  
}

