package typings.winjs.winjsMod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays data items in a customizable list or grid.
  **/
@JSImport("winjs", "UI.ListView")
@js.native
//#region Constructors
/**
  * Creates a new ListView.
  * @constructor
  * @param element The DOM element that hosts the ListView control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the selectionchanged event, add a property named "onselectionchanged" to the options object and set its value to the event handler.
  **/
class ListView[T] ()
  extends typings.winjs.WinJS.UI.ListView[T] {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.ListView")
@js.native
object ListView extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
  /**
    * Triggers the ListView disposal service manually.
    **/
  def triggerDispose(): Unit = js.native
}

