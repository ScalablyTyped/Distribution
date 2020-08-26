package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Utilities.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a layout for the ListView in which items are arranged in a vertical list.
  **/
@js.native
trait ListLayout extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * This property is no longer supported. Starting with Windows Library for JavaScript 2.0, use the .win-listview.win-container.win-backdrop CSS selector.
    **/
  var backdropColor: String = js.native
  /**
    * This property is no longer supported. Starting with Windows Library for JavaScript 2.0, use the .win-listview.win-container.win-backdrop CSS selector.
    **/
  var disableBackdrop: Boolean = js.native
  /**
    * Gets or sets the position of group headers.
    **/
  var groupHeaderPosition: HeaderPosition = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var numberOfItemsPerItemsBlock: js.Any = js.native
  /**
    * Gets or sets the orientation of the GridLayout.
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
    * Determines the next item to receive keyboard focus.
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
    **/
  def initialize(): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param firstPixel
    * @param lastPixel
    **/
  def itemsFromRange(firstPixel: Double, lastPixel: Double): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param tree
    * @param changedRange
    * @param modifiedItems
    * @param modifiedGroups
    **/
  def layout(tree: js.Any, changedRange: js.Any, modifiedItems: js.Any, modifiedGroups: js.Any): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def setupAnimations(): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def uninitialize(): Unit = js.native
}

object ListLayout {
  @scala.inline
  def apply(
    backdropColor: String,
    disableBackdrop: Boolean,
    dragLeave: () => Unit,
    dragOver: () => Unit,
    executeAnimations: () => Unit,
    getAdjacent: (js.Any, Key) => js.Any,
    groupHeaderPosition: HeaderPosition,
    hitTest: (Double, Double) => Unit,
    initialize: () => Unit,
    itemsFromRange: (Double, Double) => Unit,
    layout: (js.Any, js.Any, js.Any, js.Any) => Unit,
    numberOfItemsPerItemsBlock: js.Any,
    orientation: Orientation,
    setupAnimations: () => Unit,
    uninitialize: () => Unit
  ): ListLayout = {
    val __obj = js.Dynamic.literal(backdropColor = backdropColor.asInstanceOf[js.Any], disableBackdrop = disableBackdrop.asInstanceOf[js.Any], dragLeave = js.Any.fromFunction0(dragLeave), dragOver = js.Any.fromFunction0(dragOver), executeAnimations = js.Any.fromFunction0(executeAnimations), getAdjacent = js.Any.fromFunction2(getAdjacent), groupHeaderPosition = groupHeaderPosition.asInstanceOf[js.Any], hitTest = js.Any.fromFunction2(hitTest), initialize = js.Any.fromFunction0(initialize), itemsFromRange = js.Any.fromFunction2(itemsFromRange), layout = js.Any.fromFunction4(layout), numberOfItemsPerItemsBlock = numberOfItemsPerItemsBlock.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], setupAnimations = js.Any.fromFunction0(setupAnimations), uninitialize = js.Any.fromFunction0(uninitialize))
    __obj.asInstanceOf[ListLayout]
  }
  @scala.inline
  implicit class ListLayoutOps[Self <: ListLayout] (val x: Self) extends AnyVal {
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
    def setBackdropColor(value: String): Self = this.set("backdropColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableBackdrop(value: Boolean): Self = this.set("disableBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragLeave(value: () => Unit): Self = this.set("dragLeave", js.Any.fromFunction0(value))
    @scala.inline
    def setDragOver(value: () => Unit): Self = this.set("dragOver", js.Any.fromFunction0(value))
    @scala.inline
    def setExecuteAnimations(value: () => Unit): Self = this.set("executeAnimations", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAdjacent(value: (js.Any, Key) => js.Any): Self = this.set("getAdjacent", js.Any.fromFunction2(value))
    @scala.inline
    def setGroupHeaderPosition(value: HeaderPosition): Self = this.set("groupHeaderPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setHitTest(value: (Double, Double) => Unit): Self = this.set("hitTest", js.Any.fromFunction2(value))
    @scala.inline
    def setInitialize(value: () => Unit): Self = this.set("initialize", js.Any.fromFunction0(value))
    @scala.inline
    def setItemsFromRange(value: (Double, Double) => Unit): Self = this.set("itemsFromRange", js.Any.fromFunction2(value))
    @scala.inline
    def setLayout(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = this.set("layout", js.Any.fromFunction4(value))
    @scala.inline
    def setNumberOfItemsPerItemsBlock(value: js.Any): Self = this.set("numberOfItemsPerItemsBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetupAnimations(value: () => Unit): Self = this.set("setupAnimations", js.Any.fromFunction0(value))
    @scala.inline
    def setUninitialize(value: () => Unit): Self = this.set("uninitialize", js.Any.fromFunction0(value))
  }
  
}

