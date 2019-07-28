package typings.titanium.TitaniumNs.AppNs.iOSNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A search query object manages the criteria to apply when searching app content that you have previously
			 * indexed by using the Core Spotlight APIs.
			 */
trait SearchQuery extends Proxy {
  /**
  				 * An array of strings that represent the attributes of indexed items.
  				 */
  var attributes: js.Array[String]
  /**
  				 * A formatted string that defines the matching criteria to apply to indexed items.
  				 */
  var queryString: String
  /**
  				 * Cancels a query operation.
  				 */
  def cancel(): Unit
  /**
  				 * A Boolean value that indicates if the query has been cancelled (`true`) or not (`false`).
  				 */
  def isCancelled(): Boolean
  /**
  				 * Asynchronously queries the index for items that match the query object's specifications.
  				 */
  def start(): Unit
}

object SearchQuery {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    attributes: js.Array[String],
    bubbleParent: Boolean,
    cancel: () => Unit,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    isCancelled: () => Boolean,
    queryString: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    start: () => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): SearchQuery = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), attributes = attributes, bubbleParent = bubbleParent, cancel = js.Any.fromFunction0(cancel), fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), isCancelled = js.Any.fromFunction0(isCancelled), queryString = queryString, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), start = js.Any.fromFunction0(start))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[SearchQuery]
  }
}

