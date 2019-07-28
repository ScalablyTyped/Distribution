package typings.titanium.TitaniumNs.UINs.iPhoneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.UI.iPhone")
@js.native
object ^ extends js.Object {
  /**
  			 * View presented with the same style as its parent window.
  			 */
  val MODAL_PRESENTATION_CURRENT_CONTEXT: Double = js.native
  /**
  			 * Window width and height are smaller than those of the screen and the view is centered on
  			 * the screen.
  			 */
  val MODAL_PRESENTATION_FORMSHEET: Double = js.native
  /**
  			 * Window covers the screen.
  			 */
  val MODAL_PRESENTATION_FULLSCREEN: Double = js.native
  /**
  			 * Window height is the height of the screen and width is equal to screen width in a portrait
  			 * orientation.
  			 */
  val MODAL_PRESENTATION_PAGESHEET: Double = js.native
  /**
  			 * When the window is presented, its view slides up from the bottom of the screen. On dismissal,
  			 * the view slides back down (default.)
  			 */
  val MODAL_TRANSITION_STYLE_COVER_VERTICAL: Double = js.native
  /**
  			 * When the window is presented, the current view fades out while the new view fades in at the
  			 * same time. On dismissal, a similar type of cross-fade is used to return to the original view.
  			 */
  val MODAL_TRANSITION_STYLE_CROSS_DISSOLVE: Double = js.native
  /**
  			 * When the window is presented, the current view initiates a horizontal 3D flip from
  			 * right-to-left, resulting in the revealing of the new view as if it were on the back of the
  			 * previous view. On dismissal, the flip occurs from left-to-right, returning to the original
  			 * view.
  			 */
  val MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL: Double = js.native
  /**
  			 * When the window is presented, one corner of the current view curls up to reveal the modal
  			 * view underneath. On dismissal, the curled up page unfurls itself back on top of the modal
  			 * view.
  			 */
  val MODAL_TRANSITION_STYLE_PARTIAL_CURL: Double = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: String = js.native
  /**
  			 * Value of the badge for the application's springboard icon.
  			 */
  var appBadge: Double = js.native
  /**
  			 * Determines whether the shake to edit system-wide capability is enabled.
  			 */
  var appSupportsShakeToEdit: Boolean = js.native
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
  			 * Gets the value of the <Titanium.UI.iPhone.apiName> property.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.appBadge> property.
  			 */
  def getAppBadge(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.appSupportsShakeToEdit> property.
  			 */
  def getAppSupportsShakeToEdit(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.bubbleParent> property.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.iPhone.appBadge> property.
  			 */
  def setAppBadge(appBadge: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.iPhone.appSupportsShakeToEdit> property.
  			 */
  def setAppSupportsShakeToEdit(appSupportsShakeToEdit: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.iPhone.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
}

