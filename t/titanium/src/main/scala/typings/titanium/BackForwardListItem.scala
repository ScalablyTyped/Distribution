package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The object represents a webpage in the back-forward of a web view.
  */
trait BackForwardListItem extends js.Object {
  /**
  	 * The URL of the initial request that created this item.
  	 */
  var initialUrl: js.UndefOr[String] = js.undefined
  /**
  	 * The title of the webpage represented by this item.
  	 */
  var title: js.UndefOr[String] = js.undefined
  /**
  	 * The URL of the webpage represented by this item.
  	 */
  var url: js.UndefOr[String] = js.undefined
}

object BackForwardListItem {
  @scala.inline
  def apply(initialUrl: String = null, title: String = null, url: String = null): BackForwardListItem = {
    val __obj = js.Dynamic.literal()
    if (initialUrl != null) __obj.updateDynamic("initialUrl")(initialUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BackForwardListItem]
  }
}

