package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSystemIcon extends js.Object {
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

object TypeofSystemIcon {
  @scala.inline
  def apply(
    BOOKMARKS: scala.Double,
    CONTACTS: scala.Double,
    DOWNLOADS: scala.Double,
    FAVORITES: scala.Double,
    FEATURED: scala.Double,
    HISTORY: scala.Double,
    MORE: scala.Double,
    MOST_RECENT: scala.Double,
    MOST_VIEWED: scala.Double,
    RECENTS: scala.Double,
    SEARCH: scala.Double,
    TOP_RATED: scala.Double,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit
  ): TypeofSystemIcon = {
    val __obj = js.Dynamic.literal(BOOKMARKS = BOOKMARKS, CONTACTS = CONTACTS, DOWNLOADS = DOWNLOADS, FAVORITES = FAVORITES, FEATURED = FEATURED, HISTORY = HISTORY, MORE = MORE, MOST_RECENT = MOST_RECENT, MOST_VIEWED = MOST_VIEWED, RECENTS = RECENTS, SEARCH = SEARCH, TOP_RATED = TOP_RATED, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofSystemIcon]
  }
}

