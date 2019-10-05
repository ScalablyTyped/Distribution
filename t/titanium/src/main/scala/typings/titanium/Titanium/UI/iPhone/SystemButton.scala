package typings.titanium.Titanium.UI.iPhone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for creating standard iOS system buttons.
			 */
@JSGlobal("Titanium.UI.iPhone.SystemButton")
@js.native
object SystemButton extends js.Object {
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Action** button.
  				 */
  val ACTION: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create an activity indicator that
  				 * can be used in navigation bars and toolbars.
  				 */
  val ACTIVITY: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Add** button.
  				 */
  val ADD: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Bookmarks** button.
  				 */
  val BOOKMARKS: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Camera** button.
  				 */
  val CAMERA: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Cancel** button.
  				 */
  val CANCEL: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Compose** button.
  				 */
  val COMPOSE: Double = js.native
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a **ContactAdd** button.
  				 */
  val CONTACT_ADD: Double = js.native
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a **Disclosure** button.
  				 */
  val DISCLOSURE: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Done** button.
  				 */
  val DONE: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Edit** button.
  				 */
  val EDIT: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Fast Forward** button.
  				 */
  val FAST_FORWARD: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create a fixed-width blank space
  				 * for spacing items in toolbars.
  				 */
  val FIXED_SPACE: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create a flexible blank space
  				 * for spacing items in toolbars.
  				 */
  val FLEXIBLE_SPACE: Double = js.native
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a dark-colored **Info** button.
  				 */
  val INFO_DARK: Double = js.native
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a light-colored **Info** button.
  				 */
  val INFO_LIGHT: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Organize** button.
  				 */
  val ORGANIZE: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Pause** button.
  				 */
  val PAUSE: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Play** button.
  				 */
  val PLAY: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Refresh** button.
  				 */
  val REFRESH: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Reply** button.
  				 */
  val REPLY: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Rewind** button.
  				 */
  val REWIND: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Save** button.
  				 */
  val SAVE: Double = js.native
  /**
  				 * Identical to [ACTIVITY](Titanium.UI.iPhone.SystemButton.ACTIVITY).
  				 */
  val SPINNER: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Stop** button.
  				 */
  val STOP: Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Trash** button.
  				 */
  val TRASH: Double = js.native
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
  				 * Gets the value of the <Titanium.UI.iPhone.SystemButton.apiName> property.
  				 */
  def getApiName(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemButton.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.SystemButton.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
}

