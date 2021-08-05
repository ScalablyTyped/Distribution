package typings.winjs.mod.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Prevents a DOM sub-tree from receiving tab navigations and focus.
  **/
@JSImport("winjs", "UI.TabContainer")
@js.native
class TabContainer protected ()
  extends StObject
     with typings.winjs.WinJS.UI.TabContainer {
  //#region Constructors
  /**
    * Creates a new TabContainer.
    * @constructor
    * @param element The DOM element that hosts the TabContainer control.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties.
    **/
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the child DOM element that receives tab focus.
    **/
  /* CompleteClass */
  var childFocus: HTMLElement = js.native
  
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this TabContainer. Call this method when the TabContainer is no longer needed. After calling this method, the TabContainer becomes unusable.
    **/
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Gets or sets the tab index of this container.
    **/
  /* CompleteClass */
  var tabIndex: Double = js.native
}
object TabContainer {
  
  @JSImport("winjs", "UI.TabContainer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.TabContainer.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
