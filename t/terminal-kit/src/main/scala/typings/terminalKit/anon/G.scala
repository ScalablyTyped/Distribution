package typings.terminalKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait G extends js.Object {
  var b: Double
  var g: Double
  var names: js.Array[String]
  var r: Double
}

object G {
  @scala.inline
  def apply(b: Double, g: Double, names: js.Array[String], r: Double): G = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[G]
  }
}

