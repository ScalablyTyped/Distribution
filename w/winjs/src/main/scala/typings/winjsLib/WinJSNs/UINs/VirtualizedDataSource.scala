package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base class for a custom IListDataSource.
  **/
@JSGlobal("WinJS.UI.VirtualizedDataSource")
@js.native
class VirtualizedDataSource[T] protected () extends js.Object {
  //#region Constructors
  /**
    * Initializes the VirtualizedDataSource base class of a custom data source.
    * @constructor
    * @param listDataAdapter The object that supplies data to the VirtualizedDataSource.
    * @param options An object that can contain properties that specify additional options for the VirtualizedDataSource. It supports these properties: cacheSize.
    **/
  def this(listDataAdapter: IListDataAdapter[T]) = this()
  def this(listDataAdapter: IListDataAdapter[T], options: js.Any) = this()
  //#endregion Constructors
  //#region Events
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle. See the VirtualizedDataSource object page for a list of events. Note that you drop the "on" when specifying the event name for the addEventListener method. For example, instead of specifying "onstatuschanged", you specify "statuschanged".
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for. See the VirtualizedDataSource object page for a list of events.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function): scala.Unit = js.native
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("WinJS.UI.VirtualizedDataSource")
@js.native
object VirtualizedDataSource extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
}

