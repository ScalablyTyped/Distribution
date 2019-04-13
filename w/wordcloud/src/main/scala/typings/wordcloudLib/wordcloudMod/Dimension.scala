package typings
package wordcloudLib.wordcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  var h: scala.Double
  var w: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Dimension {
  @scala.inline
  def apply(h: scala.Double, w: scala.Double, x: scala.Double, y: scala.Double): Dimension = {
    val __obj = js.Dynamic.literal(h = h, w = w, x = x, y = y)
  
    __obj.asInstanceOf[Dimension]
  }
}

