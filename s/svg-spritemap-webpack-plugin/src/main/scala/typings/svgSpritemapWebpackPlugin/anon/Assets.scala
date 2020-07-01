package typings.svgSpritemapWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assets extends js.Object {
  val assets: js.Object
  val filename: String
}

object Assets {
  @scala.inline
  def apply(assets: js.Object, filename: String): Assets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assets]
  }
}

