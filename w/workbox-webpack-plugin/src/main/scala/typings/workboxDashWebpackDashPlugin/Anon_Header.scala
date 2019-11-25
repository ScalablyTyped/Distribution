package typings.workboxDashWebpackDashPlugin

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  /**
  		 * Only cache responses with headers which match this map.
  		 */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
  		 * Only cache responses with HTTP code(s) listed.
  		 */
  var statuses: js.UndefOr[js.Array[Double]] = js.undefined
}

object Anon_Header {
  @scala.inline
  def apply(headers: StringDictionary[String] = null, statuses: js.Array[Double] = null): Anon_Header = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Header]
  }
}

