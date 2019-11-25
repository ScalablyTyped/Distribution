package typings.websiteDashScraper.websiteDashScraperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  var filename: String
  var url: String
}

object Url {
  @scala.inline
  def apply(filename: String, url: String): Url = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Url]
  }
}

