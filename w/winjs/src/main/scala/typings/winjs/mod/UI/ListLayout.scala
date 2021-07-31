package typings.winjs.mod.UI

import typings.winjs.WinJS.Utilities.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a layout for the ListView in which items are arranged in a vertical list.
  **/
@JSImport("winjs", "UI.ListLayout")
@js.native
//#region Constructors
/**
  * Creates a new ListLayout.
  * @constructor
  * @param options An object that contains one or more property/value pairs to apply to the new ListLayout. Each property of the options object corresponds to one of the object's properties or events. Event names must begin with "on".
  **/
class ListLayout ()
  extends StObject
     with typings.winjs.WinJS.UI.ListLayout {
  def this(options: js.Any) = this()
  
  //#endregion Methods
  //#region Properties
  /**
    * This property is no longer supported. Starting with Windows Library for JavaScript 2.0, use the .win-listview.win-container.win-backdrop CSS selector.
    **/
  /* CompleteClass */
  var backdropColor: String = js.native
  
  /**
    * This property is no longer supported. Starting with Windows Library for JavaScript 2.0, use the .win-listview.win-container.win-backdrop CSS selector.
    **/
  /* CompleteClass */
  var disableBackdrop: Boolean = js.native
  
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
    * Determines the next item to receive keyboard focus.
    * @param currentItem An object that describes the current item. It has these properties: index, type.
    * @param pressedKey The key that was pressed.
    * @returns An object that describes the next item that should receive focus. It has these properties: index, type.
    **/
  /* CompleteClass */
  override def getAdjacent(currentItem: js.Any, pressedKey: Key): js.Any = js.native
  
  /**
    * Gets or sets the position of group headers.
    **/
  /* CompleteClass */
  var groupHeaderPosition: typings.winjs.WinJS.UI.HeaderPosition = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param x The x-coordinate, or the horizontal position on the screen.
    * @param y The y-coordinate, or the vertical position on the screen.
    **/
  /* CompleteClass */
  override def hitTest(x: Double, y: Double): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  /* CompleteClass */
  override def initialize(): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param firstPixel
    * @param lastPixel
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
  override def layout(tree: js.Any, changedRange: js.Any, modifiedItems: js.Any, modifiedGroups: js.Any): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  /* CompleteClass */
  var numberOfItemsPerItemsBlock: js.Any = js.native
  
  /**
    * Gets or sets the orientation of the GridLayout.
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
object ListLayout {
  
  @JSImport("winjs", "UI.ListLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.ListLayout.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
