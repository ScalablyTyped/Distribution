package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSystemButton extends js.Object {
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Action** button.
  				 */
  val ACTION: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create an activity indicator that
  				 * can be used in navigation bars and toolbars.
  				 */
  val ACTIVITY: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Add** button.
  				 */
  val ADD: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Bookmarks** button.
  				 */
  val BOOKMARKS: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Camera** button.
  				 */
  val CAMERA: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Cancel** button.
  				 */
  val CANCEL: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Compose** button.
  				 */
  val COMPOSE: scala.Double
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a **ContactAdd** button.
  				 */
  val CONTACT_ADD: scala.Double
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a **Disclosure** button.
  				 */
  val DISCLOSURE: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Done** button.
  				 */
  val DONE: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Edit** button.
  				 */
  val EDIT: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Fast Forward** button.
  				 */
  val FAST_FORWARD: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create a fixed-width blank space
  				 * for spacing items in toolbars.
  				 */
  val FIXED_SPACE: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create a flexible blank space
  				 * for spacing items in toolbars.
  				 */
  val FLEXIBLE_SPACE: scala.Double
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a dark-colored **Info** button.
  				 */
  val INFO_DARK: scala.Double
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a light-colored **Info** button.
  				 */
  val INFO_LIGHT: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Organize** button.
  				 */
  val ORGANIZE: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Pause** button.
  				 */
  val PAUSE: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Play** button.
  				 */
  val PLAY: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Refresh** button.
  				 */
  val REFRESH: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Reply** button.
  				 */
  val REPLY: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Rewind** button.
  				 */
  val REWIND: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Save** button.
  				 */
  val SAVE: scala.Double
  /**
  				 * Identical to [ACTIVITY](Titanium.UI.iPhone.SystemButton.ACTIVITY).
  				 */
  val SPINNER: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Stop** button.
  				 */
  val STOP: scala.Double
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Trash** button.
  				 */
  val TRASH: scala.Double
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: java.lang.String
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: scala.Boolean
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Applies the properties to the proxy.
  				 */
  def applyProperties(props: js.Any): scala.Unit
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemButton.apiName> property.
  				 */
  def getApiName(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemButton.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.SystemButton.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit
}

object TypeofSystemButton {
  @scala.inline
  def apply(
    ACTION: scala.Double,
    ACTIVITY: scala.Double,
    ADD: scala.Double,
    BOOKMARKS: scala.Double,
    CAMERA: scala.Double,
    CANCEL: scala.Double,
    COMPOSE: scala.Double,
    CONTACT_ADD: scala.Double,
    DISCLOSURE: scala.Double,
    DONE: scala.Double,
    EDIT: scala.Double,
    FAST_FORWARD: scala.Double,
    FIXED_SPACE: scala.Double,
    FLEXIBLE_SPACE: scala.Double,
    INFO_DARK: scala.Double,
    INFO_LIGHT: scala.Double,
    ORGANIZE: scala.Double,
    PAUSE: scala.Double,
    PLAY: scala.Double,
    REFRESH: scala.Double,
    REPLY: scala.Double,
    REWIND: scala.Double,
    SAVE: scala.Double,
    SPINNER: scala.Double,
    STOP: scala.Double,
    TRASH: scala.Double,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit
  ): TypeofSystemButton = {
    val __obj = js.Dynamic.literal(ACTION = ACTION, ACTIVITY = ACTIVITY, ADD = ADD, BOOKMARKS = BOOKMARKS, CAMERA = CAMERA, CANCEL = CANCEL, COMPOSE = COMPOSE, CONTACT_ADD = CONTACT_ADD, DISCLOSURE = DISCLOSURE, DONE = DONE, EDIT = EDIT, FAST_FORWARD = FAST_FORWARD, FIXED_SPACE = FIXED_SPACE, FLEXIBLE_SPACE = FLEXIBLE_SPACE, INFO_DARK = INFO_DARK, INFO_LIGHT = INFO_LIGHT, ORGANIZE = ORGANIZE, PAUSE = PAUSE, PLAY = PLAY, REFRESH = REFRESH, REPLY = REPLY, REWIND = REWIND, SAVE = SAVE, SPINNER = SPINNER, STOP = STOP, TRASH = TRASH, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofSystemButton]
  }
}

