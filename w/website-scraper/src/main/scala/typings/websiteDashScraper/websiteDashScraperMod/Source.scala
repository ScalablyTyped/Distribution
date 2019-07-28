package typings.websiteDashScraper.websiteDashScraperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var attr: String
  var selector: String
}

object Source {
  @scala.inline
  def apply(attr: String, selector: String): Source = {
    val __obj = js.Dynamic.literal(attr = attr, selector = selector)
  
    __obj.asInstanceOf[Source]
  }
}

