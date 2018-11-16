package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Contains a group of NavBarCommand objects in a NavBar.
    **/
@JSGlobal("WinJS.UI.NavBarContainer")
@js.native
class NavBarContainer () extends js.Object {
  //#region Constructors
  /**
           * Creates a new NavBarContainer.
           * @constructor
           * @param element The DOM element hosts the new NavBarContainer.
           * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
          **/
  def this(element: stdLib.HTMLElement) = this()
  //#region Constructors
  /**
           * Creates a new NavBarContainer.
           * @constructor
           * @param element The DOM element hosts the new NavBarContainer.
           * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
          **/
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
           * Gets or sets the index of the current item.
          **/
  var currentIndex: scala.Double = js.native
  /**
           * Gets or sets a WinJS.Binding.List that generates NavBarCommand objects.
          **/
  var data: winjsLib.WinJSNs.BindingNs.List[NavBarCommand] = js.native
  /**
           * Gets the HTML element that hosts this NavBarContainer.
          **/
  var element: stdLib.HTMLElement = js.native
  /**
           * Gets or sets a value that specifies whether NavBarCommand objects in this container use a fixed or dynamic width.
          **/
  var fixedSize: scala.Boolean = js.native
  /**
           * Gets or sets a value that specifies whether the NavBarContainer has a horizontal or vertical layout.
          **/
  var layout: Orientation = js.native
  /**
           * Gets or sets a value that specifies how many rows of navigation commands to display on a page.
          **/
  var maxRows: scala.Double = js.native
  /**
           * Gets or sets the WinJS.Binding.Template or templating function that creates the DOM elements for each item in the data source. Each item can contain multiple elements, but it must have a single root element.
          **/
  var template: winjsLib.WinJSNs.BindingNs.Template = js.native
  //#endregion Events
  //#region Methods
  /**
           * Registers an event handler for the specified event.
           * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
           * @param eventHandler The event handler function to associate with the event.
           * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
          **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  //#endregion Events
  //#region Methods
  /**
           * Registers an event handler for the specified event.
           * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
           * @param eventHandler The event handler function to associate with the event.
           * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
          **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
           * Raises an event of the specified type and with additional properties.
           * @param type The type (name) of the event.
           * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
           * @returns true if preventDefault was called on the event, otherwise false.
          **/
  def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  /**
           * Releases resources held by this NavBarCommand. Call this method when the NavBarCommand is no longer needed. After calling this method, the NavBarCommand becomes unusable.
          **/
  def dispose(): scala.Unit = js.native
  /**
           * Forces the NavBarContainer to update its layout. Use this function when making the NavBarContainer visible again after you set its style.display property to "none".
          **/
  def forceLayout(): scala.Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
           * Occurs when a child NavBarCommand object's click event fires.
           * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.index, detail.navbarcommand, detail.data.
          **/
  def oninvoked(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
           * Occurs when the split button of a child NavBarCommand is opened or closed. A split button is toggled when the user navigates to another page or opens another split button.
           * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.opened, detail.index, detail.navbarcommand, detail.data.
          **/
  def onsplittoggle(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
           * Removes an event handler that the addEventListener method registered.
           * @param eventName The name of the event that the event handler is registered for.
           * @param eventCallback The event handler function to remove.
           * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
          **/
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function): scala.Unit = js.native
  /**
           * Removes an event handler that the addEventListener method registered.
           * @param eventName The name of the event that the event handler is registered for.
           * @param eventCallback The event handler function to remove.
           * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
          **/
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
}

/**
     * Contains a group of NavBarCommand objects in a NavBar.
    **/
@JSGlobal("WinJS.UI.NavBarContainer")
@js.native
object NavBarContainer extends js.Object {
  /**
           * Indicates that the object is compatibile with declarative processing.
          **/
  var supportedForProcessing: scala.Boolean = js.native
}

