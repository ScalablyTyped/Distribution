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
    val __obj = js.Dynamic.literal(filename = filename, url = url)
  
    __obj.asInstanceOf[Url]
  }
}

