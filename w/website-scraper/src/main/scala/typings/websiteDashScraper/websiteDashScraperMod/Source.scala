package typings.websiteDashScraper.websiteDashScraperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var attr: js.UndefOr[String] = js.undefined
  var selector: String
}

object Source {
  @scala.inline
  def apply(selector: String, attr: String = null): Source = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

