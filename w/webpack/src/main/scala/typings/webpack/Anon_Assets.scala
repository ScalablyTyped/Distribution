package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assets extends js.Object {
  var assets: js.Array[String]
  var chunks: js.Array[Double | String]
  var name: String
}

object Anon_Assets {
  @scala.inline
  def apply(assets: js.Array[String], chunks: js.Array[Double | String], name: String): Anon_Assets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Assets]
  }
}

