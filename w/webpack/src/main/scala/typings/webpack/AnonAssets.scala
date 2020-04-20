package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssets extends js.Object {
  var assets: js.Array[String]
  var chunks: js.Array[Double | String]
  var name: String
}

object AnonAssets {
  @scala.inline
  def apply(assets: js.Array[String], chunks: js.Array[Double | String], name: String): AnonAssets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssets]
  }
}

