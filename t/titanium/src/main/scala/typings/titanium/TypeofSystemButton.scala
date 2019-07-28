package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSystemButton extends js.Object {
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Action** button.
  				 */
  val ACTION: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create an activity indicator that
  				 * can be used in navigation bars and toolbars.
  				 */
  val ACTIVITY: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Add** button.
  				 */
  val ADD: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Bookmarks** button.
  				 */
  val BOOKMARKS: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Camera** button.
  				 */
  val CAMERA: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Cancel** button.
  				 */
  val CANCEL: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Compose** button.
  				 */
  val COMPOSE: Double
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a **ContactAdd** button.
  				 */
  val CONTACT_ADD: Double
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a **Disclosure** button.
  				 */
  val DISCLOSURE: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Done** button.
  				 */
  val DONE: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Edit** button.
  				 */
  val EDIT: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Fast Forward** button.
  				 */
  val FAST_FORWARD: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create a fixed-width blank space
  				 * for spacing items in toolbars.
  				 */
  val FIXED_SPACE: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create a flexible blank space
  				 * for spacing items in toolbars.
  				 */
  val FLEXIBLE_SPACE: Double
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a dark-colored **Info** button.
  				 */
  val INFO_DARK: Double
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a light-colored **Info** button.
  				 */
  val INFO_LIGHT: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Organize** button.
  				 */
  val ORGANIZE: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Pause** button.
  				 */
  val PAUSE: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Play** button.
  				 */
  val PLAY: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Refresh** button.
  				 */
  val REFRESH: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Reply** button.
  				 */
  val REPLY: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Rewind** button.
  				 */
  val REWIND: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Save** button.
  				 */
  val SAVE: Double
  /**
  				 * Identical to [ACTIVITY](Titanium.UI.iPhone.SystemButton.ACTIVITY).
  				 */
  val SPINNER: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Stop** button.
  				 */
  val STOP: Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Trash** button.
  				 */
  val TRASH: Double
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: String
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: Boolean
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Applies the properties to the proxy.
  				 */
  def applyProperties(props: js.Any): Unit
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: String, event: js.Any): Unit
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemButton.apiName> property.
  				 */
  def getApiName(): String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemButton.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.SystemButton.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit
}

object TypeofSystemButton {
  @scala.inline
  def apply(
    ACTION: Double,
    ACTIVITY: Double,
    ADD: Double,
    BOOKMARKS: Double,
    CAMERA: Double,
    CANCEL: Double,
    COMPOSE: Double,
    CONTACT_ADD: Double,
    DISCLOSURE: Double,
    DONE: Double,
    EDIT: Double,
    FAST_FORWARD: Double,
    FIXED_SPACE: Double,
    FLEXIBLE_SPACE: Double,
    INFO_DARK: Double,
    INFO_LIGHT: Double,
    ORGANIZE: Double,
    PAUSE: Double,
    PLAY: Double,
    REFRESH: Double,
    REPLY: Double,
    REWIND: Double,
    SAVE: Double,
    SPINNER: Double,
    STOP: Double,
    TRASH: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit
  ): TypeofSystemButton = {
    val __obj = js.Dynamic.literal(ACTION = ACTION, ACTIVITY = ACTIVITY, ADD = ADD, BOOKMARKS = BOOKMARKS, CAMERA = CAMERA, CANCEL = CANCEL, COMPOSE = COMPOSE, CONTACT_ADD = CONTACT_ADD, DISCLOSURE = DISCLOSURE, DONE = DONE, EDIT = EDIT, FAST_FORWARD = FAST_FORWARD, FIXED_SPACE = FIXED_SPACE, FLEXIBLE_SPACE = FLEXIBLE_SPACE, INFO_DARK = INFO_DARK, INFO_LIGHT = INFO_LIGHT, ORGANIZE = ORGANIZE, PAUSE = PAUSE, PLAY = PLAY, REFRESH = REFRESH, REPLY = REPLY, REWIND = REWIND, SAVE = SAVE, SPINNER = SPINNER, STOP = STOP, TRASH = TRASH, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofSystemButton]
  }
}

