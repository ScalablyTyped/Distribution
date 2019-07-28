package typings.titanium.TitaniumNs.UINs.iPadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.UI.iPad")
@js.native
object ^ extends js.Object {
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
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iPad.DocumentViewer>.
  			 */
  def createDocumentViewer(): DocumentViewer = js.native
  def createDocumentViewer(parameters: js.Any): DocumentViewer = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iPad.Popover>.
  			 */
  def createPopover(): Popover = js.native
  def createPopover(parameters: js.Any): Popover = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iPad.SplitWindow>.
  			 */
  def createSplitWindow(): SplitWindow = js.native
  def createSplitWindow(parameters: js.Any): SplitWindow = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.iPad.apiName> property.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.iPad.bubbleParent> property.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.iPad.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
}

