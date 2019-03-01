package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters used to identify an incoming URL that is handled
  * by the application.
  */
trait LaunchOptionsType extends js.Object {
  /**
  	 * The application or service that triggered the handled URL.
  	 */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The url that was triggered by the application or service.
  	 */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object LaunchOptionsType {
  @scala.inline
  def apply(source: java.lang.String = null, url: java.lang.String = null): LaunchOptionsType = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[LaunchOptionsType]
  }
}

