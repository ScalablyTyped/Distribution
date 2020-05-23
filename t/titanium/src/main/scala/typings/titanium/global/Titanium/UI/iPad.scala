package typings.titanium.global.Titanium.UI

import typings.titanium.Dictionary
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * iPad specific UI capabilities.
  */
@JSGlobal("Titanium.UI.iPad")
@js.native
class iPad () extends Proxy

/**
  * iPad specific UI capabilities.
  */
/* static members */
@JSGlobal("Titanium.UI.iPad")
@js.native
object iPad extends js.Object {
  /**
    * A Popover is used to manage the presentation of content in a popover.
    */
  @js.native
  class Popover ()
    extends typings.titanium.Titanium.UI.iPad.Popover
  
  /**
    * A DocumentViewer provides in-app support for managing user interactions with files on the
    * local system.
    * @deprecated Use [Titanium.UI.iOS.DocumentViewer](Titanium.UI.iOS.DocumentViewer) instead.
    */
  val DocumentViewer: scala.Nothing = js.native
  /**
    * An arrow that points in any direction.
    */
  val POPOVER_ARROW_DIRECTION_ANY: Double = js.native
  /**
    * An arrow that points downward.
    */
  val POPOVER_ARROW_DIRECTION_DOWN: Double = js.native
  /**
    * An arrow that points toward the left.
    */
  val POPOVER_ARROW_DIRECTION_LEFT: Double = js.native
  /**
    * An arrow that points toward the right.
    */
  val POPOVER_ARROW_DIRECTION_RIGHT: Double = js.native
  /**
    * The status of the arrow is currently unknown.
    */
  val POPOVER_ARROW_DIRECTION_UNKNOWN: Double = js.native
  /**
    * An arrow that points upward.
    */
  val POPOVER_ARROW_DIRECTION_UP: Double = js.native
  /**
    * A SplitWindow is a window that manages the presentation of two side-by-side view
    * controllers.
    * @deprecated Use [Titanium.UI.iOS.SplitWindow](Titanium.UI.iOS.SplitWindow) instead.
    */
  val SplitWindow: scala.Nothing = js.native
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.iPad.Popover>.
    */
  def createPopover(): typings.titanium.Titanium.UI.iPad.Popover = js.native
  def createPopover(parameters: Dictionary[typings.titanium.Titanium.UI.iPad.Popover]): typings.titanium.Titanium.UI.iPad.Popover = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.iPad.apiName> property.
    * @deprecated Access <Titanium.UI.iPad.apiName> instead.
    */
  def getApiName(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.iPad.bubbleParent> property.
    * @deprecated Access <Titanium.UI.iPad.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iPad.bubbleParent> property.
    * @deprecated Set the value using <Titanium.UI.iPad.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
}

