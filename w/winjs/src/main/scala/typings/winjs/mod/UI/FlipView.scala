package typings.winjs.mod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays a collection, such as a set of photos, one item at a time.
  **/
@JSImport("winjs", "UI.FlipView")
@js.native
//#region Constructors
/**
  * Creates a new FlipView.
  * @constructor
  * @param element The DOM element that hosts the control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the pageselected event, add a property named "onpageselected" and set its value to the event handler.
  **/
class FlipView[T] ()
  extends typings.winjs.WinJS.UI.FlipView[T] {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
/* static members */
@JSImport("winjs", "UI.FlipView")
@js.native
object FlipView extends js.Object {
  
  /**
    * Event Name
    **/
  var datasourceCountChangedEvent: String = js.native
  
  /**
    * Event Name
    **/
  var pageCompletedEvent: String = js.native
  
  /**
    * Event Name
    **/
  var pageSelectedEvent: String = js.native
  
  /**
    * Event Name
    **/
  var pageVisibilityChangedEvent: String = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}
