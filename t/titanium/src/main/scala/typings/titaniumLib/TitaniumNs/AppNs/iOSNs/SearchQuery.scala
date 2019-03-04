package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A search query object manages the criteria to apply when searching app content that you have previously
			 * indexed by using the Core Spotlight APIs.
			 */
trait SearchQuery
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * An array of strings that represent the attributes of indexed items.
  				 */
  var attributes: js.Array[java.lang.String]
  /**
  				 * A formatted string that defines the matching criteria to apply to indexed items.
  				 */
  var queryString: java.lang.String
  /**
  				 * Cancels a query operation.
  				 */
  def cancel(): scala.Unit
  /**
  				 * A Boolean value that indicates if the query has been cancelled (`true`) or not (`false`).
  				 */
  def isCancelled(): scala.Boolean
  /**
  				 * Asynchronously queries the index for items that match the query object's specifications.
  				 */
  def start(): scala.Unit
}

object SearchQuery {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    attributes: js.Array[java.lang.String],
    bubbleParent: scala.Boolean,
    cancel: js.Function0[scala.Unit],
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    isCancelled: js.Function0[scala.Boolean],
    queryString: java.lang.String,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    start: js.Function0[scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): SearchQuery = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, attributes = attributes, bubbleParent = bubbleParent, cancel = cancel, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, isCancelled = isCancelled, queryString = queryString, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, start = start)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[SearchQuery]
  }
}

