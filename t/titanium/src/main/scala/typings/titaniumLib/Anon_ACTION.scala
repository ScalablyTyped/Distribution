package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ACTION extends js.Object {
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

object Anon_ACTION {
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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit]
  ): Anon_ACTION = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ACTION")(ACTION)
    __obj.updateDynamic("ACTIVITY")(ACTIVITY)
    __obj.updateDynamic("ADD")(ADD)
    __obj.updateDynamic("BOOKMARKS")(BOOKMARKS)
    __obj.updateDynamic("CAMERA")(CAMERA)
    __obj.updateDynamic("CANCEL")(CANCEL)
    __obj.updateDynamic("COMPOSE")(COMPOSE)
    __obj.updateDynamic("CONTACT_ADD")(CONTACT_ADD)
    __obj.updateDynamic("DISCLOSURE")(DISCLOSURE)
    __obj.updateDynamic("DONE")(DONE)
    __obj.updateDynamic("EDIT")(EDIT)
    __obj.updateDynamic("FAST_FORWARD")(FAST_FORWARD)
    __obj.updateDynamic("FIXED_SPACE")(FIXED_SPACE)
    __obj.updateDynamic("FLEXIBLE_SPACE")(FLEXIBLE_SPACE)
    __obj.updateDynamic("INFO_DARK")(INFO_DARK)
    __obj.updateDynamic("INFO_LIGHT")(INFO_LIGHT)
    __obj.updateDynamic("ORGANIZE")(ORGANIZE)
    __obj.updateDynamic("PAUSE")(PAUSE)
    __obj.updateDynamic("PLAY")(PLAY)
    __obj.updateDynamic("REFRESH")(REFRESH)
    __obj.updateDynamic("REPLY")(REPLY)
    __obj.updateDynamic("REWIND")(REWIND)
    __obj.updateDynamic("SAVE")(SAVE)
    __obj.updateDynamic("SPINNER")(SPINNER)
    __obj.updateDynamic("STOP")(STOP)
    __obj.updateDynamic("TRASH")(TRASH)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.asInstanceOf[Anon_ACTION]
  }
}

