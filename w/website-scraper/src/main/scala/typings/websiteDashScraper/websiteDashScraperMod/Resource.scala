package typings.websiteDashScraper.websiteDashScraperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var assets: js.Array[Resource]
  var filename: String
  var url: String
}

object Resource {
  @scala.inline
  def apply(assets: js.Array[Resource], filename: String, url: String): Resource = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Resource]
  }
}

