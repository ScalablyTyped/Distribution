package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddEventListenerApiNameApplyPropertiesBOOKMARKS extends js.Object {
  /**
  				 * Bookmark style icon
  				 */
  val BOOKMARKS: scala.Double
  /**
  				 * Contacts style icon
  				 */
  val CONTACTS: scala.Double
  /**
  				 * Downloads style icon
  				 */
  val DOWNLOADS: scala.Double
  /**
  				 * Favorites style icon
  				 */
  val FAVORITES: scala.Double
  /**
  				 * Featured style icon
  				 */
  val FEATURED: scala.Double
  /**
  				 * History style icon
  				 */
  val HISTORY: scala.Double
  /**
  				 * More style icon
  				 */
  val MORE: scala.Double
  /**
  				 * Most recent style icon
  				 */
  val MOST_RECENT: scala.Double
  /**
  				 * Most viewed style icon
  				 */
  val MOST_VIEWED: scala.Double
  /**
  				 * Recents style icon
  				 */
  val RECENTS: scala.Double
  /**
  				 * Search style icon
  				 */
  val SEARCH: scala.Double
  /**
  				 * Top rated style icon
  				 */
  val TOP_RATED: scala.Double
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
  				 * Gets the value of the <Titanium.UI.iPhone.SystemIcon.apiName> property.
  				 */
  def getApiName(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemIcon.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.SystemIcon.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit
}

