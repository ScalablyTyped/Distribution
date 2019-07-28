package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSystemIcon extends js.Object {
  /**
  				 * Bookmark style icon
  				 */
  val BOOKMARKS: Double
  /**
  				 * Contacts style icon
  				 */
  val CONTACTS: Double
  /**
  				 * Downloads style icon
  				 */
  val DOWNLOADS: Double
  /**
  				 * Favorites style icon
  				 */
  val FAVORITES: Double
  /**
  				 * Featured style icon
  				 */
  val FEATURED: Double
  /**
  				 * History style icon
  				 */
  val HISTORY: Double
  /**
  				 * More style icon
  				 */
  val MORE: Double
  /**
  				 * Most recent style icon
  				 */
  val MOST_RECENT: Double
  /**
  				 * Most viewed style icon
  				 */
  val MOST_VIEWED: Double
  /**
  				 * Recents style icon
  				 */
  val RECENTS: Double
  /**
  				 * Search style icon
  				 */
  val SEARCH: Double
  /**
  				 * Top rated style icon
  				 */
  val TOP_RATED: Double
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
  				 * Gets the value of the <Titanium.UI.iPhone.SystemIcon.apiName> property.
  				 */
  def getApiName(): String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemIcon.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.SystemIcon.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit
}

object TypeofSystemIcon {
  @scala.inline
  def apply(
    BOOKMARKS: Double,
    CONTACTS: Double,
    DOWNLOADS: Double,
    FAVORITES: Double,
    FEATURED: Double,
    HISTORY: Double,
    MORE: Double,
    MOST_RECENT: Double,
    MOST_VIEWED: Double,
    RECENTS: Double,
    SEARCH: Double,
    TOP_RATED: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit
  ): TypeofSystemIcon = {
    val __obj = js.Dynamic.literal(BOOKMARKS = BOOKMARKS, CONTACTS = CONTACTS, DOWNLOADS = DOWNLOADS, FAVORITES = FAVORITES, FEATURED = FEATURED, HISTORY = HISTORY, MORE = MORE, MOST_RECENT = MOST_RECENT, MOST_VIEWED = MOST_VIEWED, RECENTS = RECENTS, SEARCH = SEARCH, TOP_RATED = TOP_RATED, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofSystemIcon]
  }
}

