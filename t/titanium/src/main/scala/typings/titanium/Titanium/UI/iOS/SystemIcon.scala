package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the system icon styles that can be used on a tab group tab.
			 */
@JSGlobal("Titanium.UI.iOS.SystemIcon")
@js.native
object SystemIcon extends js.Object {
  /**
  				 * Bookmark style icon
  				 */
  val BOOKMARKS: Double = js.native
  /**
  				 * Contacts style icon
  				 */
  val CONTACTS: Double = js.native
  /**
  				 * Downloads style icon
  				 */
  val DOWNLOADS: Double = js.native
  /**
  				 * Favorites style icon
  				 */
  val FAVORITES: Double = js.native
  /**
  				 * Featured style icon
  				 */
  val FEATURED: Double = js.native
  /**
  				 * History style icon
  				 */
  val HISTORY: Double = js.native
  /**
  				 * More style icon
  				 */
  val MORE: Double = js.native
  /**
  				 * Most recent style icon
  				 */
  val MOST_RECENT: Double = js.native
  /**
  				 * Most viewed style icon
  				 */
  val MOST_VIEWED: Double = js.native
  /**
  				 * Recents style icon
  				 */
  val RECENTS: Double = js.native
  /**
  				 * Search style icon
  				 */
  val SEARCH: Double = js.native
  /**
  				 * Top rated style icon
  				 */
  val TOP_RATED: Double = js.native
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
  				 * Gets the value of the <Titanium.UI.iOS.SystemIcon.apiName> property.
  				 */
  def getApiName(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SystemIcon.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SystemIcon.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
}

