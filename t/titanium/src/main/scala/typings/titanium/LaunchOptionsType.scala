package typings.titanium

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
  var source: js.UndefOr[String] = js.undefined
  /**
  	 * The url that was triggered by the application or service.
  	 */
  var url: js.UndefOr[String] = js.undefined
}

object LaunchOptionsType {
  @scala.inline
  def apply(source: String = null, url: String = null): LaunchOptionsType = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptionsType]
  }
}

