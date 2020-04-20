package typings.webpackBlocksAssets.mod.css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseImportOptions extends js.Object {
  var media: String
  var url: String
}

object ParseImportOptions {
  @scala.inline
  def apply(media: String, url: String): ParseImportOptions = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseImportOptions]
  }
}

