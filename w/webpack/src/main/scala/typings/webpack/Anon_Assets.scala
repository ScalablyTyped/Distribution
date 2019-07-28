package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assets extends js.Object {
  var assets: js.Array[String]
  var chunks: js.Array[Double]
  var name: String
}

object Anon_Assets {
  @scala.inline
  def apply(assets: js.Array[String], chunks: js.Array[Double], name: String): Anon_Assets = {
    val __obj = js.Dynamic.literal(assets = assets, chunks = chunks, name = name)
  
    __obj.asInstanceOf[Anon_Assets]
  }
}

