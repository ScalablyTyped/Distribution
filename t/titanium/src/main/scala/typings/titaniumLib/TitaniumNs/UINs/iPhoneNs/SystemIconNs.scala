package typings
package titaniumLib.TitaniumNs.UINs.iPhoneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the system icon styles that can be used on a tab group tab.
			 */
@JSGlobal("Titanium.UI.iPhone.SystemIcon")
@js.native
object SystemIconNs extends js.Object {
  /**
  				 * Bookmark style icon
  				 */
  val BOOKMARKS: scala.Double = js.native
  /**
  				 * Contacts style icon
  				 */
  val CONTACTS: scala.Double = js.native
  /**
  				 * Downloads style icon
  				 */
  val DOWNLOADS: scala.Double = js.native
  /**
  				 * Favorites style icon
  				 */
  val FAVORITES: scala.Double = js.native
  /**
  				 * Featured style icon
  				 */
  val FEATURED: scala.Double = js.native
  /**
  				 * History style icon
  				 */
  val HISTORY: scala.Double = js.native
  /**
  				 * More style icon
  				 */
  val MORE: scala.Double = js.native
  /**
  				 * Most recent style icon
  				 */
  val MOST_RECENT: scala.Double = js.native
  /**
  				 * Most viewed style icon
  				 */
  val MOST_VIEWED: scala.Double = js.native
  /**
  				 * Recents style icon
  				 */
  val RECENTS: scala.Double = js.native
  /**
  				 * Search style icon
  				 */
  val SEARCH: scala.Double = js.native
  /**
  				 * Top rated style icon
  				 */
  val TOP_RATED: scala.Double = js.native
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
  				 * Gets the value of the <Titanium.UI.iPhone.SystemIcon.apiName> property.
  				 */
  def getApiName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemIcon.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.SystemIcon.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
}

