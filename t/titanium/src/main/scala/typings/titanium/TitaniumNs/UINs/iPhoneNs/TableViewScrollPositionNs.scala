package typings.titanium.TitaniumNs.UINs.iPhoneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the position value that can be used for the `position` property of
			 * <Titanium.UI.TableView> when invoking `scrollToIndex`.
			 */
@JSGlobal("Titanium.UI.iPhone.TableViewScrollPosition")
@js.native
object TableViewScrollPositionNs extends js.Object {
  /**
  				 * The table view scrolls the row of interest to the bottom of the visible table view.
  				 */
  val BOTTOM: Double = js.native
  /**
  				 * The table view scrolls the row of interest to the middle of the visible table view.
  				 */
  val MIDDLE: Double = js.native
  /**
  				 * The table view scrolls the row of interest to be fully visible with a minimum of movement. If the row is already fully visible, no scrolling occurs. For example, if the row is above the visible area, the behavior is identical to that specified by `TOP`. This is the default.
  				 */
  val NONE: Double = js.native
  /**
  				 * The table view scrolls the row of interest to the top of the visible table view.
  				 */
  val TOP: Double = js.native
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
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.TableViewScrollPosition.apiName> property.
  				 */
  def getApiName(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.TableViewScrollPosition.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.TableViewScrollPosition.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
}

