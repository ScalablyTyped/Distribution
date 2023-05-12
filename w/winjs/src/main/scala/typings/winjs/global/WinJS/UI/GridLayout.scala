package typings.winjs.global.WinJS.UI

import typings.winjs.WinJS.UI.ILayoutSite2
import typings.winjs.WinJS.Utilities.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a grid layout for the ListView in which items are arranged in a horizontal grid.
  **/
@JSGlobal("WinJS.UI.GridLayout")
@js.native
//#region Constructors
/**
  * Creates a new GridLayout object.
  * @param options The set of properties and values to apply to the new GridLayout.
  **/
open class GridLayout ()
  extends StObject
     with typings.winjs.WinJS.UI.GridLayout {
  def this(options: Any) = this()
  
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
  override def getAdjacent(currentItem: Any, pressedKey: Key): Any = js.native
  
  /**
    * Gets or sets the position of group headers.
    **/
  /* CompleteClass */
  var groupHeaderPosition: typings.winjs.WinJS.UI.HeaderPosition = js.native
  
  /**
    * This property is no longer supported. Starting with the Windows Library for JavaScript 2.0, use a CellSpanningLayout.
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
    * This property is no longer supported. Starting with the Windows Library for JavaScript 2.0, use a CellSpanningLayout.
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
  override def layout(tree: Any, changedRange: Any, modifiedItems: Any, modifiedGroups: Any): Unit = js.native
  
  /**
    * This property is no longer supported. Starting with Windows Library for JavaScript 2.0, use the maximumRowsOrColumns property.
    **/
  /* CompleteClass */
  var maxRows: Double = js.native
  
  /**
    * Gets or set the maximum number of rows or columns, depending on the orientation, to display before content begins to wrap.
    **/
  /* CompleteClass */
  var maximumRowsOrColumns: Double = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  /* CompleteClass */
  var numberOfItemsPerItemsBlock: Any = js.native
  
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
object GridLayout {
  
  @JSGlobal("WinJS.UI.GridLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.GridLayout.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
