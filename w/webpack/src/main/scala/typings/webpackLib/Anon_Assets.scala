package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assets extends js.Object {
  var assets: js.Array[java.lang.String]
  var chunks: js.Array[scala.Double]
  var name: java.lang.String
}

object Anon_Assets {
  @scala.inline
  def apply(assets: js.Array[java.lang.String], chunks: js.Array[scala.Double], name: java.lang.String): Anon_Assets = {
    val __obj = js.Dynamic.literal(assets = assets, chunks = chunks, name = name)
  
    __obj.asInstanceOf[Anon_Assets]
  }
}

