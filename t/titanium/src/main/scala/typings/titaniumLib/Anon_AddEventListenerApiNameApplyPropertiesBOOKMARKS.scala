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

object Anon_AddEventListenerApiNameApplyPropertiesBOOKMARKS {
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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit]
  ): Anon_AddEventListenerApiNameApplyPropertiesBOOKMARKS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BOOKMARKS")(BOOKMARKS)
    __obj.updateDynamic("CONTACTS")(CONTACTS)
    __obj.updateDynamic("DOWNLOADS")(DOWNLOADS)
    __obj.updateDynamic("FAVORITES")(FAVORITES)
    __obj.updateDynamic("FEATURED")(FEATURED)
    __obj.updateDynamic("HISTORY")(HISTORY)
    __obj.updateDynamic("MORE")(MORE)
    __obj.updateDynamic("MOST_RECENT")(MOST_RECENT)
    __obj.updateDynamic("MOST_VIEWED")(MOST_VIEWED)
    __obj.updateDynamic("RECENTS")(RECENTS)
    __obj.updateDynamic("SEARCH")(SEARCH)
    __obj.updateDynamic("TOP_RATED")(TOP_RATED)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.asInstanceOf[Anon_AddEventListenerApiNameApplyPropertiesBOOKMARKS]
  }
}

