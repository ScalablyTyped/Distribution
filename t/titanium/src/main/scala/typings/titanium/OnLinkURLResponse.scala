package typings.titanium

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
  var url: js.UndefOr[String] = js.undefined
}

object OnLinkURLResponse {
  @scala.inline
  def apply(url: String = null): OnLinkURLResponse = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[OnLinkURLResponse]
  }
}

