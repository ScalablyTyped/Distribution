package typings
package workboxDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  /**
  		 * Only cache responses with headers which match this map.
  		 */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
  		 * Only cache responses with HTTP code(s) listed.
  		 */
  var statuses: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_Header {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    statuses: js.Array[scala.Double] = null
  ): Anon_Header = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (statuses != null) __obj.updateDynamic("statuses")(statuses)
    __obj.asInstanceOf[Anon_Header]
  }
}

