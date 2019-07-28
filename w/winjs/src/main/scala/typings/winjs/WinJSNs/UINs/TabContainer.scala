package typings.winjs.WinJSNs.UINs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Prevents a DOM sub-tree from receiving tab navigations and focus.
  **/
@JSGlobal("WinJS.UI.TabContainer")
@js.native
class TabContainer protected () extends js.Object {
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
  var childFocus: HTMLElement = js.native
  /**
    * Gets or sets the tab index of this container.
    **/
  var tabIndex: Double = js.native
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this TabContainer. Call this method when the TabContainer is no longer needed. After calling this method, the TabContainer becomes unusable.
    **/
  def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("WinJS.UI.TabContainer")
@js.native
object TabContainer extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

