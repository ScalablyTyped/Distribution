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

