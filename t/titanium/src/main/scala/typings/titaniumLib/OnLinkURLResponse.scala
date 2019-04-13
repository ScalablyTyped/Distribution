package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object returned when the <Titanium.UI.WebView.onlink> callback is fired.
  */
trait OnLinkURLResponse extends js.Object {
  /**
  	 * The url of the link that should be navigated to.
  	 */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object OnLinkURLResponse {
  @scala.inline
  def apply(url: java.lang.String = null): OnLinkURLResponse = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[OnLinkURLResponse]
  }
}

