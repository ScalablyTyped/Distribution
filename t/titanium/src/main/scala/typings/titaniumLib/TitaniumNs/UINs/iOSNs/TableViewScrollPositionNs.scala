package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the position value that can be used for the `position` property of
			 * <Titanium.UI.TableView> when invoking `scrollToIndex`.
			 */
@JSGlobal("Titanium.UI.iOS.TableViewScrollPosition")
@js.native
object TableViewScrollPositionNs extends js.Object {
  /**
  				 * The table view scrolls the row of interest to the bottom of the visible table view.
  				 */
  val BOTTOM: scala.Double = js.native
  /**
  				 * The table view scrolls the row of interest to the middle of the visible table view.
  				 */
  val MIDDLE: scala.Double = js.native
  /**
  				 * The table view scrolls the row of interest to be fully visible with a minimum of movement. If the row is already fully visible, no scrolling occurs. For example, if the row is above the visible area, the behavior is identical to that specified by `TOP`. This is the default.
  				 */
  val NONE: scala.Double = js.native
  /**
  				 * The table view scrolls the row of interest to the top of the visible table view.
  				 */
  val TOP: scala.Double = js.native
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: java.lang.String = js.native
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: scala.Boolean = js.native
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Applies the properties to the proxy.
  				 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.TableViewScrollPosition.apiName> property.
  				 */
  def getApiName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.TableViewScrollPosition.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.TableViewScrollPosition.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
}

